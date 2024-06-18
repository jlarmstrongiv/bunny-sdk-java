package bunny.sdk.generated.streamapiclient.models.managevideos;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoCreate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the collection where the video belongs
     */
    private String collectionId;
    /**
     * Video time in ms to extract the main video thumbnail.
     */
    private Integer thumbnailTime;
    /**
     * The title of the video
     */
    private String title;
    /**
     * Instantiates a new {@link VideoCreate} and sets the default values.
     */
    public VideoCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoCreate}
     */
    @jakarta.annotation.Nonnull
    public static VideoCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoCreate();
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
     * Gets the collectionId property value. The ID of the collection where the video belongs
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCollectionId() {
        return this.collectionId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("collectionId", (n) -> { this.setCollectionId(n.getStringValue()); });
        deserializerMap.put("thumbnailTime", (n) -> { this.setThumbnailTime(n.getIntegerValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the thumbnailTime property value. Video time in ms to extract the main video thumbnail.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getThumbnailTime() {
        return this.thumbnailTime;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("collectionId", this.getCollectionId());
        writer.writeIntegerValue("thumbnailTime", this.getThumbnailTime());
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
     * Sets the collectionId property value. The ID of the collection where the video belongs
     * @param value Value to set for the collectionId property.
     */
    public void setCollectionId(@jakarta.annotation.Nullable final String value) {
        this.collectionId = value;
    }
    /**
     * Sets the thumbnailTime property value. Video time in ms to extract the main video thumbnail.
     * @param value Value to set for the thumbnailTime property.
     */
    public void setThumbnailTime(@jakarta.annotation.Nullable final Integer value) {
        this.thumbnailTime = value;
    }
    /**
     * Sets the title property value. The title of the video
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
