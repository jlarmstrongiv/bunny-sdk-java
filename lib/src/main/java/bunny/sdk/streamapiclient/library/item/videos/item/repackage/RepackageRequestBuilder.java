package bunny.sdk.streamapiclient.library.item.videos.item.repackage;

import bunny.sdk.streamapiclient.models.managevideos.Video;
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
 * Builds and executes requests for operations under /library/{libraryId}/videos/{videoId}/repackage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RepackageRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RepackageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RepackageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/repackage?keepOriginalFiles={keepOriginalFiles}", pathParameters);
    }
    /**
     * Instantiates a new {@link RepackageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RepackageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/repackage?keepOriginalFiles={keepOriginalFiles}", rawUrl);
    }
    /**
     * [RepackageVideo API Docs](https://docs.bunny.net/reference/video_repackage)
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video post() {
        return post(null);
    }
    /**
     * [RepackageVideo API Docs](https://docs.bunny.net/reference/video_repackage)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Video::createFromDiscriminatorValue);
    }
    /**
     * [RepackageVideo API Docs](https://docs.bunny.net/reference/video_repackage)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * [RepackageVideo API Docs](https://docs.bunny.net/reference/video_repackage)
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
     * @return a {@link RepackageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RepackageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RepackageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [RepackageVideo API Docs](https://docs.bunny.net/reference/video_repackage)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        /**
         * Marks whether previous file versions should be kept in storage, allows for faster repackage later on. Default is true.
         */
        @jakarta.annotation.Nullable
        public Boolean keepOriginalFiles;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("keepOriginalFiles", keepOriginalFiles);
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
