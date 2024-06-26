package bunny.sdk.bunnyapiclient.dnszone.item.records.item;

import bunny.sdk.bunnyapiclient.models.dnszone.updatednsrecord.OptionalParameters;
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
 * Builds and executes requests for operations under /dnszone/{-id}/records/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecordsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RecordsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecordsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/{%2Did}/records/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link RecordsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecordsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/{%2Did}/records/{id}", rawUrl);
    }
    /**
     * [DeleteDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_deleterecord)
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeleteDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_deleterecord)
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
     * [UpdateDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_updaterecord)
     * @param body The template for adding optional properties.
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    public void post(@jakarta.annotation.Nonnull final OptionalParameters body) {
        post(body, null);
    }
    /**
     * [UpdateDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_updaterecord)
     * @param body The template for adding optional properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    public void post(@jakarta.annotation.Nonnull final OptionalParameters body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", StructuredBadRequestResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * [DeleteDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_deleterecord)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_deleterecord)
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
     * [UpdateDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_updaterecord)
     * @param body The template for adding optional properties.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OptionalParameters body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdateDnsRecord API Docs](https://docs.bunny.net/reference/dnszonepublic_updaterecord)
     * @param body The template for adding optional properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OptionalParameters body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RecordsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecordsItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RecordsItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
