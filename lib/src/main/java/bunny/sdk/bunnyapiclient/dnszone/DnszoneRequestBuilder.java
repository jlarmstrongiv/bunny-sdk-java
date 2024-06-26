package bunny.sdk.bunnyapiclient.dnszone;

import bunny.sdk.bunnyapiclient.dnszone.checkavailability.CheckavailabilityRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.item.ItemRequestBuilder;
import bunny.sdk.bunnyapiclient.models.dnszone.DnsZone;
import bunny.sdk.bunnyapiclient.models.StructuredBadRequestResponse;
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
 * Builds and executes requests for operations under /dnszone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnszoneRequestBuilder extends BaseRequestBuilder {
    /**
     * The checkavailability property
     * @return a {@link CheckavailabilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckavailabilityRequestBuilder checkavailability() {
        return new CheckavailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.dnszone.item collection
     * @param id The ID of the DNS Zone that will be returned
     * @return a {@link ItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemRequestBuilder byId(@jakarta.annotation.Nonnull final Long id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("%2Did", id);
        return new ItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DnszoneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DnszoneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone?page={page}&perPage={perPage}&search={search}", pathParameters);
    }
    /**
     * Instantiates a new {@link DnszoneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DnszoneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone?page={page}&perPage={perPage}&search={search}", rawUrl);
    }
    /**
     * [ListDnsZones API Docs](https://docs.bunny.net/reference/dnszonepublic_index)
     * @return a {@link DnszoneGetResponse}
     */
    @jakarta.annotation.Nullable
    public DnszoneGetResponse get() {
        return get(null);
    }
    /**
     * [ListDnsZones API Docs](https://docs.bunny.net/reference/dnszonepublic_index)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DnszoneGetResponse}
     */
    @jakarta.annotation.Nullable
    public DnszoneGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DnszoneGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [AddDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_add)
     * @param body The request body
     * @return a {@link DnsZone}
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public DnsZone post(@jakarta.annotation.Nonnull final DnszonePostRequestBody body) {
        return post(body, null);
    }
    /**
     * [AddDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_add)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DnsZone}
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public DnsZone post(@jakarta.annotation.Nonnull final DnszonePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", StructuredBadRequestResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DnsZone::createFromDiscriminatorValue);
    }
    /**
     * [ListDnsZones API Docs](https://docs.bunny.net/reference/dnszonepublic_index)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [ListDnsZones API Docs](https://docs.bunny.net/reference/dnszonepublic_index)
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
     * [AddDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_add)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DnszonePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [AddDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_add)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DnszonePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/dnszone", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DnszoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DnszoneRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DnszoneRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [ListDnsZones API Docs](https://docs.bunny.net/reference/dnszonepublic_index)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer page;
        @jakarta.annotation.Nullable
        public Integer perPage;
        /**
         * The search term that will be used to filter the results
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("page", page);
            allQueryParams.put("perPage", perPage);
            allQueryParams.put("search", search);
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
