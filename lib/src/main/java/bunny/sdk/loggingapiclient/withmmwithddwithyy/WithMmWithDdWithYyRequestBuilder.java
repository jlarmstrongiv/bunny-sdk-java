package bunny.sdk.loggingapiclient.withmmwithddwithyy;

import bunny.sdk.loggingapiclient.withmmwithddwithyy.withpullzoneidlog.WithPullZoneIdLogRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /{mm}-{dd}-{yy}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMmWithDdWithYyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithMmWithDdWithYyRequestBuilder} and sets the default values.
     * @param dd The path parameter: dd
     * @param mm The path parameter: mm
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param yy The path parameter: yy
     */
    public WithMmWithDdWithYyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String dd, @jakarta.annotation.Nullable final String mm, @jakarta.annotation.Nullable final String yy) {
        super(requestAdapter, "{+baseurl}/{mm}-{dd}-{yy}", pathParameters);
        this.pathParameters.put("dd", dd);
        this.pathParameters.put("mm", mm);
        this.pathParameters.put("yy", yy);
    }
    /**
     * Instantiates a new {@link WithMmWithDdWithYyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMmWithDdWithYyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{mm}-{dd}-{yy}", rawUrl);
    }
    /**
     * Builds and executes requests for operations under /{mm}-{dd}-{yy}/{pullZoneId}.log
     * @param pullZoneId The path parameter: pullZoneId
     * @return a {@link WithPullZoneIdLogRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPullZoneIdLogRequestBuilder withPullZoneIdLog(@jakarta.annotation.Nonnull final Long pullZoneId) {
        Objects.requireNonNull(pullZoneId);
        return new WithPullZoneIdLogRequestBuilder(pathParameters, requestAdapter, pullZoneId);
    }
}
