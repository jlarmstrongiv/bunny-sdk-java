package bunny.sdk.bunnyapiclient.pullzone.setzonesecurityincludehashremoteipenabled;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /pullzone/setZoneSecurityIncludeHashRemoteIPEnabled
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/setZoneSecurityIncludeHashRemoteIPEnabled", pathParameters);
    }
    /**
     * Instantiates a new {@link SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/setZoneSecurityIncludeHashRemoteIPEnabled", rawUrl);
    }
    /**
     * [TokenIpValidation API Docs](https://toshy.github.io/BunnyNet-PHP/base-api/#set-zone-security-include-hash-remote-ip-enabled)
     * @param body The request body
     */
    public void post(@jakarta.annotation.Nonnull final SetZoneSecurityIncludeHashRemoteIPEnabledPostRequestBody body) {
        post(body, null);
    }
    /**
     * [TokenIpValidation API Docs](https://toshy.github.io/BunnyNet-PHP/base-api/#set-zone-security-include-hash-remote-ip-enabled)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final SetZoneSecurityIncludeHashRemoteIPEnabledPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * [TokenIpValidation API Docs](https://toshy.github.io/BunnyNet-PHP/base-api/#set-zone-security-include-hash-remote-ip-enabled)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetZoneSecurityIncludeHashRemoteIPEnabledPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [TokenIpValidation API Docs](https://toshy.github.io/BunnyNet-PHP/base-api/#set-zone-security-include-hash-remote-ip-enabled)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetZoneSecurityIncludeHashRemoteIPEnabledPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SetZoneSecurityIncludeHashRemoteIPEnabledRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
