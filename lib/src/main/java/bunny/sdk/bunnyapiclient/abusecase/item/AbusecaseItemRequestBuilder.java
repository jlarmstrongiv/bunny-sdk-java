package bunny.sdk.bunnyapiclient.abusecase.item;

import bunny.sdk.bunnyapiclient.abusecase.item.check.CheckRequestBuilder;
import bunny.sdk.bunnyapiclient.abusecase.item.resolve.ResolveRequestBuilder;
import bunny.sdk.bunnyapiclient.models.abusecases.AbuseCase;
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
 * Builds and executes requests for operations under /abusecase/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AbusecaseItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The check property
     * @return a {@link CheckRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckRequestBuilder check() {
        return new CheckRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The resolve property
     * @return a {@link ResolveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResolveRequestBuilder resolve() {
        return new ResolveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AbusecaseItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AbusecaseItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/abusecase/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link AbusecaseItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AbusecaseItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/abusecase/{id}", rawUrl);
    }
    /**
     * [GetAbuseCase API Docs](https://docs.bunny.net/reference/abusecasepublic_getabusecase2)
     * @return a {@link AbuseCase}
     */
    @jakarta.annotation.Nullable
    public AbuseCase get() {
        return get(null);
    }
    /**
     * [GetAbuseCase API Docs](https://docs.bunny.net/reference/abusecasepublic_getabusecase2)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AbuseCase}
     */
    @jakarta.annotation.Nullable
    public AbuseCase get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AbuseCase::createFromDiscriminatorValue);
    }
    /**
     * [GetAbuseCase API Docs](https://docs.bunny.net/reference/abusecasepublic_getabusecase2)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * [GetAbuseCase API Docs](https://docs.bunny.net/reference/abusecasepublic_getabusecase2)
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
     * @return a {@link AbusecaseItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AbusecaseItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AbusecaseItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
