package bunny.sdk.generated.bunnyapiclient.pullzone.item.originshield;

import bunny.sdk.generated.bunnyapiclient.pullzone.item.originshield.queuestatistics.QueuestatisticsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /pullzone/{-id}/originshield
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OriginshieldRequestBuilder extends BaseRequestBuilder {
    /**
     * The queuestatistics property
     * @return a {@link QueuestatisticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QueuestatisticsRequestBuilder queuestatistics() {
        return new QueuestatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OriginshieldRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OriginshieldRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/originshield", pathParameters);
    }
    /**
     * Instantiates a new {@link OriginshieldRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OriginshieldRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/originshield", rawUrl);
    }
}
