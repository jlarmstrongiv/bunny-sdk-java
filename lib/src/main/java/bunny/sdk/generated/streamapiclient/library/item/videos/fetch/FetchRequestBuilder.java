package bunny.sdk.generated.streamapiclient.library.item.videos.fetch;

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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /library/{libraryId}/videos/fetch
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FetchRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FetchRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FetchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/fetch{?collectionId*,thumbnailTime*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FetchRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FetchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/fetch{?collectionId*,thumbnailTime*}", rawUrl);
    }
    /**
     * [FetchVideo API Docs](https://docs.bunny.net/reference/video_fetchnewvideo)
     * @param body The request body
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse post(@jakarta.annotation.Nonnull final FetchPostRequestBody body) {
        return post(body, null);
    }
    /**
     * [FetchVideo API Docs](https://docs.bunny.net/reference/video_fetchnewvideo)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse post(@jakarta.annotation.Nonnull final FetchPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StructuredSuccessResponse::createFromDiscriminatorValue);
    }
    /**
     * [FetchVideo API Docs](https://docs.bunny.net/reference/video_fetchnewvideo)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FetchPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [FetchVideo API Docs](https://docs.bunny.net/reference/video_fetchnewvideo)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FetchPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FetchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FetchRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FetchRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [FetchVideo API Docs](https://docs.bunny.net/reference/video_fetchnewvideo)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String collectionId;
        /**
         * Video time in ms to extract the main video thumbnail.
         */
        @jakarta.annotation.Nullable
        public Integer thumbnailTime;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("collectionId", collectionId);
            allQueryParams.put("thumbnailTime", thumbnailTime);
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
