package bunny.sdk.generated.streamapiclient.library.item;

import bunny.sdk.generated.streamapiclient.library.item.collections.CollectionsRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.statistics.StatisticsRequestBuilder;
import bunny.sdk.generated.streamapiclient.library.item.videos.VideosRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /library/{libraryId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithLibraryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The collections property
     * @return a {@link CollectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CollectionsRequestBuilder collections() {
        return new CollectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The statistics property
     * @return a {@link StatisticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatisticsRequestBuilder statistics() {
        return new StatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The videos property
     * @return a {@link VideosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideosRequestBuilder videos() {
        return new VideosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithLibraryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLibraryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithLibraryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLibraryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/library/{libraryId}", rawUrl);
    }
}
