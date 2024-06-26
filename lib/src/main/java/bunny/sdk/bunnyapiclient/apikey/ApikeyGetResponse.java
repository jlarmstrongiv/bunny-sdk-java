package bunny.sdk.bunnyapiclient.apikey;

import bunny.sdk.bunnyapiclient.models.apikeys.listapikeys.ApiKey;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApikeyGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CurrentPage property
     */
    private Integer currentPage;
    /**
     * The HasMoreItems property
     */
    private Boolean hasMoreItems;
    /**
     * The Items property
     */
    private java.util.List<ApiKey> items;
    /**
     * The TotalItems property
     */
    private Integer totalItems;
    /**
     * Instantiates a new {@link ApikeyGetResponse} and sets the default values.
     */
    public ApikeyGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApikeyGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static ApikeyGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApikeyGetResponse();
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
     * Gets the CurrentPage property value. The CurrentPage property
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
        deserializerMap.put("CurrentPage", (n) -> { this.setCurrentPage(n.getIntegerValue()); });
        deserializerMap.put("HasMoreItems", (n) -> { this.setHasMoreItems(n.getBooleanValue()); });
        deserializerMap.put("Items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ApiKey::createFromDiscriminatorValue)); });
        deserializerMap.put("TotalItems", (n) -> { this.setTotalItems(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the HasMoreItems property value. The HasMoreItems property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMoreItems() {
        return this.hasMoreItems;
    }
    /**
     * Gets the Items property value. The Items property
     * @return a {@link java.util.List<ApiKey>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApiKey> getItems() {
        return this.items;
    }
    /**
     * Gets the TotalItems property value. The TotalItems property
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
        writer.writeIntegerValue("CurrentPage", this.getCurrentPage());
        writer.writeBooleanValue("HasMoreItems", this.getHasMoreItems());
        writer.writeCollectionOfObjectValues("Items", this.getItems());
        writer.writeIntegerValue("TotalItems", this.getTotalItems());
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
     * Sets the CurrentPage property value. The CurrentPage property
     * @param value Value to set for the CurrentPage property.
     */
    public void setCurrentPage(@jakarta.annotation.Nullable final Integer value) {
        this.currentPage = value;
    }
    /**
     * Sets the HasMoreItems property value. The HasMoreItems property
     * @param value Value to set for the HasMoreItems property.
     */
    public void setHasMoreItems(@jakarta.annotation.Nullable final Boolean value) {
        this.hasMoreItems = value;
    }
    /**
     * Sets the Items property value. The Items property
     * @param value Value to set for the Items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ApiKey> value) {
        this.items = value;
    }
    /**
     * Sets the TotalItems property value. The TotalItems property
     * @param value Value to set for the TotalItems property.
     */
    public void setTotalItems(@jakarta.annotation.Nullable final Integer value) {
        this.totalItems = value;
    }
}
