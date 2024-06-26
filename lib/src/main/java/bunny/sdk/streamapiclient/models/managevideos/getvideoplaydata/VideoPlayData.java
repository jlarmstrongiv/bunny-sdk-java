package bunny.sdk.streamapiclient.models.managevideos.getvideoplaydata;

import bunny.sdk.streamapiclient.models.managevideos.Video;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoPlayData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allowEarlyPlay property
     */
    private Boolean allowEarlyPlay;
    /**
     * The captionsBackground property
     */
    private String captionsBackground;
    /**
     * The captionsFontColor property
     */
    private String captionsFontColor;
    /**
     * The captionsFontSize property
     */
    private Integer captionsFontSize;
    /**
     * The captionsPath property
     */
    private String captionsPath;
    /**
     * The controls property
     */
    private String controls;
    /**
     * The drmVersion property
     */
    private Integer drmVersion;
    /**
     * The enableDRM property
     */
    private Boolean enableDRM;
    /**
     * The enableMP4Fallback property
     */
    private Boolean enableMP4Fallback;
    /**
     * The fallbackUrl property
     */
    private String fallbackUrl;
    /**
     * The fontFamily property
     */
    private String fontFamily;
    /**
     * The originalUrl property
     */
    private String originalUrl;
    /**
     * The playbackSpeeds property
     */
    private String playbackSpeeds;
    /**
     * The playerKeyColor property
     */
    private String playerKeyColor;
    /**
     * The previewUrl property
     */
    private String previewUrl;
    /**
     * The seekPath property
     */
    private String seekPath;
    /**
     * The showHeatmap property
     */
    private Boolean showHeatmap;
    /**
     * The thumbnailUrl property
     */
    private String thumbnailUrl;
    /**
     * The tokenAuthEnabled property
     */
    private Boolean tokenAuthEnabled;
    /**
     * The uiLanguage property
     */
    private String uiLanguage;
    /**
     * The vastTagUrl property
     */
    private String vastTagUrl;
    /**
     * The video property
     */
    private Video video;
    /**
     * The videoPlaylistUrl property
     */
    private String videoPlaylistUrl;
    /**
     * Instantiates a new {@link VideoPlayData} and sets the default values.
     */
    public VideoPlayData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoPlayData}
     */
    @jakarta.annotation.Nonnull
    public static VideoPlayData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoPlayData();
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
     * Gets the allowEarlyPlay property value. The allowEarlyPlay property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEarlyPlay() {
        return this.allowEarlyPlay;
    }
    /**
     * Gets the captionsBackground property value. The captionsBackground property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptionsBackground() {
        return this.captionsBackground;
    }
    /**
     * Gets the captionsFontColor property value. The captionsFontColor property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptionsFontColor() {
        return this.captionsFontColor;
    }
    /**
     * Gets the captionsFontSize property value. The captionsFontSize property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCaptionsFontSize() {
        return this.captionsFontSize;
    }
    /**
     * Gets the captionsPath property value. The captionsPath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptionsPath() {
        return this.captionsPath;
    }
    /**
     * Gets the controls property value. The controls property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getControls() {
        return this.controls;
    }
    /**
     * Gets the drmVersion property value. The drmVersion property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDrmVersion() {
        return this.drmVersion;
    }
    /**
     * Gets the enableDRM property value. The enableDRM property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableDRM() {
        return this.enableDRM;
    }
    /**
     * Gets the enableMP4Fallback property value. The enableMP4Fallback property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableMP4Fallback() {
        return this.enableMP4Fallback;
    }
    /**
     * Gets the fallbackUrl property value. The fallbackUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFallbackUrl() {
        return this.fallbackUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("allowEarlyPlay", (n) -> { this.setAllowEarlyPlay(n.getBooleanValue()); });
        deserializerMap.put("captionsBackground", (n) -> { this.setCaptionsBackground(n.getStringValue()); });
        deserializerMap.put("captionsFontColor", (n) -> { this.setCaptionsFontColor(n.getStringValue()); });
        deserializerMap.put("captionsFontSize", (n) -> { this.setCaptionsFontSize(n.getIntegerValue()); });
        deserializerMap.put("captionsPath", (n) -> { this.setCaptionsPath(n.getStringValue()); });
        deserializerMap.put("controls", (n) -> { this.setControls(n.getStringValue()); });
        deserializerMap.put("drmVersion", (n) -> { this.setDrmVersion(n.getIntegerValue()); });
        deserializerMap.put("enableDRM", (n) -> { this.setEnableDRM(n.getBooleanValue()); });
        deserializerMap.put("enableMP4Fallback", (n) -> { this.setEnableMP4Fallback(n.getBooleanValue()); });
        deserializerMap.put("fallbackUrl", (n) -> { this.setFallbackUrl(n.getStringValue()); });
        deserializerMap.put("fontFamily", (n) -> { this.setFontFamily(n.getStringValue()); });
        deserializerMap.put("originalUrl", (n) -> { this.setOriginalUrl(n.getStringValue()); });
        deserializerMap.put("playbackSpeeds", (n) -> { this.setPlaybackSpeeds(n.getStringValue()); });
        deserializerMap.put("playerKeyColor", (n) -> { this.setPlayerKeyColor(n.getStringValue()); });
        deserializerMap.put("previewUrl", (n) -> { this.setPreviewUrl(n.getStringValue()); });
        deserializerMap.put("seekPath", (n) -> { this.setSeekPath(n.getStringValue()); });
        deserializerMap.put("showHeatmap", (n) -> { this.setShowHeatmap(n.getBooleanValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("tokenAuthEnabled", (n) -> { this.setTokenAuthEnabled(n.getBooleanValue()); });
        deserializerMap.put("uiLanguage", (n) -> { this.setUiLanguage(n.getStringValue()); });
        deserializerMap.put("vastTagUrl", (n) -> { this.setVastTagUrl(n.getStringValue()); });
        deserializerMap.put("video", (n) -> { this.setVideo(n.getObjectValue(Video::createFromDiscriminatorValue)); });
        deserializerMap.put("videoPlaylistUrl", (n) -> { this.setVideoPlaylistUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fontFamily property value. The fontFamily property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFontFamily() {
        return this.fontFamily;
    }
    /**
     * Gets the originalUrl property value. The originalUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginalUrl() {
        return this.originalUrl;
    }
    /**
     * Gets the playbackSpeeds property value. The playbackSpeeds property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaybackSpeeds() {
        return this.playbackSpeeds;
    }
    /**
     * Gets the playerKeyColor property value. The playerKeyColor property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlayerKeyColor() {
        return this.playerKeyColor;
    }
    /**
     * Gets the previewUrl property value. The previewUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreviewUrl() {
        return this.previewUrl;
    }
    /**
     * Gets the seekPath property value. The seekPath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeekPath() {
        return this.seekPath;
    }
    /**
     * Gets the showHeatmap property value. The showHeatmap property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowHeatmap() {
        return this.showHeatmap;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Gets the tokenAuthEnabled property value. The tokenAuthEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTokenAuthEnabled() {
        return this.tokenAuthEnabled;
    }
    /**
     * Gets the uiLanguage property value. The uiLanguage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUiLanguage() {
        return this.uiLanguage;
    }
    /**
     * Gets the vastTagUrl property value. The vastTagUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVastTagUrl() {
        return this.vastTagUrl;
    }
    /**
     * Gets the video property value. The video property
     * @return a {@link Video}
     */
    @jakarta.annotation.Nullable
    public Video getVideo() {
        return this.video;
    }
    /**
     * Gets the videoPlaylistUrl property value. The videoPlaylistUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoPlaylistUrl() {
        return this.videoPlaylistUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowEarlyPlay", this.getAllowEarlyPlay());
        writer.writeStringValue("captionsBackground", this.getCaptionsBackground());
        writer.writeStringValue("captionsFontColor", this.getCaptionsFontColor());
        writer.writeIntegerValue("captionsFontSize", this.getCaptionsFontSize());
        writer.writeStringValue("captionsPath", this.getCaptionsPath());
        writer.writeStringValue("controls", this.getControls());
        writer.writeIntegerValue("drmVersion", this.getDrmVersion());
        writer.writeBooleanValue("enableDRM", this.getEnableDRM());
        writer.writeBooleanValue("enableMP4Fallback", this.getEnableMP4Fallback());
        writer.writeStringValue("fallbackUrl", this.getFallbackUrl());
        writer.writeStringValue("fontFamily", this.getFontFamily());
        writer.writeStringValue("originalUrl", this.getOriginalUrl());
        writer.writeStringValue("playbackSpeeds", this.getPlaybackSpeeds());
        writer.writeStringValue("playerKeyColor", this.getPlayerKeyColor());
        writer.writeStringValue("previewUrl", this.getPreviewUrl());
        writer.writeStringValue("seekPath", this.getSeekPath());
        writer.writeBooleanValue("showHeatmap", this.getShowHeatmap());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeBooleanValue("tokenAuthEnabled", this.getTokenAuthEnabled());
        writer.writeStringValue("uiLanguage", this.getUiLanguage());
        writer.writeStringValue("vastTagUrl", this.getVastTagUrl());
        writer.writeObjectValue("video", this.getVideo());
        writer.writeStringValue("videoPlaylistUrl", this.getVideoPlaylistUrl());
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
     * Sets the allowEarlyPlay property value. The allowEarlyPlay property
     * @param value Value to set for the allowEarlyPlay property.
     */
    public void setAllowEarlyPlay(@jakarta.annotation.Nullable final Boolean value) {
        this.allowEarlyPlay = value;
    }
    /**
     * Sets the captionsBackground property value. The captionsBackground property
     * @param value Value to set for the captionsBackground property.
     */
    public void setCaptionsBackground(@jakarta.annotation.Nullable final String value) {
        this.captionsBackground = value;
    }
    /**
     * Sets the captionsFontColor property value. The captionsFontColor property
     * @param value Value to set for the captionsFontColor property.
     */
    public void setCaptionsFontColor(@jakarta.annotation.Nullable final String value) {
        this.captionsFontColor = value;
    }
    /**
     * Sets the captionsFontSize property value. The captionsFontSize property
     * @param value Value to set for the captionsFontSize property.
     */
    public void setCaptionsFontSize(@jakarta.annotation.Nullable final Integer value) {
        this.captionsFontSize = value;
    }
    /**
     * Sets the captionsPath property value. The captionsPath property
     * @param value Value to set for the captionsPath property.
     */
    public void setCaptionsPath(@jakarta.annotation.Nullable final String value) {
        this.captionsPath = value;
    }
    /**
     * Sets the controls property value. The controls property
     * @param value Value to set for the controls property.
     */
    public void setControls(@jakarta.annotation.Nullable final String value) {
        this.controls = value;
    }
    /**
     * Sets the drmVersion property value. The drmVersion property
     * @param value Value to set for the drmVersion property.
     */
    public void setDrmVersion(@jakarta.annotation.Nullable final Integer value) {
        this.drmVersion = value;
    }
    /**
     * Sets the enableDRM property value. The enableDRM property
     * @param value Value to set for the enableDRM property.
     */
    public void setEnableDRM(@jakarta.annotation.Nullable final Boolean value) {
        this.enableDRM = value;
    }
    /**
     * Sets the enableMP4Fallback property value. The enableMP4Fallback property
     * @param value Value to set for the enableMP4Fallback property.
     */
    public void setEnableMP4Fallback(@jakarta.annotation.Nullable final Boolean value) {
        this.enableMP4Fallback = value;
    }
    /**
     * Sets the fallbackUrl property value. The fallbackUrl property
     * @param value Value to set for the fallbackUrl property.
     */
    public void setFallbackUrl(@jakarta.annotation.Nullable final String value) {
        this.fallbackUrl = value;
    }
    /**
     * Sets the fontFamily property value. The fontFamily property
     * @param value Value to set for the fontFamily property.
     */
    public void setFontFamily(@jakarta.annotation.Nullable final String value) {
        this.fontFamily = value;
    }
    /**
     * Sets the originalUrl property value. The originalUrl property
     * @param value Value to set for the originalUrl property.
     */
    public void setOriginalUrl(@jakarta.annotation.Nullable final String value) {
        this.originalUrl = value;
    }
    /**
     * Sets the playbackSpeeds property value. The playbackSpeeds property
     * @param value Value to set for the playbackSpeeds property.
     */
    public void setPlaybackSpeeds(@jakarta.annotation.Nullable final String value) {
        this.playbackSpeeds = value;
    }
    /**
     * Sets the playerKeyColor property value. The playerKeyColor property
     * @param value Value to set for the playerKeyColor property.
     */
    public void setPlayerKeyColor(@jakarta.annotation.Nullable final String value) {
        this.playerKeyColor = value;
    }
    /**
     * Sets the previewUrl property value. The previewUrl property
     * @param value Value to set for the previewUrl property.
     */
    public void setPreviewUrl(@jakarta.annotation.Nullable final String value) {
        this.previewUrl = value;
    }
    /**
     * Sets the seekPath property value. The seekPath property
     * @param value Value to set for the seekPath property.
     */
    public void setSeekPath(@jakarta.annotation.Nullable final String value) {
        this.seekPath = value;
    }
    /**
     * Sets the showHeatmap property value. The showHeatmap property
     * @param value Value to set for the showHeatmap property.
     */
    public void setShowHeatmap(@jakarta.annotation.Nullable final Boolean value) {
        this.showHeatmap = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
    /**
     * Sets the tokenAuthEnabled property value. The tokenAuthEnabled property
     * @param value Value to set for the tokenAuthEnabled property.
     */
    public void setTokenAuthEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.tokenAuthEnabled = value;
    }
    /**
     * Sets the uiLanguage property value. The uiLanguage property
     * @param value Value to set for the uiLanguage property.
     */
    public void setUiLanguage(@jakarta.annotation.Nullable final String value) {
        this.uiLanguage = value;
    }
    /**
     * Sets the vastTagUrl property value. The vastTagUrl property
     * @param value Value to set for the vastTagUrl property.
     */
    public void setVastTagUrl(@jakarta.annotation.Nullable final String value) {
        this.vastTagUrl = value;
    }
    /**
     * Sets the video property value. The video property
     * @param value Value to set for the video property.
     */
    public void setVideo(@jakarta.annotation.Nullable final Video value) {
        this.video = value;
    }
    /**
     * Sets the videoPlaylistUrl property value. The videoPlaylistUrl property
     * @param value Value to set for the videoPlaylistUrl property.
     */
    public void setVideoPlaylistUrl(@jakarta.annotation.Nullable final String value) {
        this.videoPlaylistUrl = value;
    }
}
