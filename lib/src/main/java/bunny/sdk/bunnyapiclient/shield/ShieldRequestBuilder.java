package bunny.sdk.bunnyapiclient.shield;

import bunny.sdk.bunnyapiclient.shield.metrics.MetricsRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.ratelimit.RateLimitRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.ratelimits.RateLimitsRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.shieldzone.ShieldZoneRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.shieldzones.ShieldZonesRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.waf.WafRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shield
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShieldRequestBuilder extends BaseRequestBuilder {
    /**
     * The metrics property
     * @return a {@link MetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MetricsRequestBuilder metrics() {
        return new MetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rateLimit property
     * @return a {@link RateLimitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateLimitRequestBuilder rateLimit() {
        return new RateLimitRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rateLimits property
     * @return a {@link RateLimitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateLimitsRequestBuilder rateLimits() {
        return new RateLimitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The shieldZone property
     * @return a {@link ShieldZoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShieldZoneRequestBuilder shieldZone() {
        return new ShieldZoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The shieldZones property
     * @return a {@link ShieldZonesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShieldZonesRequestBuilder shieldZones() {
        return new ShieldZonesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The waf property
     * @return a {@link WafRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WafRequestBuilder waf() {
        return new WafRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ShieldRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShieldRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield", pathParameters);
    }
    /**
     * Instantiates a new {@link ShieldRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShieldRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield", rawUrl);
    }
}
