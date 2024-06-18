package bunny.sdk.generated.streamapiclient.library.item.videos.item.captions.item;

import bunny.sdk.generated.streamapiclient.models.StructuredSuccessResponse;
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
 * Builds and executes requests for operations under /library/{libraryId}/videos/{videoId}/captions/{srclangPathParameter}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSrclangPathParameterItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithSrclangPathParameterItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSrclangPathParameterItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/captions/{srclangPathParameter}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithSrclangPathParameterItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSrclangPathParameterItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/captions/{srclangPathParameter}", rawUrl);
    }
    /**
     * [DeleteCaption API Docs](https://docs.bunny.net/reference/video_deletecaption)
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse delete() {
        return delete(null);
    }
    /**
     * [DeleteCaption API Docs](https://docs.bunny.net/reference/video_deletecaption)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StructuredSuccessResponse::createFromDiscriminatorValue);
    }
    /**
     * [AddCaption API Docs](https://docs.bunny.net/reference/video_addcaption)
     * @param body The request body
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse post(@jakarta.annotation.Nonnull final WithSrclangPathParameterPostRequestBody body) {
        return post(body, null);
    }
    /**
     * [AddCaption API Docs](https://docs.bunny.net/reference/video_addcaption)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StructuredSuccessResponse}
     */
    @jakarta.annotation.Nullable
    public StructuredSuccessResponse post(@jakarta.annotation.Nonnull final WithSrclangPathParameterPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StructuredSuccessResponse::createFromDiscriminatorValue);
    }
    /**
     * [DeleteCaption API Docs](https://docs.bunny.net/reference/video_deletecaption)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * [DeleteCaption API Docs](https://docs.bunny.net/reference/video_deletecaption)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * [AddCaption API Docs](https://docs.bunny.net/reference/video_addcaption)
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WithSrclangPathParameterPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * [AddCaption API Docs](https://docs.bunny.net/reference/video_addcaption)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WithSrclangPathParameterPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithSrclangPathParameterItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSrclangPathParameterItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSrclangPathParameterItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
