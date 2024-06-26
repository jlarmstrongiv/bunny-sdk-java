package bunny.sdk.streamapiclient.library;

import bunny.sdk.streamapiclient.library.item.WithLibraryItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /library
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LibraryRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.StreamApiClient.library.item collection
     * @param libraryId Unique identifier of the item
     * @return a {@link WithLibraryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLibraryItemRequestBuilder byLibraryId(@jakarta.annotation.Nonnull final Long libraryId) {
        Objects.requireNonNull(libraryId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("libraryId", libraryId);
        return new WithLibraryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LibraryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LibraryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library", pathParameters);
    }
    /**
     * Instantiates a new {@link LibraryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LibraryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library", rawUrl);
    }
}
