package bunny.sdk.loggingapiclient.withmmwithddwithyy.withpullzoneidlog;

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
 * Builds and executes requests for operations under /{mm}-{dd}-{yy}/{pullZoneId}.log
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPullZoneIdLogRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPullZoneIdLogRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param pullZoneId The path parameter: pullZoneId
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPullZoneIdLogRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final Long pullZoneId) {
        super(requestAdapter, "{+baseurl}/{mm}-{dd}-{yy}/{pullZoneId}.log?end={end}&order={order}&search={search}&start={start}&status={status}", pathParameters);
        this.pathParameters.put("pullZoneId", pullZoneId);
    }
    /**
     * Instantiates a new {@link WithPullZoneIdLogRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPullZoneIdLogRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{mm}-{dd}-{yy}/{pullZoneId}.log?end={end}&order={order}&search={search}&start={start}&status={status}", rawUrl);
    }
    /**
     * [LoggingApi API Docs](https://docs.bunny.net/docs/cdn-logging-api)
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * [LoggingApi API Docs](https://docs.bunny.net/docs/cdn-logging-api)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendPrimitive(requestInfo, null, InputStream.class);
    }
    /**
     * [LoggingApi API Docs](https://docs.bunny.net/docs/cdn-logging-api)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [LoggingApi API Docs](https://docs.bunny.net/docs/cdn-logging-api)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/gzip");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithPullZoneIdLogRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPullZoneIdLogRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPullZoneIdLogRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [LoggingApi API Docs](https://docs.bunny.net/docs/cdn-logging-api)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Long end;
        @jakarta.annotation.Nullable
        public GetOrderQueryParameterType order;
        @jakarta.annotation.Nullable
        public String search;
        @jakarta.annotation.Nullable
        public Long start;
        @jakarta.annotation.Nullable
        public String status;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("order", order);
            allQueryParams.put("end", end);
            allQueryParams.put("search", search);
            allQueryParams.put("start", start);
            allQueryParams.put("status", status);
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
