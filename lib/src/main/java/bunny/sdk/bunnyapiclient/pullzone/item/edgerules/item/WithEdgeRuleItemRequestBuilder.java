package bunny.sdk.bunnyapiclient.pullzone.item.edgerules.item;

import bunny.sdk.bunnyapiclient.pullzone.item.edgerules.item.setedgeruleenabled.SetEdgeRuleEnabledRequestBuilder;
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
 * Builds and executes requests for operations under /pullzone/{-id}/edgerules/{edgeRuleId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithEdgeRuleItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The setEdgeRuleEnabled property
     * @return a {@link SetEdgeRuleEnabledRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetEdgeRuleEnabledRequestBuilder setEdgeRuleEnabled() {
        return new SetEdgeRuleEnabledRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithEdgeRuleItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEdgeRuleItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/edgerules/{edgeRuleId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithEdgeRuleItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEdgeRuleItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/edgerules/{edgeRuleId}", rawUrl);
    }
    /**
     * [DeleteEdgeRule API Docs](https://docs.bunny.net/reference/pullzonepublic_deleteedgerule)
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeleteEdgeRule API Docs](https://docs.bunny.net/reference/pullzonepublic_deleteedgerule)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * [DeleteEdgeRule API Docs](https://docs.bunny.net/reference/pullzonepublic_deleteedgerule)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteEdgeRule API Docs](https://docs.bunny.net/reference/pullzonepublic_deleteedgerule)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithEdgeRuleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEdgeRuleItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithEdgeRuleItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
