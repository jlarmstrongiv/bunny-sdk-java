package bunny.sdk.generated.bunnyapiclient.compute;

import bunny.sdk.generated.bunnyapiclient.compute.script.ScriptRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /compute
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComputeRequestBuilder extends BaseRequestBuilder {
    /**
     * The script property
     * @return a {@link ScriptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScriptRequestBuilder script() {
        return new ScriptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ComputeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComputeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute", pathParameters);
    }
    /**
     * Instantiates a new {@link ComputeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComputeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute", rawUrl);
    }
}
