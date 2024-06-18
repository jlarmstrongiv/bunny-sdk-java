package bunny.sdk.generated.bunnyapiclient.dnszone.item.records;

import bunny.sdk.generated.bunnyapiclient.dnszone.item.records.item.RecordsItemRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.models.dnszone.DnsRecord;
import bunny.sdk.generated.bunnyapiclient.models.StructuredBadRequestResponse;
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
 * Builds and executes requests for operations under /dnszone/{-id}/records
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecordsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.generated.BunnyApiClient.dnszone.item.records.item collection
     * @param id The ID of the DNS record that will be updated.
     * @return a {@link RecordsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecordsItemRequestBuilder byId(@jakarta.annotation.Nonnull final Long id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new RecordsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link RecordsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecordsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/{%2Did}/records", pathParameters);
    }
    /**
     * Instantiates a new {@link RecordsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecordsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/{%2Did}/records", rawUrl);
    }
    /**
     * [AddDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_addrecord)
     * @param body The request body
     * @return a {@link DnsRecord}
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public DnsRecord put(@jakarta.annotation.Nonnull final RecordsPutRequestBody body) {
        return put(body, null);
    }
    /**
     * [AddDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_addrecord)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DnsRecord}
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public DnsRecord put(@jakarta.annotation.Nonnull final RecordsPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", StructuredBadRequestResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DnsRecord::createFromDiscriminatorValue);
    }
    /**
     * [AddDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_addrecord)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final RecordsPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * [AddDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_addrecord)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final RecordsPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link RecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecordsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RecordsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
