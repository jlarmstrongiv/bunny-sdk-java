package bunny.sdk.generated.streamapiclient.oembed;

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
 * Builds and executes requests for operations under /OEmbed
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OEmbedRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link OEmbedRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OEmbedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/OEmbed?expires={expires}{&maxHeight*,maxWidth*,token*,url*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OEmbedRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OEmbedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/OEmbed?expires={expires}{&maxHeight*,maxWidth*,token*,url*}", rawUrl);
    }
    /**
     * [OEmbed API Docs](https://docs.bunny.net/reference/oembed_getoembed)
     * @return a {@link OEmbedGetResponse}
     */
    @jakarta.annotation.Nullable
    public OEmbedGetResponse get() {
        return get(null);
    }
    /**
     * [OEmbed API Docs](https://docs.bunny.net/reference/oembed_getoembed)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OEmbedGetResponse}
     */
    @jakarta.annotation.Nullable
    public OEmbedGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OEmbedGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [OEmbed API Docs](https://docs.bunny.net/reference/oembed_getoembed)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [OEmbed API Docs](https://docs.bunny.net/reference/oembed_getoembed)
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OEmbedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OEmbedRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OEmbedRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [OEmbed API Docs](https://docs.bunny.net/reference/oembed_getoembed)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Long expires;
        @jakarta.annotation.Nullable
        public Integer maxHeight;
        @jakarta.annotation.Nullable
        public Integer maxWidth;
        @jakarta.annotation.Nullable
        public String token;
        @jakarta.annotation.Nullable
        public String url;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("expires", expires);
            allQueryParams.put("maxHeight", maxHeight);
            allQueryParams.put("maxWidth", maxWidth);
            allQueryParams.put("token", token);
            allQueryParams.put("url", url);
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
}
