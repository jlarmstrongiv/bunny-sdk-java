package bunny.sdk.edgestorageapiclient.item;

import bunny.sdk.edgestorageapiclient.item.item.WithPathItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /{storageZoneName}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithStorageZoneNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.EdgeStorageApiClient.item.item collection
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
    /**
     * [DownloadZip API Docs](https://toshy.github.io/BunnyNet-PHP/edge-storage-api/#download-zip)
     * @param body The request body
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final WithStorageZoneNamePostRequestBody body) {
        return post(body, null);
    }
    /**
     * [DownloadZip API Docs](https://toshy.github.io/BunnyNet-PHP/edge-storage-api/#download-zip)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final WithStorageZoneNamePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendPrimitive(requestInfo, null, InputStream.class);
    }
    /**
     * [DownloadZip API Docs](https://toshy.github.io/BunnyNet-PHP/edge-storage-api/#download-zip)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WithStorageZoneNamePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [DownloadZip API Docs](https://toshy.github.io/BunnyNet-PHP/edge-storage-api/#download-zip)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WithStorageZoneNamePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithStorageZoneNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithStorageZoneNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithStorageZoneNameItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
