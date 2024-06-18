package bunny.sdk.generated.bunnyapiclient.pullzone.item;

import bunny.sdk.generated.bunnyapiclient.models.pullzone.PullZone;
import bunny.sdk.generated.bunnyapiclient.models.pullzone.PullZoneCreate;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.addallowedreferrer.AddAllowedReferrerRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.addblockedip.AddBlockedIpRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.addblockedreferrer.AddBlockedReferrerRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.addcertificate.AddCertificateRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.addhostname.AddHostnameRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.edgerules.EdgerulesRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.optimizer.OptimizerRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.originshield.OriginshieldRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.purgecache.PurgeCacheRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.removeallowedreferrer.RemoveAllowedReferrerRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.removeblockedip.RemoveBlockedIpRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.removeblockedreferrer.RemoveBlockedReferrerRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.removecertificate.RemoveCertificateRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.removehostname.RemoveHostnameRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.resetsecuritykey.ResetSecurityKeyRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.safehop.SafehopRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.setforcessl.SetForceSSLRequestBuilder;
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
 * Builds and executes requests for operations under /pullzone/{-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The addAllowedReferrer property
     * @return a {@link AddAllowedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddAllowedReferrerRequestBuilder addAllowedReferrer() {
        return new AddAllowedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The addBlockedIp property
     * @return a {@link AddBlockedIpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddBlockedIpRequestBuilder addBlockedIp() {
        return new AddBlockedIpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The addBlockedReferrer property
     * @return a {@link AddBlockedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddBlockedReferrerRequestBuilder addBlockedReferrer() {
        return new AddBlockedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The addCertificate property
     * @return a {@link AddCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddCertificateRequestBuilder addCertificate() {
        return new AddCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The addHostname property
     * @return a {@link AddHostnameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddHostnameRequestBuilder addHostname() {
        return new AddHostnameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The edgerules property
     * @return a {@link EdgerulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EdgerulesRequestBuilder edgerules() {
        return new EdgerulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The optimizer property
     * @return a {@link OptimizerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OptimizerRequestBuilder optimizer() {
        return new OptimizerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The originshield property
     * @return a {@link OriginshieldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OriginshieldRequestBuilder originshield() {
        return new OriginshieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The purgeCache property
     * @return a {@link PurgeCacheRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PurgeCacheRequestBuilder purgeCache() {
        return new PurgeCacheRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeAllowedReferrer property
     * @return a {@link RemoveAllowedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveAllowedReferrerRequestBuilder removeAllowedReferrer() {
        return new RemoveAllowedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeBlockedIp property
     * @return a {@link RemoveBlockedIpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveBlockedIpRequestBuilder removeBlockedIp() {
        return new RemoveBlockedIpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeBlockedReferrer property
     * @return a {@link RemoveBlockedReferrerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveBlockedReferrerRequestBuilder removeBlockedReferrer() {
        return new RemoveBlockedReferrerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeCertificate property
     * @return a {@link RemoveCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveCertificateRequestBuilder removeCertificate() {
        return new RemoveCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The removeHostname property
     * @return a {@link RemoveHostnameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveHostnameRequestBuilder removeHostname() {
        return new RemoveHostnameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The resetSecurityKey property
     * @return a {@link ResetSecurityKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetSecurityKeyRequestBuilder resetSecurityKey() {
        return new ResetSecurityKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The safehop property
     * @return a {@link SafehopRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SafehopRequestBuilder safehop() {
        return new SafehopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The setForceSSL property
     * @return a {@link SetForceSSLRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetForceSSLRequestBuilder setForceSSL() {
        return new SetForceSSLRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}?includeCertificate={includeCertificate}", pathParameters);
    }
    /**
     * Instantiates a new {@link ItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}?includeCertificate={includeCertificate}", rawUrl);
    }
    /**
     * [DeletePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_delete)
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeletePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * [GetPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_index2)
     * @return a {@link PullZone}
     */
    @jakarta.annotation.Nullable
    public PullZone get() {
        return get(null);
    }
    /**
     * [GetPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_index2)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PullZone}
     */
    @jakarta.annotation.Nullable
    public PullZone get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PullZone::createFromDiscriminatorValue);
    }
    /**
     * [UpdatePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_updatepullzone)
     * @param body The request body
     * @return a {@link PullZone}
     */
    @jakarta.annotation.Nullable
    public PullZone post(@jakarta.annotation.Nonnull final PullZoneCreate body) {
        return post(body, null);
    }
    /**
     * [UpdatePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_updatepullzone)
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
     * [DeletePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_delete)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeletePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/pullzone/{%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * [GetPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_index2)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_index2)
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
     * [UpdatePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_updatepullzone)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PullZoneCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdatePullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_updatepullzone)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PullZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/pullzone/{%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * [GetPullZone API Docs](https://docs.bunny.net/reference/pullzonepublic_index2)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Determines if the result hostnames should contain the SSL certificate
         */
        @jakarta.annotation.Nullable
        public Boolean includeCertificate;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("includeCertificate", includeCertificate);
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
