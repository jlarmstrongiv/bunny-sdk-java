package bunny.sdk.generated.bunnyapiclient.compute.script.item;

import bunny.sdk.generated.bunnyapiclient.compute.script.item.code.CodeRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.compute.script.item.publish.PublishRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.compute.script.item.releases.ReleasesRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.compute.script.item.variables.VariablesRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.models.compute.Script;
import bunny.sdk.generated.bunnyapiclient.models.compute.ScriptCreate;
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
 * Builds and executes requests for operations under /compute/script/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScriptItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The code property
     * @return a {@link CodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CodeRequestBuilder code() {
        return new CodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The publish property
     * @return a {@link PublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The releases property
     * @return a {@link ReleasesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReleasesRequestBuilder releases() {
        return new ReleasesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The variables property
     * @return a {@link VariablesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VariablesRequestBuilder variables() {
        return new VariablesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ScriptItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ScriptItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link ScriptItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ScriptItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script/{id}", rawUrl);
    }
    /**
     * [DeleteComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_delete)
     */
    public void delete() {
        delete(null);
    }
    /**
     * [DeleteComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_delete)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * [GetComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index2)
     * @return a {@link Script}
     */
    @jakarta.annotation.Nullable
    public Script get() {
        return get(null);
    }
    /**
     * [GetComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index2)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Script}
     */
    @jakarta.annotation.Nullable
    public Script get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Script::createFromDiscriminatorValue);
    }
    /**
     * [UpdateComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_update)
     * @param body The request body
     * @return a {@link Script}
     */
    @jakarta.annotation.Nullable
    public Script post(@jakarta.annotation.Nonnull final ScriptCreate body) {
        return post(body, null);
    }
    /**
     * [UpdateComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_update)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Script}
     */
    @jakarta.annotation.Nullable
    public Script post(@jakarta.annotation.Nonnull final ScriptCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Script::createFromDiscriminatorValue);
    }
    /**
     * [DeleteComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_delete)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_delete)
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
     * [GetComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index2)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index2)
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
     * [UpdateComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_update)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ScriptCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [UpdateComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_update)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ScriptCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ScriptItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScriptItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ScriptItemRequestBuilder(rawUrl, requestAdapter);
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
