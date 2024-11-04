package bunny.sdk.bunnyapiclient.shield.waf.rules;

import bunny.sdk.bunnyapiclient.models.shield.UnauthorizedResult;
import bunny.sdk.bunnyapiclient.models.shield.WafRuleMainGroupModel;
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
 * Builds and executes requests for operations under /shield/waf/rules
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RulesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RulesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/waf/rules", pathParameters);
    }
    /**
     * Instantiates a new {@link RulesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/waf/rules", rawUrl);
    }
    /**
     * @return a {@link java.util.List<WafRuleMainGroupModel>}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<WafRuleMainGroupModel> get() {
        return get(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<WafRuleMainGroupModel>}
     * @throws UnauthorizedResult When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<WafRuleMainGroupModel> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", UnauthorizedResult::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, WafRuleMainGroupModel::createFromDiscriminatorValue);
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
        requestInfo.headers.tryAdd("Accept", "text/plain;q=0.9");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link RulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RulesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RulesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
