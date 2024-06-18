package bunny.sdk.generated.streamapiclient.library.item.videos.item.captions;

import bunny.sdk.generated.streamapiclient.library.item.videos.item.captions.item.WithSrclangPathParameterItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /library/{libraryId}/videos/{videoId}/captions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaptionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.generated.StreamApiClient.library.item.videos.item.captions.item collection
     * @param srclangPathParameter srclang specified as a path parameter
     * @return a {@link WithSrclangPathParameterItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSrclangPathParameterItemRequestBuilder bySrclangPathParameter(@jakarta.annotation.Nonnull final String srclangPathParameter) {
        Objects.requireNonNull(srclangPathParameter);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("srclangPathParameter", srclangPathParameter);
        return new WithSrclangPathParameterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CaptionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CaptionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/captions", pathParameters);
    }
    /**
     * Instantiates a new {@link CaptionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CaptionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}/videos/{videoId}/captions", rawUrl);
    }
}
