package bunny.sdk.bunnyapiclient.pullzone;

import bunny.sdk.bunnyapiclient.models.pullzone.PullZone;
import bunny.sdk.bunnyapiclient.models.pullzone.PullZoneCreate;
import bunny.sdk.bunnyapiclient.pullzone.checkavailability.CheckavailabilityRequestBuilder;
import bunny.sdk.bunnyapiclient.pullzone.item.ItemRequestBuilder;
import bunny.sdk.bunnyapiclient.pullzone.loadfreecertificate.LoadFreeCertificateRequestBuilder;
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
 * Builds and executes requests for operations under /pullzone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PullzoneRequestBuilder extends BaseRequestBuilder {
    /**
     * The checkavailability property
     * @return a {@link CheckavailabilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckavailabilityRequestBuilder checkavailability() {
        return new CheckavailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The loadFreeCertificate property
     * @return a {@link LoadFreeCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoadFreeCertificateRequestBuilder loadFreeCertificate() {
        return new LoadFreeCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.pullzone.item collection
     * @param id The ID of the Pull Zone that should be returned
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
     * Instantiates a new {@link PullzoneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PullzoneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone?includeCertificate={includeCertificate}&page={page}&perPage={perPage}{&search*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PullzoneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PullzoneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone?includeCertificate={includeCertificate}&page={page}&perPage={perPage}{&search*}", rawUrl);
    }
    /**
     * [ListPullZones API Docs](https://docs.bunny.net/reference/pullzonepublic_index)
     * @return a {@link PullzoneGetResponse}
     */
    @jakarta.annotation.Nullable
    public PullzoneGetResponse get() {
        return get(null);
    }
    /**
     * [ListPullZones API Docs](https://docs.bunny.net/reference/pullzonepublic_index)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PullzoneGetResponse}
     */
    @jakarta.annotation.Nullable
    public PullzoneGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PullzoneGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [AddPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_add)
     * @param body The request body
     * @return a {@link PullZone}
     */
    @jakarta.annotation.Nullable
    public PullZone post(@jakarta.annotation.Nonnull final PullZoneCreate body) {
        return post(body, null);
    }
    /**
     * [AddPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_add)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PullZone}
     */
    @jakarta.annotation.Nullable
    public PullZone post(@jakarta.annotation.Nonnull final PullZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PullZone::createFromDiscriminatorValue);
    }
    /**
     * [ListPullZones API Docs](https://docs.bunny.net/reference/pullzonepublic_index)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [ListPullZones API Docs](https://docs.bunny.net/reference/pullzonepublic_index)
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
     * [AddPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_add)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PullZoneCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [AddPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_add)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PullZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/pullzone", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PullzoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PullzoneRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PullzoneRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [ListPullZones API Docs](https://docs.bunny.net/reference/pullzonepublic_index)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Determines if the result hostnames should contain the SSL certificate
         */
        @jakarta.annotation.Nullable
        public Boolean includeCertificate;
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
            allQueryParams.put("includeCertificate", includeCertificate);
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
