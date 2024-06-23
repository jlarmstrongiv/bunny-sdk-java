package bunny.sdk.generated.streamapiclient.library.item.videos.item;

import bunny.sdk.generated.streamapiclient.library.item.videos.item.captions.CaptionsRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.item.heatmap.HeatmapRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.item.play.PlayRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.item.reencode.ReencodeRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.item.repackage.RepackageRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.item.thumbnail.ThumbnailRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.item.transcribe.TranscribeRequestBuilder;
import bunny.sdk.generated.streamapiclient.models.managevideos.Video;
import bunny.sdk.generated.streamapiclient.models.managevideos.VideoCreate;
import bunny.sdk.generated.streamapiclient.models.StructuredSuccessResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /library/{libraryId}/videos/{videoId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The captions property
     * @return a {@link CaptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CaptionsRequestBuilder captions() {
        return new CaptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The heatmap property
     * @return a {@link HeatmapRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HeatmapRequestBuilder heatmap() {
        return new HeatmapRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The play property
     * @return a {@link PlayRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlayRequestBuilder play() {
        return new PlayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reencode property
     * @return a {@link ReencodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReencodeRequestBuilder reencode() {
        return new ReencodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The repackage property
     * @return a {@link RepackageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RepackageRequestBuilder repackage() {
        return new RepackageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The thumbnail property
     * @return a {@link ThumbnailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThumbnailRequestBuilder thumbnail() {
        return new ThumbnailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transcribe property
     * @return a {@link TranscribeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TranscribeRequestBuilder transcribe() {
        return new TranscribeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}{?enabledResolutions*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}{?enabledResolutions*}", rawUrl);
    }
    /**
     * [DeleteVideo API Docs](https://docs.bunny.net/reference/video_deletevideo)
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse delete() {
        return delete(null);
    }
    /**
     * [DeleteVideo API Docs](https://docs.bunny.net/reference/video_deletevideo)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StructuredSuccessResponse::createFromDiscriminatorValue);
    }
    /**
     * [GetVideo API Docs](https://docs.bunny.net/reference/video_getvideo)
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video get() {
        return get(null);
    }
    /**
     * [GetVideo API Docs](https://docs.bunny.net/reference/video_getvideo)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Video::createFromDiscriminatorValue);
    }
    /**
     * [UpdateVideo API Docs](https://docs.bunny.net/reference/video_updatevideo)
     * @param body The request body
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse post(@jakarta.annotation.Nonnull final VideoCreate body) {
        return post(body, null);
    }
    /**
     * [UpdateVideo API Docs](https://docs.bunny.net/reference/video_updatevideo)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse post(@jakarta.annotation.Nonnull final VideoCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StructuredSuccessResponse::createFromDiscriminatorValue);
    }
    /**
     * [UploadVideo API Docs](https://docs.bunny.net/reference/video_uploadvideo)
     * @param body Binary request body
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse put(@jakarta.annotation.Nonnull final InputStream body) {
        return put(body, null);
    }
    /**
     * [UploadVideo API Docs](https://docs.bunny.net/reference/video_uploadvideo)
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse put(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StructuredSuccessResponse::createFromDiscriminatorValue);
    }
    /**
     * [DeleteVideo API Docs](https://docs.bunny.net/reference/video_deletevideo)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteVideo API Docs](https://docs.bunny.net/reference/video_deletevideo)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * [GetVideo API Docs](https://docs.bunny.net/reference/video_getvideo)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetVideo API Docs](https://docs.bunny.net/reference/video_getvideo)
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
     * [UpdateVideo API Docs](https://docs.bunny.net/reference/video_updatevideo)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VideoCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdateVideo API Docs](https://docs.bunny.net/reference/video_updatevideo)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VideoCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * [UploadVideo API Docs](https://docs.bunny.net/reference/video_uploadvideo)
     * @param body Binary request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InputStream body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * [UploadVideo API Docs](https://docs.bunny.net/reference/video_uploadvideo)
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setStreamContent(body, "application/octet-stream");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithVideoItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * [UploadVideo API Docs](https://docs.bunny.net/reference/video_uploadvideo)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String enabledResolutions;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("enabledResolutions", enabledResolutions);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PutQueryParameters queryParameters = new PutQueryParameters();
    }
}
