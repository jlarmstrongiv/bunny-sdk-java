package bunny.sdk.bunnyapiclient.shield.metrics.waf.logged;

import bunny.sdk.bunnyapiclient.shield.metrics.waf.logged.item.WithShieldZoneItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shield/metrics/waf/logged
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoggedRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.shield.metrics.waf.logged.item collection
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
     * Instantiates a new {@link LoggedRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoggedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/metrics/waf/logged", pathParameters);
    }
    /**
     * Instantiates a new {@link LoggedRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoggedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/metrics/waf/logged", rawUrl);
    }
}
