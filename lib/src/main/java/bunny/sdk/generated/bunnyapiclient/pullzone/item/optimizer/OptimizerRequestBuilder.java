package bunny.sdk.generated.bunnyapiclient.pullzone.item.optimizer;

import bunny.sdk.generated.bunnyapiclient.pullzone.item.optimizer.statistics.StatisticsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /pullzone/{-id}/optimizer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OptimizerRequestBuilder extends BaseRequestBuilder {
    /**
     * The statistics property
     * @return a {@link StatisticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatisticsRequestBuilder statistics() {
        return new StatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OptimizerRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OptimizerRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/optimizer", pathParameters);
    }
    /**
     * Instantiates a new {@link OptimizerRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OptimizerRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/optimizer", rawUrl);
    }
}
