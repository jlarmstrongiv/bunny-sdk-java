package bunny.sdk.loggingapiclient;

import bunny.sdk.loggingapiclient.withmmwithddwithyy.WithMmWithDdWithYyRequestBuilder;
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
public class LoggingApiClient extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LoggingApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoggingApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
            requestAdapter.setBaseUrl("https://logging.bunnycdn.com");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
    /**
     * Builds and executes requests for operations under /{mm}-{dd}-{yy}
     * @param dd The path parameter: dd
     * @param mm The path parameter: mm
     * @param yy The path parameter: yy
     * @return a {@link WithMmWithDdWithYyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMmWithDdWithYyRequestBuilder withMmWithDdWithYy(@jakarta.annotation.Nonnull final String dd, @jakarta.annotation.Nonnull final String mm, @jakarta.annotation.Nonnull final String yy) {
        Objects.requireNonNull(dd);
        Objects.requireNonNull(mm);
        Objects.requireNonNull(yy);
        return new WithMmWithDdWithYyRequestBuilder(pathParameters, requestAdapter, dd, mm, yy);
    }
}
