package bunny.sdk.bunnyapiclient.videolibrary.item;

import bunny.sdk.bunnyapiclient.models.streamvideolibrary.VideoLibrary;
import bunny.sdk.bunnyapiclient.videolibrary.item.addallowedreferrer.AddAllowedReferrerRequestBuilder;
import bunny.sdk.bunnyapiclient.videolibrary.item.addblockedreferrer.AddBlockedReferrerRequestBuilder;
import bunny.sdk.bunnyapiclient.videolibrary.item.removeallowedreferrer.RemoveAllowedReferrerRequestBuilder;
import bunny.sdk.bunnyapiclient.videolibrary.item.removeblockedreferrer.RemoveBlockedReferrerRequestBuilder;
import bunny.sdk.bunnyapiclient.videolibrary.item.resetapikey.ResetApiKeyRequestBuilder;
import bunny.sdk.bunnyapiclient.videolibrary.item.watermark.WatermarkRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /videolibrary/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideolibraryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The addAllowedReferrer property
     * @return a {@link AddAllowedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddAllowedReferrerRequestBuilder addAllowedReferrer() {
        return new AddAllowedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The addBlockedReferrer property
     * @return a {@link AddBlockedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddBlockedReferrerRequestBuilder addBlockedReferrer() {
        return new AddBlockedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeAllowedReferrer property
     * @return a {@link RemoveAllowedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveAllowedReferrerRequestBuilder removeAllowedReferrer() {
        return new RemoveAllowedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeBlockedReferrer property
     * @return a {@link RemoveBlockedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveBlockedReferrerRequestBuilder removeBlockedReferrer() {
        return new RemoveBlockedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The resetApiKey property
     * @return a {@link ResetApiKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetApiKeyRequestBuilder resetApiKey() {
        return new ResetApiKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The watermark property
     * @return a {@link WatermarkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WatermarkRequestBuilder watermark() {
        return new WatermarkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideolibraryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideolibraryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videolibrary/{id}?includeAccessKey={includeAccessKey}", pathParameters);
    }
    /**
     * Instantiates a new {@link VideolibraryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideolibraryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videolibrary/{id}?includeAccessKey={includeAccessKey}", rawUrl);
    }
    /**
     * [DeleteVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_delete)
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeleteVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * [GetVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_index2)
     * @return a {@link VideoLibrary}
     */
    @jakarta.annotation.Nullable
    public VideoLibrary get() {
        return get(null);
    }
    /**
     * [GetVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_index2)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VideoLibrary}
     */
    @jakarta.annotation.Nullable
    public VideoLibrary get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VideoLibrary::createFromDiscriminatorValue);
    }
    /**
     * [UpdateVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_update)
     * @param body The template for adding optional properties.
     * @return a {@link VideoLibrary}
     */
    @jakarta.annotation.Nullable
    public VideoLibrary post(@jakarta.annotation.Nonnull final VideolibraryPostRequestBody body) {
        return post(body, null);
    }
    /**
     * [UpdateVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_update)
     * @param body The template for adding optional properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VideoLibrary}
     */
    @jakarta.annotation.Nullable
    public VideoLibrary post(@jakarta.annotation.Nonnull final VideolibraryPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VideoLibrary::createFromDiscriminatorValue);
    }
    /**
     * [DeleteVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_delete)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/videolibrary/{id}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * [GetVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_index2)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_index2)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * [UpdateVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_update)
     * @param body The template for adding optional properties.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VideolibraryPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdateVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_update)
     * @param body The template for adding optional properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VideolibraryPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/videolibrary/{id}", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link VideolibraryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideolibraryItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VideolibraryItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * [GetVideoLibrary API Docs](https://docs.bunny.net/reference/videolibrarypublic_index2)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Boolean includeAccessKey;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("includeAccessKey", includeAccessKey);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
