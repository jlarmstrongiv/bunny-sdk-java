package bunny.sdk.bunnyapiclient.dnszone.item;

import bunny.sdk.bunnyapiclient.dnszone.item.dismissnameservercheck.DismissnameservercheckRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.item.export.ExportRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.item.importescaped.ImportRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.item.recheckdns.RecheckdnsRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.item.records.RecordsRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.item.statistics.StatisticsRequestBuilder;
import bunny.sdk.bunnyapiclient.models.dnszone.DnsZone;
import bunny.sdk.bunnyapiclient.models.dnszone.DnsZoneCreate;
import bunny.sdk.bunnyapiclient.models.StructuredBadRequestResponse;
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
 * Builds and executes requests for operations under /dnszone/{-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The dismissnameservercheck property
     * @return a {@link DismissnameservercheckRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DismissnameservercheckRequestBuilder dismissnameservercheck() {
        return new DismissnameservercheckRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The export property
     * @return a {@link ExportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExportRequestBuilder export() {
        return new ExportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The import property
     * @return a {@link ImportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImportRequestBuilder importEscaped() {
        return new ImportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The recheckdns property
     * @return a {@link RecheckdnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecheckdnsRequestBuilder recheckdns() {
        return new RecheckdnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The records property
     * @return a {@link RecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecordsRequestBuilder records() {
        return new RecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The statistics property
     * @return a {@link StatisticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatisticsRequestBuilder statistics() {
        return new StatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/{%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link ItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/{%2Did}", rawUrl);
    }
    /**
     * [DeleteDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_delete)
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeleteDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", StructuredBadRequestResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * [GetDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_index2)
     * @return a {@link DnsZone}
     */
    @jakarta.annotation.Nullable
    public DnsZone get() {
        return get(null);
    }
    /**
     * [GetDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_index2)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DnsZone}
     */
    @jakarta.annotation.Nullable
    public DnsZone get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DnsZone::createFromDiscriminatorValue);
    }
    /**
     * [UpdateDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_update)
     * @param body The request body
     * @return a {@link DnsZone}
     */
    @jakarta.annotation.Nullable
    public DnsZone post(@jakarta.annotation.Nonnull final DnsZoneCreate body) {
        return post(body, null);
    }
    /**
     * [UpdateDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_update)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DnsZone}
     */
    @jakarta.annotation.Nullable
    public DnsZone post(@jakarta.annotation.Nonnull final DnsZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DnsZone::createFromDiscriminatorValue);
    }
    /**
     * [DeleteDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_delete)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * [GetDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_index2)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_index2)
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
     * [UpdateDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_update)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DnsZoneCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdateDnsZone API Docs](https://docs.bunny.net/reference/dnszonepublic_update)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DnsZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
