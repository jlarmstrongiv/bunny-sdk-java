package bunny.sdk.bunnyapiclient.shield.waf;

import bunny.sdk.bunnyapiclient.shield.waf.customrule.CustomRuleRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.waf.customrules.CustomRulesRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.waf.engineconfig.EngineConfigRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.waf.enums.EnumsRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.waf.profiles.ProfilesRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.waf.rules.RulesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shield/waf
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WafRequestBuilder extends BaseRequestBuilder {
    /**
     * The customRule property
     * @return a {@link CustomRuleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomRuleRequestBuilder customRule() {
        return new CustomRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The customRules property
     * @return a {@link CustomRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomRulesRequestBuilder customRules() {
        return new CustomRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The engineConfig property
     * @return a {@link EngineConfigRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EngineConfigRequestBuilder engineConfig() {
        return new EngineConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The enums property
     * @return a {@link EnumsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnumsRequestBuilder enums() {
        return new EnumsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The profiles property
     * @return a {@link ProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProfilesRequestBuilder profiles() {
        return new ProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rules property
     * @return a {@link RulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RulesRequestBuilder rules() {
        return new RulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WafRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WafRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/waf", pathParameters);
    }
    /**
     * Instantiates a new {@link WafRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WafRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/waf", rawUrl);
    }
}
