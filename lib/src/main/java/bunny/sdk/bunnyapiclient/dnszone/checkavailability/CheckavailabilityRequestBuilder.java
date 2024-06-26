package bunny.sdk.bunnyapiclient.dnszone.checkavailability;

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
 * Builds and executes requests for operations under /dnszone/checkavailability
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CheckavailabilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CheckavailabilityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CheckavailabilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/checkavailability", pathParameters);
    }
    /**
     * Instantiates a new {@link CheckavailabilityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CheckavailabilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dnszone/checkavailability", rawUrl);
    }
    /**
     * [CheckTheDnsZoneAvailability API Docs](https://docs.bunny.net/reference/dnszonepublic_checkavailability)
     * @param body The request body
     * @return a {@link CheckavailabilityPostResponse}
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public CheckavailabilityPostResponse post(@jakarta.annotation.Nonnull final CheckavailabilityPostRequestBody body) {
        return post(body, null);
    }
    /**
     * [CheckTheDnsZoneAvailability API Docs](https://docs.bunny.net/reference/dnszonepublic_checkavailability)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CheckavailabilityPostResponse}
     * @throws StructuredBadRequestResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public CheckavailabilityPostResponse post(@jakarta.annotation.Nonnull final CheckavailabilityPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", StructuredBadRequestResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CheckavailabilityPostResponse::createFromDiscriminatorValue);
    }
    /**
     * [CheckTheDnsZoneAvailability API Docs](https://docs.bunny.net/reference/dnszonepublic_checkavailability)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CheckavailabilityPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [CheckTheDnsZoneAvailability API Docs](https://docs.bunny.net/reference/dnszonepublic_checkavailability)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CheckavailabilityPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CheckavailabilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckavailabilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CheckavailabilityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
