package bunny.sdk.streamapiclient.models.managevideos.videoresolutionsinfo;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoResolutionsInfoData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The availableResolutions property
     */
    private java.util.List<String> availableResolutions;
    /**
     * The configuredResolutions property
     */
    private java.util.List<String> configuredResolutions;
    /**
     * The hasOriginal property
     */
    private Boolean hasOriginal;
    /**
     * The mp4Resolutions property
     */
    private Resolutions mp4Resolutions;
    /**
     * The playlistResolutions property
     */
    private Resolutions playlistResolutions;
    /**
     * The storageResolutions property
     */
    private Resolutions storageResolutions;
    /**
     * The videoId property
     */
    private String videoId;
    /**
     * The videoLibraryId property
     */
    private Long videoLibraryId;
    /**
     * Instantiates a new {@link VideoResolutionsInfoData} and sets the default values.
     */
    public VideoResolutionsInfoData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoResolutionsInfoData}
     */
    @jakarta.annotation.Nonnull
    public static VideoResolutionsInfoData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoResolutionsInfoData();
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
     * Gets the availableResolutions property value. The availableResolutions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableResolutions() {
        return this.availableResolutions;
    }
    /**
     * Gets the configuredResolutions property value. The configuredResolutions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getConfiguredResolutions() {
        return this.configuredResolutions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("availableResolutions", (n) -> { this.setAvailableResolutions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("configuredResolutions", (n) -> { this.setConfiguredResolutions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("hasOriginal", (n) -> { this.setHasOriginal(n.getBooleanValue()); });
        deserializerMap.put("mp4Resolutions", (n) -> { this.setMp4Resolutions(n.getObjectValue(Resolutions::createFromDiscriminatorValue)); });
        deserializerMap.put("playlistResolutions", (n) -> { this.setPlaylistResolutions(n.getObjectValue(Resolutions::createFromDiscriminatorValue)); });
        deserializerMap.put("storageResolutions", (n) -> { this.setStorageResolutions(n.getObjectValue(Resolutions::createFromDiscriminatorValue)); });
        deserializerMap.put("videoId", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("videoLibraryId", (n) -> { this.setVideoLibraryId(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasOriginal property value. The hasOriginal property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasOriginal() {
        return this.hasOriginal;
    }
    /**
     * Gets the mp4Resolutions property value. The mp4Resolutions property
     * @return a {@link Resolutions}
     */
    @jakarta.annotation.Nullable
    public Resolutions getMp4Resolutions() {
        return this.mp4Resolutions;
    }
    /**
     * Gets the playlistResolutions property value. The playlistResolutions property
     * @return a {@link Resolutions}
     */
    @jakarta.annotation.Nullable
    public Resolutions getPlaylistResolutions() {
        return this.playlistResolutions;
    }
    /**
     * Gets the storageResolutions property value. The storageResolutions property
     * @return a {@link Resolutions}
     */
    @jakarta.annotation.Nullable
    public Resolutions getStorageResolutions() {
        return this.storageResolutions;
    }
    /**
     * Gets the videoId property value. The videoId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the videoLibraryId property value. The videoLibraryId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getVideoLibraryId() {
        return this.videoLibraryId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("availableResolutions", this.getAvailableResolutions());
        writer.writeCollectionOfPrimitiveValues("configuredResolutions", this.getConfiguredResolutions());
        writer.writeBooleanValue("hasOriginal", this.getHasOriginal());
        writer.writeObjectValue("mp4Resolutions", this.getMp4Resolutions());
        writer.writeObjectValue("playlistResolutions", this.getPlaylistResolutions());
        writer.writeObjectValue("storageResolutions", this.getStorageResolutions());
        writer.writeStringValue("videoId", this.getVideoId());
        writer.writeLongValue("videoLibraryId", this.getVideoLibraryId());
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
     * Sets the availableResolutions property value. The availableResolutions property
     * @param value Value to set for the availableResolutions property.
     */
    public void setAvailableResolutions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.availableResolutions = value;
    }
    /**
     * Sets the configuredResolutions property value. The configuredResolutions property
     * @param value Value to set for the configuredResolutions property.
     */
    public void setConfiguredResolutions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.configuredResolutions = value;
    }
    /**
     * Sets the hasOriginal property value. The hasOriginal property
     * @param value Value to set for the hasOriginal property.
     */
    public void setHasOriginal(@jakarta.annotation.Nullable final Boolean value) {
        this.hasOriginal = value;
    }
    /**
     * Sets the mp4Resolutions property value. The mp4Resolutions property
     * @param value Value to set for the mp4Resolutions property.
     */
    public void setMp4Resolutions(@jakarta.annotation.Nullable final Resolutions value) {
        this.mp4Resolutions = value;
    }
    /**
     * Sets the playlistResolutions property value. The playlistResolutions property
     * @param value Value to set for the playlistResolutions property.
     */
    public void setPlaylistResolutions(@jakarta.annotation.Nullable final Resolutions value) {
        this.playlistResolutions = value;
    }
    /**
     * Sets the storageResolutions property value. The storageResolutions property
     * @param value Value to set for the storageResolutions property.
     */
    public void setStorageResolutions(@jakarta.annotation.Nullable final Resolutions value) {
        this.storageResolutions = value;
    }
    /**
     * Sets the videoId property value. The videoId property
     * @param value Value to set for the videoId property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the videoLibraryId property value. The videoLibraryId property
     * @param value Value to set for the videoLibraryId property.
     */
    public void setVideoLibraryId(@jakarta.annotation.Nullable final Long value) {
        this.videoLibraryId = value;
    }
}
