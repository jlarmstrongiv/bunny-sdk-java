package bunny.sdk.bunnyapiclient.shield.ratelimit.item;

import bunny.sdk.bunnyapiclient.models.shield.CustomWafRule;
import bunny.sdk.bunnyapiclient.models.shield.GenericRequestResponse;
import bunny.sdk.bunnyapiclient.models.shield.UnauthorizedResult;
import bunny.sdk.bunnyapiclient.models.shield.UpdateWafRateLimitRequest;
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
 * Builds and executes requests for operations under /shield/rate-limit/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateLimitItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RateLimitItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RateLimitItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/rate-limit/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link RateLimitItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RateLimitItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/rate-limit/{id}", rawUrl);
    }
    /**
     * @return a {@link GenericRequestResponse}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public GenericRequestResponse delete() {
        return delete(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GenericRequestResponse}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public GenericRequestResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GenericRequestResponse::createFromDiscriminatorValue);
    }
    /**
     * @return a {@link CustomWafRule}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CustomWafRule get() {
        return get(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomWafRule}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CustomWafRule get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomWafRule::createFromDiscriminatorValue);
    }
    /**
     * @param body The request body
     * @return a {@link CustomWafRule}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CustomWafRule patch(@jakarta.annotation.Nonnull final UpdateWafRateLimitRequest body) {
        return patch(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomWafRule}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CustomWafRule patch(@jakarta.annotation.Nonnull final UpdateWafRateLimitRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomWafRule::createFromDiscriminatorValue);
    }
    /**
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, text/plain;q=0.9");
        return requestInfo;
    }
    /**
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, text/plain;q=0.9");
        return requestInfo;
    }
    /**
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdateWafRateLimitRequest body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdateWafRateLimitRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, text/plain;q=0.9");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link RateLimitItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateLimitItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RateLimitItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
