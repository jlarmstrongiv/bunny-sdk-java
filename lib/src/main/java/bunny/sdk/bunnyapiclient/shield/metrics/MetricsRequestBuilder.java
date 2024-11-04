package bunny.sdk.bunnyapiclient.shield.metrics;

import bunny.sdk.bunnyapiclient.shield.metrics.waf.WafRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shield/metrics
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetricsRequestBuilder extends BaseRequestBuilder {
    /**
     * The waf property
     * @return a {@link WafRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WafRequestBuilder waf() {
        return new WafRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MetricsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MetricsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/metrics", pathParameters);
    }
    /**
     * Instantiates a new {@link MetricsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MetricsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/metrics", rawUrl);
    }
}
