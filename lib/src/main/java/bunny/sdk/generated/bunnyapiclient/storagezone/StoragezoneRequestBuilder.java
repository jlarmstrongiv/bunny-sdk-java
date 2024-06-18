package bunny.sdk.generated.bunnyapiclient.storagezone;

import bunny.sdk.generated.bunnyapiclient.models.storagezone.StorageZone;
import bunny.sdk.generated.bunnyapiclient.models.storagezone.StorageZoneCreate;
import bunny.sdk.generated.bunnyapiclient.storagezone.checkavailability.CheckavailabilityRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.storagezone.item.StoragezoneItemRequestBuilder;
import bunny.sdk.generated.bunnyapiclient.storagezone.resetreadonlypassword.ResetReadOnlyPasswordRequestBuilder;
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
 * Builds and executes requests for operations under /storagezone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StoragezoneRequestBuilder extends BaseRequestBuilder {
    /**
     * The checkavailability property
     * @return a {@link CheckavailabilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckavailabilityRequestBuilder checkavailability() {
        return new CheckavailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The resetReadOnlyPassword property
     * @return a {@link ResetReadOnlyPasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetReadOnlyPasswordRequestBuilder resetReadOnlyPassword() {
        return new ResetReadOnlyPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the bunny.sdk.generated.BunnyApiClient.storagezone.item collection
     * @param id Unique identifier of the item
     * @return a {@link StoragezoneItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StoragezoneItemRequestBuilder byId(@jakarta.annotation.Nonnull final Long id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new StoragezoneItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link StoragezoneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StoragezoneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storagezone?includeDeleted={includeDeleted}&page={page}&perPage={perPage}{&search*}", pathParameters);
    }
    /**
     * Instantiates a new {@link StoragezoneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StoragezoneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storagezone?includeDeleted={includeDeleted}&page={page}&perPage={perPage}{&search*}", rawUrl);
    }
    /**
     * [ListStorageZones API Docs](https://docs.bunny.net/reference/storagezonepublic_index)
     * @return a {@link StoragezoneGetResponse}
     */
    @jakarta.annotation.Nullable
    public StoragezoneGetResponse get() {
        return get(null);
    }
    /**
     * [ListStorageZones API Docs](https://docs.bunny.net/reference/storagezonepublic_index)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StoragezoneGetResponse}
     */
    @jakarta.annotation.Nullable
    public StoragezoneGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StoragezoneGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [AddStorageZone API Docs](https://docs.bunny.net/reference/storagezonepublic_add)
     * @param body The request body
     * @return a {@link StorageZone}
     */
    @jakarta.annotation.Nullable
    public StorageZone post(@jakarta.annotation.Nonnull final StorageZoneCreate body) {
        return post(body, null);
    }
    /**
     * [AddStorageZone API Docs](https://docs.bunny.net/reference/storagezonepublic_add)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StorageZone}
     */
    @jakarta.annotation.Nullable
    public StorageZone post(@jakarta.annotation.Nonnull final StorageZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StorageZone::createFromDiscriminatorValue);
    }
    /**
     * [ListStorageZones API Docs](https://docs.bunny.net/reference/storagezonepublic_index)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [ListStorageZones API Docs](https://docs.bunny.net/reference/storagezonepublic_index)
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
     * [AddStorageZone API Docs](https://docs.bunny.net/reference/storagezonepublic_add)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StorageZoneCreate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [AddStorageZone API Docs](https://docs.bunny.net/reference/storagezonepublic_add)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StorageZoneCreate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/storagezone", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link StoragezoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StoragezoneRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StoragezoneRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [ListStorageZones API Docs](https://docs.bunny.net/reference/storagezonepublic_index)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Boolean includeDeleted;
        @jakarta.annotation.Nullable
        public Integer page;
        @jakarta.annotation.Nullable
        public Integer perPage;
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("includeDeleted", includeDeleted);
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
