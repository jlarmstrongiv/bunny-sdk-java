package bunny.sdk.generated.bunnyapiclient.compute.script.item.variables.item;

import bunny.sdk.generated.bunnyapiclient.models.compute.EdgeScriptVariable;
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
 * Builds and executes requests for operations under /compute/script/{id}/variables/{variableId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVariableItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithVariableItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVariableItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script/{id}/variables/{variableId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVariableItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVariableItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script/{id}/variables/{variableId}", rawUrl);
    }
    /**
     * [DeleteComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_deletevariable)
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeleteComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_deletevariable)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * [GetComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_getvariable)
     * @return a {@link EdgeScriptVariable}
     */
    @jakarta.annotation.Nullable
    public EdgeScriptVariable get() {
        return get(null);
    }
    /**
     * [GetComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_getvariable)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EdgeScriptVariable}
     */
    @jakarta.annotation.Nullable
    public EdgeScriptVariable get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, EdgeScriptVariable::createFromDiscriminatorValue);
    }
    /**
     * [UpdateComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_updatevariable)
     * @param body The request body
     * @return a {@link EdgeScriptVariable}
     */
    @jakarta.annotation.Nullable
    public EdgeScriptVariable post(@jakarta.annotation.Nonnull final EdgeScriptVariable body) {
        return post(body, null);
    }
    /**
     * [UpdateComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_updatevariable)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EdgeScriptVariable}
     */
    @jakarta.annotation.Nullable
    public EdgeScriptVariable post(@jakarta.annotation.Nonnull final EdgeScriptVariable body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, EdgeScriptVariable::createFromDiscriminatorValue);
    }
    /**
     * [DeleteComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_deletevariable)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_deletevariable)
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
     * [GetComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_getvariable)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_getvariable)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * [UpdateComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_updatevariable)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdgeScriptVariable body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdateComputeScriptVariable API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_updatevariable)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdgeScriptVariable body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithVariableItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVariableItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithVariableItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
