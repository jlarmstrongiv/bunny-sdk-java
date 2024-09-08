package bunny.sdk.streamapiclient.library.item.videos.item.resolutions;

import bunny.sdk.streamapiclient.library.item.videos.item.resolutions.cleanup.CleanupRequestBuilder;
import bunny.sdk.streamapiclient.models.managevideos.videoresolutionsinfo.VideoResolutionsInfoResult;
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
 * Builds and executes requests for operations under /library/{libraryId}/videos/{videoId}/resolutions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResolutionsRequestBuilder extends BaseRequestBuilder {
    /**
     * The cleanup property
     * @return a {@link CleanupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CleanupRequestBuilder cleanup() {
        return new CleanupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ResolutionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResolutionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/resolutions", pathParameters);
    }
    /**
     * Instantiates a new {@link ResolutionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResolutionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/resolutions", rawUrl);
    }
    /**
     * [VideoResolutionsInfo API Docs](https://docs.bunny.net/reference/video_getvideoresolutions)
     * @return a {@link VideoResolutionsInfoResult}
     */
    @jakarta.annotation.Nullable
    public VideoResolutionsInfoResult get() {
        return get(null);
    }
    /**
     * [VideoResolutionsInfo API Docs](https://docs.bunny.net/reference/video_getvideoresolutions)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VideoResolutionsInfoResult}
     */
    @jakarta.annotation.Nullable
    public VideoResolutionsInfoResult get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VideoResolutionsInfoResult::createFromDiscriminatorValue);
    }
    /**
     * [VideoResolutionsInfo API Docs](https://docs.bunny.net/reference/video_getvideoresolutions)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [VideoResolutionsInfo API Docs](https://docs.bunny.net/reference/video_getvideoresolutions)
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
     * @return a {@link ResolutionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResolutionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ResolutionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
