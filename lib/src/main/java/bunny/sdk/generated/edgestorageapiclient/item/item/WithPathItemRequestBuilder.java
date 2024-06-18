package bunny.sdk.generated.edgestorageapiclient.item.item;

import bunny.sdk.generated.edgestorageapiclient.item.item.item.WithFileNameItemRequestBuilder;
import bunny.sdk.generated.edgestorageapiclient.models.File;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /{storageZoneName}/{path}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPathItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.generated.EdgeStorageApiClient.item.item.item collection
     * @param fileName The name of the file that you wish to download.
     * @return a {@link WithFileNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFileNameItemRequestBuilder byFileName(@jakarta.annotation.Nonnull final String fileName) {
        Objects.requireNonNull(fileName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fileName", fileName);
        return new WithFileNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithPathItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPathItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}/{path}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPathItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPathItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}/{path}", rawUrl);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @return a {@link java.util.List<File>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<File> get() {
        return get(null);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<File>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<File> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, File::createFromDiscriminatorValue);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithPathItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPathItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPathItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
