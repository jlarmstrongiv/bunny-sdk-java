package bunny.sdk.bunnyapiclient.videolibrary.item;

import bunny.sdk.bunnyapiclient.models.streamvideolibrary.ReplicationRegions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The template for adding optional properties.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideolibraryPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Determines direct play URLs are enabled for the library
     */
    private Boolean allowDirectPlay;
    /**
     * Determines if the Early-Play feature is enabled
     */
    private Boolean allowEarlyPlay;
    /**
     * The list of allowed referrer domains allowed to access the library
     */
    private java.util.List<String> allowedReferrers;
    /**
     * The API access key for the library. Only added when the includeAccessKey parameter is set.
     */
    private String apiAccessKey;
    /**
     * The API key used for authenticating with the video library
     */
    private String apiKey;
    /**
     * The AppleFairPlayDrm property
     */
    private VideolibraryPostRequestBodyAppleFairPlayDrm appleFairPlayDrm;
    /**
     * The bitrate used for encoding 1080p videos
     */
    private Integer bitrate1080p;
    /**
     * The bitrate used for encoding 1440p videos
     */
    private Integer bitrate1440p;
    /**
     * The bitrate used for encoding 2160p videos
     */
    private Integer bitrate2160p;
    /**
     * The bitrate used for encoding 240p videos
     */
    private Integer bitrate240p;
    /**
     * The bitrate used for encoding 360p videos
     */
    private Integer bitrate360p;
    /**
     * The bitrate used for encoding 480p videos
     */
    private Integer bitrate480p;
    /**
     * The bitrate used for encoding 720p videos
     */
    private Integer bitrate720p;
    /**
     * The list of blocked referrer domains blocked from accessing the library
     */
    private java.util.List<String> blockedReferrers;
    /**
     * Determines if the requests without a referrer are blocked
     */
    private Boolean blockNoneReferrer;
    /**
     * The captions display background color
     */
    private String captionsBackground;
    /**
     * The captions display font color
     */
    private String captionsFontColor;
    /**
     * The captions display font size
     */
    private Integer captionsFontSize;
    /**
     * The list of controls on the video player.
     */
    private String controls;
    /**
     * The custom HTMl that is added into the head of the HTML player.
     */
    private String customHTML;
    /**
     * The date when the video library was created
     */
    private OffsetDateTime dateCreated;
    /**
     * The DrmVersion property
     */
    private Long drmVersion;
    /**
     * Determines if content tagging should be enabled for this library.
     */
    private Boolean enableContentTagging;
    /**
     * The comma separated list of enabled resolutions
     */
    private String enabledResolutions;
    /**
     * Determines if the MediaCage basic DRM is enabled
     */
    private Boolean enableDRM;
    /**
     * Determines if the MP4 fallback feature is enabled
     */
    private Boolean enableMP4Fallback;
    /**
     * Determines if the automatic audio transcribing is currently enabled for this zone.
     */
    private Boolean enableTranscribing;
    /**
     * Determines if automatic transcribing description generation is currently enabled.
     */
    private Boolean enableTranscribingDescriptionGeneration;
    /**
     * Determines if automatic transcribing title generation is currently enabled.
     */
    private Boolean enableTranscribingTitleGeneration;
    /**
     * The captions font family.
     */
    private String fontFamily;
    /**
     * The GoogleWidevineDrm property
     */
    private VideolibraryPostRequestBodyGoogleWidevineDrm googleWidevineDrm;
    /**
     * Determines if the video library has a watermark configured
     */
    private Boolean hasWatermark;
    /**
     * The Id property
     */
    private Long id;
    /**
     * Determines if the original video files should be stored after encoding
     */
    private Boolean keepOriginalFiles;
    /**
     * The name of the Video Library.
     */
    private String name;
    /**
     * The key color of the player.
     */
    private String playerKeyColor;
    /**
     * Determines if the player token authentication is enabled
     */
    private Boolean playerTokenAuthenticationEnabled;
    /**
     * The ID of the connected underlying pull zone
     */
    private Long pullZoneId;
    /**
     * The PullZoneType property
     */
    private Double pullZoneType;
    /**
     * The read-only API key used for authenticating with the video library
     */
    private String readOnlyApiKey;
    /**
     * The list of languages that the captions will be automatically transcribed to.
     */
    private Boolean rememberPlayerPosition;
    /**
     * The geo-replication regions of the underlying storage zone
     */
    private java.util.List<ReplicationRegions> replicationRegions;
    /**
     * Determines if the video watch heatmap should be displayed in the player.
     */
    private Boolean showHeatmap;
    /**
     * The total amount of storage used by the library
     */
    private Long storageUsage;
    /**
     * The ID of the connected underlying storage zone
     */
    private Long storageZoneId;
    /**
     * The amount of traffic usage this month
     */
    private Long trafficUsage;
    /**
     * The TranscribingCaptionLanguages property
     */
    private java.util.List<String> transcribingCaptionLanguages;
    /**
     * The UI language of the player
     */
    private String uILanguage;
    /**
     * The URL of the VAST tag endpoint for advertising configuration
     */
    private String vastTagUrl;
    /**
     * The vi.ai publisher id for advertising configuration
     */
    private String viAiPublisherId;
    /**
     * The number of videos in the video library
     */
    private Long videoCount;
    /**
     * The height of the watermark (in %)
     */
    private Integer watermarkHeight;
    /**
     * The left offset of the watermark position (in %)
     */
    private Integer watermarkPositionLeft;
    /**
     * The top offset of the watermark position (in %)
     */
    private Integer watermarkPositionTop;
    /**
     * The WatermarkVersion property
     */
    private Long watermarkVersion;
    /**
     * The width of the watermark (in %)
     */
    private Integer watermarkWidth;
    /**
     * The webhook URL of the video library
     */
    private String webhookUrl;
    /**
     * Instantiates a new {@link VideolibraryPostRequestBody} and sets the default values.
     */
    public VideolibraryPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideolibraryPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static VideolibraryPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideolibraryPostRequestBody();
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
     * Gets the AllowDirectPlay property value. Determines direct play URLs are enabled for the library
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDirectPlay() {
        return this.allowDirectPlay;
    }
    /**
     * Gets the AllowEarlyPlay property value. Determines if the Early-Play feature is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEarlyPlay() {
        return this.allowEarlyPlay;
    }
    /**
     * Gets the AllowedReferrers property value. The list of allowed referrer domains allowed to access the library
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedReferrers() {
        return this.allowedReferrers;
    }
    /**
     * Gets the ApiAccessKey property value. The API access key for the library. Only added when the includeAccessKey parameter is set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiAccessKey() {
        return this.apiAccessKey;
    }
    /**
     * Gets the ApiKey property value. The API key used for authenticating with the video library
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiKey() {
        return this.apiKey;
    }
    /**
     * Gets the AppleFairPlayDrm property value. The AppleFairPlayDrm property
     * @return a {@link VideolibraryPostRequestBodyAppleFairPlayDrm}
     */
    @jakarta.annotation.Nullable
    public VideolibraryPostRequestBodyAppleFairPlayDrm getAppleFairPlayDrm() {
        return this.appleFairPlayDrm;
    }
    /**
     * Gets the Bitrate1080p property value. The bitrate used for encoding 1080p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate1080p() {
        return this.bitrate1080p;
    }
    /**
     * Gets the Bitrate1440p property value. The bitrate used for encoding 1440p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate1440p() {
        return this.bitrate1440p;
    }
    /**
     * Gets the Bitrate2160p property value. The bitrate used for encoding 2160p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate2160p() {
        return this.bitrate2160p;
    }
    /**
     * Gets the Bitrate240p property value. The bitrate used for encoding 240p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate240p() {
        return this.bitrate240p;
    }
    /**
     * Gets the Bitrate360p property value. The bitrate used for encoding 360p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate360p() {
        return this.bitrate360p;
    }
    /**
     * Gets the Bitrate480p property value. The bitrate used for encoding 480p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate480p() {
        return this.bitrate480p;
    }
    /**
     * Gets the Bitrate720p property value. The bitrate used for encoding 720p videos
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate720p() {
        return this.bitrate720p;
    }
    /**
     * Gets the BlockedReferrers property value. The list of blocked referrer domains blocked from accessing the library
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedReferrers() {
        return this.blockedReferrers;
    }
    /**
     * Gets the BlockNoneReferrer property value. Determines if the requests without a referrer are blocked
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockNoneReferrer() {
        return this.blockNoneReferrer;
    }
    /**
     * Gets the CaptionsBackground property value. The captions display background color
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptionsBackground() {
        return this.captionsBackground;
    }
    /**
     * Gets the CaptionsFontColor property value. The captions display font color
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptionsFontColor() {
        return this.captionsFontColor;
    }
    /**
     * Gets the CaptionsFontSize property value. The captions display font size
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCaptionsFontSize() {
        return this.captionsFontSize;
    }
    /**
     * Gets the Controls property value. The list of controls on the video player.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getControls() {
        return this.controls;
    }
    /**
     * Gets the CustomHTML property value. The custom HTMl that is added into the head of the HTML player.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomHTML() {
        return this.customHTML;
    }
    /**
     * Gets the DateCreated property value. The date when the video library was created
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Gets the DrmVersion property value. The DrmVersion property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDrmVersion() {
        return this.drmVersion;
    }
    /**
     * Gets the EnableContentTagging property value. Determines if content tagging should be enabled for this library.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableContentTagging() {
        return this.enableContentTagging;
    }
    /**
     * Gets the EnabledResolutions property value. The comma separated list of enabled resolutions
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnabledResolutions() {
        return this.enabledResolutions;
    }
    /**
     * Gets the EnableDRM property value. Determines if the MediaCage basic DRM is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableDRM() {
        return this.enableDRM;
    }
    /**
     * Gets the EnableMP4Fallback property value. Determines if the MP4 fallback feature is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableMP4Fallback() {
        return this.enableMP4Fallback;
    }
    /**
     * Gets the EnableTranscribing property value. Determines if the automatic audio transcribing is currently enabled for this zone.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTranscribing() {
        return this.enableTranscribing;
    }
    /**
     * Gets the EnableTranscribingDescriptionGeneration property value. Determines if automatic transcribing description generation is currently enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTranscribingDescriptionGeneration() {
        return this.enableTranscribingDescriptionGeneration;
    }
    /**
     * Gets the EnableTranscribingTitleGeneration property value. Determines if automatic transcribing title generation is currently enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTranscribingTitleGeneration() {
        return this.enableTranscribingTitleGeneration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(57);
        deserializerMap.put("AllowDirectPlay", (n) -> { this.setAllowDirectPlay(n.getBooleanValue()); });
        deserializerMap.put("AllowEarlyPlay", (n) -> { this.setAllowEarlyPlay(n.getBooleanValue()); });
        deserializerMap.put("AllowedReferrers", (n) -> { this.setAllowedReferrers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ApiAccessKey", (n) -> { this.setApiAccessKey(n.getStringValue()); });
        deserializerMap.put("ApiKey", (n) -> { this.setApiKey(n.getStringValue()); });
        deserializerMap.put("AppleFairPlayDrm", (n) -> { this.setAppleFairPlayDrm(n.getObjectValue(VideolibraryPostRequestBodyAppleFairPlayDrm::createFromDiscriminatorValue)); });
        deserializerMap.put("Bitrate1080p", (n) -> { this.setBitrate1080p(n.getIntegerValue()); });
        deserializerMap.put("Bitrate1440p", (n) -> { this.setBitrate1440p(n.getIntegerValue()); });
        deserializerMap.put("Bitrate2160p", (n) -> { this.setBitrate2160p(n.getIntegerValue()); });
        deserializerMap.put("Bitrate240p", (n) -> { this.setBitrate240p(n.getIntegerValue()); });
        deserializerMap.put("Bitrate360p", (n) -> { this.setBitrate360p(n.getIntegerValue()); });
        deserializerMap.put("Bitrate480p", (n) -> { this.setBitrate480p(n.getIntegerValue()); });
        deserializerMap.put("Bitrate720p", (n) -> { this.setBitrate720p(n.getIntegerValue()); });
        deserializerMap.put("BlockedReferrers", (n) -> { this.setBlockedReferrers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("BlockNoneReferrer", (n) -> { this.setBlockNoneReferrer(n.getBooleanValue()); });
        deserializerMap.put("CaptionsBackground", (n) -> { this.setCaptionsBackground(n.getStringValue()); });
        deserializerMap.put("CaptionsFontColor", (n) -> { this.setCaptionsFontColor(n.getStringValue()); });
        deserializerMap.put("CaptionsFontSize", (n) -> { this.setCaptionsFontSize(n.getIntegerValue()); });
        deserializerMap.put("Controls", (n) -> { this.setControls(n.getStringValue()); });
        deserializerMap.put("CustomHTML", (n) -> { this.setCustomHTML(n.getStringValue()); });
        deserializerMap.put("DateCreated", (n) -> { this.setDateCreated(n.getOffsetDateTimeValue()); });
        deserializerMap.put("DrmVersion", (n) -> { this.setDrmVersion(n.getLongValue()); });
        deserializerMap.put("EnableContentTagging", (n) -> { this.setEnableContentTagging(n.getBooleanValue()); });
        deserializerMap.put("EnabledResolutions", (n) -> { this.setEnabledResolutions(n.getStringValue()); });
        deserializerMap.put("EnableDRM", (n) -> { this.setEnableDRM(n.getBooleanValue()); });
        deserializerMap.put("EnableMP4Fallback", (n) -> { this.setEnableMP4Fallback(n.getBooleanValue()); });
        deserializerMap.put("EnableTranscribing", (n) -> { this.setEnableTranscribing(n.getBooleanValue()); });
        deserializerMap.put("EnableTranscribingDescriptionGeneration", (n) -> { this.setEnableTranscribingDescriptionGeneration(n.getBooleanValue()); });
        deserializerMap.put("EnableTranscribingTitleGeneration", (n) -> { this.setEnableTranscribingTitleGeneration(n.getBooleanValue()); });
        deserializerMap.put("FontFamily", (n) -> { this.setFontFamily(n.getStringValue()); });
        deserializerMap.put("GoogleWidevineDrm", (n) -> { this.setGoogleWidevineDrm(n.getObjectValue(VideolibraryPostRequestBodyGoogleWidevineDrm::createFromDiscriminatorValue)); });
        deserializerMap.put("HasWatermark", (n) -> { this.setHasWatermark(n.getBooleanValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("KeepOriginalFiles", (n) -> { this.setKeepOriginalFiles(n.getBooleanValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("PlayerKeyColor", (n) -> { this.setPlayerKeyColor(n.getStringValue()); });
        deserializerMap.put("PlayerTokenAuthenticationEnabled", (n) -> { this.setPlayerTokenAuthenticationEnabled(n.getBooleanValue()); });
        deserializerMap.put("PullZoneId", (n) -> { this.setPullZoneId(n.getLongValue()); });
        deserializerMap.put("PullZoneType", (n) -> { this.setPullZoneType(n.getDoubleValue()); });
        deserializerMap.put("ReadOnlyApiKey", (n) -> { this.setReadOnlyApiKey(n.getStringValue()); });
        deserializerMap.put("RememberPlayerPosition", (n) -> { this.setRememberPlayerPosition(n.getBooleanValue()); });
        deserializerMap.put("ReplicationRegions", (n) -> { this.setReplicationRegions(n.getCollectionOfEnumValues(ReplicationRegions::forValue)); });
        deserializerMap.put("ShowHeatmap", (n) -> { this.setShowHeatmap(n.getBooleanValue()); });
        deserializerMap.put("StorageUsage", (n) -> { this.setStorageUsage(n.getLongValue()); });
        deserializerMap.put("StorageZoneId", (n) -> { this.setStorageZoneId(n.getLongValue()); });
        deserializerMap.put("TrafficUsage", (n) -> { this.setTrafficUsage(n.getLongValue()); });
        deserializerMap.put("TranscribingCaptionLanguages", (n) -> { this.setTranscribingCaptionLanguages(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("UILanguage", (n) -> { this.setUILanguage(n.getStringValue()); });
        deserializerMap.put("VastTagUrl", (n) -> { this.setVastTagUrl(n.getStringValue()); });
        deserializerMap.put("ViAiPublisherId", (n) -> { this.setViAiPublisherId(n.getStringValue()); });
        deserializerMap.put("VideoCount", (n) -> { this.setVideoCount(n.getLongValue()); });
        deserializerMap.put("WatermarkHeight", (n) -> { this.setWatermarkHeight(n.getIntegerValue()); });
        deserializerMap.put("WatermarkPositionLeft", (n) -> { this.setWatermarkPositionLeft(n.getIntegerValue()); });
        deserializerMap.put("WatermarkPositionTop", (n) -> { this.setWatermarkPositionTop(n.getIntegerValue()); });
        deserializerMap.put("WatermarkVersion", (n) -> { this.setWatermarkVersion(n.getLongValue()); });
        deserializerMap.put("WatermarkWidth", (n) -> { this.setWatermarkWidth(n.getIntegerValue()); });
        deserializerMap.put("WebhookUrl", (n) -> { this.setWebhookUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FontFamily property value. The captions font family.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFontFamily() {
        return this.fontFamily;
    }
    /**
     * Gets the GoogleWidevineDrm property value. The GoogleWidevineDrm property
     * @return a {@link VideolibraryPostRequestBodyGoogleWidevineDrm}
     */
    @jakarta.annotation.Nullable
    public VideolibraryPostRequestBodyGoogleWidevineDrm getGoogleWidevineDrm() {
        return this.googleWidevineDrm;
    }
    /**
     * Gets the HasWatermark property value. Determines if the video library has a watermark configured
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasWatermark() {
        return this.hasWatermark;
    }
    /**
     * Gets the Id property value. The Id property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the KeepOriginalFiles property value. Determines if the original video files should be stored after encoding
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepOriginalFiles() {
        return this.keepOriginalFiles;
    }
    /**
     * Gets the Name property value. The name of the Video Library.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the PlayerKeyColor property value. The key color of the player.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlayerKeyColor() {
        return this.playerKeyColor;
    }
    /**
     * Gets the PlayerTokenAuthenticationEnabled property value. Determines if the player token authentication is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPlayerTokenAuthenticationEnabled() {
        return this.playerTokenAuthenticationEnabled;
    }
    /**
     * Gets the PullZoneId property value. The ID of the connected underlying pull zone
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPullZoneId() {
        return this.pullZoneId;
    }
    /**
     * Gets the PullZoneType property value. The PullZoneType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPullZoneType() {
        return this.pullZoneType;
    }
    /**
     * Gets the ReadOnlyApiKey property value. The read-only API key used for authenticating with the video library
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReadOnlyApiKey() {
        return this.readOnlyApiKey;
    }
    /**
     * Gets the RememberPlayerPosition property value. The list of languages that the captions will be automatically transcribed to.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRememberPlayerPosition() {
        return this.rememberPlayerPosition;
    }
    /**
     * Gets the ReplicationRegions property value. The geo-replication regions of the underlying storage zone
     * @return a {@link java.util.List<ReplicationRegions>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReplicationRegions> getReplicationRegions() {
        return this.replicationRegions;
    }
    /**
     * Gets the ShowHeatmap property value. Determines if the video watch heatmap should be displayed in the player.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowHeatmap() {
        return this.showHeatmap;
    }
    /**
     * Gets the StorageUsage property value. The total amount of storage used by the library
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageUsage() {
        return this.storageUsage;
    }
    /**
     * Gets the StorageZoneId property value. The ID of the connected underlying storage zone
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageZoneId() {
        return this.storageZoneId;
    }
    /**
     * Gets the TrafficUsage property value. The amount of traffic usage this month
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTrafficUsage() {
        return this.trafficUsage;
    }
    /**
     * Gets the TranscribingCaptionLanguages property value. The TranscribingCaptionLanguages property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTranscribingCaptionLanguages() {
        return this.transcribingCaptionLanguages;
    }
    /**
     * Gets the UILanguage property value. The UI language of the player
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUILanguage() {
        return this.uILanguage;
    }
    /**
     * Gets the VastTagUrl property value. The URL of the VAST tag endpoint for advertising configuration
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVastTagUrl() {
        return this.vastTagUrl;
    }
    /**
     * Gets the ViAiPublisherId property value. The vi.ai publisher id for advertising configuration
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getViAiPublisherId() {
        return this.viAiPublisherId;
    }
    /**
     * Gets the VideoCount property value. The number of videos in the video library
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getVideoCount() {
        return this.videoCount;
    }
    /**
     * Gets the WatermarkHeight property value. The height of the watermark (in %)
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWatermarkHeight() {
        return this.watermarkHeight;
    }
    /**
     * Gets the WatermarkPositionLeft property value. The left offset of the watermark position (in %)
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWatermarkPositionLeft() {
        return this.watermarkPositionLeft;
    }
    /**
     * Gets the WatermarkPositionTop property value. The top offset of the watermark position (in %)
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWatermarkPositionTop() {
        return this.watermarkPositionTop;
    }
    /**
     * Gets the WatermarkVersion property value. The WatermarkVersion property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWatermarkVersion() {
        return this.watermarkVersion;
    }
    /**
     * Gets the WatermarkWidth property value. The width of the watermark (in %)
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWatermarkWidth() {
        return this.watermarkWidth;
    }
    /**
     * Gets the WebhookUrl property value. The webhook URL of the video library
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebhookUrl() {
        return this.webhookUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("AllowDirectPlay", this.getAllowDirectPlay());
        writer.writeBooleanValue("AllowEarlyPlay", this.getAllowEarlyPlay());
        writer.writeIntegerValue("Bitrate1080p", this.getBitrate1080p());
        writer.writeIntegerValue("Bitrate1440p", this.getBitrate1440p());
        writer.writeIntegerValue("Bitrate2160p", this.getBitrate2160p());
        writer.writeIntegerValue("Bitrate240p", this.getBitrate240p());
        writer.writeIntegerValue("Bitrate360p", this.getBitrate360p());
        writer.writeIntegerValue("Bitrate480p", this.getBitrate480p());
        writer.writeIntegerValue("Bitrate720p", this.getBitrate720p());
        writer.writeBooleanValue("BlockNoneReferrer", this.getBlockNoneReferrer());
        writer.writeStringValue("CaptionsBackground", this.getCaptionsBackground());
        writer.writeStringValue("CaptionsFontColor", this.getCaptionsFontColor());
        writer.writeIntegerValue("CaptionsFontSize", this.getCaptionsFontSize());
        writer.writeStringValue("Controls", this.getControls());
        writer.writeStringValue("CustomHTML", this.getCustomHTML());
        writer.writeBooleanValue("EnableContentTagging", this.getEnableContentTagging());
        writer.writeStringValue("EnabledResolutions", this.getEnabledResolutions());
        writer.writeBooleanValue("EnableDRM", this.getEnableDRM());
        writer.writeBooleanValue("EnableMP4Fallback", this.getEnableMP4Fallback());
        writer.writeBooleanValue("EnableTranscribing", this.getEnableTranscribing());
        writer.writeBooleanValue("EnableTranscribingDescriptionGeneration", this.getEnableTranscribingDescriptionGeneration());
        writer.writeBooleanValue("EnableTranscribingTitleGeneration", this.getEnableTranscribingTitleGeneration());
        writer.writeStringValue("FontFamily", this.getFontFamily());
        writer.writeBooleanValue("KeepOriginalFiles", this.getKeepOriginalFiles());
        writer.writeStringValue("Name", this.getName());
        writer.writeStringValue("PlayerKeyColor", this.getPlayerKeyColor());
        writer.writeBooleanValue("PlayerTokenAuthenticationEnabled", this.getPlayerTokenAuthenticationEnabled());
        writer.writeBooleanValue("ShowHeatmap", this.getShowHeatmap());
        writer.writeCollectionOfPrimitiveValues("TranscribingCaptionLanguages", this.getTranscribingCaptionLanguages());
        writer.writeStringValue("UILanguage", this.getUILanguage());
        writer.writeStringValue("VastTagUrl", this.getVastTagUrl());
        writer.writeStringValue("ViAiPublisherId", this.getViAiPublisherId());
        writer.writeIntegerValue("WatermarkHeight", this.getWatermarkHeight());
        writer.writeIntegerValue("WatermarkPositionLeft", this.getWatermarkPositionLeft());
        writer.writeIntegerValue("WatermarkPositionTop", this.getWatermarkPositionTop());
        writer.writeIntegerValue("WatermarkWidth", this.getWatermarkWidth());
        writer.writeStringValue("WebhookUrl", this.getWebhookUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the AllowDirectPlay property value. Determines direct play URLs are enabled for the library
     * @param value Value to set for the AllowDirectPlay property.
     */
    public void setAllowDirectPlay(@jakarta.annotation.Nullable final Boolean value) {
        this.allowDirectPlay = value;
    }
    /**
     * Sets the AllowEarlyPlay property value. Determines if the Early-Play feature is enabled
     * @param value Value to set for the AllowEarlyPlay property.
     */
    public void setAllowEarlyPlay(@jakarta.annotation.Nullable final Boolean value) {
        this.allowEarlyPlay = value;
    }
    /**
     * Sets the AllowedReferrers property value. The list of allowed referrer domains allowed to access the library
     * @param value Value to set for the AllowedReferrers property.
     */
    public void setAllowedReferrers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedReferrers = value;
    }
    /**
     * Sets the ApiAccessKey property value. The API access key for the library. Only added when the includeAccessKey parameter is set.
     * @param value Value to set for the ApiAccessKey property.
     */
    public void setApiAccessKey(@jakarta.annotation.Nullable final String value) {
        this.apiAccessKey = value;
    }
    /**
     * Sets the ApiKey property value. The API key used for authenticating with the video library
     * @param value Value to set for the ApiKey property.
     */
    public void setApiKey(@jakarta.annotation.Nullable final String value) {
        this.apiKey = value;
    }
    /**
     * Sets the AppleFairPlayDrm property value. The AppleFairPlayDrm property
     * @param value Value to set for the AppleFairPlayDrm property.
     */
    public void setAppleFairPlayDrm(@jakarta.annotation.Nullable final VideolibraryPostRequestBodyAppleFairPlayDrm value) {
        this.appleFairPlayDrm = value;
    }
    /**
     * Sets the Bitrate1080p property value. The bitrate used for encoding 1080p videos
     * @param value Value to set for the Bitrate1080p property.
     */
    public void setBitrate1080p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate1080p = value;
    }
    /**
     * Sets the Bitrate1440p property value. The bitrate used for encoding 1440p videos
     * @param value Value to set for the Bitrate1440p property.
     */
    public void setBitrate1440p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate1440p = value;
    }
    /**
     * Sets the Bitrate2160p property value. The bitrate used for encoding 2160p videos
     * @param value Value to set for the Bitrate2160p property.
     */
    public void setBitrate2160p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate2160p = value;
    }
    /**
     * Sets the Bitrate240p property value. The bitrate used for encoding 240p videos
     * @param value Value to set for the Bitrate240p property.
     */
    public void setBitrate240p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate240p = value;
    }
    /**
     * Sets the Bitrate360p property value. The bitrate used for encoding 360p videos
     * @param value Value to set for the Bitrate360p property.
     */
    public void setBitrate360p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate360p = value;
    }
    /**
     * Sets the Bitrate480p property value. The bitrate used for encoding 480p videos
     * @param value Value to set for the Bitrate480p property.
     */
    public void setBitrate480p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate480p = value;
    }
    /**
     * Sets the Bitrate720p property value. The bitrate used for encoding 720p videos
     * @param value Value to set for the Bitrate720p property.
     */
    public void setBitrate720p(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate720p = value;
    }
    /**
     * Sets the BlockedReferrers property value. The list of blocked referrer domains blocked from accessing the library
     * @param value Value to set for the BlockedReferrers property.
     */
    public void setBlockedReferrers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.blockedReferrers = value;
    }
    /**
     * Sets the BlockNoneReferrer property value. Determines if the requests without a referrer are blocked
     * @param value Value to set for the BlockNoneReferrer property.
     */
    public void setBlockNoneReferrer(@jakarta.annotation.Nullable final Boolean value) {
        this.blockNoneReferrer = value;
    }
    /**
     * Sets the CaptionsBackground property value. The captions display background color
     * @param value Value to set for the CaptionsBackground property.
     */
    public void setCaptionsBackground(@jakarta.annotation.Nullable final String value) {
        this.captionsBackground = value;
    }
    /**
     * Sets the CaptionsFontColor property value. The captions display font color
     * @param value Value to set for the CaptionsFontColor property.
     */
    public void setCaptionsFontColor(@jakarta.annotation.Nullable final String value) {
        this.captionsFontColor = value;
    }
    /**
     * Sets the CaptionsFontSize property value. The captions display font size
     * @param value Value to set for the CaptionsFontSize property.
     */
    public void setCaptionsFontSize(@jakarta.annotation.Nullable final Integer value) {
        this.captionsFontSize = value;
    }
    /**
     * Sets the Controls property value. The list of controls on the video player.
     * @param value Value to set for the Controls property.
     */
    public void setControls(@jakarta.annotation.Nullable final String value) {
        this.controls = value;
    }
    /**
     * Sets the CustomHTML property value. The custom HTMl that is added into the head of the HTML player.
     * @param value Value to set for the CustomHTML property.
     */
    public void setCustomHTML(@jakarta.annotation.Nullable final String value) {
        this.customHTML = value;
    }
    /**
     * Sets the DateCreated property value. The date when the video library was created
     * @param value Value to set for the DateCreated property.
     */
    public void setDateCreated(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateCreated = value;
    }
    /**
     * Sets the DrmVersion property value. The DrmVersion property
     * @param value Value to set for the DrmVersion property.
     */
    public void setDrmVersion(@jakarta.annotation.Nullable final Long value) {
        this.drmVersion = value;
    }
    /**
     * Sets the EnableContentTagging property value. Determines if content tagging should be enabled for this library.
     * @param value Value to set for the EnableContentTagging property.
     */
    public void setEnableContentTagging(@jakarta.annotation.Nullable final Boolean value) {
        this.enableContentTagging = value;
    }
    /**
     * Sets the EnabledResolutions property value. The comma separated list of enabled resolutions
     * @param value Value to set for the EnabledResolutions property.
     */
    public void setEnabledResolutions(@jakarta.annotation.Nullable final String value) {
        this.enabledResolutions = value;
    }
    /**
     * Sets the EnableDRM property value. Determines if the MediaCage basic DRM is enabled
     * @param value Value to set for the EnableDRM property.
     */
    public void setEnableDRM(@jakarta.annotation.Nullable final Boolean value) {
        this.enableDRM = value;
    }
    /**
     * Sets the EnableMP4Fallback property value. Determines if the MP4 fallback feature is enabled
     * @param value Value to set for the EnableMP4Fallback property.
     */
    public void setEnableMP4Fallback(@jakarta.annotation.Nullable final Boolean value) {
        this.enableMP4Fallback = value;
    }
    /**
     * Sets the EnableTranscribing property value. Determines if the automatic audio transcribing is currently enabled for this zone.
     * @param value Value to set for the EnableTranscribing property.
     */
    public void setEnableTranscribing(@jakarta.annotation.Nullable final Boolean value) {
        this.enableTranscribing = value;
    }
    /**
     * Sets the EnableTranscribingDescriptionGeneration property value. Determines if automatic transcribing description generation is currently enabled.
     * @param value Value to set for the EnableTranscribingDescriptionGeneration property.
     */
    public void setEnableTranscribingDescriptionGeneration(@jakarta.annotation.Nullable final Boolean value) {
        this.enableTranscribingDescriptionGeneration = value;
    }
    /**
     * Sets the EnableTranscribingTitleGeneration property value. Determines if automatic transcribing title generation is currently enabled.
     * @param value Value to set for the EnableTranscribingTitleGeneration property.
     */
    public void setEnableTranscribingTitleGeneration(@jakarta.annotation.Nullable final Boolean value) {
        this.enableTranscribingTitleGeneration = value;
    }
    /**
     * Sets the FontFamily property value. The captions font family.
     * @param value Value to set for the FontFamily property.
     */
    public void setFontFamily(@jakarta.annotation.Nullable final String value) {
        this.fontFamily = value;
    }
    /**
     * Sets the GoogleWidevineDrm property value. The GoogleWidevineDrm property
     * @param value Value to set for the GoogleWidevineDrm property.
     */
    public void setGoogleWidevineDrm(@jakarta.annotation.Nullable final VideolibraryPostRequestBodyGoogleWidevineDrm value) {
        this.googleWidevineDrm = value;
    }
    /**
     * Sets the HasWatermark property value. Determines if the video library has a watermark configured
     * @param value Value to set for the HasWatermark property.
     */
    public void setHasWatermark(@jakarta.annotation.Nullable final Boolean value) {
        this.hasWatermark = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the KeepOriginalFiles property value. Determines if the original video files should be stored after encoding
     * @param value Value to set for the KeepOriginalFiles property.
     */
    public void setKeepOriginalFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.keepOriginalFiles = value;
    }
    /**
     * Sets the Name property value. The name of the Video Library.
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the PlayerKeyColor property value. The key color of the player.
     * @param value Value to set for the PlayerKeyColor property.
     */
    public void setPlayerKeyColor(@jakarta.annotation.Nullable final String value) {
        this.playerKeyColor = value;
    }
    /**
     * Sets the PlayerTokenAuthenticationEnabled property value. Determines if the player token authentication is enabled
     * @param value Value to set for the PlayerTokenAuthenticationEnabled property.
     */
    public void setPlayerTokenAuthenticationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.playerTokenAuthenticationEnabled = value;
    }
    /**
     * Sets the PullZoneId property value. The ID of the connected underlying pull zone
     * @param value Value to set for the PullZoneId property.
     */
    public void setPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.pullZoneId = value;
    }
    /**
     * Sets the PullZoneType property value. The PullZoneType property
     * @param value Value to set for the PullZoneType property.
     */
    public void setPullZoneType(@jakarta.annotation.Nullable final Double value) {
        this.pullZoneType = value;
    }
    /**
     * Sets the ReadOnlyApiKey property value. The read-only API key used for authenticating with the video library
     * @param value Value to set for the ReadOnlyApiKey property.
     */
    public void setReadOnlyApiKey(@jakarta.annotation.Nullable final String value) {
        this.readOnlyApiKey = value;
    }
    /**
     * Sets the RememberPlayerPosition property value. The list of languages that the captions will be automatically transcribed to.
     * @param value Value to set for the RememberPlayerPosition property.
     */
    public void setRememberPlayerPosition(@jakarta.annotation.Nullable final Boolean value) {
        this.rememberPlayerPosition = value;
    }
    /**
     * Sets the ReplicationRegions property value. The geo-replication regions of the underlying storage zone
     * @param value Value to set for the ReplicationRegions property.
     */
    public void setReplicationRegions(@jakarta.annotation.Nullable final java.util.List<ReplicationRegions> value) {
        this.replicationRegions = value;
    }
    /**
     * Sets the ShowHeatmap property value. Determines if the video watch heatmap should be displayed in the player.
     * @param value Value to set for the ShowHeatmap property.
     */
    public void setShowHeatmap(@jakarta.annotation.Nullable final Boolean value) {
        this.showHeatmap = value;
    }
    /**
     * Sets the StorageUsage property value. The total amount of storage used by the library
     * @param value Value to set for the StorageUsage property.
     */
    public void setStorageUsage(@jakarta.annotation.Nullable final Long value) {
        this.storageUsage = value;
    }
    /**
     * Sets the StorageZoneId property value. The ID of the connected underlying storage zone
     * @param value Value to set for the StorageZoneId property.
     */
    public void setStorageZoneId(@jakarta.annotation.Nullable final Long value) {
        this.storageZoneId = value;
    }
    /**
     * Sets the TrafficUsage property value. The amount of traffic usage this month
     * @param value Value to set for the TrafficUsage property.
     */
    public void setTrafficUsage(@jakarta.annotation.Nullable final Long value) {
        this.trafficUsage = value;
    }
    /**
     * Sets the TranscribingCaptionLanguages property value. The TranscribingCaptionLanguages property
     * @param value Value to set for the TranscribingCaptionLanguages property.
     */
    public void setTranscribingCaptionLanguages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.transcribingCaptionLanguages = value;
    }
    /**
     * Sets the UILanguage property value. The UI language of the player
     * @param value Value to set for the UILanguage property.
     */
    public void setUILanguage(@jakarta.annotation.Nullable final String value) {
        this.uILanguage = value;
    }
    /**
     * Sets the VastTagUrl property value. The URL of the VAST tag endpoint for advertising configuration
     * @param value Value to set for the VastTagUrl property.
     */
    public void setVastTagUrl(@jakarta.annotation.Nullable final String value) {
        this.vastTagUrl = value;
    }
    /**
     * Sets the ViAiPublisherId property value. The vi.ai publisher id for advertising configuration
     * @param value Value to set for the ViAiPublisherId property.
     */
    public void setViAiPublisherId(@jakarta.annotation.Nullable final String value) {
        this.viAiPublisherId = value;
    }
    /**
     * Sets the VideoCount property value. The number of videos in the video library
     * @param value Value to set for the VideoCount property.
     */
    public void setVideoCount(@jakarta.annotation.Nullable final Long value) {
        this.videoCount = value;
    }
    /**
     * Sets the WatermarkHeight property value. The height of the watermark (in %)
     * @param value Value to set for the WatermarkHeight property.
     */
    public void setWatermarkHeight(@jakarta.annotation.Nullable final Integer value) {
        this.watermarkHeight = value;
    }
    /**
     * Sets the WatermarkPositionLeft property value. The left offset of the watermark position (in %)
     * @param value Value to set for the WatermarkPositionLeft property.
     */
    public void setWatermarkPositionLeft(@jakarta.annotation.Nullable final Integer value) {
        this.watermarkPositionLeft = value;
    }
    /**
     * Sets the WatermarkPositionTop property value. The top offset of the watermark position (in %)
     * @param value Value to set for the WatermarkPositionTop property.
     */
    public void setWatermarkPositionTop(@jakarta.annotation.Nullable final Integer value) {
        this.watermarkPositionTop = value;
    }
    /**
     * Sets the WatermarkVersion property value. The WatermarkVersion property
     * @param value Value to set for the WatermarkVersion property.
     */
    public void setWatermarkVersion(@jakarta.annotation.Nullable final Long value) {
        this.watermarkVersion = value;
    }
    /**
     * Sets the WatermarkWidth property value. The width of the watermark (in %)
     * @param value Value to set for the WatermarkWidth property.
     */
    public void setWatermarkWidth(@jakarta.annotation.Nullable final Integer value) {
        this.watermarkWidth = value;
    }
    /**
     * Sets the WebhookUrl property value. The webhook URL of the video library
     * @param value Value to set for the WebhookUrl property.
     */
    public void setWebhookUrl(@jakarta.annotation.Nullable final String value) {
        this.webhookUrl = value;
    }
}
