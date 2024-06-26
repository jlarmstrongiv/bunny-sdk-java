package bunny.sdk.streamapiclient.models.managevideos;

import bunny.sdk.streamapiclient.models.managevideos.transcodingmessage.TranscodingMessage;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Video implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The available resolutions of the video
     */
    private String availableResolutions;
    /**
     * The average watch time of the video in seconds
     */
    private Long averageWatchTime;
    /**
     * The captions property
     */
    private java.util.List<Caption> captions;
    /**
     * The automatically detected category of the video
     */
    private VideoCategory category;
    /**
     * The list of chapters available for the video
     */
    private java.util.List<Chapter> chapters;
    /**
     * The ID of the collection where the video belongs
     */
    private String collectionId;
    /**
     * The date when the video was uploaded
     */
    private OffsetDateTime dateUploaded;
    /**
     * The current encode progress of the video
     */
    private Integer encodeProgress;
    /**
     * The framerate of the video
     */
    private Double framerate;
    /**
     * The unique ID of the video
     */
    private String guid;
    /**
     * Determines if the video has MP4 fallback files generated
     */
    private Boolean hasMP4Fallback;
    /**
     * The height of the original video file
     */
    private Integer height;
    /**
     * Determines if the video is publicly accessible
     */
    private Boolean isPublic;
    /**
     * The duration of the video in seconds
     */
    private Integer length;
    /**
     * The list of meta tags that have been added to the video
     */
    private java.util.List<MetaTag> metaTags;
    /**
     * The list of moments available for the video
     */
    private java.util.List<Moment> moments;
    /**
     * The rotation of the video
     */
    private Integer rotation;
    /**
     * The status of the video.
     */
    private Double status;
    /**
     * The amount of storage used by this video
     */
    private Long storageSize;
    /**
     * The number of thumbnails generated for this video
     */
    private Integer thumbnailCount;
    /**
     * The file name of the thumbnail inside of the storage
     */
    private String thumbnailFileName;
    /**
     * The title of the video
     */
    private String title;
    /**
     * The total video watch time in seconds
     */
    private Long totalWatchTime;
    /**
     * The list of transcoding messages that describe potential issues while the video was transcoding
     */
    private java.util.List<TranscodingMessage> transcodingMessages;
    /**
     * The ID of the video library that the video belongs to
     */
    private Long videoLibraryId;
    /**
     * The number of views the video received
     */
    private Long views;
    /**
     * The width of the original video file
     */
    private Integer width;
    /**
     * Instantiates a new {@link Video} and sets the default values.
     */
    public Video() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Video}
     */
    @jakarta.annotation.Nonnull
    public static Video createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Video();
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
     * Gets the availableResolutions property value. The available resolutions of the video
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAvailableResolutions() {
        return this.availableResolutions;
    }
    /**
     * Gets the averageWatchTime property value. The average watch time of the video in seconds
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAverageWatchTime() {
        return this.averageWatchTime;
    }
    /**
     * Gets the captions property value. The captions property
     * @return a {@link java.util.List<Caption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Caption> getCaptions() {
        return this.captions;
    }
    /**
     * Gets the category property value. The automatically detected category of the video
     * @return a {@link VideoCategory}
     */
    @jakarta.annotation.Nullable
    public VideoCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the chapters property value. The list of chapters available for the video
     * @return a {@link java.util.List<Chapter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Chapter> getChapters() {
        return this.chapters;
    }
    /**
     * Gets the collectionId property value. The ID of the collection where the video belongs
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCollectionId() {
        return this.collectionId;
    }
    /**
     * Gets the dateUploaded property value. The date when the video was uploaded
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateUploaded() {
        return this.dateUploaded;
    }
    /**
     * Gets the encodeProgress property value. The current encode progress of the video
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEncodeProgress() {
        return this.encodeProgress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("availableResolutions", (n) -> { this.setAvailableResolutions(n.getStringValue()); });
        deserializerMap.put("averageWatchTime", (n) -> { this.setAverageWatchTime(n.getLongValue()); });
        deserializerMap.put("captions", (n) -> { this.setCaptions(n.getCollectionOfObjectValues(Caption::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(VideoCategory::forValue)); });
        deserializerMap.put("chapters", (n) -> { this.setChapters(n.getCollectionOfObjectValues(Chapter::createFromDiscriminatorValue)); });
        deserializerMap.put("collectionId", (n) -> { this.setCollectionId(n.getStringValue()); });
        deserializerMap.put("dateUploaded", (n) -> { this.setDateUploaded(n.getOffsetDateTimeValue()); });
        deserializerMap.put("encodeProgress", (n) -> { this.setEncodeProgress(n.getIntegerValue()); });
        deserializerMap.put("framerate", (n) -> { this.setFramerate(n.getDoubleValue()); });
        deserializerMap.put("guid", (n) -> { this.setGuid(n.getStringValue()); });
        deserializerMap.put("hasMP4Fallback", (n) -> { this.setHasMP4Fallback(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("isPublic", (n) -> { this.setIsPublic(n.getBooleanValue()); });
        deserializerMap.put("length", (n) -> { this.setLength(n.getIntegerValue()); });
        deserializerMap.put("metaTags", (n) -> { this.setMetaTags(n.getCollectionOfObjectValues(MetaTag::createFromDiscriminatorValue)); });
        deserializerMap.put("moments", (n) -> { this.setMoments(n.getCollectionOfObjectValues(Moment::createFromDiscriminatorValue)); });
        deserializerMap.put("rotation", (n) -> { this.setRotation(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getDoubleValue()); });
        deserializerMap.put("storageSize", (n) -> { this.setStorageSize(n.getLongValue()); });
        deserializerMap.put("thumbnailCount", (n) -> { this.setThumbnailCount(n.getIntegerValue()); });
        deserializerMap.put("thumbnailFileName", (n) -> { this.setThumbnailFileName(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("totalWatchTime", (n) -> { this.setTotalWatchTime(n.getLongValue()); });
        deserializerMap.put("transcodingMessages", (n) -> { this.setTranscodingMessages(n.getCollectionOfObjectValues(TranscodingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("videoLibraryId", (n) -> { this.setVideoLibraryId(n.getLongValue()); });
        deserializerMap.put("views", (n) -> { this.setViews(n.getLongValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the framerate property value. The framerate of the video
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getFramerate() {
        return this.framerate;
    }
    /**
     * Gets the guid property value. The unique ID of the video
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGuid() {
        return this.guid;
    }
    /**
     * Gets the hasMP4Fallback property value. Determines if the video has MP4 fallback files generated
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMP4Fallback() {
        return this.hasMP4Fallback;
    }
    /**
     * Gets the height property value. The height of the original video file
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the isPublic property value. Determines if the video is publicly accessible
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublic() {
        return this.isPublic;
    }
    /**
     * Gets the length property value. The duration of the video in seconds
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLength() {
        return this.length;
    }
    /**
     * Gets the metaTags property value. The list of meta tags that have been added to the video
     * @return a {@link java.util.List<MetaTag>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetaTag> getMetaTags() {
        return this.metaTags;
    }
    /**
     * Gets the moments property value. The list of moments available for the video
     * @return a {@link java.util.List<Moment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Moment> getMoments() {
        return this.moments;
    }
    /**
     * Gets the rotation property value. The rotation of the video
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRotation() {
        return this.rotation;
    }
    /**
     * Gets the status property value. The status of the video.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStatus() {
        return this.status;
    }
    /**
     * Gets the storageSize property value. The amount of storage used by this video
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageSize() {
        return this.storageSize;
    }
    /**
     * Gets the thumbnailCount property value. The number of thumbnails generated for this video
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getThumbnailCount() {
        return this.thumbnailCount;
    }
    /**
     * Gets the thumbnailFileName property value. The file name of the thumbnail inside of the storage
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbnailFileName() {
        return this.thumbnailFileName;
    }
    /**
     * Gets the title property value. The title of the video
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the totalWatchTime property value. The total video watch time in seconds
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalWatchTime() {
        return this.totalWatchTime;
    }
    /**
     * Gets the transcodingMessages property value. The list of transcoding messages that describe potential issues while the video was transcoding
     * @return a {@link java.util.List<TranscodingMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TranscodingMessage> getTranscodingMessages() {
        return this.transcodingMessages;
    }
    /**
     * Gets the videoLibraryId property value. The ID of the video library that the video belongs to
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getVideoLibraryId() {
        return this.videoLibraryId;
    }
    /**
     * Gets the views property value. The number of views the video received
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getViews() {
        return this.views;
    }
    /**
     * Gets the width property value. The width of the original video file
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("captions", this.getCaptions());
        writer.writeCollectionOfObjectValues("chapters", this.getChapters());
        writer.writeStringValue("collectionId", this.getCollectionId());
        writer.writeCollectionOfObjectValues("metaTags", this.getMetaTags());
        writer.writeCollectionOfObjectValues("moments", this.getMoments());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the availableResolutions property value. The available resolutions of the video
     * @param value Value to set for the availableResolutions property.
     */
    public void setAvailableResolutions(@jakarta.annotation.Nullable final String value) {
        this.availableResolutions = value;
    }
    /**
     * Sets the averageWatchTime property value. The average watch time of the video in seconds
     * @param value Value to set for the averageWatchTime property.
     */
    public void setAverageWatchTime(@jakarta.annotation.Nullable final Long value) {
        this.averageWatchTime = value;
    }
    /**
     * Sets the captions property value. The captions property
     * @param value Value to set for the captions property.
     */
    public void setCaptions(@jakarta.annotation.Nullable final java.util.List<Caption> value) {
        this.captions = value;
    }
    /**
     * Sets the category property value. The automatically detected category of the video
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final VideoCategory value) {
        this.category = value;
    }
    /**
     * Sets the chapters property value. The list of chapters available for the video
     * @param value Value to set for the chapters property.
     */
    public void setChapters(@jakarta.annotation.Nullable final java.util.List<Chapter> value) {
        this.chapters = value;
    }
    /**
     * Sets the collectionId property value. The ID of the collection where the video belongs
     * @param value Value to set for the collectionId property.
     */
    public void setCollectionId(@jakarta.annotation.Nullable final String value) {
        this.collectionId = value;
    }
    /**
     * Sets the dateUploaded property value. The date when the video was uploaded
     * @param value Value to set for the dateUploaded property.
     */
    public void setDateUploaded(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateUploaded = value;
    }
    /**
     * Sets the encodeProgress property value. The current encode progress of the video
     * @param value Value to set for the encodeProgress property.
     */
    public void setEncodeProgress(@jakarta.annotation.Nullable final Integer value) {
        this.encodeProgress = value;
    }
    /**
     * Sets the framerate property value. The framerate of the video
     * @param value Value to set for the framerate property.
     */
    public void setFramerate(@jakarta.annotation.Nullable final Double value) {
        this.framerate = value;
    }
    /**
     * Sets the guid property value. The unique ID of the video
     * @param value Value to set for the guid property.
     */
    public void setGuid(@jakarta.annotation.Nullable final String value) {
        this.guid = value;
    }
    /**
     * Sets the hasMP4Fallback property value. Determines if the video has MP4 fallback files generated
     * @param value Value to set for the hasMP4Fallback property.
     */
    public void setHasMP4Fallback(@jakarta.annotation.Nullable final Boolean value) {
        this.hasMP4Fallback = value;
    }
    /**
     * Sets the height property value. The height of the original video file
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the isPublic property value. Determines if the video is publicly accessible
     * @param value Value to set for the isPublic property.
     */
    public void setIsPublic(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublic = value;
    }
    /**
     * Sets the length property value. The duration of the video in seconds
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Integer value) {
        this.length = value;
    }
    /**
     * Sets the metaTags property value. The list of meta tags that have been added to the video
     * @param value Value to set for the metaTags property.
     */
    public void setMetaTags(@jakarta.annotation.Nullable final java.util.List<MetaTag> value) {
        this.metaTags = value;
    }
    /**
     * Sets the moments property value. The list of moments available for the video
     * @param value Value to set for the moments property.
     */
    public void setMoments(@jakarta.annotation.Nullable final java.util.List<Moment> value) {
        this.moments = value;
    }
    /**
     * Sets the rotation property value. The rotation of the video
     * @param value Value to set for the rotation property.
     */
    public void setRotation(@jakarta.annotation.Nullable final Integer value) {
        this.rotation = value;
    }
    /**
     * Sets the status property value. The status of the video.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Double value) {
        this.status = value;
    }
    /**
     * Sets the storageSize property value. The amount of storage used by this video
     * @param value Value to set for the storageSize property.
     */
    public void setStorageSize(@jakarta.annotation.Nullable final Long value) {
        this.storageSize = value;
    }
    /**
     * Sets the thumbnailCount property value. The number of thumbnails generated for this video
     * @param value Value to set for the thumbnailCount property.
     */
    public void setThumbnailCount(@jakarta.annotation.Nullable final Integer value) {
        this.thumbnailCount = value;
    }
    /**
     * Sets the thumbnailFileName property value. The file name of the thumbnail inside of the storage
     * @param value Value to set for the thumbnailFileName property.
     */
    public void setThumbnailFileName(@jakarta.annotation.Nullable final String value) {
        this.thumbnailFileName = value;
    }
    /**
     * Sets the title property value. The title of the video
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the totalWatchTime property value. The total video watch time in seconds
     * @param value Value to set for the totalWatchTime property.
     */
    public void setTotalWatchTime(@jakarta.annotation.Nullable final Long value) {
        this.totalWatchTime = value;
    }
    /**
     * Sets the transcodingMessages property value. The list of transcoding messages that describe potential issues while the video was transcoding
     * @param value Value to set for the transcodingMessages property.
     */
    public void setTranscodingMessages(@jakarta.annotation.Nullable final java.util.List<TranscodingMessage> value) {
        this.transcodingMessages = value;
    }
    /**
     * Sets the videoLibraryId property value. The ID of the video library that the video belongs to
     * @param value Value to set for the videoLibraryId property.
     */
    public void setVideoLibraryId(@jakarta.annotation.Nullable final Long value) {
        this.videoLibraryId = value;
    }
    /**
     * Sets the views property value. The number of views the video received
     * @param value Value to set for the views property.
     */
    public void setViews(@jakarta.annotation.Nullable final Long value) {
        this.views = value;
    }
    /**
     * Sets the width property value. The width of the original video file
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
