package bunny.sdk.bunnyapiclient.billing;

import bunny.sdk.bunnyapiclient.billing.affiliate.AffiliateRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingRequestBuilder extends BaseRequestBuilder {
    /**
     * The affiliate property
     * @return a {@link AffiliateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AffiliateRequestBuilder affiliate() {
        return new AffiliateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BillingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BillingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing", pathParameters);
    }
    /**
     * Instantiates a new {@link BillingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BillingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing", rawUrl);
    }
}
