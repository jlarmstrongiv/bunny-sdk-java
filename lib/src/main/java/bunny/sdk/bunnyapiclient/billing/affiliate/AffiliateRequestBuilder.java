package bunny.sdk.bunnyapiclient.billing.affiliate;

import bunny.sdk.bunnyapiclient.billing.affiliate.claim.ClaimRequestBuilder;
import bunny.sdk.bunnyapiclient.models.billing.getaffiliatedetails.AffiliateDetailsResult;
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
 * Builds and executes requests for operations under /billing/affiliate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AffiliateRequestBuilder extends BaseRequestBuilder {
    /**
     * The claim property
     * @return a {@link ClaimRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClaimRequestBuilder claim() {
        return new ClaimRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AffiliateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AffiliateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/affiliate", pathParameters);
    }
    /**
     * Instantiates a new {@link AffiliateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AffiliateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/affiliate", rawUrl);
    }
    /**
     * [GetAffiliateDetails API Docs](https://docs.bunny.net/reference/billingpublic_affiliatedetails)
     * @return a {@link AffiliateDetailsResult}
     */
    @jakarta.annotation.Nullable
    public AffiliateDetailsResult get() {
        return get(null);
    }
    /**
     * [GetAffiliateDetails API Docs](https://docs.bunny.net/reference/billingpublic_affiliatedetails)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AffiliateDetailsResult}
     */
    @jakarta.annotation.Nullable
    public AffiliateDetailsResult get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AffiliateDetailsResult::createFromDiscriminatorValue);
    }
    /**
     * [GetAffiliateDetails API Docs](https://docs.bunny.net/reference/billingpublic_affiliatedetails)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetAffiliateDetails API Docs](https://docs.bunny.net/reference/billingpublic_affiliatedetails)
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AffiliateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AffiliateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AffiliateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}