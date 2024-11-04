package bunny.sdk.edgestorageapiclient;

import bunny.sdk.edgestorageapiclient.item.WithStorageZoneNameItemRequestBuilder;
import bunny.sdk.edgestorageapiclient.item.WithStorageZoneNameSlashRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdgeStorageApiClient extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.EdgeStorageApiClient.item collection
     * @param storageZoneName the name of your storage zone where you are connecting to.
     * @return a {@link WithStorageZoneNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithStorageZoneNameItemRequestBuilder byStorageZoneName(@jakarta.annotation.Nonnull final String storageZoneName) {
        Objects.requireNonNull(storageZoneName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("storageZoneName", storageZoneName);
        return new WithStorageZoneNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link EdgeStorageApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdgeStorageApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://{region}.bunnycdn.com");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
    /**
     * Builds and executes requests for operations under /{storageZoneName}/
     * @param storageZoneName The name of your storage zone where you are connecting to.
     * @return a {@link WithStorageZoneNameSlashRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithStorageZoneNameSlashRequestBuilder withStorageZoneNameSlash(@jakarta.annotation.Nonnull final String storageZoneName) {
        Objects.requireNonNull(storageZoneName);
        return new WithStorageZoneNameSlashRequestBuilder(pathParameters, requestAdapter, storageZoneName);
    }
}
