package bunny.sdk.bunnyapiclient.pullzone.item.originshield.queuestatistics;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /pullzone/{-id}/originshield/queuestatistics
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueuestatisticsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link QueuestatisticsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueuestatisticsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/originshield/queuestatistics{?dateFrom,dateTo,hourly}", pathParameters);
    }
    /**
     * Instantiates a new {@link QueuestatisticsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueuestatisticsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/originshield/queuestatistics{?dateFrom,dateTo,hourly}", rawUrl);
    }
    /**
     * [GetOriginShieldQueueStatistics API Docs](https://docs.bunny.net/reference/pullzonepublic_originshieldconcurrencystatistics)
     * @return a {@link QueuestatisticsGetResponse}
     */
    @jakarta.annotation.Nullable
    public QueuestatisticsGetResponse get() {
        return get(null);
    }
    /**
     * [GetOriginShieldQueueStatistics API Docs](https://docs.bunny.net/reference/pullzonepublic_originshieldconcurrencystatistics)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link QueuestatisticsGetResponse}
     */
    @jakarta.annotation.Nullable
    public QueuestatisticsGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, QueuestatisticsGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [GetOriginShieldQueueStatistics API Docs](https://docs.bunny.net/reference/pullzonepublic_originshieldconcurrencystatistics)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetOriginShieldQueueStatistics API Docs](https://docs.bunny.net/reference/pullzonepublic_originshieldconcurrencystatistics)
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
     * @return a {@link QueuestatisticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QueuestatisticsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new QueuestatisticsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [GetOriginShieldQueueStatistics API Docs](https://docs.bunny.net/reference/pullzonepublic_originshieldconcurrencystatistics)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The start date of the statistics. If no value is passed, the last 30 days will be returned.
         */
        @jakarta.annotation.Nullable
        public OffsetDateTime dateFrom;
        /**
         * The end date of the statistics. If no value is passed, the last 30 days will be returned.
         */
        @jakarta.annotation.Nullable
        public OffsetDateTime dateTo;
        /**
         * If true, the statistics data will be returned in hourly grouping.
         */
        @jakarta.annotation.Nullable
        public Boolean hourly;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("dateFrom", dateFrom);
            allQueryParams.put("dateTo", dateTo);
            allQueryParams.put("hourly", hourly);
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
