package bunny.sdk.bunnyapiclient.shield.metrics.waf;

import bunny.sdk.bunnyapiclient.shield.metrics.waf.blocked.BlockedRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.metrics.waf.logged.LoggedRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.metrics.waf.processed.ProcessedRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.metrics.waf.triggered.TriggeredRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shield/metrics/waf
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WafRequestBuilder extends BaseRequestBuilder {
    /**
     * The blocked property
     * @return a {@link BlockedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BlockedRequestBuilder blocked() {
        return new BlockedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The logged property
     * @return a {@link LoggedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoggedRequestBuilder logged() {
        return new LoggedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The processed property
     * @return a {@link ProcessedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProcessedRequestBuilder processed() {
        return new ProcessedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The triggered property
     * @return a {@link TriggeredRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TriggeredRequestBuilder triggered() {
        return new TriggeredRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WafRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WafRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/metrics/waf", pathParameters);
    }
    /**
     * Instantiates a new {@link WafRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WafRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/metrics/waf", rawUrl);
    }
}
