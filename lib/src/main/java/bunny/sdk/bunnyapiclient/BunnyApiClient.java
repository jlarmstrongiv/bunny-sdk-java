package bunny.sdk.bunnyapiclient;

import bunny.sdk.bunnyapiclient.abusecase.AbusecaseRequestBuilder;
import bunny.sdk.bunnyapiclient.apikey.ApikeyRequestBuilder;
import bunny.sdk.bunnyapiclient.billing.BillingRequestBuilder;
import bunny.sdk.bunnyapiclient.compute.ComputeRequestBuilder;
import bunny.sdk.bunnyapiclient.country.CountryRequestBuilder;
import bunny.sdk.bunnyapiclient.dmca.DmcaRequestBuilder;
import bunny.sdk.bunnyapiclient.dnszone.DnszoneRequestBuilder;
import bunny.sdk.bunnyapiclient.integration.IntegrationRequestBuilder;
import bunny.sdk.bunnyapiclient.pullzone.PullzoneRequestBuilder;
import bunny.sdk.bunnyapiclient.purge.PurgeRequestBuilder;
import bunny.sdk.bunnyapiclient.region.RegionRequestBuilder;
import bunny.sdk.bunnyapiclient.search.SearchRequestBuilder;
import bunny.sdk.bunnyapiclient.shield.ShieldRequestBuilder;
import bunny.sdk.bunnyapiclient.statistics.StatisticsRequestBuilder;
import bunny.sdk.bunnyapiclient.storagezone.StoragezoneRequestBuilder;
import bunny.sdk.bunnyapiclient.user.UserRequestBuilder;
import bunny.sdk.bunnyapiclient.videolibrary.VideolibraryRequestBuilder;
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
public class BunnyApiClient extends BaseRequestBuilder {
    /**
     * The abusecase property
     * @return a {@link AbusecaseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AbusecaseRequestBuilder abusecase() {
        return new AbusecaseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The apikey property
     * @return a {@link ApikeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApikeyRequestBuilder apikey() {
        return new ApikeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The billing property
     * @return a {@link BillingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BillingRequestBuilder billing() {
        return new BillingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The compute property
     * @return a {@link ComputeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComputeRequestBuilder compute() {
        return new ComputeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The country property
     * @return a {@link CountryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountryRequestBuilder country() {
        return new CountryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dmca property
     * @return a {@link DmcaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DmcaRequestBuilder dmca() {
        return new DmcaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dnszone property
     * @return a {@link DnszoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DnszoneRequestBuilder dnszone() {
        return new DnszoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The integration property
     * @return a {@link IntegrationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IntegrationRequestBuilder integration() {
        return new IntegrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The pullzone property
     * @return a {@link PullzoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PullzoneRequestBuilder pullzone() {
        return new PullzoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The purge property
     * @return a {@link PurgeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PurgeRequestBuilder purge() {
        return new PurgeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The region property
     * @return a {@link RegionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegionRequestBuilder region() {
        return new RegionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The shield property
     * @return a {@link ShieldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShieldRequestBuilder shield() {
        return new ShieldRequestBuilder(pathParameters, requestAdapter);
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
     * The storagezone property
     * @return a {@link StoragezoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StoragezoneRequestBuilder storagezone() {
        return new StoragezoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user property
     * @return a {@link UserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The videolibrary property
     * @return a {@link VideolibraryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideolibraryRequestBuilder videolibrary() {
        return new VideolibraryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BunnyApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BunnyApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
            requestAdapter.setBaseUrl("https://api.bunny.net");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
