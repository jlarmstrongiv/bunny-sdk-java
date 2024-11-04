package bunny.sdk.bunnyapiclient.shield.shieldzone.getbypullzone;

import bunny.sdk.bunnyapiclient.shield.shieldzone.getbypullzone.item.WithPullZoneItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shield/shield-zone/get-by-pullzone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetByPullzoneRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the bunny.sdk.BunnyApiClient.shield.shieldZone.getByPullzone.item collection
     * @param pullZoneId Unique identifier of the item
     * @return a {@link WithPullZoneItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPullZoneItemRequestBuilder byPullZoneId(@jakarta.annotation.Nonnull final Integer pullZoneId) {
        Objects.requireNonNull(pullZoneId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("pullZoneId", pullZoneId);
        return new WithPullZoneItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link GetByPullzoneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPullzoneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/shield-zone/get-by-pullzone", pathParameters);
    }
    /**
     * Instantiates a new {@link GetByPullzoneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPullzoneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shield/shield-zone/get-by-pullzone", rawUrl);
    }
}
