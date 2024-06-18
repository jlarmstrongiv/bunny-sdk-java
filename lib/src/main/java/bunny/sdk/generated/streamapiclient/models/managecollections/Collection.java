package bunny.sdk.generated.streamapiclient.models.managecollections;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Collection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique ID of the collection
     */
    private String guid;
    /**
     * The name of the collection
     */
    private String name;
    /**
     * The URLs of preview images of videos in the collection
     */
    private String previewImageUrls;
    /**
     * The IDs of videos to be used as preview icons
     */
    private String previewVideoIds;
    /**
     * The total storage size of the collection
     */
    private Long totalSize;
    /**
     * The number of videos that the collection contains
     */
    private Long videoCount;
    /**
     * The video library ID that contains the collection
     */
    private Long videoLibraryId;
    /**
     * Instantiates a new {@link Collection} and sets the default values.
     */
    public Collection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Collection}
     */
    @jakarta.annotation.Nonnull
    public static Collection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Collection();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("guid", (n) -> { this.setGuid(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("previewImageUrls", (n) -> { this.setPreviewImageUrls(n.getStringValue()); });
        deserializerMap.put("previewVideoIds", (n) -> { this.setPreviewVideoIds(n.getStringValue()); });
        deserializerMap.put("totalSize", (n) -> { this.setTotalSize(n.getLongValue()); });
        deserializerMap.put("videoCount", (n) -> { this.setVideoCount(n.getLongValue()); });
        deserializerMap.put("videoLibraryId", (n) -> { this.setVideoLibraryId(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guid property value. The unique ID of the collection
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGuid() {
        return this.guid;
    }
    /**
     * Gets the name property value. The name of the collection
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the previewImageUrls property value. The URLs of preview images of videos in the collection
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreviewImageUrls() {
        return this.previewImageUrls;
    }
    /**
     * Gets the previewVideoIds property value. The IDs of videos to be used as preview icons
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreviewVideoIds() {
        return this.previewVideoIds;
    }
    /**
     * Gets the totalSize property value. The total storage size of the collection
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalSize() {
        return this.totalSize;
    }
    /**
     * Gets the videoCount property value. The number of videos that the collection contains
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getVideoCount() {
        return this.videoCount;
    }
    /**
     * Gets the videoLibraryId property value. The video library ID that contains the collection
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
        writer.writeStringValue("name", this.getName());
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
     * Sets the guid property value. The unique ID of the collection
     * @param value Value to set for the guid property.
     */
    public void setGuid(@jakarta.annotation.Nullable final String value) {
        this.guid = value;
    }
    /**
     * Sets the name property value. The name of the collection
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the previewImageUrls property value. The URLs of preview images of videos in the collection
     * @param value Value to set for the previewImageUrls property.
     */
    public void setPreviewImageUrls(@jakarta.annotation.Nullable final String value) {
        this.previewImageUrls = value;
    }
    /**
     * Sets the previewVideoIds property value. The IDs of videos to be used as preview icons
     * @param value Value to set for the previewVideoIds property.
     */
    public void setPreviewVideoIds(@jakarta.annotation.Nullable final String value) {
        this.previewVideoIds = value;
    }
    /**
     * Sets the totalSize property value. The total storage size of the collection
     * @param value Value to set for the totalSize property.
     */
    public void setTotalSize(@jakarta.annotation.Nullable final Long value) {
        this.totalSize = value;
    }
    /**
     * Sets the videoCount property value. The number of videos that the collection contains
     * @param value Value to set for the videoCount property.
     */
    public void setVideoCount(@jakarta.annotation.Nullable final Long value) {
        this.videoCount = value;
    }
    /**
     * Sets the videoLibraryId property value. The video library ID that contains the collection
     * @param value Value to set for the videoLibraryId property.
     */
    public void setVideoLibraryId(@jakarta.annotation.Nullable final Long value) {
        this.videoLibraryId = value;
    }
}
