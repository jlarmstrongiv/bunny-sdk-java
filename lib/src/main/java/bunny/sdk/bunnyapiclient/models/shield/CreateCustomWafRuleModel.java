package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCustomWafRuleModel implements AdditionalDataHolder, Parsable {
    /**
     * The actionType property
     */
    private Double actionType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The operatorType property
     */
    private Double operatorType;
    /**
     * The severityType property
     */
    private Double severityType;
    /**
     * The transformationTypes property
     */
    private java.util.List<Double> transformationTypes;
    /**
     * The value property
     */
    private String value;
    /**
     * The variableTypes property
     */
    private CreateCustomWafRuleModelVariableTypes variableTypes;
    /**
     * Instantiates a new {@link CreateCustomWafRuleModel} and sets the default values.
     */
    public CreateCustomWafRuleModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateCustomWafRuleModel}
     */
    @jakarta.annotation.Nonnull
    public static CreateCustomWafRuleModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCustomWafRuleModel();
    }
    /**
     * Gets the actionType property value. The actionType property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getDoubleValue()); });
        deserializerMap.put("operatorType", (n) -> { this.setOperatorType(n.getDoubleValue()); });
        deserializerMap.put("severityType", (n) -> { this.setSeverityType(n.getDoubleValue()); });
        deserializerMap.put("transformationTypes", (n) -> { this.setTransformationTypes(n.getCollectionOfPrimitiveValues(Double.class)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("variableTypes", (n) -> { this.setVariableTypes(n.getObjectValue(CreateCustomWafRuleModelVariableTypes::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the operatorType property value. The operatorType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOperatorType() {
        return this.operatorType;
    }
    /**
     * Gets the severityType property value. The severityType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSeverityType() {
        return this.severityType;
    }
    /**
     * Gets the transformationTypes property value. The transformationTypes property
     * @return a {@link java.util.List<Double>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Double> getTransformationTypes() {
        return this.transformationTypes;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Gets the variableTypes property value. The variableTypes property
     * @return a {@link CreateCustomWafRuleModelVariableTypes}
     */
    @jakarta.annotation.Nullable
    public CreateCustomWafRuleModelVariableTypes getVariableTypes() {
        return this.variableTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("actionType", this.getActionType());
        writer.writeDoubleValue("operatorType", this.getOperatorType());
        writer.writeDoubleValue("severityType", this.getSeverityType());
        writer.writeCollectionOfPrimitiveValues("transformationTypes", this.getTransformationTypes());
        writer.writeStringValue("value", this.getValue());
        writer.writeObjectValue("variableTypes", this.getVariableTypes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
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
     * Sets the operatorType property value. The operatorType property
     * @param value Value to set for the operatorType property.
     */
    public void setOperatorType(@jakarta.annotation.Nullable final Double value) {
        this.operatorType = value;
    }
    /**
     * Sets the severityType property value. The severityType property
     * @param value Value to set for the severityType property.
     */
    public void setSeverityType(@jakarta.annotation.Nullable final Double value) {
        this.severityType = value;
    }
    /**
     * Sets the transformationTypes property value. The transformationTypes property
     * @param value Value to set for the transformationTypes property.
     */
    public void setTransformationTypes(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.transformationTypes = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
    /**
     * Sets the variableTypes property value. The variableTypes property
     * @param value Value to set for the variableTypes property.
     */
    public void setVariableTypes(@jakarta.annotation.Nullable final CreateCustomWafRuleModelVariableTypes value) {
        this.variableTypes = value;
    }
}
