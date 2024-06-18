package bunny.sdk;

import java.util.List;

import bunny.sdk.generated.bunnyapiclient.BunnyApiClient;
import bunny.sdk.generated.bunnyapiclient.models.countries.getcountrylist.Country;
import bunny.sdk.generated.bunnyapiclient.models.storagezone.StorageZone;
import bunny.sdk.generated.bunnyapiclient.storagezone.StoragezoneGetResponse;

// BUNNY_API_ACCESS_KEY="***" ./gradlew --console plain run
// BUNNY_API_ACCESS_KEY="***" ./gradlew --console plain --warning-mode none run

public class Test {
  public static void main(String[] args) {
    final BunnyApiClient client = BunnySdk.createBunnyApiClient(
        CreateBunnyApiClientParameters.Builder.create()
            .setAccessKey(System.getenv().getOrDefault("BUNNY_API_ACCESS_KEY", ""))
            .build());

    try {
      StoragezoneGetResponse storageZoneGetResponse = client.storagezone()
          .get(q -> {
            q.queryParameters.includeDeleted = true;
            q.queryParameters.page = 1;
            q.queryParameters.perPage = 1000;
            // q.queryParameters.search = "my-storage-zone";
          });
      List<StorageZone> storageZones = storageZoneGetResponse.getItems();
      for (int i = 0; i < storageZones.size(); ++i) {
        System.out.printf("%d: %s\n", i, storageZones.get(i).getName());
      }

      List<Country> countries = client.country()
          .get();
      for (int i = 0; i < countries.size(); ++i) {
        System.out.printf("%d: %s\n", i, countries.get(i).getName());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      throw e;
    }
  }
}
