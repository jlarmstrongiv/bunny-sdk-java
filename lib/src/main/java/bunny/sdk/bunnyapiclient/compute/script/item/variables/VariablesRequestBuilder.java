package bunny.sdk.bunnyapiclient.compute.script.item.variables;

import bunny.sdk.bunnyapiclient.compute.script.item.variables.add.AddRequestBuilder;
import bunny.sdk.bunnyapiclient.compute.script.item.variables.item.WithVariableItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /compute/script/{id}/variables
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VariablesRequestBuilder extends BaseRequestBuilder {
    /**
     * The add property
     * @return a {@link AddRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.compute.script.item.variables.item collection
     * @param variableId The ID of the Environment Variable that will be updated
     * @return a {@link WithVariableItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVariableItemRequestBuilder byVariableId(@jakarta.annotation.Nonnull final Long variableId) {
        Objects.requireNonNull(variableId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("variableId", variableId);
        return new WithVariableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VariablesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VariablesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script/{id}/variables", pathParameters);
    }
    /**
     * Instantiates a new {@link VariablesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VariablesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script/{id}/variables", rawUrl);
    }
}
