package bunny.sdk.streamapiclient.library.item.videos.item.resolutions.cleanup;

import bunny.sdk.streamapiclient.models.managevideos.cleanupunconfiguredresolutions.CleanupUnconfiguredResolutionsResult;
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
 * Builds and executes requests for operations under /library/{libraryId}/videos/{videoId}/resolutions/cleanup
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CleanupRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CleanupRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CleanupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/resolutions/cleanup{?deleteMp4Files,deleteNonConfiguredResolutions,deleteOriginal,resolutionsToDelete}", pathParameters);
    }
    /**
     * Instantiates a new {@link CleanupRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CleanupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/resolutions/cleanup{?deleteMp4Files,deleteNonConfiguredResolutions,deleteOriginal,resolutionsToDelete}", rawUrl);
    }
    /**
     * [CleanupUnconfiguredResolutions API Docs](https://docs.bunny.net/reference/video_deleteresolutions)
     * @return a {@link CleanupUnconfiguredResolutionsResult}
     */
    @jakarta.annotation.Nullable
    public CleanupUnconfiguredResolutionsResult post() {
        return post(null);
    }
    /**
     * [CleanupUnconfiguredResolutions API Docs](https://docs.bunny.net/reference/video_deleteresolutions)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CleanupUnconfiguredResolutionsResult}
     */
    @jakarta.annotation.Nullable
    public CleanupUnconfiguredResolutionsResult post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CleanupUnconfiguredResolutionsResult::createFromDiscriminatorValue);
    }
    /**
     * [CleanupUnconfiguredResolutions API Docs](https://docs.bunny.net/reference/video_deleteresolutions)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * [CleanupUnconfiguredResolutions API Docs](https://docs.bunny.net/reference/video_deleteresolutions)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CleanupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CleanupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CleanupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [CleanupUnconfiguredResolutions API Docs](https://docs.bunny.net/reference/video_deleteresolutions)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Boolean deleteMp4Files;
        @jakarta.annotation.Nullable
        public Boolean deleteNonConfiguredResolutions;
        @jakarta.annotation.Nullable
        public Boolean deleteOriginal;
        @jakarta.annotation.Nullable
        public String resolutionsToDelete;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("deleteMp4Files", deleteMp4Files);
            allQueryParams.put("deleteNonConfiguredResolutions", deleteNonConfiguredResolutions);
            allQueryParams.put("deleteOriginal", deleteOriginal);
            allQueryParams.put("resolutionsToDelete", resolutionsToDelete);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
    }
}
