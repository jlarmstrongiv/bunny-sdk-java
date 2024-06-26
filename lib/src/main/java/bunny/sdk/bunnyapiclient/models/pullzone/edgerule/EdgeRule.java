package bunny.sdk.bunnyapiclient.models.pullzone.edgerule;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdgeRule implements AdditionalDataHolder, Parsable {
    /**
     * The Action parameter 1. The value depends on other parameters of the edge rule.
     */
    private String actionParameter1;
    /**
     * The Action parameter 2. The value depends on other parameters of the edge rule.
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
     * The description of the edge rule
     */
    private String description;
    /**
     * Determines if the edge rule is currently enabled or not
     */
    private Boolean enabled;
    /**
     * The ExtraActions property
     */
    private java.util.List<Action> extraActions;
    /**
     * The unique GUID of the edge rule
     */
    private String guid;
    /**
     * The TriggerMatchingType property
     */
    private Double triggerMatchingType;
    /**
     * The Triggers property
     */
    private java.util.List<Trigger> triggers;
    /**
     * Instantiates a new {@link EdgeRule} and sets the default values.
     */
    public EdgeRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdgeRule}
     */
    @jakarta.annotation.Nonnull
    public static EdgeRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeRule();
    }
    /**
     * Gets the ActionParameter1 property value. The Action parameter 1. The value depends on other parameters of the edge rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionParameter1() {
        return this.actionParameter1;
    }
    /**
     * Gets the ActionParameter2 property value. The Action parameter 2. The value depends on other parameters of the edge rule.
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
     * Gets the Description property value. The description of the edge rule
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the Enabled property value. Determines if the edge rule is currently enabled or not
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Gets the ExtraActions property value. The ExtraActions property
     * @return a {@link java.util.List<Action>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Action> getExtraActions() {
        return this.extraActions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("ActionParameter1", (n) -> { this.setActionParameter1(n.getStringValue()); });
        deserializerMap.put("ActionParameter2", (n) -> { this.setActionParameter2(n.getStringValue()); });
        deserializerMap.put("ActionType", (n) -> { this.setActionType(n.getDoubleValue()); });
        deserializerMap.put("Description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("Enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("ExtraActions", (n) -> { this.setExtraActions(n.getCollectionOfObjectValues(Action::createFromDiscriminatorValue)); });
        deserializerMap.put("Guid", (n) -> { this.setGuid(n.getStringValue()); });
        deserializerMap.put("TriggerMatchingType", (n) -> { this.setTriggerMatchingType(n.getDoubleValue()); });
        deserializerMap.put("Triggers", (n) -> { this.setTriggers(n.getCollectionOfObjectValues(Trigger::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the Guid property value. The unique GUID of the edge rule
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGuid() {
        return this.guid;
    }
    /**
     * Gets the TriggerMatchingType property value. The TriggerMatchingType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTriggerMatchingType() {
        return this.triggerMatchingType;
    }
    /**
     * Gets the Triggers property value. The Triggers property
     * @return a {@link java.util.List<Trigger>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Trigger> getTriggers() {
        return this.triggers;
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
        writer.writeStringValue("Description", this.getDescription());
        writer.writeBooleanValue("Enabled", this.getEnabled());
        writer.writeCollectionOfObjectValues("ExtraActions", this.getExtraActions());
        writer.writeStringValue("Guid", this.getGuid());
        writer.writeDoubleValue("TriggerMatchingType", this.getTriggerMatchingType());
        writer.writeCollectionOfObjectValues("Triggers", this.getTriggers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the ActionParameter1 property value. The Action parameter 1. The value depends on other parameters of the edge rule.
     * @param value Value to set for the ActionParameter1 property.
     */
    public void setActionParameter1(@jakarta.annotation.Nullable final String value) {
        this.actionParameter1 = value;
    }
    /**
     * Sets the ActionParameter2 property value. The Action parameter 2. The value depends on other parameters of the edge rule.
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
    /**
     * Sets the Description property value. The description of the edge rule
     * @param value Value to set for the Description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the Enabled property value. Determines if the edge rule is currently enabled or not
     * @param value Value to set for the Enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the ExtraActions property value. The ExtraActions property
     * @param value Value to set for the ExtraActions property.
     */
    public void setExtraActions(@jakarta.annotation.Nullable final java.util.List<Action> value) {
        this.extraActions = value;
    }
    /**
     * Sets the Guid property value. The unique GUID of the edge rule
     * @param value Value to set for the Guid property.
     */
    public void setGuid(@jakarta.annotation.Nullable final String value) {
        this.guid = value;
    }
    /**
     * Sets the TriggerMatchingType property value. The TriggerMatchingType property
     * @param value Value to set for the TriggerMatchingType property.
     */
    public void setTriggerMatchingType(@jakarta.annotation.Nullable final Double value) {
        this.triggerMatchingType = value;
    }
    /**
     * Sets the Triggers property value. The Triggers property
     * @param value Value to set for the Triggers property.
     */
    public void setTriggers(@jakarta.annotation.Nullable final java.util.List<Trigger> value) {
        this.triggers = value;
    }
}
