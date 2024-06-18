package bunny.sdk.generated.streamapiclient.library.item.videos;

import bunny.sdk.generated.streamapiclient.models.managevideos.Video;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideosGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The currentPage property
     */
    private Integer currentPage;
    /**
     * The items property
     */
    private java.util.List<Video> items;
    /**
     * The itemsPerPage property
     */
    private Integer itemsPerPage;
    /**
     * The totalItems property
     */
    private Integer totalItems;
    /**
     * Instantiates a new {@link VideosGetResponse} and sets the default values.
     */
    public VideosGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideosGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static VideosGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideosGetResponse();
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
     * Gets the currentPage property value. The currentPage property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCurrentPage() {
        return this.currentPage;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("currentPage", (n) -> { this.setCurrentPage(n.getIntegerValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(Video::createFromDiscriminatorValue)); });
        deserializerMap.put("itemsPerPage", (n) -> { this.setItemsPerPage(n.getIntegerValue()); });
        deserializerMap.put("totalItems", (n) -> { this.setTotalItems(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. The items property
     * @return a {@link java.util.List<Video>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Video> getItems() {
        return this.items;
    }
    /**
     * Gets the itemsPerPage property value. The itemsPerPage property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemsPerPage() {
        return this.itemsPerPage;
    }
    /**
     * Gets the totalItems property value. The totalItems property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalItems() {
        return this.totalItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("currentPage", this.getCurrentPage());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeIntegerValue("itemsPerPage", this.getItemsPerPage());
        writer.writeIntegerValue("totalItems", this.getTotalItems());
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
     * Sets the currentPage property value. The currentPage property
     * @param value Value to set for the currentPage property.
     */
    public void setCurrentPage(@jakarta.annotation.Nullable final Integer value) {
        this.currentPage = value;
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<Video> value) {
        this.items = value;
    }
    /**
     * Sets the itemsPerPage property value. The itemsPerPage property
     * @param value Value to set for the itemsPerPage property.
     */
    public void setItemsPerPage(@jakarta.annotation.Nullable final Integer value) {
        this.itemsPerPage = value;
    }
    /**
     * Sets the totalItems property value. The totalItems property
     * @param value Value to set for the totalItems property.
     */
    public void setTotalItems(@jakarta.annotation.Nullable final Integer value) {
        this.totalItems = value;
    }
}
