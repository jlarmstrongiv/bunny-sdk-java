package bunny.sdk.edgestorageapiclient.item.item;

import bunny.sdk.edgestorageapiclient.models.File;
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
 * Builds and executes requests for operations under /{storageZoneName}/{+path}/
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPathSlashRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPathSlashRequestBuilder} and sets the default values.
     * @param path The directory path that you want to list.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPathSlashRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String path) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}/{+path}/", pathParameters);
        this.pathParameters.put("path", path);
    }
    /**
     * Instantiates a new {@link WithPathSlashRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPathSlashRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/{storageZoneName}/{+path}/", rawUrl);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @return a {@link java.util.List<File>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<File> get() {
        return get(null);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<File>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<File> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, File::createFromDiscriminatorValue);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [ListFiles API Docs](https://docs.bunny.net/reference/get_-storagezonename-path-)
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithPathSlashRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPathSlashRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPathSlashRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
