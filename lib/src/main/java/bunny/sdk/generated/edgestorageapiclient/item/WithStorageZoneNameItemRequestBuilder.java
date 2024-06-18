package bunny.sdk.generated.edgestorageapiclient.item;

import bunny.sdk.generated.edgestorageapiclient.item.item.WithPathItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /{storageZoneName}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithStorageZoneNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.generated.EdgeStorageApiClient.item.item collection
     * @param path The directory path that you want to list.
     * @return a {@link WithPathItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPathItemRequestBuilder byPath(@jakarta.annotation.Nonnull final String path) {
        Objects.requireNonNull(path);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("path", path);
        return new WithPathItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithStorageZoneNameItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithStorageZoneNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithStorageZoneNameItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithStorageZoneNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}", rawUrl);
    }
}
