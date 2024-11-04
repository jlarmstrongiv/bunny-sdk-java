package bunny.sdk.bunnyapiclient.shield.shieldzone;

import bunny.sdk.bunnyapiclient.models.shield.CreateShieldZoneRequest;
import bunny.sdk.bunnyapiclient.models.shield.CreateShieldZoneResponse;
import bunny.sdk.bunnyapiclient.models.shield.UnauthorizedResult;
import bunny.sdk.bunnyapiclient.models.shield.UpdateShieldZoneRequest;
import bunny.sdk.bunnyapiclient.shield.shieldzone.getbypullzone.GetByPullzoneRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.shieldzone.item.WithShieldZoneItemRequestBuilder;
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
 * Builds and executes requests for operations under /shield/shield-zone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShieldZoneRequestBuilder extends BaseRequestBuilder {
    /**
     * The getByPullzone property
     * @return a {@link GetByPullzoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByPullzoneRequestBuilder getByPullzone() {
        return new GetByPullzoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.shield.shieldZone.item collection
     * @param shieldZoneId Unique identifier of the item
     * @return a {@link WithShieldZoneItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithShieldZoneItemRequestBuilder byShieldZoneId(@jakarta.annotation.Nonnull final Integer shieldZoneId) {
        Objects.requireNonNull(shieldZoneId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("shieldZoneId", shieldZoneId);
        return new WithShieldZoneItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ShieldZoneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShieldZoneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/shield-zone", pathParameters);
    }
    /**
     * Instantiates a new {@link ShieldZoneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShieldZoneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/shield-zone", rawUrl);
    }
    /**
     * @param body The request body
     * @return a {@link CreateShieldZoneResponse}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CreateShieldZoneResponse patch(@jakarta.annotation.Nonnull final UpdateShieldZoneRequest body) {
        return patch(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateShieldZoneResponse}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CreateShieldZoneResponse patch(@jakarta.annotation.Nonnull final UpdateShieldZoneRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CreateShieldZoneResponse::createFromDiscriminatorValue);
    }
    /**
     * @param body The request body
     * @return a {@link CreateShieldZoneResponse}
     * @throws UnauthorizedResult When receiving a 401 status code
     * @throws CreateShieldZoneResponse When receiving a 403 status code
     * @throws CreateShieldZoneResponse When receiving a 409 status code
     */
    @jakarta.annotation.Nullable
    public CreateShieldZoneResponse post(@jakarta.annotation.Nonnull final CreateShieldZoneRequest body) {
        return post(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateShieldZoneResponse}
     * @throws UnauthorizedResult When receiving a 401 status code
     * @throws CreateShieldZoneResponse When receiving a 403 status code
     * @throws CreateShieldZoneResponse When receiving a 409 status code
     */
    @jakarta.annotation.Nullable
    public CreateShieldZoneResponse post(@jakarta.annotation.Nonnull final CreateShieldZoneRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        errorMapping.put("403", CreateShieldZoneResponse::createFromDiscriminatorValue);
        errorMapping.put("409", CreateShieldZoneResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CreateShieldZoneResponse::createFromDiscriminatorValue);
    }
    /**
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdateShieldZoneRequest body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdateShieldZoneRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, text/plain;q=0.9");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateShieldZoneRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateShieldZoneRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, text/plain;q=0.9");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ShieldZoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShieldZoneRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ShieldZoneRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
