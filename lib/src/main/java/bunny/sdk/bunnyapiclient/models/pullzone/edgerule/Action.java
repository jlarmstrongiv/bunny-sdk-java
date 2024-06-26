package bunny.sdk.bunnyapiclient.models.pullzone.edgerule;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Action implements AdditionalDataHolder, Parsable {
    /**
     * The ActionParameter1 property
     */
    private String actionParameter1;
    /**
     * The ActionParameter2 property
     */
    private String actionParameter2;
    /**
     * The ActionType property
     */
    private Double actionType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new {@link Action} and sets the default values.
     */
    public Action() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Action}
     */
    @jakarta.annotation.Nonnull
    public static Action createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Action();
    }
    /**
     * Gets the ActionParameter1 property value. The ActionParameter1 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionParameter1() {
        return this.actionParameter1;
    }
    /**
     * Gets the ActionParameter2 property value. The ActionParameter2 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionParameter2() {
        return this.actionParameter2;
    }
    /**
     * Gets the ActionType property value. The ActionType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getActionType() {
        return this.actionType;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("ActionParameter1", (n) -> { this.setActionParameter1(n.getStringValue()); });
        deserializerMap.put("ActionParameter2", (n) -> { this.setActionParameter2(n.getStringValue()); });
        deserializerMap.put("ActionType", (n) -> { this.setActionType(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ActionParameter1", this.getActionParameter1());
        writer.writeStringValue("ActionParameter2", this.getActionParameter2());
        writer.writeDoubleValue("ActionType", this.getActionType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the ActionParameter1 property value. The ActionParameter1 property
     * @param value Value to set for the ActionParameter1 property.
     */
    public void setActionParameter1(@jakarta.annotation.Nullable final String value) {
        this.actionParameter1 = value;
    }
    /**
     * Sets the ActionParameter2 property value. The ActionParameter2 property
     * @param value Value to set for the ActionParameter2 property.
     */
    public void setActionParameter2(@jakarta.annotation.Nullable final String value) {
        this.actionParameter2 = value;
    }
    /**
     * Sets the ActionType property value. The ActionType property
     * @param value Value to set for the ActionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final Double value) {
        this.actionType = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
