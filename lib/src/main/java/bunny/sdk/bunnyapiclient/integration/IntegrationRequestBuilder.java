package bunny.sdk.bunnyapiclient.integration;

import bunny.sdk.bunnyapiclient.integration.github.GithubRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /integration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationRequestBuilder extends BaseRequestBuilder {
    /**
     * The github property
     * @return a {@link GithubRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GithubRequestBuilder github() {
        return new GithubRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link IntegrationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/integration", pathParameters);
    }
    /**
     * Instantiates a new {@link IntegrationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/integration", rawUrl);
    }
}
