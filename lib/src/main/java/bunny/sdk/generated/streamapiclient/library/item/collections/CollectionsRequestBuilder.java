package bunny.sdk.generated.streamapiclient.library.item.collections;

import bunny.sdk.generated.streamapiclient.library.item.collections.item.WithCollectionItemRequestBuilder;
import bunny.sdk.generated.streamapiclient.models.managecollections.Collection;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /library/{libraryId}/collections
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CollectionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.generated.StreamApiClient.library.item.collections.item collection
     * @param collectionId Unique identifier of the item
     * @return a {@link WithCollectionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCollectionItemRequestBuilder byCollectionId(@jakarta.annotation.Nonnull final String collectionId) {
        Objects.requireNonNull(collectionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("collectionId", collectionId);
        return new WithCollectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CollectionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CollectionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/collections?includeThumbnails={includeThumbnails}&itemsPerPage={itemsPerPage}&orderBy={orderBy}&page={page}{&search*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CollectionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CollectionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/collections?includeThumbnails={includeThumbnails}&itemsPerPage={itemsPerPage}&orderBy={orderBy}&page={page}{&search*}", rawUrl);
    }
    /**
     * [GetCollectionList API Docs](https://docs.bunny.net/reference/collection_list)
     * @return a {@link CollectionsGetResponse}
     */
    @jakarta.annotation.Nullable
    public CollectionsGetResponse get() {
        return get(null);
    }
    /**
     * [GetCollectionList API Docs](https://docs.bunny.net/reference/collection_list)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CollectionsGetResponse}
     */
    @jakarta.annotation.Nullable
    public CollectionsGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CollectionsGetResponse::createFromDiscriminatorValue);
    }
    /**
     * [CreateCollection API Docs](https://docs.bunny.net/reference/collection_createcollection)
     * @param body The request body
     * @return a {@link Collection}
     */
    @jakarta.annotation.Nullable
    public Collection post(@jakarta.annotation.Nonnull final Collection body) {
        return post(body, null);
    }
    /**
     * [CreateCollection API Docs](https://docs.bunny.net/reference/collection_createcollection)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Collection}
     */
    @jakarta.annotation.Nullable
    public Collection post(@jakarta.annotation.Nonnull final Collection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Collection::createFromDiscriminatorValue);
    }
    /**
     * [GetCollectionList API Docs](https://docs.bunny.net/reference/collection_list)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetCollectionList API Docs](https://docs.bunny.net/reference/collection_list)
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
     * [CreateCollection API Docs](https://docs.bunny.net/reference/collection_createcollection)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Collection body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [CreateCollection API Docs](https://docs.bunny.net/reference/collection_createcollection)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Collection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/library/{libraryId}/collections", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CollectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CollectionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CollectionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * [GetCollectionList API Docs](https://docs.bunny.net/reference/collection_list)
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Boolean includeThumbnails;
        @jakarta.annotation.Nullable
        public Integer itemsPerPage;
        @jakarta.annotation.Nullable
        public GetOrderByQueryParameterType orderBy;
        @jakarta.annotation.Nullable
        public Integer page;
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("orderBy", orderBy);
            allQueryParams.put("includeThumbnails", includeThumbnails);
            allQueryParams.put("itemsPerPage", itemsPerPage);
            allQueryParams.put("page", page);
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
