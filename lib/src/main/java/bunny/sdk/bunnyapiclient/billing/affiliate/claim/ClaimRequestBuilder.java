package bunny.sdk.bunnyapiclient.billing.affiliate.claim;

import bunny.sdk.bunnyapiclient.models.billing.claimaffiliatecredits.ClaimAffiliateCreditsResult;
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
 * Builds and executes requests for operations under /billing/affiliate/claim
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClaimRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ClaimRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClaimRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/affiliate/claim", pathParameters);
    }
    /**
     * Instantiates a new {@link ClaimRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClaimRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/affiliate/claim", rawUrl);
    }
    /**
     * [ClaimAffiliateCredits API Docs](https://docs.bunny.net/reference/billingpublic_affiliateclaim)
     * @return a {@link ClaimAffiliateCreditsResult}
     */
    @jakarta.annotation.Nullable
    public ClaimAffiliateCreditsResult post() {
        return post(null);
    }
    /**
     * [ClaimAffiliateCredits API Docs](https://docs.bunny.net/reference/billingpublic_affiliateclaim)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ClaimAffiliateCreditsResult}
     */
    @jakarta.annotation.Nullable
    public ClaimAffiliateCreditsResult post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ClaimAffiliateCreditsResult::createFromDiscriminatorValue);
    }
    /**
     * [ClaimAffiliateCredits API Docs](https://docs.bunny.net/reference/billingpublic_affiliateclaim)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * [ClaimAffiliateCredits API Docs](https://docs.bunny.net/reference/billingpublic_affiliateclaim)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ClaimRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClaimRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ClaimRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
