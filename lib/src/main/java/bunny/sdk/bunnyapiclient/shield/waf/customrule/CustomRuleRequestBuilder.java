package bunny.sdk.bunnyapiclient.shield.waf.customrule;

import bunny.sdk.bunnyapiclient.models.shield.CreateCustomWafRuleRequest;
import bunny.sdk.bunnyapiclient.models.shield.CustomWafRule;
import bunny.sdk.bunnyapiclient.models.shield.UnauthorizedResult;
import bunny.sdk.bunnyapiclient.shield.waf.customrule.item.CustomRuleItemRequestBuilder;
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
 * Builds and executes requests for operations under /shield/waf/custom-rule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomRuleRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.shield.waf.customRule.item collection
     * @param id Unique identifier of the item
     * @return a {@link CustomRuleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomRuleItemRequestBuilder byId(@jakarta.annotation.Nonnull final Integer id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new CustomRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CustomRuleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomRuleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/waf/custom-rule", pathParameters);
    }
    /**
     * Instantiates a new {@link CustomRuleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomRuleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/waf/custom-rule", rawUrl);
    }
    /**
     * @param body The request body
     * @return a {@link CustomWafRule}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CustomWafRule post(@jakarta.annotation.Nonnull final CreateCustomWafRuleRequest body) {
        return post(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomWafRule}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public CustomWafRule post(@jakarta.annotation.Nonnull final CreateCustomWafRuleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomWafRule::createFromDiscriminatorValue);
    }
    /**
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateCustomWafRuleRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateCustomWafRuleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CustomRuleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomRuleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustomRuleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
