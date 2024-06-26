package bunny.sdk.bunnyapiclient.compute.script;

import bunny.sdk.bunnyapiclient.compute.script.item.ScriptItemRequestBuilder;
import bunny.sdk.bunnyapiclient.models.compute.Script;
import bunny.sdk.bunnyapiclient.models.compute.ScriptCreate;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /compute/script
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScriptRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.compute.script.item collection
     * @param id The ID of the script that will be returned
     * @return a {@link ScriptItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScriptItemRequestBuilder byId(@jakarta.annotation.Nonnull final Long id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ScriptItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ScriptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ScriptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script?page={page}&perPage={perPage}&search={search}", pathParameters);
    }
    /**
     * Instantiates a new {@link ScriptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ScriptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compute/script?page={page}&perPage={perPage}&search={search}", rawUrl);
    }
    /**
     * [ListComputeScripts API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index)
     * @return a {@link ScriptGetResponse}
     */
    @jakarta.annotation.Nullable
    public ScriptGetResponse get() {
        return get(null);
    }
    /**
     * [ListComputeScripts API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ScriptGetResponse}
     */
    @jakarta.annotation.Nullable
    public ScriptGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ScriptGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [AddComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_addscript)
     * @param body The request body
     * @return a {@link Script}
     */
    @jakarta.annotation.Nullable
    public Script post(@jakarta.annotation.Nonnull final ScriptCreate body) {
        return post(body, null);
    }
    /**
     * [AddComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_addscript)
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
     * [ListComputeScripts API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [ListComputeScripts API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * [AddComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_addscript)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ScriptCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [AddComputeScript API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_addscript)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ScriptCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/compute/script", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ScriptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScriptRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ScriptRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [ListComputeScripts API Docs](https://docs.bunny.net/reference/computeedgescriptpublic_index)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer page;
        @jakarta.annotation.Nullable
        public Integer perPage;
        /**
         * The search term that will be used to filter the results
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("page", page);
            allQueryParams.put("perPage", perPage);
            allQueryParams.put("search", search);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
