package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WafMappedEnumList implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enumName property
     */
    private String enumName;
    /**
     * The enumValues property
     */
    private java.util.List<WafMappedEnum> enumValues;
    /**
     * Instantiates a new {@link WafMappedEnumList} and sets the default values.
     */
    public WafMappedEnumList() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WafMappedEnumList}
     */
    @jakarta.annotation.Nonnull
    public static WafMappedEnumList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WafMappedEnumList();
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
     * Gets the enumName property value. The enumName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnumName() {
        return this.enumName;
    }
    /**
     * Gets the enumValues property value. The enumValues property
     * @return a {@link java.util.List<WafMappedEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WafMappedEnum> getEnumValues() {
        return this.enumValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("enumName", (n) -> { this.setEnumName(n.getStringValue()); });
        deserializerMap.put("enumValues", (n) -> { this.setEnumValues(n.getCollectionOfObjectValues(WafMappedEnum::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("enumName", this.getEnumName());
        writer.writeCollectionOfObjectValues("enumValues", this.getEnumValues());
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
     * Sets the enumName property value. The enumName property
     * @param value Value to set for the enumName property.
     */
    public void setEnumName(@jakarta.annotation.Nullable final String value) {
        this.enumName = value;
    }
    /**
     * Sets the enumValues property value. The enumValues property
     * @param value Value to set for the enumValues property.
     */
    public void setEnumValues(@jakarta.annotation.Nullable final java.util.List<WafMappedEnum> value) {
        this.enumValues = value;
    }
}
