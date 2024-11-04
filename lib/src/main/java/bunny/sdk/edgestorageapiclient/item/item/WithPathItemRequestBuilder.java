package bunny.sdk.edgestorageapiclient.item.item;

import bunny.sdk.edgestorageapiclient.item.item.item.WithFileNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /{storageZoneName}/{+path}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPathItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.EdgeStorageApiClient.item.item.item collection
     * @param fileName The name of the file that you wish to download.
     * @return a {@link WithFileNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFileNameItemRequestBuilder byFileName(@jakarta.annotation.Nonnull final String fileName) {
        Objects.requireNonNull(fileName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fileName", fileName);
        return new WithFileNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithPathItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPathItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}/{+path}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPathItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPathItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}/{+path}", rawUrl);
    }
}
