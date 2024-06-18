package bunny.sdk.generated.bunnyapiclient.pullzone.item.edgerules;

import bunny.sdk.generated.bunnyapiclient.pullzone.item.edgerules.addorupdate.AddOrUpdateRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.pullzone.item.edgerules.item.WithEdgeRuleItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /pullzone/{-id}/edgerules
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdgerulesRequestBuilder extends BaseRequestBuilder {
    /**
     * The addOrUpdate property
     * @return a {@link AddOrUpdateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddOrUpdateRequestBuilder addOrUpdate() {
        return new AddOrUpdateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the bunny.sdk.generated.BunnyApiClient.pullzone.item.edgerules.item collection
     * @param edgeRuleId The ID of the Edge Rule that should be deleted
     * @return a {@link WithEdgeRuleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEdgeRuleItemRequestBuilder byEdgeRuleId(@jakarta.annotation.Nonnull final String edgeRuleId) {
        Objects.requireNonNull(edgeRuleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("edgeRuleId", edgeRuleId);
        return new WithEdgeRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link EdgerulesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdgerulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/edgerules", pathParameters);
    }
    /**
     * Instantiates a new {@link EdgerulesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdgerulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/pullzone/{%2Did}/edgerules", rawUrl);
    }
}
