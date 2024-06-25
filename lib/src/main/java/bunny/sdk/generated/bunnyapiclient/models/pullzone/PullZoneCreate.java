package bunny.sdk.generated.bunnyapiclient.models.pullzone;

import bunny.sdk.generated.bunnyapiclient.models.pullzone.edgerule.EdgeRule;
import bunny.sdk.generated.bunnyapiclient.models.pullzone.optimizer.OptimizerClass;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PullZoneCreate implements AdditionalDataHolder, Parsable {
    /**
     * The list of extensions that will return the CORS headers
     */
    private java.util.List<String> accessControlOriginHeaderExtensions;
    /**
     * Determines if the Add Canonical Header is enabled for this Pull Zone
     */
    private Boolean addCanonicalHeader;
    /**
     * Determines if the Pull Zone should forward the current hostname to the origin
     */
    private Boolean addHostHeader;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of referrer hostnames that are allowed to access the pull zone.Requests containing the header Referer: hostname that is not on the list will be rejected.If empty, all the referrers are allowed
     */
    private java.util.List<String> allowedReferrers;
    /**
     * Determines if the AWS Signing is enabled
     */
    private Boolean aWSSigningEnabled;
    /**
     * The AWS Signing region key
     */
    private String aWSSigningKey;
    /**
     * The AWS Signing region name
     */
    private String aWSSigningRegionName;
    /**
     * The AWS Signing region secret
     */
    private String aWSSigningSecret;
    /**
     * The list of blocked countries with the two-letter Alpha2 ISO codes
     */
    private java.util.List<String> blockedCountries;
    /**
     * The list of IPs that are blocked from accessing the pull zone. Requests coming from the following IPs will be rejected. If empty, all the IPs will be allowed
     */
    private java.util.List<String> blockedIps;
    /**
     * The list of referrer hostnames that are not allowed to access the pull zone. Requests containing the header Referer: hostname that is on the list will be rejected. If empty, all the referrers are allowed
     */
    private java.util.List<String> blockedReferrers;
    /**
     * The BlockNoneReferrer property
     */
    private Boolean blockNoneReferrer;
    /**
     * If true, POST requests to the zone will be blocked
     */
    private Boolean blockPostRequests;
    /**
     * If true, access to root path will return a 403 error
     */
    private Boolean blockRootPathAccess;
    /**
     * The list of budget redirected countries with the two-letter Alpha2 ISO codes
     */
    private java.util.List<String> budgetRedirectedCountries;
    /**
     * The BunnyAiImageBlueprints property
     */
    private java.util.List<BunnyAiImageBlueprint> bunnyAiImageBlueprints;
    /**
     * Excessive requests are delayed until their number exceeds the maximum burst size.
     */
    private Integer burstSize;
    /**
     * Sets the browser cache control override setting for this zone
     * @deprecated
     * 
     */
    @Deprecated
    private Long cacheControlBrowserMaxAgeOverride;
    /**
     * The override cache time for the pull zone
     */
    private Long cacheControlMaxAgeOverride;
    /**
     * The override cache time for the pull zone for the end client
     */
    private Long cacheControlPublicMaxAgeOverride;
    /**
     * Determines if bunny.net should be caching error responses
     */
    private Boolean cacheErrorResponses;
    /**
     * The number of connections limited per IP for this zone
     */
    private Integer connectionLimitPerIPCount;
    /**
     * Contains the list of vary parameters that will be used for vary cache by cookie string. If empty, cookie vary will not be used.
     */
    private java.util.List<String> cookieVaryParameters;
    /**
     * Determines if the cookies are disabled for the pull zone
     */
    private Boolean disableCookies;
    /**
     * If true, the built-in let's encrypt is disabled and requests are passed to the origin.
     */
    private Boolean disableLetsEncrypt;
    /**
     * Determines the origin port of the pull zone.
     */
    private Integer dnsOriginPort;
    /**
     * Determines the origin scheme of the pull zone.
     */
    private String dnsOriginScheme;
    /**
     * The list of edge rules on this Pull Zone
     */
    private java.util.List<EdgeRule> edgeRules;
    /**
     * The EdgeScriptExecutionPhase property
     */
    private Double edgeScriptExecutionPhase;
    /**
     * The ID of the edge script that the pull zone is linked to
     */
    private Long edgeScriptId;
    /**
     * Determines if the CORS headers should be enabled
     */
    private Boolean enableAccessControlOriginHeader;
    /**
     * If set to true, any hostnames added to this Pull Zone will automatically enable SSL.
     */
    private Boolean enableAutoSSL;
    /**
     * Determines if the AVIF Vary feature is enabled.
     */
    private Boolean enableAvifVary;
    /**
     * The EnableBunnyImageAi property
     */
    private Boolean enableBunnyImageAi;
    /**
     * Determines if the cache slice (Optimize for video) feature is enabled for the Pull Zone
     */
    private Boolean enableCacheSlice;
    /**
     * Determines if the Cookie Vary feature is enabled.
     */
    private Boolean enableCookieVary;
    /**
     * Determines if the Country Code Vary feature is enabled.
     */
    private Boolean enableCountryCodeVary;
    /**
     * Determines if the delivery from the Africa region is enabled for this pull zone
     */
    private Boolean enableGeoZoneAF;
    /**
     * Determines if the delivery from the Asian / Oceanian region is enabled for this pull zone
     */
    private Boolean enableGeoZoneASIA;
    /**
     * Determines if the delivery from the European region is enabled for this pull zone
     */
    private Boolean enableGeoZoneEU;
    /**
     * Determines if the delivery from the South American region is enabled for this pull zone
     */
    private Boolean enableGeoZoneSA;
    /**
     * Determines if the delivery from the North American region is enabled for this pull zone
     */
    private Boolean enableGeoZoneUS;
    /**
     * Determines if the Hostname Vary feature is enabled.
     */
    private Boolean enableHostnameVary;
    /**
     * Determines if the logging is enabled for this Pull Zone
     */
    private Boolean enableLogging;
    /**
     * Determines if the Mobile Vary feature is enabled.
     */
    private Boolean enableMobileVary;
    /**
     * If true the server will use the origin shield feature
     */
    private Boolean enableOriginShield;
    /**
     * If set to true the query string ordering property is enabled.
     */
    private Boolean enableQueryStringOrdering;
    /**
     * Determines if request coalescing is currently enabled.
     */
    private Boolean enableRequestCoalescing;
    /**
     * The EnableSafeHop property
     */
    private Boolean enableSafeHop;
    /**
     * Determines if smart caching is enabled for this zone
     */
    private Boolean enableSmartCache;
    /**
     * Determines if the TLS 1 is enabled on the Pull Zone
     */
    private Boolean enableTLS1;
    /**
     * Determines if the TLS 1.1 is enabled on the Pull Zone
     */
    private Boolean enableTLS11;
    /**
     * Determines if the WebP Vary feature is enabled.
     */
    private Boolean enableWebPVary;
    /**
     * Contains the custom error page code that will be returned
     */
    private String errorPageCustomCode;
    /**
     * Determines if custom error page code should be enabled.
     */
    private Boolean errorPageEnableCustomCode;
    /**
     * Determines if the statuspage widget should be displayed on the error pages
     */
    private Boolean errorPageEnableStatuspageWidget;
    /**
     * The statuspage code that will be used to build the status widget
     */
    private String errorPageStatuspageCode;
    /**
     * Determines if the error pages should be whitelabel or not
     */
    private Boolean errorPageWhitelabel;
    /**
     * Determines if the zone will follow origin redirects
     */
    private Boolean followRedirects;
    /**
     * True if the Pull Zone is ignoring query strings when serving cached objects
     */
    private Boolean ignoreQueryStrings;
    /**
     * The amount of data after the rate limit will be activated
     */
    private Double limitRateAfter;
    /**
     * The maximum rate at which the zone will transfer data in kb/s. 0 for unlimited
     */
    private Double limitRatePerSecond;
    /**
     * The LogAnonymizationType property
     */
    private Double logAnonymizationType;
    /**
     * The LogFormat property
     */
    private Double logFormat;
    /**
     * Determines if the log forwarding is enabled
     */
    private Boolean logForwardingEnabled;
    /**
     * The LogForwardingFormat property
     */
    private Double logForwardingFormat;
    /**
     * The log forwarding hostname
     */
    private String logForwardingHostname;
    /**
     * The log forwarding port
     */
    private Integer logForwardingPort;
    /**
     * The LogForwardingProtocol property
     */
    private Double logForwardingProtocol;
    /**
     * The log forwarding token value
     */
    private String logForwardingToken;
    /**
     * Determines if the log anonymization should be enabled
     */
    private Boolean loggingIPAnonymizationEnabled;
    /**
     * Determines if the permanent logging feature is enabled
     */
    private Boolean loggingSaveToStorage;
    /**
     * The ID of the logging storage zone that is configured for this Pull Zone
     */
    private Long loggingStorageZoneId;
    /**
     * The MagicContainersAppId property
     */
    private String magicContainersAppId;
    /**
     * The MagicContainersEndpointId property
     */
    private Long magicContainersEndpointId;
    /**
     * The MiddlewareScriptId property
     */
    private Long middlewareScriptId;
    /**
     * The monthly limit of bandwidth in bytes that the pullzone is allowed to use
     */
    private Long monthlyBandwidthLimit;
    /**
     * The total monthly charges for this so zone so far
     */
    private Double monthlyCharges;
    /**
     * The name of the pull zone.
     */
    private String name;
    /**
     * Determines if the automatic image optimization should be enabled
     */
    private Boolean optimizerAutomaticOptimizationEnabled;
    /**
     * Contains the list of optimizer classes
     */
    private java.util.List<OptimizerClass> optimizerClasses;
    /**
     * Determines the maximum automatic image size for desktop clients
     */
    private Integer optimizerDesktopMaxWidth;
    /**
     * Determines if the optimizer should be enabled for this zone
     */
    private Boolean optimizerEnabled;
    /**
     * Determines the image manipulation should be enabled
     */
    private Boolean optimizerEnableManipulationEngine;
    /**
     * Determines if the WebP optimization should be enabled
     */
    private Boolean optimizerEnableWebP;
    /**
     * Determines if the optimizer class list should be enforced
     */
    private Boolean optimizerForceClasses;
    /**
     * Determines the image quality for desktop clients
     */
    private Integer optimizerImageQuality;
    /**
     * Determines if the CSS minification should be enabled
     */
    private Boolean optimizerMinifyCSS;
    /**
     * Determines if the JavaScript minification should be enabled
     */
    private Boolean optimizerMinifyJavaScript;
    /**
     * Determines the image quality for mobile clients
     */
    private Integer optimizerMobileImageQuality;
    /**
     * Determines the maximum automatic image size for mobile clients
     */
    private Integer optimizerMobileMaxWidth;
    /**
     * The OptimizerStaticHtmlEnabled property
     */
    private Boolean optimizerStaticHtmlEnabled;
    /**
     * The OptimizerStaticHtmlWordPressBypassCookie property
     */
    private String optimizerStaticHtmlWordPressBypassCookie;
    /**
     * The OptimizerStaticHtmlWordPressPath property
     */
    private String optimizerStaticHtmlWordPressPath;
    /**
     * Determines if image watermarking should be enabled
     */
    private Boolean optimizerWatermarkEnabled;
    /**
     * Sets the minimum image size to which the watermark will be added
     */
    private Integer optimizerWatermarkMinImageSize;
    /**
     * Sets the offset of the watermark image
     */
    private Double optimizerWatermarkOffset;
    /**
     * The OptimizerWatermarkPosition property
     */
    private Double optimizerWatermarkPosition;
    /**
     * Sets the URL of the watermark image
     */
    private String optimizerWatermarkUrl;
    /**
     * The amount of seconds to wait when connecting to the origin. Otherwise the request will fail or retry.
     */
    private Integer originConnectTimeout;
    /**
     * Determines the host header that will be sent to the origin
     */
    private String originHostHeader;
    /**
     * The amount of seconds to wait when waiting for the origin reply. Otherwise the request will fail or retry.
     */
    private Integer originResponseTimeout;
    /**
     * The number of retries to the origin server
     */
    private Integer originRetries;
    /**
     * Determines if we should retry the request in case of a 5XX response.
     */
    private Boolean originRetry5XXResponses;
    /**
     * Determines if we should retry the request in case of a connection timeout.
     */
    private Boolean originRetryConnectionTimeout;
    /**
     * Determines the amount of time that the CDN should wait before retrying an origin request.
     */
    private Integer originRetryDelay;
    /**
     * Determines if we should retry the request in case of a response timeout.
     */
    private Boolean originRetryResponseTimeout;
    /**
     * Determines if the origin shield concurrency limit is enabled.
     */
    private Boolean originShieldEnableConcurrencyLimit;
    /**
     * Determines the number of maximum concurrent requests allowed to the origin.
     */
    private Integer originShieldMaxConcurrentRequests;
    /**
     * Determines the max number of origin requests that will remain in the queue
     */
    private Integer originShieldMaxQueuedRequests;
    /**
     * Determines the max queue wait time
     */
    private Integer originShieldQueueMaxWaitTime;
    /**
     * The zone code of the origin shield
     */
    private String originShieldZoneCode;
    /**
     * The OriginType property
     */
    private Double originType;
    /**
     * The origin URL of the pull zone where the files are fetched from.
     */
    private String originUrl;
    /**
     * The IP of the storage zone used for Perma-Cache
     */
    private Long permaCacheStorageZoneId;
    /**
     * The PermaCacheType property
     */
    private Long permaCacheType;
    /**
     * The custom preloading screen code
     */
    private String preloadingScreenCode;
    /**
     * Determines if the custom preloader screen is enabled
     */
    private Boolean preloadingScreenCodeEnabled;
    /**
     * The delay in milliseconds after which the preloading screen will be displayed
     */
    private Integer preloadingScreenDelay;
    /**
     * Determines if the preloading screen is currently enabled
     */
    private Boolean preloadingScreenEnabled;
    /**
     * The preloading screen logo URL
     */
    private String preloadingScreenLogoUrl;
    /**
     * The PreloadingScreenShowOnFirstVisit property
     */
    private Boolean preloadingScreenShowOnFirstVisit;
    /**
     * The PreloadingScreenTheme property
     */
    private Double preloadingScreenTheme;
    /**
     * Contains the list of vary parameters that will be used for vary cache by query string. If empty, all parameters will be used to construct the key
     */
    private java.util.List<String> queryStringVaryParameters;
    /**
     * Determines the lock time for coalesced requests.
     */
    private Integer requestCoalescingTimeout;
    /**
     * Max number of requests per IP per second
     */
    private Integer requestLimit;
    /**
     * The list of routing filters enabled for this zone
     */
    private java.util.List<PullZoneCreateRoutingFilters> routingFilters;
    /**
     * The ShieldDDosProtectionEnabled property
     */
    private Boolean shieldDDosProtectionEnabled;
    /**
     * The ShieldDDosProtectionType property
     */
    private Double shieldDDosProtectionType;
    /**
     * The ID of the storage zone that the pull zone is linked to
     */
    private Long storageZoneId;
    /**
     * The Type property
     */
    private Double type;
    /**
     * Determines if cache update is performed in the background.
     */
    private Boolean useBackgroundUpdate;
    /**
     * Determines if we should use stale cache while the origin is offline
     */
    private Boolean useStaleWhileOffline;
    /**
     * Determines if we should use stale cache while cache is updating
     */
    private Boolean useStaleWhileUpdating;
    /**
     * Determines if the Pull Zone should verify the origin SSL certificate
     */
    private Boolean verifyOriginSSL;
    /**
     * Determines the enabled WAF rule groups
     */
    private java.util.List<String> wAFDisabledRuleGroups;
    /**
     * Determines the disabled WAF rules
     */
    private java.util.List<String> wAFDisabledRules;
    /**
     * Determines if WAF should be enabled on the zone
     */
    private Boolean wAFEnabled;
    /**
     * Determines if WAF should enable request headers logging
     */
    private Boolean wAFEnableRequestHeaderLogging;
    /**
     * Determines the list of headers that will be ignored in the WAF logs
     */
    private Boolean wAFRequestHeaderIgnores;
    /**
     * True if the URL secure token authentication security is enabled
     */
    private Boolean zoneSecurityEnabled;
    /**
     * True if the zone security hash should include the remote IP
     */
    private Boolean zoneSecurityIncludeHashRemoteIP;
    /**
     * Instantiates a new {@link PullZoneCreate} and sets the default values.
     */
    public PullZoneCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PullZoneCreate}
     */
    @jakarta.annotation.Nonnull
    public static PullZoneCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PullZoneCreate();
    }
    /**
     * Gets the AccessControlOriginHeaderExtensions property value. The list of extensions that will return the CORS headers
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAccessControlOriginHeaderExtensions() {
        return this.accessControlOriginHeaderExtensions;
    }
    /**
     * Gets the AddCanonicalHeader property value. Determines if the Add Canonical Header is enabled for this Pull Zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAddCanonicalHeader() {
        return this.addCanonicalHeader;
    }
    /**
     * Gets the AddHostHeader property value. Determines if the Pull Zone should forward the current hostname to the origin
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAddHostHeader() {
        return this.addHostHeader;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the AllowedReferrers property value. The list of referrer hostnames that are allowed to access the pull zone.Requests containing the header Referer: hostname that is not on the list will be rejected.If empty, all the referrers are allowed
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedReferrers() {
        return this.allowedReferrers;
    }
    /**
     * Gets the AWSSigningEnabled property value. Determines if the AWS Signing is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAWSSigningEnabled() {
        return this.aWSSigningEnabled;
    }
    /**
     * Gets the AWSSigningKey property value. The AWS Signing region key
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAWSSigningKey() {
        return this.aWSSigningKey;
    }
    /**
     * Gets the AWSSigningRegionName property value. The AWS Signing region name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAWSSigningRegionName() {
        return this.aWSSigningRegionName;
    }
    /**
     * Gets the AWSSigningSecret property value. The AWS Signing region secret
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAWSSigningSecret() {
        return this.aWSSigningSecret;
    }
    /**
     * Gets the BlockedCountries property value. The list of blocked countries with the two-letter Alpha2 ISO codes
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedCountries() {
        return this.blockedCountries;
    }
    /**
     * Gets the BlockedIps property value. The list of IPs that are blocked from accessing the pull zone. Requests coming from the following IPs will be rejected. If empty, all the IPs will be allowed
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedIps() {
        return this.blockedIps;
    }
    /**
     * Gets the BlockedReferrers property value. The list of referrer hostnames that are not allowed to access the pull zone. Requests containing the header Referer: hostname that is on the list will be rejected. If empty, all the referrers are allowed
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedReferrers() {
        return this.blockedReferrers;
    }
    /**
     * Gets the BlockNoneReferrer property value. The BlockNoneReferrer property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockNoneReferrer() {
        return this.blockNoneReferrer;
    }
    /**
     * Gets the BlockPostRequests property value. If true, POST requests to the zone will be blocked
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockPostRequests() {
        return this.blockPostRequests;
    }
    /**
     * Gets the BlockRootPathAccess property value. If true, access to root path will return a 403 error
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockRootPathAccess() {
        return this.blockRootPathAccess;
    }
    /**
     * Gets the BudgetRedirectedCountries property value. The list of budget redirected countries with the two-letter Alpha2 ISO codes
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBudgetRedirectedCountries() {
        return this.budgetRedirectedCountries;
    }
    /**
     * Gets the BunnyAiImageBlueprints property value. The BunnyAiImageBlueprints property
     * @return a {@link java.util.List<BunnyAiImageBlueprint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BunnyAiImageBlueprint> getBunnyAiImageBlueprints() {
        return this.bunnyAiImageBlueprints;
    }
    /**
     * Gets the BurstSize property value. Excessive requests are delayed until their number exceeds the maximum burst size.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBurstSize() {
        return this.burstSize;
    }
    /**
     * Gets the CacheControlBrowserMaxAgeOverride property value. Sets the browser cache control override setting for this zone
     * @return a {@link Long}
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Long getCacheControlBrowserMaxAgeOverride() {
        return this.cacheControlBrowserMaxAgeOverride;
    }
    /**
     * Gets the CacheControlMaxAgeOverride property value. The override cache time for the pull zone
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCacheControlMaxAgeOverride() {
        return this.cacheControlMaxAgeOverride;
    }
    /**
     * Gets the CacheControlPublicMaxAgeOverride property value. The override cache time for the pull zone for the end client
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCacheControlPublicMaxAgeOverride() {
        return this.cacheControlPublicMaxAgeOverride;
    }
    /**
     * Gets the CacheErrorResponses property value. Determines if bunny.net should be caching error responses
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCacheErrorResponses() {
        return this.cacheErrorResponses;
    }
    /**
     * Gets the ConnectionLimitPerIPCount property value. The number of connections limited per IP for this zone
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConnectionLimitPerIPCount() {
        return this.connectionLimitPerIPCount;
    }
    /**
     * Gets the CookieVaryParameters property value. Contains the list of vary parameters that will be used for vary cache by cookie string. If empty, cookie vary will not be used.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCookieVaryParameters() {
        return this.cookieVaryParameters;
    }
    /**
     * Gets the DisableCookies property value. Determines if the cookies are disabled for the pull zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableCookies() {
        return this.disableCookies;
    }
    /**
     * Gets the DisableLetsEncrypt property value. If true, the built-in let's encrypt is disabled and requests are passed to the origin.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableLetsEncrypt() {
        return this.disableLetsEncrypt;
    }
    /**
     * Gets the DnsOriginPort property value. Determines the origin port of the pull zone.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDnsOriginPort() {
        return this.dnsOriginPort;
    }
    /**
     * Gets the DnsOriginScheme property value. Determines the origin scheme of the pull zone.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDnsOriginScheme() {
        return this.dnsOriginScheme;
    }
    /**
     * Gets the EdgeRules property value. The list of edge rules on this Pull Zone
     * @return a {@link java.util.List<EdgeRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdgeRule> getEdgeRules() {
        return this.edgeRules;
    }
    /**
     * Gets the EdgeScriptExecutionPhase property value. The EdgeScriptExecutionPhase property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getEdgeScriptExecutionPhase() {
        return this.edgeScriptExecutionPhase;
    }
    /**
     * Gets the EdgeScriptId property value. The ID of the edge script that the pull zone is linked to
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEdgeScriptId() {
        return this.edgeScriptId;
    }
    /**
     * Gets the EnableAccessControlOriginHeader property value. Determines if the CORS headers should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAccessControlOriginHeader() {
        return this.enableAccessControlOriginHeader;
    }
    /**
     * Gets the EnableAutoSSL property value. If set to true, any hostnames added to this Pull Zone will automatically enable SSL.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAutoSSL() {
        return this.enableAutoSSL;
    }
    /**
     * Gets the EnableAvifVary property value. Determines if the AVIF Vary feature is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAvifVary() {
        return this.enableAvifVary;
    }
    /**
     * Gets the EnableBunnyImageAi property value. The EnableBunnyImageAi property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableBunnyImageAi() {
        return this.enableBunnyImageAi;
    }
    /**
     * Gets the EnableCacheSlice property value. Determines if the cache slice (Optimize for video) feature is enabled for the Pull Zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableCacheSlice() {
        return this.enableCacheSlice;
    }
    /**
     * Gets the EnableCookieVary property value. Determines if the Cookie Vary feature is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableCookieVary() {
        return this.enableCookieVary;
    }
    /**
     * Gets the EnableCountryCodeVary property value. Determines if the Country Code Vary feature is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableCountryCodeVary() {
        return this.enableCountryCodeVary;
    }
    /**
     * Gets the EnableGeoZoneAF property value. Determines if the delivery from the Africa region is enabled for this pull zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableGeoZoneAF() {
        return this.enableGeoZoneAF;
    }
    /**
     * Gets the EnableGeoZoneASIA property value. Determines if the delivery from the Asian / Oceanian region is enabled for this pull zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableGeoZoneASIA() {
        return this.enableGeoZoneASIA;
    }
    /**
     * Gets the EnableGeoZoneEU property value. Determines if the delivery from the European region is enabled for this pull zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableGeoZoneEU() {
        return this.enableGeoZoneEU;
    }
    /**
     * Gets the EnableGeoZoneSA property value. Determines if the delivery from the South American region is enabled for this pull zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableGeoZoneSA() {
        return this.enableGeoZoneSA;
    }
    /**
     * Gets the EnableGeoZoneUS property value. Determines if the delivery from the North American region is enabled for this pull zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableGeoZoneUS() {
        return this.enableGeoZoneUS;
    }
    /**
     * Gets the EnableHostnameVary property value. Determines if the Hostname Vary feature is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableHostnameVary() {
        return this.enableHostnameVary;
    }
    /**
     * Gets the EnableLogging property value. Determines if the logging is enabled for this Pull Zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }
    /**
     * Gets the EnableMobileVary property value. Determines if the Mobile Vary feature is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableMobileVary() {
        return this.enableMobileVary;
    }
    /**
     * Gets the EnableOriginShield property value. If true the server will use the origin shield feature
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableOriginShield() {
        return this.enableOriginShield;
    }
    /**
     * Gets the EnableQueryStringOrdering property value. If set to true the query string ordering property is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableQueryStringOrdering() {
        return this.enableQueryStringOrdering;
    }
    /**
     * Gets the EnableRequestCoalescing property value. Determines if request coalescing is currently enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableRequestCoalescing() {
        return this.enableRequestCoalescing;
    }
    /**
     * Gets the EnableSafeHop property value. The EnableSafeHop property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSafeHop() {
        return this.enableSafeHop;
    }
    /**
     * Gets the EnableSmartCache property value. Determines if smart caching is enabled for this zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSmartCache() {
        return this.enableSmartCache;
    }
    /**
     * Gets the EnableTLS1 property value. Determines if the TLS 1 is enabled on the Pull Zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTLS1() {
        return this.enableTLS1;
    }
    /**
     * Gets the EnableTLS1_1 property value. Determines if the TLS 1.1 is enabled on the Pull Zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTLS11() {
        return this.enableTLS11;
    }
    /**
     * Gets the EnableWebPVary property value. Determines if the WebP Vary feature is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableWebPVary() {
        return this.enableWebPVary;
    }
    /**
     * Gets the ErrorPageCustomCode property value. Contains the custom error page code that will be returned
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorPageCustomCode() {
        return this.errorPageCustomCode;
    }
    /**
     * Gets the ErrorPageEnableCustomCode property value. Determines if custom error page code should be enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getErrorPageEnableCustomCode() {
        return this.errorPageEnableCustomCode;
    }
    /**
     * Gets the ErrorPageEnableStatuspageWidget property value. Determines if the statuspage widget should be displayed on the error pages
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getErrorPageEnableStatuspageWidget() {
        return this.errorPageEnableStatuspageWidget;
    }
    /**
     * Gets the ErrorPageStatuspageCode property value. The statuspage code that will be used to build the status widget
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorPageStatuspageCode() {
        return this.errorPageStatuspageCode;
    }
    /**
     * Gets the ErrorPageWhitelabel property value. Determines if the error pages should be whitelabel or not
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getErrorPageWhitelabel() {
        return this.errorPageWhitelabel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(142);
        deserializerMap.put("AccessControlOriginHeaderExtensions", (n) -> { this.setAccessControlOriginHeaderExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("AddCanonicalHeader", (n) -> { this.setAddCanonicalHeader(n.getBooleanValue()); });
        deserializerMap.put("AddHostHeader", (n) -> { this.setAddHostHeader(n.getBooleanValue()); });
        deserializerMap.put("AllowedReferrers", (n) -> { this.setAllowedReferrers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("AWSSigningEnabled", (n) -> { this.setAWSSigningEnabled(n.getBooleanValue()); });
        deserializerMap.put("AWSSigningKey", (n) -> { this.setAWSSigningKey(n.getStringValue()); });
        deserializerMap.put("AWSSigningRegionName", (n) -> { this.setAWSSigningRegionName(n.getStringValue()); });
        deserializerMap.put("AWSSigningSecret", (n) -> { this.setAWSSigningSecret(n.getStringValue()); });
        deserializerMap.put("BlockedCountries", (n) -> { this.setBlockedCountries(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("BlockedIps", (n) -> { this.setBlockedIps(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("BlockedReferrers", (n) -> { this.setBlockedReferrers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("BlockNoneReferrer", (n) -> { this.setBlockNoneReferrer(n.getBooleanValue()); });
        deserializerMap.put("BlockPostRequests", (n) -> { this.setBlockPostRequests(n.getBooleanValue()); });
        deserializerMap.put("BlockRootPathAccess", (n) -> { this.setBlockRootPathAccess(n.getBooleanValue()); });
        deserializerMap.put("BudgetRedirectedCountries", (n) -> { this.setBudgetRedirectedCountries(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("BunnyAiImageBlueprints", (n) -> { this.setBunnyAiImageBlueprints(n.getCollectionOfObjectValues(BunnyAiImageBlueprint::createFromDiscriminatorValue)); });
        deserializerMap.put("BurstSize", (n) -> { this.setBurstSize(n.getIntegerValue()); });
        deserializerMap.put("CacheControlBrowserMaxAgeOverride", (n) -> { this.setCacheControlBrowserMaxAgeOverride(n.getLongValue()); });
        deserializerMap.put("CacheControlMaxAgeOverride", (n) -> { this.setCacheControlMaxAgeOverride(n.getLongValue()); });
        deserializerMap.put("CacheControlPublicMaxAgeOverride", (n) -> { this.setCacheControlPublicMaxAgeOverride(n.getLongValue()); });
        deserializerMap.put("CacheErrorResponses", (n) -> { this.setCacheErrorResponses(n.getBooleanValue()); });
        deserializerMap.put("ConnectionLimitPerIPCount", (n) -> { this.setConnectionLimitPerIPCount(n.getIntegerValue()); });
        deserializerMap.put("CookieVaryParameters", (n) -> { this.setCookieVaryParameters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("DisableCookies", (n) -> { this.setDisableCookies(n.getBooleanValue()); });
        deserializerMap.put("DisableLetsEncrypt", (n) -> { this.setDisableLetsEncrypt(n.getBooleanValue()); });
        deserializerMap.put("DnsOriginPort", (n) -> { this.setDnsOriginPort(n.getIntegerValue()); });
        deserializerMap.put("DnsOriginScheme", (n) -> { this.setDnsOriginScheme(n.getStringValue()); });
        deserializerMap.put("EdgeRules", (n) -> { this.setEdgeRules(n.getCollectionOfObjectValues(EdgeRule::createFromDiscriminatorValue)); });
        deserializerMap.put("EdgeScriptExecutionPhase", (n) -> { this.setEdgeScriptExecutionPhase(n.getDoubleValue()); });
        deserializerMap.put("EdgeScriptId", (n) -> { this.setEdgeScriptId(n.getLongValue()); });
        deserializerMap.put("EnableAccessControlOriginHeader", (n) -> { this.setEnableAccessControlOriginHeader(n.getBooleanValue()); });
        deserializerMap.put("EnableAutoSSL", (n) -> { this.setEnableAutoSSL(n.getBooleanValue()); });
        deserializerMap.put("EnableAvifVary", (n) -> { this.setEnableAvifVary(n.getBooleanValue()); });
        deserializerMap.put("EnableBunnyImageAi", (n) -> { this.setEnableBunnyImageAi(n.getBooleanValue()); });
        deserializerMap.put("EnableCacheSlice", (n) -> { this.setEnableCacheSlice(n.getBooleanValue()); });
        deserializerMap.put("EnableCookieVary", (n) -> { this.setEnableCookieVary(n.getBooleanValue()); });
        deserializerMap.put("EnableCountryCodeVary", (n) -> { this.setEnableCountryCodeVary(n.getBooleanValue()); });
        deserializerMap.put("EnableGeoZoneAF", (n) -> { this.setEnableGeoZoneAF(n.getBooleanValue()); });
        deserializerMap.put("EnableGeoZoneASIA", (n) -> { this.setEnableGeoZoneASIA(n.getBooleanValue()); });
        deserializerMap.put("EnableGeoZoneEU", (n) -> { this.setEnableGeoZoneEU(n.getBooleanValue()); });
        deserializerMap.put("EnableGeoZoneSA", (n) -> { this.setEnableGeoZoneSA(n.getBooleanValue()); });
        deserializerMap.put("EnableGeoZoneUS", (n) -> { this.setEnableGeoZoneUS(n.getBooleanValue()); });
        deserializerMap.put("EnableHostnameVary", (n) -> { this.setEnableHostnameVary(n.getBooleanValue()); });
        deserializerMap.put("EnableLogging", (n) -> { this.setEnableLogging(n.getBooleanValue()); });
        deserializerMap.put("EnableMobileVary", (n) -> { this.setEnableMobileVary(n.getBooleanValue()); });
        deserializerMap.put("EnableOriginShield", (n) -> { this.setEnableOriginShield(n.getBooleanValue()); });
        deserializerMap.put("EnableQueryStringOrdering", (n) -> { this.setEnableQueryStringOrdering(n.getBooleanValue()); });
        deserializerMap.put("EnableRequestCoalescing", (n) -> { this.setEnableRequestCoalescing(n.getBooleanValue()); });
        deserializerMap.put("EnableSafeHop", (n) -> { this.setEnableSafeHop(n.getBooleanValue()); });
        deserializerMap.put("EnableSmartCache", (n) -> { this.setEnableSmartCache(n.getBooleanValue()); });
        deserializerMap.put("EnableTLS1", (n) -> { this.setEnableTLS1(n.getBooleanValue()); });
        deserializerMap.put("EnableTLS1_1", (n) -> { this.setEnableTLS11(n.getBooleanValue()); });
        deserializerMap.put("EnableWebPVary", (n) -> { this.setEnableWebPVary(n.getBooleanValue()); });
        deserializerMap.put("ErrorPageCustomCode", (n) -> { this.setErrorPageCustomCode(n.getStringValue()); });
        deserializerMap.put("ErrorPageEnableCustomCode", (n) -> { this.setErrorPageEnableCustomCode(n.getBooleanValue()); });
        deserializerMap.put("ErrorPageEnableStatuspageWidget", (n) -> { this.setErrorPageEnableStatuspageWidget(n.getBooleanValue()); });
        deserializerMap.put("ErrorPageStatuspageCode", (n) -> { this.setErrorPageStatuspageCode(n.getStringValue()); });
        deserializerMap.put("ErrorPageWhitelabel", (n) -> { this.setErrorPageWhitelabel(n.getBooleanValue()); });
        deserializerMap.put("FollowRedirects", (n) -> { this.setFollowRedirects(n.getBooleanValue()); });
        deserializerMap.put("IgnoreQueryStrings", (n) -> { this.setIgnoreQueryStrings(n.getBooleanValue()); });
        deserializerMap.put("LimitRateAfter", (n) -> { this.setLimitRateAfter(n.getDoubleValue()); });
        deserializerMap.put("LimitRatePerSecond", (n) -> { this.setLimitRatePerSecond(n.getDoubleValue()); });
        deserializerMap.put("LogAnonymizationType", (n) -> { this.setLogAnonymizationType(n.getDoubleValue()); });
        deserializerMap.put("LogFormat", (n) -> { this.setLogFormat(n.getDoubleValue()); });
        deserializerMap.put("LogForwardingEnabled", (n) -> { this.setLogForwardingEnabled(n.getBooleanValue()); });
        deserializerMap.put("LogForwardingFormat", (n) -> { this.setLogForwardingFormat(n.getDoubleValue()); });
        deserializerMap.put("LogForwardingHostname", (n) -> { this.setLogForwardingHostname(n.getStringValue()); });
        deserializerMap.put("LogForwardingPort", (n) -> { this.setLogForwardingPort(n.getIntegerValue()); });
        deserializerMap.put("LogForwardingProtocol", (n) -> { this.setLogForwardingProtocol(n.getDoubleValue()); });
        deserializerMap.put("LogForwardingToken", (n) -> { this.setLogForwardingToken(n.getStringValue()); });
        deserializerMap.put("LoggingIPAnonymizationEnabled", (n) -> { this.setLoggingIPAnonymizationEnabled(n.getBooleanValue()); });
        deserializerMap.put("LoggingSaveToStorage", (n) -> { this.setLoggingSaveToStorage(n.getBooleanValue()); });
        deserializerMap.put("LoggingStorageZoneId", (n) -> { this.setLoggingStorageZoneId(n.getLongValue()); });
        deserializerMap.put("MagicContainersAppId", (n) -> { this.setMagicContainersAppId(n.getStringValue()); });
        deserializerMap.put("MagicContainersEndpointId", (n) -> { this.setMagicContainersEndpointId(n.getLongValue()); });
        deserializerMap.put("MiddlewareScriptId", (n) -> { this.setMiddlewareScriptId(n.getLongValue()); });
        deserializerMap.put("MonthlyBandwidthLimit", (n) -> { this.setMonthlyBandwidthLimit(n.getLongValue()); });
        deserializerMap.put("MonthlyCharges", (n) -> { this.setMonthlyCharges(n.getDoubleValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("OptimizerAutomaticOptimizationEnabled", (n) -> { this.setOptimizerAutomaticOptimizationEnabled(n.getBooleanValue()); });
        deserializerMap.put("OptimizerClasses", (n) -> { this.setOptimizerClasses(n.getCollectionOfObjectValues(OptimizerClass::createFromDiscriminatorValue)); });
        deserializerMap.put("OptimizerDesktopMaxWidth", (n) -> { this.setOptimizerDesktopMaxWidth(n.getIntegerValue()); });
        deserializerMap.put("OptimizerEnabled", (n) -> { this.setOptimizerEnabled(n.getBooleanValue()); });
        deserializerMap.put("OptimizerEnableManipulationEngine", (n) -> { this.setOptimizerEnableManipulationEngine(n.getBooleanValue()); });
        deserializerMap.put("OptimizerEnableWebP", (n) -> { this.setOptimizerEnableWebP(n.getBooleanValue()); });
        deserializerMap.put("OptimizerForceClasses", (n) -> { this.setOptimizerForceClasses(n.getBooleanValue()); });
        deserializerMap.put("OptimizerImageQuality", (n) -> { this.setOptimizerImageQuality(n.getIntegerValue()); });
        deserializerMap.put("OptimizerMinifyCSS", (n) -> { this.setOptimizerMinifyCSS(n.getBooleanValue()); });
        deserializerMap.put("OptimizerMinifyJavaScript", (n) -> { this.setOptimizerMinifyJavaScript(n.getBooleanValue()); });
        deserializerMap.put("OptimizerMobileImageQuality", (n) -> { this.setOptimizerMobileImageQuality(n.getIntegerValue()); });
        deserializerMap.put("OptimizerMobileMaxWidth", (n) -> { this.setOptimizerMobileMaxWidth(n.getIntegerValue()); });
        deserializerMap.put("OptimizerStaticHtmlEnabled", (n) -> { this.setOptimizerStaticHtmlEnabled(n.getBooleanValue()); });
        deserializerMap.put("OptimizerStaticHtmlWordPressBypassCookie", (n) -> { this.setOptimizerStaticHtmlWordPressBypassCookie(n.getStringValue()); });
        deserializerMap.put("OptimizerStaticHtmlWordPressPath", (n) -> { this.setOptimizerStaticHtmlWordPressPath(n.getStringValue()); });
        deserializerMap.put("OptimizerWatermarkEnabled", (n) -> { this.setOptimizerWatermarkEnabled(n.getBooleanValue()); });
        deserializerMap.put("OptimizerWatermarkMinImageSize", (n) -> { this.setOptimizerWatermarkMinImageSize(n.getIntegerValue()); });
        deserializerMap.put("OptimizerWatermarkOffset", (n) -> { this.setOptimizerWatermarkOffset(n.getDoubleValue()); });
        deserializerMap.put("OptimizerWatermarkPosition", (n) -> { this.setOptimizerWatermarkPosition(n.getDoubleValue()); });
        deserializerMap.put("OptimizerWatermarkUrl", (n) -> { this.setOptimizerWatermarkUrl(n.getStringValue()); });
        deserializerMap.put("OriginConnectTimeout", (n) -> { this.setOriginConnectTimeout(n.getIntegerValue()); });
        deserializerMap.put("OriginHostHeader", (n) -> { this.setOriginHostHeader(n.getStringValue()); });
        deserializerMap.put("OriginResponseTimeout", (n) -> { this.setOriginResponseTimeout(n.getIntegerValue()); });
        deserializerMap.put("OriginRetries", (n) -> { this.setOriginRetries(n.getIntegerValue()); });
        deserializerMap.put("OriginRetry5XXResponses", (n) -> { this.setOriginRetry5XXResponses(n.getBooleanValue()); });
        deserializerMap.put("OriginRetryConnectionTimeout", (n) -> { this.setOriginRetryConnectionTimeout(n.getBooleanValue()); });
        deserializerMap.put("OriginRetryDelay", (n) -> { this.setOriginRetryDelay(n.getIntegerValue()); });
        deserializerMap.put("OriginRetryResponseTimeout", (n) -> { this.setOriginRetryResponseTimeout(n.getBooleanValue()); });
        deserializerMap.put("OriginShieldEnableConcurrencyLimit", (n) -> { this.setOriginShieldEnableConcurrencyLimit(n.getBooleanValue()); });
        deserializerMap.put("OriginShieldMaxConcurrentRequests", (n) -> { this.setOriginShieldMaxConcurrentRequests(n.getIntegerValue()); });
        deserializerMap.put("OriginShieldMaxQueuedRequests", (n) -> { this.setOriginShieldMaxQueuedRequests(n.getIntegerValue()); });
        deserializerMap.put("OriginShieldQueueMaxWaitTime", (n) -> { this.setOriginShieldQueueMaxWaitTime(n.getIntegerValue()); });
        deserializerMap.put("OriginShieldZoneCode", (n) -> { this.setOriginShieldZoneCode(n.getStringValue()); });
        deserializerMap.put("OriginType", (n) -> { this.setOriginType(n.getDoubleValue()); });
        deserializerMap.put("OriginUrl", (n) -> { this.setOriginUrl(n.getStringValue()); });
        deserializerMap.put("PermaCacheStorageZoneId", (n) -> { this.setPermaCacheStorageZoneId(n.getLongValue()); });
        deserializerMap.put("PermaCacheType", (n) -> { this.setPermaCacheType(n.getLongValue()); });
        deserializerMap.put("PreloadingScreenCode", (n) -> { this.setPreloadingScreenCode(n.getStringValue()); });
        deserializerMap.put("PreloadingScreenCodeEnabled", (n) -> { this.setPreloadingScreenCodeEnabled(n.getBooleanValue()); });
        deserializerMap.put("PreloadingScreenDelay", (n) -> { this.setPreloadingScreenDelay(n.getIntegerValue()); });
        deserializerMap.put("PreloadingScreenEnabled", (n) -> { this.setPreloadingScreenEnabled(n.getBooleanValue()); });
        deserializerMap.put("PreloadingScreenLogoUrl", (n) -> { this.setPreloadingScreenLogoUrl(n.getStringValue()); });
        deserializerMap.put("PreloadingScreenShowOnFirstVisit", (n) -> { this.setPreloadingScreenShowOnFirstVisit(n.getBooleanValue()); });
        deserializerMap.put("PreloadingScreenTheme", (n) -> { this.setPreloadingScreenTheme(n.getDoubleValue()); });
        deserializerMap.put("QueryStringVaryParameters", (n) -> { this.setQueryStringVaryParameters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("RequestCoalescingTimeout", (n) -> { this.setRequestCoalescingTimeout(n.getIntegerValue()); });
        deserializerMap.put("RequestLimit", (n) -> { this.setRequestLimit(n.getIntegerValue()); });
        deserializerMap.put("RoutingFilters", (n) -> { this.setRoutingFilters(n.getCollectionOfEnumValues(PullZoneCreateRoutingFilters::forValue)); });
        deserializerMap.put("ShieldDDosProtectionEnabled", (n) -> { this.setShieldDDosProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("ShieldDDosProtectionType", (n) -> { this.setShieldDDosProtectionType(n.getDoubleValue()); });
        deserializerMap.put("StorageZoneId", (n) -> { this.setStorageZoneId(n.getLongValue()); });
        deserializerMap.put("Type", (n) -> { this.setType(n.getDoubleValue()); });
        deserializerMap.put("UseBackgroundUpdate", (n) -> { this.setUseBackgroundUpdate(n.getBooleanValue()); });
        deserializerMap.put("UseStaleWhileOffline", (n) -> { this.setUseStaleWhileOffline(n.getBooleanValue()); });
        deserializerMap.put("UseStaleWhileUpdating", (n) -> { this.setUseStaleWhileUpdating(n.getBooleanValue()); });
        deserializerMap.put("VerifyOriginSSL", (n) -> { this.setVerifyOriginSSL(n.getBooleanValue()); });
        deserializerMap.put("WAFDisabledRuleGroups", (n) -> { this.setWAFDisabledRuleGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("WAFDisabledRules", (n) -> { this.setWAFDisabledRules(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("WAFEnabled", (n) -> { this.setWAFEnabled(n.getBooleanValue()); });
        deserializerMap.put("WAFEnableRequestHeaderLogging", (n) -> { this.setWAFEnableRequestHeaderLogging(n.getBooleanValue()); });
        deserializerMap.put("WAFRequestHeaderIgnores", (n) -> { this.setWAFRequestHeaderIgnores(n.getBooleanValue()); });
        deserializerMap.put("ZoneSecurityEnabled", (n) -> { this.setZoneSecurityEnabled(n.getBooleanValue()); });
        deserializerMap.put("ZoneSecurityIncludeHashRemoteIP", (n) -> { this.setZoneSecurityIncludeHashRemoteIP(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FollowRedirects property value. Determines if the zone will follow origin redirects
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFollowRedirects() {
        return this.followRedirects;
    }
    /**
     * Gets the IgnoreQueryStrings property value. True if the Pull Zone is ignoring query strings when serving cached objects
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreQueryStrings() {
        return this.ignoreQueryStrings;
    }
    /**
     * Gets the LimitRateAfter property value. The amount of data after the rate limit will be activated
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLimitRateAfter() {
        return this.limitRateAfter;
    }
    /**
     * Gets the LimitRatePerSecond property value. The maximum rate at which the zone will transfer data in kb/s. 0 for unlimited
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLimitRatePerSecond() {
        return this.limitRatePerSecond;
    }
    /**
     * Gets the LogAnonymizationType property value. The LogAnonymizationType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLogAnonymizationType() {
        return this.logAnonymizationType;
    }
    /**
     * Gets the LogFormat property value. The LogFormat property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLogFormat() {
        return this.logFormat;
    }
    /**
     * Gets the LogForwardingEnabled property value. Determines if the log forwarding is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLogForwardingEnabled() {
        return this.logForwardingEnabled;
    }
    /**
     * Gets the LogForwardingFormat property value. The LogForwardingFormat property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLogForwardingFormat() {
        return this.logForwardingFormat;
    }
    /**
     * Gets the LogForwardingHostname property value. The log forwarding hostname
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogForwardingHostname() {
        return this.logForwardingHostname;
    }
    /**
     * Gets the LogForwardingPort property value. The log forwarding port
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLogForwardingPort() {
        return this.logForwardingPort;
    }
    /**
     * Gets the LogForwardingProtocol property value. The LogForwardingProtocol property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLogForwardingProtocol() {
        return this.logForwardingProtocol;
    }
    /**
     * Gets the LogForwardingToken property value. The log forwarding token value
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogForwardingToken() {
        return this.logForwardingToken;
    }
    /**
     * Gets the LoggingIPAnonymizationEnabled property value. Determines if the log anonymization should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLoggingIPAnonymizationEnabled() {
        return this.loggingIPAnonymizationEnabled;
    }
    /**
     * Gets the LoggingSaveToStorage property value. Determines if the permanent logging feature is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLoggingSaveToStorage() {
        return this.loggingSaveToStorage;
    }
    /**
     * Gets the LoggingStorageZoneId property value. The ID of the logging storage zone that is configured for this Pull Zone
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLoggingStorageZoneId() {
        return this.loggingStorageZoneId;
    }
    /**
     * Gets the MagicContainersAppId property value. The MagicContainersAppId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMagicContainersAppId() {
        return this.magicContainersAppId;
    }
    /**
     * Gets the MagicContainersEndpointId property value. The MagicContainersEndpointId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMagicContainersEndpointId() {
        return this.magicContainersEndpointId;
    }
    /**
     * Gets the MiddlewareScriptId property value. The MiddlewareScriptId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMiddlewareScriptId() {
        return this.middlewareScriptId;
    }
    /**
     * Gets the MonthlyBandwidthLimit property value. The monthly limit of bandwidth in bytes that the pullzone is allowed to use
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMonthlyBandwidthLimit() {
        return this.monthlyBandwidthLimit;
    }
    /**
     * Gets the MonthlyCharges property value. The total monthly charges for this so zone so far
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlyCharges() {
        return this.monthlyCharges;
    }
    /**
     * Gets the Name property value. The name of the pull zone.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the OptimizerAutomaticOptimizationEnabled property value. Determines if the automatic image optimization should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerAutomaticOptimizationEnabled() {
        return this.optimizerAutomaticOptimizationEnabled;
    }
    /**
     * Gets the OptimizerClasses property value. Contains the list of optimizer classes
     * @return a {@link java.util.List<OptimizerClass>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OptimizerClass> getOptimizerClasses() {
        return this.optimizerClasses;
    }
    /**
     * Gets the OptimizerDesktopMaxWidth property value. Determines the maximum automatic image size for desktop clients
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptimizerDesktopMaxWidth() {
        return this.optimizerDesktopMaxWidth;
    }
    /**
     * Gets the OptimizerEnabled property value. Determines if the optimizer should be enabled for this zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerEnabled() {
        return this.optimizerEnabled;
    }
    /**
     * Gets the OptimizerEnableManipulationEngine property value. Determines the image manipulation should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerEnableManipulationEngine() {
        return this.optimizerEnableManipulationEngine;
    }
    /**
     * Gets the OptimizerEnableWebP property value. Determines if the WebP optimization should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerEnableWebP() {
        return this.optimizerEnableWebP;
    }
    /**
     * Gets the OptimizerForceClasses property value. Determines if the optimizer class list should be enforced
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerForceClasses() {
        return this.optimizerForceClasses;
    }
    /**
     * Gets the OptimizerImageQuality property value. Determines the image quality for desktop clients
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptimizerImageQuality() {
        return this.optimizerImageQuality;
    }
    /**
     * Gets the OptimizerMinifyCSS property value. Determines if the CSS minification should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerMinifyCSS() {
        return this.optimizerMinifyCSS;
    }
    /**
     * Gets the OptimizerMinifyJavaScript property value. Determines if the JavaScript minification should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerMinifyJavaScript() {
        return this.optimizerMinifyJavaScript;
    }
    /**
     * Gets the OptimizerMobileImageQuality property value. Determines the image quality for mobile clients
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptimizerMobileImageQuality() {
        return this.optimizerMobileImageQuality;
    }
    /**
     * Gets the OptimizerMobileMaxWidth property value. Determines the maximum automatic image size for mobile clients
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptimizerMobileMaxWidth() {
        return this.optimizerMobileMaxWidth;
    }
    /**
     * Gets the OptimizerStaticHtmlEnabled property value. The OptimizerStaticHtmlEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerStaticHtmlEnabled() {
        return this.optimizerStaticHtmlEnabled;
    }
    /**
     * Gets the OptimizerStaticHtmlWordPressBypassCookie property value. The OptimizerStaticHtmlWordPressBypassCookie property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptimizerStaticHtmlWordPressBypassCookie() {
        return this.optimizerStaticHtmlWordPressBypassCookie;
    }
    /**
     * Gets the OptimizerStaticHtmlWordPressPath property value. The OptimizerStaticHtmlWordPressPath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptimizerStaticHtmlWordPressPath() {
        return this.optimizerStaticHtmlWordPressPath;
    }
    /**
     * Gets the OptimizerWatermarkEnabled property value. Determines if image watermarking should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptimizerWatermarkEnabled() {
        return this.optimizerWatermarkEnabled;
    }
    /**
     * Gets the OptimizerWatermarkMinImageSize property value. Sets the minimum image size to which the watermark will be added
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptimizerWatermarkMinImageSize() {
        return this.optimizerWatermarkMinImageSize;
    }
    /**
     * Gets the OptimizerWatermarkOffset property value. Sets the offset of the watermark image
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOptimizerWatermarkOffset() {
        return this.optimizerWatermarkOffset;
    }
    /**
     * Gets the OptimizerWatermarkPosition property value. The OptimizerWatermarkPosition property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOptimizerWatermarkPosition() {
        return this.optimizerWatermarkPosition;
    }
    /**
     * Gets the OptimizerWatermarkUrl property value. Sets the URL of the watermark image
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptimizerWatermarkUrl() {
        return this.optimizerWatermarkUrl;
    }
    /**
     * Gets the OriginConnectTimeout property value. The amount of seconds to wait when connecting to the origin. Otherwise the request will fail or retry.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginConnectTimeout() {
        return this.originConnectTimeout;
    }
    /**
     * Gets the OriginHostHeader property value. Determines the host header that will be sent to the origin
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginHostHeader() {
        return this.originHostHeader;
    }
    /**
     * Gets the OriginResponseTimeout property value. The amount of seconds to wait when waiting for the origin reply. Otherwise the request will fail or retry.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginResponseTimeout() {
        return this.originResponseTimeout;
    }
    /**
     * Gets the OriginRetries property value. The number of retries to the origin server
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginRetries() {
        return this.originRetries;
    }
    /**
     * Gets the OriginRetry5XXResponses property value. Determines if we should retry the request in case of a 5XX response.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOriginRetry5XXResponses() {
        return this.originRetry5XXResponses;
    }
    /**
     * Gets the OriginRetryConnectionTimeout property value. Determines if we should retry the request in case of a connection timeout.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOriginRetryConnectionTimeout() {
        return this.originRetryConnectionTimeout;
    }
    /**
     * Gets the OriginRetryDelay property value. Determines the amount of time that the CDN should wait before retrying an origin request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginRetryDelay() {
        return this.originRetryDelay;
    }
    /**
     * Gets the OriginRetryResponseTimeout property value. Determines if we should retry the request in case of a response timeout.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOriginRetryResponseTimeout() {
        return this.originRetryResponseTimeout;
    }
    /**
     * Gets the OriginShieldEnableConcurrencyLimit property value. Determines if the origin shield concurrency limit is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOriginShieldEnableConcurrencyLimit() {
        return this.originShieldEnableConcurrencyLimit;
    }
    /**
     * Gets the OriginShieldMaxConcurrentRequests property value. Determines the number of maximum concurrent requests allowed to the origin.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginShieldMaxConcurrentRequests() {
        return this.originShieldMaxConcurrentRequests;
    }
    /**
     * Gets the OriginShieldMaxQueuedRequests property value. Determines the max number of origin requests that will remain in the queue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginShieldMaxQueuedRequests() {
        return this.originShieldMaxQueuedRequests;
    }
    /**
     * Gets the OriginShieldQueueMaxWaitTime property value. Determines the max queue wait time
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOriginShieldQueueMaxWaitTime() {
        return this.originShieldQueueMaxWaitTime;
    }
    /**
     * Gets the OriginShieldZoneCode property value. The zone code of the origin shield
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginShieldZoneCode() {
        return this.originShieldZoneCode;
    }
    /**
     * Gets the OriginType property value. The OriginType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOriginType() {
        return this.originType;
    }
    /**
     * Gets the OriginUrl property value. The origin URL of the pull zone where the files are fetched from.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginUrl() {
        return this.originUrl;
    }
    /**
     * Gets the PermaCacheStorageZoneId property value. The IP of the storage zone used for Perma-Cache
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPermaCacheStorageZoneId() {
        return this.permaCacheStorageZoneId;
    }
    /**
     * Gets the PermaCacheType property value. The PermaCacheType property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPermaCacheType() {
        return this.permaCacheType;
    }
    /**
     * Gets the PreloadingScreenCode property value. The custom preloading screen code
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreloadingScreenCode() {
        return this.preloadingScreenCode;
    }
    /**
     * Gets the PreloadingScreenCodeEnabled property value. Determines if the custom preloader screen is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreloadingScreenCodeEnabled() {
        return this.preloadingScreenCodeEnabled;
    }
    /**
     * Gets the PreloadingScreenDelay property value. The delay in milliseconds after which the preloading screen will be displayed
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPreloadingScreenDelay() {
        return this.preloadingScreenDelay;
    }
    /**
     * Gets the PreloadingScreenEnabled property value. Determines if the preloading screen is currently enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreloadingScreenEnabled() {
        return this.preloadingScreenEnabled;
    }
    /**
     * Gets the PreloadingScreenLogoUrl property value. The preloading screen logo URL
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreloadingScreenLogoUrl() {
        return this.preloadingScreenLogoUrl;
    }
    /**
     * Gets the PreloadingScreenShowOnFirstVisit property value. The PreloadingScreenShowOnFirstVisit property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreloadingScreenShowOnFirstVisit() {
        return this.preloadingScreenShowOnFirstVisit;
    }
    /**
     * Gets the PreloadingScreenTheme property value. The PreloadingScreenTheme property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPreloadingScreenTheme() {
        return this.preloadingScreenTheme;
    }
    /**
     * Gets the QueryStringVaryParameters property value. Contains the list of vary parameters that will be used for vary cache by query string. If empty, all parameters will be used to construct the key
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getQueryStringVaryParameters() {
        return this.queryStringVaryParameters;
    }
    /**
     * Gets the RequestCoalescingTimeout property value. Determines the lock time for coalesced requests.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRequestCoalescingTimeout() {
        return this.requestCoalescingTimeout;
    }
    /**
     * Gets the RequestLimit property value. Max number of requests per IP per second
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRequestLimit() {
        return this.requestLimit;
    }
    /**
     * Gets the RoutingFilters property value. The list of routing filters enabled for this zone
     * @return a {@link java.util.List<PullZoneCreateRoutingFilters>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PullZoneCreateRoutingFilters> getRoutingFilters() {
        return this.routingFilters;
    }
    /**
     * Gets the ShieldDDosProtectionEnabled property value. The ShieldDDosProtectionEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShieldDDosProtectionEnabled() {
        return this.shieldDDosProtectionEnabled;
    }
    /**
     * Gets the ShieldDDosProtectionType property value. The ShieldDDosProtectionType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getShieldDDosProtectionType() {
        return this.shieldDDosProtectionType;
    }
    /**
     * Gets the StorageZoneId property value. The ID of the storage zone that the pull zone is linked to
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageZoneId() {
        return this.storageZoneId;
    }
    /**
     * Gets the Type property value. The Type property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getType() {
        return this.type;
    }
    /**
     * Gets the UseBackgroundUpdate property value. Determines if cache update is performed in the background.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseBackgroundUpdate() {
        return this.useBackgroundUpdate;
    }
    /**
     * Gets the UseStaleWhileOffline property value. Determines if we should use stale cache while the origin is offline
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseStaleWhileOffline() {
        return this.useStaleWhileOffline;
    }
    /**
     * Gets the UseStaleWhileUpdating property value. Determines if we should use stale cache while cache is updating
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseStaleWhileUpdating() {
        return this.useStaleWhileUpdating;
    }
    /**
     * Gets the VerifyOriginSSL property value. Determines if the Pull Zone should verify the origin SSL certificate
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVerifyOriginSSL() {
        return this.verifyOriginSSL;
    }
    /**
     * Gets the WAFDisabledRuleGroups property value. Determines the enabled WAF rule groups
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWAFDisabledRuleGroups() {
        return this.wAFDisabledRuleGroups;
    }
    /**
     * Gets the WAFDisabledRules property value. Determines the disabled WAF rules
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWAFDisabledRules() {
        return this.wAFDisabledRules;
    }
    /**
     * Gets the WAFEnabled property value. Determines if WAF should be enabled on the zone
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWAFEnabled() {
        return this.wAFEnabled;
    }
    /**
     * Gets the WAFEnableRequestHeaderLogging property value. Determines if WAF should enable request headers logging
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWAFEnableRequestHeaderLogging() {
        return this.wAFEnableRequestHeaderLogging;
    }
    /**
     * Gets the WAFRequestHeaderIgnores property value. Determines the list of headers that will be ignored in the WAF logs
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWAFRequestHeaderIgnores() {
        return this.wAFRequestHeaderIgnores;
    }
    /**
     * Gets the ZoneSecurityEnabled property value. True if the URL secure token authentication security is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getZoneSecurityEnabled() {
        return this.zoneSecurityEnabled;
    }
    /**
     * Gets the ZoneSecurityIncludeHashRemoteIP property value. True if the zone security hash should include the remote IP
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getZoneSecurityIncludeHashRemoteIP() {
        return this.zoneSecurityIncludeHashRemoteIP;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("AccessControlOriginHeaderExtensions", this.getAccessControlOriginHeaderExtensions());
        writer.writeBooleanValue("AddCanonicalHeader", this.getAddCanonicalHeader());
        writer.writeBooleanValue("AddHostHeader", this.getAddHostHeader());
        writer.writeCollectionOfPrimitiveValues("AllowedReferrers", this.getAllowedReferrers());
        writer.writeBooleanValue("AWSSigningEnabled", this.getAWSSigningEnabled());
        writer.writeStringValue("AWSSigningKey", this.getAWSSigningKey());
        writer.writeStringValue("AWSSigningRegionName", this.getAWSSigningRegionName());
        writer.writeStringValue("AWSSigningSecret", this.getAWSSigningSecret());
        writer.writeCollectionOfPrimitiveValues("BlockedCountries", this.getBlockedCountries());
        writer.writeCollectionOfPrimitiveValues("BlockedIps", this.getBlockedIps());
        writer.writeCollectionOfPrimitiveValues("BlockedReferrers", this.getBlockedReferrers());
        writer.writeBooleanValue("BlockNoneReferrer", this.getBlockNoneReferrer());
        writer.writeBooleanValue("BlockPostRequests", this.getBlockPostRequests());
        writer.writeBooleanValue("BlockRootPathAccess", this.getBlockRootPathAccess());
        writer.writeCollectionOfPrimitiveValues("BudgetRedirectedCountries", this.getBudgetRedirectedCountries());
        writer.writeCollectionOfObjectValues("BunnyAiImageBlueprints", this.getBunnyAiImageBlueprints());
        writer.writeIntegerValue("BurstSize", this.getBurstSize());
        writer.writeLongValue("CacheControlBrowserMaxAgeOverride", this.getCacheControlBrowserMaxAgeOverride());
        writer.writeLongValue("CacheControlMaxAgeOverride", this.getCacheControlMaxAgeOverride());
        writer.writeLongValue("CacheControlPublicMaxAgeOverride", this.getCacheControlPublicMaxAgeOverride());
        writer.writeBooleanValue("CacheErrorResponses", this.getCacheErrorResponses());
        writer.writeIntegerValue("ConnectionLimitPerIPCount", this.getConnectionLimitPerIPCount());
        writer.writeCollectionOfPrimitiveValues("CookieVaryParameters", this.getCookieVaryParameters());
        writer.writeBooleanValue("DisableCookies", this.getDisableCookies());
        writer.writeBooleanValue("DisableLetsEncrypt", this.getDisableLetsEncrypt());
        writer.writeIntegerValue("DnsOriginPort", this.getDnsOriginPort());
        writer.writeStringValue("DnsOriginScheme", this.getDnsOriginScheme());
        writer.writeCollectionOfObjectValues("EdgeRules", this.getEdgeRules());
        writer.writeDoubleValue("EdgeScriptExecutionPhase", this.getEdgeScriptExecutionPhase());
        writer.writeLongValue("EdgeScriptId", this.getEdgeScriptId());
        writer.writeBooleanValue("EnableAccessControlOriginHeader", this.getEnableAccessControlOriginHeader());
        writer.writeBooleanValue("EnableAutoSSL", this.getEnableAutoSSL());
        writer.writeBooleanValue("EnableAvifVary", this.getEnableAvifVary());
        writer.writeBooleanValue("EnableBunnyImageAi", this.getEnableBunnyImageAi());
        writer.writeBooleanValue("EnableCacheSlice", this.getEnableCacheSlice());
        writer.writeBooleanValue("EnableCookieVary", this.getEnableCookieVary());
        writer.writeBooleanValue("EnableCountryCodeVary", this.getEnableCountryCodeVary());
        writer.writeBooleanValue("EnableGeoZoneAF", this.getEnableGeoZoneAF());
        writer.writeBooleanValue("EnableGeoZoneASIA", this.getEnableGeoZoneASIA());
        writer.writeBooleanValue("EnableGeoZoneEU", this.getEnableGeoZoneEU());
        writer.writeBooleanValue("EnableGeoZoneSA", this.getEnableGeoZoneSA());
        writer.writeBooleanValue("EnableGeoZoneUS", this.getEnableGeoZoneUS());
        writer.writeBooleanValue("EnableHostnameVary", this.getEnableHostnameVary());
        writer.writeBooleanValue("EnableLogging", this.getEnableLogging());
        writer.writeBooleanValue("EnableMobileVary", this.getEnableMobileVary());
        writer.writeBooleanValue("EnableOriginShield", this.getEnableOriginShield());
        writer.writeBooleanValue("EnableQueryStringOrdering", this.getEnableQueryStringOrdering());
        writer.writeBooleanValue("EnableRequestCoalescing", this.getEnableRequestCoalescing());
        writer.writeBooleanValue("EnableSafeHop", this.getEnableSafeHop());
        writer.writeBooleanValue("EnableSmartCache", this.getEnableSmartCache());
        writer.writeBooleanValue("EnableTLS1", this.getEnableTLS1());
        writer.writeBooleanValue("EnableTLS1_1", this.getEnableTLS11());
        writer.writeBooleanValue("EnableWebPVary", this.getEnableWebPVary());
        writer.writeStringValue("ErrorPageCustomCode", this.getErrorPageCustomCode());
        writer.writeBooleanValue("ErrorPageEnableCustomCode", this.getErrorPageEnableCustomCode());
        writer.writeBooleanValue("ErrorPageEnableStatuspageWidget", this.getErrorPageEnableStatuspageWidget());
        writer.writeStringValue("ErrorPageStatuspageCode", this.getErrorPageStatuspageCode());
        writer.writeBooleanValue("ErrorPageWhitelabel", this.getErrorPageWhitelabel());
        writer.writeBooleanValue("FollowRedirects", this.getFollowRedirects());
        writer.writeBooleanValue("IgnoreQueryStrings", this.getIgnoreQueryStrings());
        writer.writeDoubleValue("LimitRateAfter", this.getLimitRateAfter());
        writer.writeDoubleValue("LimitRatePerSecond", this.getLimitRatePerSecond());
        writer.writeDoubleValue("LogAnonymizationType", this.getLogAnonymizationType());
        writer.writeDoubleValue("LogFormat", this.getLogFormat());
        writer.writeBooleanValue("LogForwardingEnabled", this.getLogForwardingEnabled());
        writer.writeDoubleValue("LogForwardingFormat", this.getLogForwardingFormat());
        writer.writeStringValue("LogForwardingHostname", this.getLogForwardingHostname());
        writer.writeIntegerValue("LogForwardingPort", this.getLogForwardingPort());
        writer.writeDoubleValue("LogForwardingProtocol", this.getLogForwardingProtocol());
        writer.writeStringValue("LogForwardingToken", this.getLogForwardingToken());
        writer.writeBooleanValue("LoggingIPAnonymizationEnabled", this.getLoggingIPAnonymizationEnabled());
        writer.writeBooleanValue("LoggingSaveToStorage", this.getLoggingSaveToStorage());
        writer.writeLongValue("LoggingStorageZoneId", this.getLoggingStorageZoneId());
        writer.writeStringValue("MagicContainersAppId", this.getMagicContainersAppId());
        writer.writeLongValue("MagicContainersEndpointId", this.getMagicContainersEndpointId());
        writer.writeLongValue("MiddlewareScriptId", this.getMiddlewareScriptId());
        writer.writeLongValue("MonthlyBandwidthLimit", this.getMonthlyBandwidthLimit());
        writer.writeDoubleValue("MonthlyCharges", this.getMonthlyCharges());
        writer.writeStringValue("Name", this.getName());
        writer.writeBooleanValue("OptimizerAutomaticOptimizationEnabled", this.getOptimizerAutomaticOptimizationEnabled());
        writer.writeCollectionOfObjectValues("OptimizerClasses", this.getOptimizerClasses());
        writer.writeIntegerValue("OptimizerDesktopMaxWidth", this.getOptimizerDesktopMaxWidth());
        writer.writeBooleanValue("OptimizerEnabled", this.getOptimizerEnabled());
        writer.writeBooleanValue("OptimizerEnableManipulationEngine", this.getOptimizerEnableManipulationEngine());
        writer.writeBooleanValue("OptimizerEnableWebP", this.getOptimizerEnableWebP());
        writer.writeBooleanValue("OptimizerForceClasses", this.getOptimizerForceClasses());
        writer.writeIntegerValue("OptimizerImageQuality", this.getOptimizerImageQuality());
        writer.writeBooleanValue("OptimizerMinifyCSS", this.getOptimizerMinifyCSS());
        writer.writeBooleanValue("OptimizerMinifyJavaScript", this.getOptimizerMinifyJavaScript());
        writer.writeIntegerValue("OptimizerMobileImageQuality", this.getOptimizerMobileImageQuality());
        writer.writeIntegerValue("OptimizerMobileMaxWidth", this.getOptimizerMobileMaxWidth());
        writer.writeBooleanValue("OptimizerStaticHtmlEnabled", this.getOptimizerStaticHtmlEnabled());
        writer.writeStringValue("OptimizerStaticHtmlWordPressBypassCookie", this.getOptimizerStaticHtmlWordPressBypassCookie());
        writer.writeStringValue("OptimizerStaticHtmlWordPressPath", this.getOptimizerStaticHtmlWordPressPath());
        writer.writeBooleanValue("OptimizerWatermarkEnabled", this.getOptimizerWatermarkEnabled());
        writer.writeIntegerValue("OptimizerWatermarkMinImageSize", this.getOptimizerWatermarkMinImageSize());
        writer.writeDoubleValue("OptimizerWatermarkOffset", this.getOptimizerWatermarkOffset());
        writer.writeDoubleValue("OptimizerWatermarkPosition", this.getOptimizerWatermarkPosition());
        writer.writeStringValue("OptimizerWatermarkUrl", this.getOptimizerWatermarkUrl());
        writer.writeIntegerValue("OriginConnectTimeout", this.getOriginConnectTimeout());
        writer.writeStringValue("OriginHostHeader", this.getOriginHostHeader());
        writer.writeIntegerValue("OriginResponseTimeout", this.getOriginResponseTimeout());
        writer.writeIntegerValue("OriginRetries", this.getOriginRetries());
        writer.writeBooleanValue("OriginRetry5XXResponses", this.getOriginRetry5XXResponses());
        writer.writeBooleanValue("OriginRetryConnectionTimeout", this.getOriginRetryConnectionTimeout());
        writer.writeIntegerValue("OriginRetryDelay", this.getOriginRetryDelay());
        writer.writeBooleanValue("OriginRetryResponseTimeout", this.getOriginRetryResponseTimeout());
        writer.writeBooleanValue("OriginShieldEnableConcurrencyLimit", this.getOriginShieldEnableConcurrencyLimit());
        writer.writeIntegerValue("OriginShieldMaxConcurrentRequests", this.getOriginShieldMaxConcurrentRequests());
        writer.writeIntegerValue("OriginShieldMaxQueuedRequests", this.getOriginShieldMaxQueuedRequests());
        writer.writeIntegerValue("OriginShieldQueueMaxWaitTime", this.getOriginShieldQueueMaxWaitTime());
        writer.writeStringValue("OriginShieldZoneCode", this.getOriginShieldZoneCode());
        writer.writeDoubleValue("OriginType", this.getOriginType());
        writer.writeStringValue("OriginUrl", this.getOriginUrl());
        writer.writeLongValue("PermaCacheStorageZoneId", this.getPermaCacheStorageZoneId());
        writer.writeLongValue("PermaCacheType", this.getPermaCacheType());
        writer.writeStringValue("PreloadingScreenCode", this.getPreloadingScreenCode());
        writer.writeBooleanValue("PreloadingScreenCodeEnabled", this.getPreloadingScreenCodeEnabled());
        writer.writeIntegerValue("PreloadingScreenDelay", this.getPreloadingScreenDelay());
        writer.writeBooleanValue("PreloadingScreenEnabled", this.getPreloadingScreenEnabled());
        writer.writeStringValue("PreloadingScreenLogoUrl", this.getPreloadingScreenLogoUrl());
        writer.writeBooleanValue("PreloadingScreenShowOnFirstVisit", this.getPreloadingScreenShowOnFirstVisit());
        writer.writeDoubleValue("PreloadingScreenTheme", this.getPreloadingScreenTheme());
        writer.writeCollectionOfPrimitiveValues("QueryStringVaryParameters", this.getQueryStringVaryParameters());
        writer.writeIntegerValue("RequestCoalescingTimeout", this.getRequestCoalescingTimeout());
        writer.writeIntegerValue("RequestLimit", this.getRequestLimit());
        writer.writeCollectionOfEnumValues("RoutingFilters", this.getRoutingFilters());
        writer.writeBooleanValue("ShieldDDosProtectionEnabled", this.getShieldDDosProtectionEnabled());
        writer.writeDoubleValue("ShieldDDosProtectionType", this.getShieldDDosProtectionType());
        writer.writeLongValue("StorageZoneId", this.getStorageZoneId());
        writer.writeDoubleValue("Type", this.getType());
        writer.writeBooleanValue("UseBackgroundUpdate", this.getUseBackgroundUpdate());
        writer.writeBooleanValue("UseStaleWhileOffline", this.getUseStaleWhileOffline());
        writer.writeBooleanValue("UseStaleWhileUpdating", this.getUseStaleWhileUpdating());
        writer.writeBooleanValue("VerifyOriginSSL", this.getVerifyOriginSSL());
        writer.writeCollectionOfPrimitiveValues("WAFDisabledRuleGroups", this.getWAFDisabledRuleGroups());
        writer.writeCollectionOfPrimitiveValues("WAFDisabledRules", this.getWAFDisabledRules());
        writer.writeBooleanValue("WAFEnabled", this.getWAFEnabled());
        writer.writeBooleanValue("WAFEnableRequestHeaderLogging", this.getWAFEnableRequestHeaderLogging());
        writer.writeBooleanValue("WAFRequestHeaderIgnores", this.getWAFRequestHeaderIgnores());
        writer.writeBooleanValue("ZoneSecurityEnabled", this.getZoneSecurityEnabled());
        writer.writeBooleanValue("ZoneSecurityIncludeHashRemoteIP", this.getZoneSecurityIncludeHashRemoteIP());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AccessControlOriginHeaderExtensions property value. The list of extensions that will return the CORS headers
     * @param value Value to set for the AccessControlOriginHeaderExtensions property.
     */
    public void setAccessControlOriginHeaderExtensions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.accessControlOriginHeaderExtensions = value;
    }
    /**
     * Sets the AddCanonicalHeader property value. Determines if the Add Canonical Header is enabled for this Pull Zone
     * @param value Value to set for the AddCanonicalHeader property.
     */
    public void setAddCanonicalHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.addCanonicalHeader = value;
    }
    /**
     * Sets the AddHostHeader property value. Determines if the Pull Zone should forward the current hostname to the origin
     * @param value Value to set for the AddHostHeader property.
     */
    public void setAddHostHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.addHostHeader = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the AllowedReferrers property value. The list of referrer hostnames that are allowed to access the pull zone.Requests containing the header Referer: hostname that is not on the list will be rejected.If empty, all the referrers are allowed
     * @param value Value to set for the AllowedReferrers property.
     */
    public void setAllowedReferrers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedReferrers = value;
    }
    /**
     * Sets the AWSSigningEnabled property value. Determines if the AWS Signing is enabled
     * @param value Value to set for the AWSSigningEnabled property.
     */
    public void setAWSSigningEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.aWSSigningEnabled = value;
    }
    /**
     * Sets the AWSSigningKey property value. The AWS Signing region key
     * @param value Value to set for the AWSSigningKey property.
     */
    public void setAWSSigningKey(@jakarta.annotation.Nullable final String value) {
        this.aWSSigningKey = value;
    }
    /**
     * Sets the AWSSigningRegionName property value. The AWS Signing region name
     * @param value Value to set for the AWSSigningRegionName property.
     */
    public void setAWSSigningRegionName(@jakarta.annotation.Nullable final String value) {
        this.aWSSigningRegionName = value;
    }
    /**
     * Sets the AWSSigningSecret property value. The AWS Signing region secret
     * @param value Value to set for the AWSSigningSecret property.
     */
    public void setAWSSigningSecret(@jakarta.annotation.Nullable final String value) {
        this.aWSSigningSecret = value;
    }
    /**
     * Sets the BlockedCountries property value. The list of blocked countries with the two-letter Alpha2 ISO codes
     * @param value Value to set for the BlockedCountries property.
     */
    public void setBlockedCountries(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.blockedCountries = value;
    }
    /**
     * Sets the BlockedIps property value. The list of IPs that are blocked from accessing the pull zone. Requests coming from the following IPs will be rejected. If empty, all the IPs will be allowed
     * @param value Value to set for the BlockedIps property.
     */
    public void setBlockedIps(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.blockedIps = value;
    }
    /**
     * Sets the BlockedReferrers property value. The list of referrer hostnames that are not allowed to access the pull zone. Requests containing the header Referer: hostname that is on the list will be rejected. If empty, all the referrers are allowed
     * @param value Value to set for the BlockedReferrers property.
     */
    public void setBlockedReferrers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.blockedReferrers = value;
    }
    /**
     * Sets the BlockNoneReferrer property value. The BlockNoneReferrer property
     * @param value Value to set for the BlockNoneReferrer property.
     */
    public void setBlockNoneReferrer(@jakarta.annotation.Nullable final Boolean value) {
        this.blockNoneReferrer = value;
    }
    /**
     * Sets the BlockPostRequests property value. If true, POST requests to the zone will be blocked
     * @param value Value to set for the BlockPostRequests property.
     */
    public void setBlockPostRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.blockPostRequests = value;
    }
    /**
     * Sets the BlockRootPathAccess property value. If true, access to root path will return a 403 error
     * @param value Value to set for the BlockRootPathAccess property.
     */
    public void setBlockRootPathAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.blockRootPathAccess = value;
    }
    /**
     * Sets the BudgetRedirectedCountries property value. The list of budget redirected countries with the two-letter Alpha2 ISO codes
     * @param value Value to set for the BudgetRedirectedCountries property.
     */
    public void setBudgetRedirectedCountries(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.budgetRedirectedCountries = value;
    }
    /**
     * Sets the BunnyAiImageBlueprints property value. The BunnyAiImageBlueprints property
     * @param value Value to set for the BunnyAiImageBlueprints property.
     */
    public void setBunnyAiImageBlueprints(@jakarta.annotation.Nullable final java.util.List<BunnyAiImageBlueprint> value) {
        this.bunnyAiImageBlueprints = value;
    }
    /**
     * Sets the BurstSize property value. Excessive requests are delayed until their number exceeds the maximum burst size.
     * @param value Value to set for the BurstSize property.
     */
    public void setBurstSize(@jakarta.annotation.Nullable final Integer value) {
        this.burstSize = value;
    }
    /**
     * Sets the CacheControlBrowserMaxAgeOverride property value. Sets the browser cache control override setting for this zone
     * @param value Value to set for the CacheControlBrowserMaxAgeOverride property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setCacheControlBrowserMaxAgeOverride(@jakarta.annotation.Nullable final Long value) {
        this.cacheControlBrowserMaxAgeOverride = value;
    }
    /**
     * Sets the CacheControlMaxAgeOverride property value. The override cache time for the pull zone
     * @param value Value to set for the CacheControlMaxAgeOverride property.
     */
    public void setCacheControlMaxAgeOverride(@jakarta.annotation.Nullable final Long value) {
        this.cacheControlMaxAgeOverride = value;
    }
    /**
     * Sets the CacheControlPublicMaxAgeOverride property value. The override cache time for the pull zone for the end client
     * @param value Value to set for the CacheControlPublicMaxAgeOverride property.
     */
    public void setCacheControlPublicMaxAgeOverride(@jakarta.annotation.Nullable final Long value) {
        this.cacheControlPublicMaxAgeOverride = value;
    }
    /**
     * Sets the CacheErrorResponses property value. Determines if bunny.net should be caching error responses
     * @param value Value to set for the CacheErrorResponses property.
     */
    public void setCacheErrorResponses(@jakarta.annotation.Nullable final Boolean value) {
        this.cacheErrorResponses = value;
    }
    /**
     * Sets the ConnectionLimitPerIPCount property value. The number of connections limited per IP for this zone
     * @param value Value to set for the ConnectionLimitPerIPCount property.
     */
    public void setConnectionLimitPerIPCount(@jakarta.annotation.Nullable final Integer value) {
        this.connectionLimitPerIPCount = value;
    }
    /**
     * Sets the CookieVaryParameters property value. Contains the list of vary parameters that will be used for vary cache by cookie string. If empty, cookie vary will not be used.
     * @param value Value to set for the CookieVaryParameters property.
     */
    public void setCookieVaryParameters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.cookieVaryParameters = value;
    }
    /**
     * Sets the DisableCookies property value. Determines if the cookies are disabled for the pull zone
     * @param value Value to set for the DisableCookies property.
     */
    public void setDisableCookies(@jakarta.annotation.Nullable final Boolean value) {
        this.disableCookies = value;
    }
    /**
     * Sets the DisableLetsEncrypt property value. If true, the built-in let's encrypt is disabled and requests are passed to the origin.
     * @param value Value to set for the DisableLetsEncrypt property.
     */
    public void setDisableLetsEncrypt(@jakarta.annotation.Nullable final Boolean value) {
        this.disableLetsEncrypt = value;
    }
    /**
     * Sets the DnsOriginPort property value. Determines the origin port of the pull zone.
     * @param value Value to set for the DnsOriginPort property.
     */
    public void setDnsOriginPort(@jakarta.annotation.Nullable final Integer value) {
        this.dnsOriginPort = value;
    }
    /**
     * Sets the DnsOriginScheme property value. Determines the origin scheme of the pull zone.
     * @param value Value to set for the DnsOriginScheme property.
     */
    public void setDnsOriginScheme(@jakarta.annotation.Nullable final String value) {
        this.dnsOriginScheme = value;
    }
    /**
     * Sets the EdgeRules property value. The list of edge rules on this Pull Zone
     * @param value Value to set for the EdgeRules property.
     */
    public void setEdgeRules(@jakarta.annotation.Nullable final java.util.List<EdgeRule> value) {
        this.edgeRules = value;
    }
    /**
     * Sets the EdgeScriptExecutionPhase property value. The EdgeScriptExecutionPhase property
     * @param value Value to set for the EdgeScriptExecutionPhase property.
     */
    public void setEdgeScriptExecutionPhase(@jakarta.annotation.Nullable final Double value) {
        this.edgeScriptExecutionPhase = value;
    }
    /**
     * Sets the EdgeScriptId property value. The ID of the edge script that the pull zone is linked to
     * @param value Value to set for the EdgeScriptId property.
     */
    public void setEdgeScriptId(@jakarta.annotation.Nullable final Long value) {
        this.edgeScriptId = value;
    }
    /**
     * Sets the EnableAccessControlOriginHeader property value. Determines if the CORS headers should be enabled
     * @param value Value to set for the EnableAccessControlOriginHeader property.
     */
    public void setEnableAccessControlOriginHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.enableAccessControlOriginHeader = value;
    }
    /**
     * Sets the EnableAutoSSL property value. If set to true, any hostnames added to this Pull Zone will automatically enable SSL.
     * @param value Value to set for the EnableAutoSSL property.
     */
    public void setEnableAutoSSL(@jakarta.annotation.Nullable final Boolean value) {
        this.enableAutoSSL = value;
    }
    /**
     * Sets the EnableAvifVary property value. Determines if the AVIF Vary feature is enabled.
     * @param value Value to set for the EnableAvifVary property.
     */
    public void setEnableAvifVary(@jakarta.annotation.Nullable final Boolean value) {
        this.enableAvifVary = value;
    }
    /**
     * Sets the EnableBunnyImageAi property value. The EnableBunnyImageAi property
     * @param value Value to set for the EnableBunnyImageAi property.
     */
    public void setEnableBunnyImageAi(@jakarta.annotation.Nullable final Boolean value) {
        this.enableBunnyImageAi = value;
    }
    /**
     * Sets the EnableCacheSlice property value. Determines if the cache slice (Optimize for video) feature is enabled for the Pull Zone
     * @param value Value to set for the EnableCacheSlice property.
     */
    public void setEnableCacheSlice(@jakarta.annotation.Nullable final Boolean value) {
        this.enableCacheSlice = value;
    }
    /**
     * Sets the EnableCookieVary property value. Determines if the Cookie Vary feature is enabled.
     * @param value Value to set for the EnableCookieVary property.
     */
    public void setEnableCookieVary(@jakarta.annotation.Nullable final Boolean value) {
        this.enableCookieVary = value;
    }
    /**
     * Sets the EnableCountryCodeVary property value. Determines if the Country Code Vary feature is enabled.
     * @param value Value to set for the EnableCountryCodeVary property.
     */
    public void setEnableCountryCodeVary(@jakarta.annotation.Nullable final Boolean value) {
        this.enableCountryCodeVary = value;
    }
    /**
     * Sets the EnableGeoZoneAF property value. Determines if the delivery from the Africa region is enabled for this pull zone
     * @param value Value to set for the EnableGeoZoneAF property.
     */
    public void setEnableGeoZoneAF(@jakarta.annotation.Nullable final Boolean value) {
        this.enableGeoZoneAF = value;
    }
    /**
     * Sets the EnableGeoZoneASIA property value. Determines if the delivery from the Asian / Oceanian region is enabled for this pull zone
     * @param value Value to set for the EnableGeoZoneASIA property.
     */
    public void setEnableGeoZoneASIA(@jakarta.annotation.Nullable final Boolean value) {
        this.enableGeoZoneASIA = value;
    }
    /**
     * Sets the EnableGeoZoneEU property value. Determines if the delivery from the European region is enabled for this pull zone
     * @param value Value to set for the EnableGeoZoneEU property.
     */
    public void setEnableGeoZoneEU(@jakarta.annotation.Nullable final Boolean value) {
        this.enableGeoZoneEU = value;
    }
    /**
     * Sets the EnableGeoZoneSA property value. Determines if the delivery from the South American region is enabled for this pull zone
     * @param value Value to set for the EnableGeoZoneSA property.
     */
    public void setEnableGeoZoneSA(@jakarta.annotation.Nullable final Boolean value) {
        this.enableGeoZoneSA = value;
    }
    /**
     * Sets the EnableGeoZoneUS property value. Determines if the delivery from the North American region is enabled for this pull zone
     * @param value Value to set for the EnableGeoZoneUS property.
     */
    public void setEnableGeoZoneUS(@jakarta.annotation.Nullable final Boolean value) {
        this.enableGeoZoneUS = value;
    }
    /**
     * Sets the EnableHostnameVary property value. Determines if the Hostname Vary feature is enabled.
     * @param value Value to set for the EnableHostnameVary property.
     */
    public void setEnableHostnameVary(@jakarta.annotation.Nullable final Boolean value) {
        this.enableHostnameVary = value;
    }
    /**
     * Sets the EnableLogging property value. Determines if the logging is enabled for this Pull Zone
     * @param value Value to set for the EnableLogging property.
     */
    public void setEnableLogging(@jakarta.annotation.Nullable final Boolean value) {
        this.enableLogging = value;
    }
    /**
     * Sets the EnableMobileVary property value. Determines if the Mobile Vary feature is enabled.
     * @param value Value to set for the EnableMobileVary property.
     */
    public void setEnableMobileVary(@jakarta.annotation.Nullable final Boolean value) {
        this.enableMobileVary = value;
    }
    /**
     * Sets the EnableOriginShield property value. If true the server will use the origin shield feature
     * @param value Value to set for the EnableOriginShield property.
     */
    public void setEnableOriginShield(@jakarta.annotation.Nullable final Boolean value) {
        this.enableOriginShield = value;
    }
    /**
     * Sets the EnableQueryStringOrdering property value. If set to true the query string ordering property is enabled.
     * @param value Value to set for the EnableQueryStringOrdering property.
     */
    public void setEnableQueryStringOrdering(@jakarta.annotation.Nullable final Boolean value) {
        this.enableQueryStringOrdering = value;
    }
    /**
     * Sets the EnableRequestCoalescing property value. Determines if request coalescing is currently enabled.
     * @param value Value to set for the EnableRequestCoalescing property.
     */
    public void setEnableRequestCoalescing(@jakarta.annotation.Nullable final Boolean value) {
        this.enableRequestCoalescing = value;
    }
    /**
     * Sets the EnableSafeHop property value. The EnableSafeHop property
     * @param value Value to set for the EnableSafeHop property.
     */
    public void setEnableSafeHop(@jakarta.annotation.Nullable final Boolean value) {
        this.enableSafeHop = value;
    }
    /**
     * Sets the EnableSmartCache property value. Determines if smart caching is enabled for this zone
     * @param value Value to set for the EnableSmartCache property.
     */
    public void setEnableSmartCache(@jakarta.annotation.Nullable final Boolean value) {
        this.enableSmartCache = value;
    }
    /**
     * Sets the EnableTLS1 property value. Determines if the TLS 1 is enabled on the Pull Zone
     * @param value Value to set for the EnableTLS1 property.
     */
    public void setEnableTLS1(@jakarta.annotation.Nullable final Boolean value) {
        this.enableTLS1 = value;
    }
    /**
     * Sets the EnableTLS1_1 property value. Determines if the TLS 1.1 is enabled on the Pull Zone
     * @param value Value to set for the EnableTLS1_1 property.
     */
    public void setEnableTLS11(@jakarta.annotation.Nullable final Boolean value) {
        this.enableTLS11 = value;
    }
    /**
     * Sets the EnableWebPVary property value. Determines if the WebP Vary feature is enabled.
     * @param value Value to set for the EnableWebPVary property.
     */
    public void setEnableWebPVary(@jakarta.annotation.Nullable final Boolean value) {
        this.enableWebPVary = value;
    }
    /**
     * Sets the ErrorPageCustomCode property value. Contains the custom error page code that will be returned
     * @param value Value to set for the ErrorPageCustomCode property.
     */
    public void setErrorPageCustomCode(@jakarta.annotation.Nullable final String value) {
        this.errorPageCustomCode = value;
    }
    /**
     * Sets the ErrorPageEnableCustomCode property value. Determines if custom error page code should be enabled.
     * @param value Value to set for the ErrorPageEnableCustomCode property.
     */
    public void setErrorPageEnableCustomCode(@jakarta.annotation.Nullable final Boolean value) {
        this.errorPageEnableCustomCode = value;
    }
    /**
     * Sets the ErrorPageEnableStatuspageWidget property value. Determines if the statuspage widget should be displayed on the error pages
     * @param value Value to set for the ErrorPageEnableStatuspageWidget property.
     */
    public void setErrorPageEnableStatuspageWidget(@jakarta.annotation.Nullable final Boolean value) {
        this.errorPageEnableStatuspageWidget = value;
    }
    /**
     * Sets the ErrorPageStatuspageCode property value. The statuspage code that will be used to build the status widget
     * @param value Value to set for the ErrorPageStatuspageCode property.
     */
    public void setErrorPageStatuspageCode(@jakarta.annotation.Nullable final String value) {
        this.errorPageStatuspageCode = value;
    }
    /**
     * Sets the ErrorPageWhitelabel property value. Determines if the error pages should be whitelabel or not
     * @param value Value to set for the ErrorPageWhitelabel property.
     */
    public void setErrorPageWhitelabel(@jakarta.annotation.Nullable final Boolean value) {
        this.errorPageWhitelabel = value;
    }
    /**
     * Sets the FollowRedirects property value. Determines if the zone will follow origin redirects
     * @param value Value to set for the FollowRedirects property.
     */
    public void setFollowRedirects(@jakarta.annotation.Nullable final Boolean value) {
        this.followRedirects = value;
    }
    /**
     * Sets the IgnoreQueryStrings property value. True if the Pull Zone is ignoring query strings when serving cached objects
     * @param value Value to set for the IgnoreQueryStrings property.
     */
    public void setIgnoreQueryStrings(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreQueryStrings = value;
    }
    /**
     * Sets the LimitRateAfter property value. The amount of data after the rate limit will be activated
     * @param value Value to set for the LimitRateAfter property.
     */
    public void setLimitRateAfter(@jakarta.annotation.Nullable final Double value) {
        this.limitRateAfter = value;
    }
    /**
     * Sets the LimitRatePerSecond property value. The maximum rate at which the zone will transfer data in kb/s. 0 for unlimited
     * @param value Value to set for the LimitRatePerSecond property.
     */
    public void setLimitRatePerSecond(@jakarta.annotation.Nullable final Double value) {
        this.limitRatePerSecond = value;
    }
    /**
     * Sets the LogAnonymizationType property value. The LogAnonymizationType property
     * @param value Value to set for the LogAnonymizationType property.
     */
    public void setLogAnonymizationType(@jakarta.annotation.Nullable final Double value) {
        this.logAnonymizationType = value;
    }
    /**
     * Sets the LogFormat property value. The LogFormat property
     * @param value Value to set for the LogFormat property.
     */
    public void setLogFormat(@jakarta.annotation.Nullable final Double value) {
        this.logFormat = value;
    }
    /**
     * Sets the LogForwardingEnabled property value. Determines if the log forwarding is enabled
     * @param value Value to set for the LogForwardingEnabled property.
     */
    public void setLogForwardingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.logForwardingEnabled = value;
    }
    /**
     * Sets the LogForwardingFormat property value. The LogForwardingFormat property
     * @param value Value to set for the LogForwardingFormat property.
     */
    public void setLogForwardingFormat(@jakarta.annotation.Nullable final Double value) {
        this.logForwardingFormat = value;
    }
    /**
     * Sets the LogForwardingHostname property value. The log forwarding hostname
     * @param value Value to set for the LogForwardingHostname property.
     */
    public void setLogForwardingHostname(@jakarta.annotation.Nullable final String value) {
        this.logForwardingHostname = value;
    }
    /**
     * Sets the LogForwardingPort property value. The log forwarding port
     * @param value Value to set for the LogForwardingPort property.
     */
    public void setLogForwardingPort(@jakarta.annotation.Nullable final Integer value) {
        this.logForwardingPort = value;
    }
    /**
     * Sets the LogForwardingProtocol property value. The LogForwardingProtocol property
     * @param value Value to set for the LogForwardingProtocol property.
     */
    public void setLogForwardingProtocol(@jakarta.annotation.Nullable final Double value) {
        this.logForwardingProtocol = value;
    }
    /**
     * Sets the LogForwardingToken property value. The log forwarding token value
     * @param value Value to set for the LogForwardingToken property.
     */
    public void setLogForwardingToken(@jakarta.annotation.Nullable final String value) {
        this.logForwardingToken = value;
    }
    /**
     * Sets the LoggingIPAnonymizationEnabled property value. Determines if the log anonymization should be enabled
     * @param value Value to set for the LoggingIPAnonymizationEnabled property.
     */
    public void setLoggingIPAnonymizationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.loggingIPAnonymizationEnabled = value;
    }
    /**
     * Sets the LoggingSaveToStorage property value. Determines if the permanent logging feature is enabled
     * @param value Value to set for the LoggingSaveToStorage property.
     */
    public void setLoggingSaveToStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.loggingSaveToStorage = value;
    }
    /**
     * Sets the LoggingStorageZoneId property value. The ID of the logging storage zone that is configured for this Pull Zone
     * @param value Value to set for the LoggingStorageZoneId property.
     */
    public void setLoggingStorageZoneId(@jakarta.annotation.Nullable final Long value) {
        this.loggingStorageZoneId = value;
    }
    /**
     * Sets the MagicContainersAppId property value. The MagicContainersAppId property
     * @param value Value to set for the MagicContainersAppId property.
     */
    public void setMagicContainersAppId(@jakarta.annotation.Nullable final String value) {
        this.magicContainersAppId = value;
    }
    /**
     * Sets the MagicContainersEndpointId property value. The MagicContainersEndpointId property
     * @param value Value to set for the MagicContainersEndpointId property.
     */
    public void setMagicContainersEndpointId(@jakarta.annotation.Nullable final Long value) {
        this.magicContainersEndpointId = value;
    }
    /**
     * Sets the MiddlewareScriptId property value. The MiddlewareScriptId property
     * @param value Value to set for the MiddlewareScriptId property.
     */
    public void setMiddlewareScriptId(@jakarta.annotation.Nullable final Long value) {
        this.middlewareScriptId = value;
    }
    /**
     * Sets the MonthlyBandwidthLimit property value. The monthly limit of bandwidth in bytes that the pullzone is allowed to use
     * @param value Value to set for the MonthlyBandwidthLimit property.
     */
    public void setMonthlyBandwidthLimit(@jakarta.annotation.Nullable final Long value) {
        this.monthlyBandwidthLimit = value;
    }
    /**
     * Sets the MonthlyCharges property value. The total monthly charges for this so zone so far
     * @param value Value to set for the MonthlyCharges property.
     */
    public void setMonthlyCharges(@jakarta.annotation.Nullable final Double value) {
        this.monthlyCharges = value;
    }
    /**
     * Sets the Name property value. The name of the pull zone.
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the OptimizerAutomaticOptimizationEnabled property value. Determines if the automatic image optimization should be enabled
     * @param value Value to set for the OptimizerAutomaticOptimizationEnabled property.
     */
    public void setOptimizerAutomaticOptimizationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerAutomaticOptimizationEnabled = value;
    }
    /**
     * Sets the OptimizerClasses property value. Contains the list of optimizer classes
     * @param value Value to set for the OptimizerClasses property.
     */
    public void setOptimizerClasses(@jakarta.annotation.Nullable final java.util.List<OptimizerClass> value) {
        this.optimizerClasses = value;
    }
    /**
     * Sets the OptimizerDesktopMaxWidth property value. Determines the maximum automatic image size for desktop clients
     * @param value Value to set for the OptimizerDesktopMaxWidth property.
     */
    public void setOptimizerDesktopMaxWidth(@jakarta.annotation.Nullable final Integer value) {
        this.optimizerDesktopMaxWidth = value;
    }
    /**
     * Sets the OptimizerEnabled property value. Determines if the optimizer should be enabled for this zone
     * @param value Value to set for the OptimizerEnabled property.
     */
    public void setOptimizerEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerEnabled = value;
    }
    /**
     * Sets the OptimizerEnableManipulationEngine property value. Determines the image manipulation should be enabled
     * @param value Value to set for the OptimizerEnableManipulationEngine property.
     */
    public void setOptimizerEnableManipulationEngine(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerEnableManipulationEngine = value;
    }
    /**
     * Sets the OptimizerEnableWebP property value. Determines if the WebP optimization should be enabled
     * @param value Value to set for the OptimizerEnableWebP property.
     */
    public void setOptimizerEnableWebP(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerEnableWebP = value;
    }
    /**
     * Sets the OptimizerForceClasses property value. Determines if the optimizer class list should be enforced
     * @param value Value to set for the OptimizerForceClasses property.
     */
    public void setOptimizerForceClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerForceClasses = value;
    }
    /**
     * Sets the OptimizerImageQuality property value. Determines the image quality for desktop clients
     * @param value Value to set for the OptimizerImageQuality property.
     */
    public void setOptimizerImageQuality(@jakarta.annotation.Nullable final Integer value) {
        this.optimizerImageQuality = value;
    }
    /**
     * Sets the OptimizerMinifyCSS property value. Determines if the CSS minification should be enabled
     * @param value Value to set for the OptimizerMinifyCSS property.
     */
    public void setOptimizerMinifyCSS(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerMinifyCSS = value;
    }
    /**
     * Sets the OptimizerMinifyJavaScript property value. Determines if the JavaScript minification should be enabled
     * @param value Value to set for the OptimizerMinifyJavaScript property.
     */
    public void setOptimizerMinifyJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerMinifyJavaScript = value;
    }
    /**
     * Sets the OptimizerMobileImageQuality property value. Determines the image quality for mobile clients
     * @param value Value to set for the OptimizerMobileImageQuality property.
     */
    public void setOptimizerMobileImageQuality(@jakarta.annotation.Nullable final Integer value) {
        this.optimizerMobileImageQuality = value;
    }
    /**
     * Sets the OptimizerMobileMaxWidth property value. Determines the maximum automatic image size for mobile clients
     * @param value Value to set for the OptimizerMobileMaxWidth property.
     */
    public void setOptimizerMobileMaxWidth(@jakarta.annotation.Nullable final Integer value) {
        this.optimizerMobileMaxWidth = value;
    }
    /**
     * Sets the OptimizerStaticHtmlEnabled property value. The OptimizerStaticHtmlEnabled property
     * @param value Value to set for the OptimizerStaticHtmlEnabled property.
     */
    public void setOptimizerStaticHtmlEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerStaticHtmlEnabled = value;
    }
    /**
     * Sets the OptimizerStaticHtmlWordPressBypassCookie property value. The OptimizerStaticHtmlWordPressBypassCookie property
     * @param value Value to set for the OptimizerStaticHtmlWordPressBypassCookie property.
     */
    public void setOptimizerStaticHtmlWordPressBypassCookie(@jakarta.annotation.Nullable final String value) {
        this.optimizerStaticHtmlWordPressBypassCookie = value;
    }
    /**
     * Sets the OptimizerStaticHtmlWordPressPath property value. The OptimizerStaticHtmlWordPressPath property
     * @param value Value to set for the OptimizerStaticHtmlWordPressPath property.
     */
    public void setOptimizerStaticHtmlWordPressPath(@jakarta.annotation.Nullable final String value) {
        this.optimizerStaticHtmlWordPressPath = value;
    }
    /**
     * Sets the OptimizerWatermarkEnabled property value. Determines if image watermarking should be enabled
     * @param value Value to set for the OptimizerWatermarkEnabled property.
     */
    public void setOptimizerWatermarkEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.optimizerWatermarkEnabled = value;
    }
    /**
     * Sets the OptimizerWatermarkMinImageSize property value. Sets the minimum image size to which the watermark will be added
     * @param value Value to set for the OptimizerWatermarkMinImageSize property.
     */
    public void setOptimizerWatermarkMinImageSize(@jakarta.annotation.Nullable final Integer value) {
        this.optimizerWatermarkMinImageSize = value;
    }
    /**
     * Sets the OptimizerWatermarkOffset property value. Sets the offset of the watermark image
     * @param value Value to set for the OptimizerWatermarkOffset property.
     */
    public void setOptimizerWatermarkOffset(@jakarta.annotation.Nullable final Double value) {
        this.optimizerWatermarkOffset = value;
    }
    /**
     * Sets the OptimizerWatermarkPosition property value. The OptimizerWatermarkPosition property
     * @param value Value to set for the OptimizerWatermarkPosition property.
     */
    public void setOptimizerWatermarkPosition(@jakarta.annotation.Nullable final Double value) {
        this.optimizerWatermarkPosition = value;
    }
    /**
     * Sets the OptimizerWatermarkUrl property value. Sets the URL of the watermark image
     * @param value Value to set for the OptimizerWatermarkUrl property.
     */
    public void setOptimizerWatermarkUrl(@jakarta.annotation.Nullable final String value) {
        this.optimizerWatermarkUrl = value;
    }
    /**
     * Sets the OriginConnectTimeout property value. The amount of seconds to wait when connecting to the origin. Otherwise the request will fail or retry.
     * @param value Value to set for the OriginConnectTimeout property.
     */
    public void setOriginConnectTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.originConnectTimeout = value;
    }
    /**
     * Sets the OriginHostHeader property value. Determines the host header that will be sent to the origin
     * @param value Value to set for the OriginHostHeader property.
     */
    public void setOriginHostHeader(@jakarta.annotation.Nullable final String value) {
        this.originHostHeader = value;
    }
    /**
     * Sets the OriginResponseTimeout property value. The amount of seconds to wait when waiting for the origin reply. Otherwise the request will fail or retry.
     * @param value Value to set for the OriginResponseTimeout property.
     */
    public void setOriginResponseTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.originResponseTimeout = value;
    }
    /**
     * Sets the OriginRetries property value. The number of retries to the origin server
     * @param value Value to set for the OriginRetries property.
     */
    public void setOriginRetries(@jakarta.annotation.Nullable final Integer value) {
        this.originRetries = value;
    }
    /**
     * Sets the OriginRetry5XXResponses property value. Determines if we should retry the request in case of a 5XX response.
     * @param value Value to set for the OriginRetry5XXResponses property.
     */
    public void setOriginRetry5XXResponses(@jakarta.annotation.Nullable final Boolean value) {
        this.originRetry5XXResponses = value;
    }
    /**
     * Sets the OriginRetryConnectionTimeout property value. Determines if we should retry the request in case of a connection timeout.
     * @param value Value to set for the OriginRetryConnectionTimeout property.
     */
    public void setOriginRetryConnectionTimeout(@jakarta.annotation.Nullable final Boolean value) {
        this.originRetryConnectionTimeout = value;
    }
    /**
     * Sets the OriginRetryDelay property value. Determines the amount of time that the CDN should wait before retrying an origin request.
     * @param value Value to set for the OriginRetryDelay property.
     */
    public void setOriginRetryDelay(@jakarta.annotation.Nullable final Integer value) {
        this.originRetryDelay = value;
    }
    /**
     * Sets the OriginRetryResponseTimeout property value. Determines if we should retry the request in case of a response timeout.
     * @param value Value to set for the OriginRetryResponseTimeout property.
     */
    public void setOriginRetryResponseTimeout(@jakarta.annotation.Nullable final Boolean value) {
        this.originRetryResponseTimeout = value;
    }
    /**
     * Sets the OriginShieldEnableConcurrencyLimit property value. Determines if the origin shield concurrency limit is enabled.
     * @param value Value to set for the OriginShieldEnableConcurrencyLimit property.
     */
    public void setOriginShieldEnableConcurrencyLimit(@jakarta.annotation.Nullable final Boolean value) {
        this.originShieldEnableConcurrencyLimit = value;
    }
    /**
     * Sets the OriginShieldMaxConcurrentRequests property value. Determines the number of maximum concurrent requests allowed to the origin.
     * @param value Value to set for the OriginShieldMaxConcurrentRequests property.
     */
    public void setOriginShieldMaxConcurrentRequests(@jakarta.annotation.Nullable final Integer value) {
        this.originShieldMaxConcurrentRequests = value;
    }
    /**
     * Sets the OriginShieldMaxQueuedRequests property value. Determines the max number of origin requests that will remain in the queue
     * @param value Value to set for the OriginShieldMaxQueuedRequests property.
     */
    public void setOriginShieldMaxQueuedRequests(@jakarta.annotation.Nullable final Integer value) {
        this.originShieldMaxQueuedRequests = value;
    }
    /**
     * Sets the OriginShieldQueueMaxWaitTime property value. Determines the max queue wait time
     * @param value Value to set for the OriginShieldQueueMaxWaitTime property.
     */
    public void setOriginShieldQueueMaxWaitTime(@jakarta.annotation.Nullable final Integer value) {
        this.originShieldQueueMaxWaitTime = value;
    }
    /**
     * Sets the OriginShieldZoneCode property value. The zone code of the origin shield
     * @param value Value to set for the OriginShieldZoneCode property.
     */
    public void setOriginShieldZoneCode(@jakarta.annotation.Nullable final String value) {
        this.originShieldZoneCode = value;
    }
    /**
     * Sets the OriginType property value. The OriginType property
     * @param value Value to set for the OriginType property.
     */
    public void setOriginType(@jakarta.annotation.Nullable final Double value) {
        this.originType = value;
    }
    /**
     * Sets the OriginUrl property value. The origin URL of the pull zone where the files are fetched from.
     * @param value Value to set for the OriginUrl property.
     */
    public void setOriginUrl(@jakarta.annotation.Nullable final String value) {
        this.originUrl = value;
    }
    /**
     * Sets the PermaCacheStorageZoneId property value. The IP of the storage zone used for Perma-Cache
     * @param value Value to set for the PermaCacheStorageZoneId property.
     */
    public void setPermaCacheStorageZoneId(@jakarta.annotation.Nullable final Long value) {
        this.permaCacheStorageZoneId = value;
    }
    /**
     * Sets the PermaCacheType property value. The PermaCacheType property
     * @param value Value to set for the PermaCacheType property.
     */
    public void setPermaCacheType(@jakarta.annotation.Nullable final Long value) {
        this.permaCacheType = value;
    }
    /**
     * Sets the PreloadingScreenCode property value. The custom preloading screen code
     * @param value Value to set for the PreloadingScreenCode property.
     */
    public void setPreloadingScreenCode(@jakarta.annotation.Nullable final String value) {
        this.preloadingScreenCode = value;
    }
    /**
     * Sets the PreloadingScreenCodeEnabled property value. Determines if the custom preloader screen is enabled
     * @param value Value to set for the PreloadingScreenCodeEnabled property.
     */
    public void setPreloadingScreenCodeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.preloadingScreenCodeEnabled = value;
    }
    /**
     * Sets the PreloadingScreenDelay property value. The delay in milliseconds after which the preloading screen will be displayed
     * @param value Value to set for the PreloadingScreenDelay property.
     */
    public void setPreloadingScreenDelay(@jakarta.annotation.Nullable final Integer value) {
        this.preloadingScreenDelay = value;
    }
    /**
     * Sets the PreloadingScreenEnabled property value. Determines if the preloading screen is currently enabled
     * @param value Value to set for the PreloadingScreenEnabled property.
     */
    public void setPreloadingScreenEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.preloadingScreenEnabled = value;
    }
    /**
     * Sets the PreloadingScreenLogoUrl property value. The preloading screen logo URL
     * @param value Value to set for the PreloadingScreenLogoUrl property.
     */
    public void setPreloadingScreenLogoUrl(@jakarta.annotation.Nullable final String value) {
        this.preloadingScreenLogoUrl = value;
    }
    /**
     * Sets the PreloadingScreenShowOnFirstVisit property value. The PreloadingScreenShowOnFirstVisit property
     * @param value Value to set for the PreloadingScreenShowOnFirstVisit property.
     */
    public void setPreloadingScreenShowOnFirstVisit(@jakarta.annotation.Nullable final Boolean value) {
        this.preloadingScreenShowOnFirstVisit = value;
    }
    /**
     * Sets the PreloadingScreenTheme property value. The PreloadingScreenTheme property
     * @param value Value to set for the PreloadingScreenTheme property.
     */
    public void setPreloadingScreenTheme(@jakarta.annotation.Nullable final Double value) {
        this.preloadingScreenTheme = value;
    }
    /**
     * Sets the QueryStringVaryParameters property value. Contains the list of vary parameters that will be used for vary cache by query string. If empty, all parameters will be used to construct the key
     * @param value Value to set for the QueryStringVaryParameters property.
     */
    public void setQueryStringVaryParameters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.queryStringVaryParameters = value;
    }
    /**
     * Sets the RequestCoalescingTimeout property value. Determines the lock time for coalesced requests.
     * @param value Value to set for the RequestCoalescingTimeout property.
     */
    public void setRequestCoalescingTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.requestCoalescingTimeout = value;
    }
    /**
     * Sets the RequestLimit property value. Max number of requests per IP per second
     * @param value Value to set for the RequestLimit property.
     */
    public void setRequestLimit(@jakarta.annotation.Nullable final Integer value) {
        this.requestLimit = value;
    }
    /**
     * Sets the RoutingFilters property value. The list of routing filters enabled for this zone
     * @param value Value to set for the RoutingFilters property.
     */
    public void setRoutingFilters(@jakarta.annotation.Nullable final java.util.List<PullZoneCreateRoutingFilters> value) {
        this.routingFilters = value;
    }
    /**
     * Sets the ShieldDDosProtectionEnabled property value. The ShieldDDosProtectionEnabled property
     * @param value Value to set for the ShieldDDosProtectionEnabled property.
     */
    public void setShieldDDosProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.shieldDDosProtectionEnabled = value;
    }
    /**
     * Sets the ShieldDDosProtectionType property value. The ShieldDDosProtectionType property
     * @param value Value to set for the ShieldDDosProtectionType property.
     */
    public void setShieldDDosProtectionType(@jakarta.annotation.Nullable final Double value) {
        this.shieldDDosProtectionType = value;
    }
    /**
     * Sets the StorageZoneId property value. The ID of the storage zone that the pull zone is linked to
     * @param value Value to set for the StorageZoneId property.
     */
    public void setStorageZoneId(@jakarta.annotation.Nullable final Long value) {
        this.storageZoneId = value;
    }
    /**
     * Sets the Type property value. The Type property
     * @param value Value to set for the Type property.
     */
    public void setType(@jakarta.annotation.Nullable final Double value) {
        this.type = value;
    }
    /**
     * Sets the UseBackgroundUpdate property value. Determines if cache update is performed in the background.
     * @param value Value to set for the UseBackgroundUpdate property.
     */
    public void setUseBackgroundUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.useBackgroundUpdate = value;
    }
    /**
     * Sets the UseStaleWhileOffline property value. Determines if we should use stale cache while the origin is offline
     * @param value Value to set for the UseStaleWhileOffline property.
     */
    public void setUseStaleWhileOffline(@jakarta.annotation.Nullable final Boolean value) {
        this.useStaleWhileOffline = value;
    }
    /**
     * Sets the UseStaleWhileUpdating property value. Determines if we should use stale cache while cache is updating
     * @param value Value to set for the UseStaleWhileUpdating property.
     */
    public void setUseStaleWhileUpdating(@jakarta.annotation.Nullable final Boolean value) {
        this.useStaleWhileUpdating = value;
    }
    /**
     * Sets the VerifyOriginSSL property value. Determines if the Pull Zone should verify the origin SSL certificate
     * @param value Value to set for the VerifyOriginSSL property.
     */
    public void setVerifyOriginSSL(@jakarta.annotation.Nullable final Boolean value) {
        this.verifyOriginSSL = value;
    }
    /**
     * Sets the WAFDisabledRuleGroups property value. Determines the enabled WAF rule groups
     * @param value Value to set for the WAFDisabledRuleGroups property.
     */
    public void setWAFDisabledRuleGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.wAFDisabledRuleGroups = value;
    }
    /**
     * Sets the WAFDisabledRules property value. Determines the disabled WAF rules
     * @param value Value to set for the WAFDisabledRules property.
     */
    public void setWAFDisabledRules(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.wAFDisabledRules = value;
    }
    /**
     * Sets the WAFEnabled property value. Determines if WAF should be enabled on the zone
     * @param value Value to set for the WAFEnabled property.
     */
    public void setWAFEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.wAFEnabled = value;
    }
    /**
     * Sets the WAFEnableRequestHeaderLogging property value. Determines if WAF should enable request headers logging
     * @param value Value to set for the WAFEnableRequestHeaderLogging property.
     */
    public void setWAFEnableRequestHeaderLogging(@jakarta.annotation.Nullable final Boolean value) {
        this.wAFEnableRequestHeaderLogging = value;
    }
    /**
     * Sets the WAFRequestHeaderIgnores property value. Determines the list of headers that will be ignored in the WAF logs
     * @param value Value to set for the WAFRequestHeaderIgnores property.
     */
    public void setWAFRequestHeaderIgnores(@jakarta.annotation.Nullable final Boolean value) {
        this.wAFRequestHeaderIgnores = value;
    }
    /**
     * Sets the ZoneSecurityEnabled property value. True if the URL secure token authentication security is enabled
     * @param value Value to set for the ZoneSecurityEnabled property.
     */
    public void setZoneSecurityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.zoneSecurityEnabled = value;
    }
    /**
     * Sets the ZoneSecurityIncludeHashRemoteIP property value. True if the zone security hash should include the remote IP
     * @param value Value to set for the ZoneSecurityIncludeHashRemoteIP property.
     */
    public void setZoneSecurityIncludeHashRemoteIP(@jakarta.annotation.Nullable final Boolean value) {
        this.zoneSecurityIncludeHashRemoteIP = value;
    }
}
