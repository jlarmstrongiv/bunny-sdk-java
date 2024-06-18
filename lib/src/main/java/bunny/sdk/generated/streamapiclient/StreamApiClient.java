package bunny.sdk.generated.streamapiclient;

import bunny.sdk.generated.streamapiclient.library.LibraryRequestBuilder;
import bunny.sdk.generated.streamapiclient.oembed.OEmbedRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StreamApiClient extends BaseRequestBuilder {
    /**
     * The library property
     * @return a {@link LibraryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LibraryRequestBuilder library() {
        return new LibraryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The OEmbed property
     * @return a {@link OEmbedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OEmbedRequestBuilder oEmbed() {
        return new OEmbedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link StreamApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StreamApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://video.bunnycdn.com");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
