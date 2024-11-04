package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateWafRateLimitRuleModel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The blockTime property
     */
    private Double blockTime;
    /**
     * The operatorType property
     */
    private Double operatorType;
    /**
     * The requestCount property
     */
    private Integer requestCount;
    /**
     * The severityType property
     */
    private Double severityType;
    /**
     * The timeframe property
     */
    private Double timeframe;
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
    private CreateWafRateLimitRuleModelVariableTypes variableTypes;
    /**
     * Instantiates a new {@link CreateWafRateLimitRuleModel} and sets the default values.
     */
    public CreateWafRateLimitRuleModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateWafRateLimitRuleModel}
     */
    @jakarta.annotation.Nonnull
    public static CreateWafRateLimitRuleModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateWafRateLimitRuleModel();
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
     * Gets the blockTime property value. The blockTime property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBlockTime() {
        return this.blockTime;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("blockTime", (n) -> { this.setBlockTime(n.getDoubleValue()); });
        deserializerMap.put("operatorType", (n) -> { this.setOperatorType(n.getDoubleValue()); });
        deserializerMap.put("requestCount", (n) -> { this.setRequestCount(n.getIntegerValue()); });
        deserializerMap.put("severityType", (n) -> { this.setSeverityType(n.getDoubleValue()); });
        deserializerMap.put("timeframe", (n) -> { this.setTimeframe(n.getDoubleValue()); });
        deserializerMap.put("transformationTypes", (n) -> { this.setTransformationTypes(n.getCollectionOfPrimitiveValues(Double.class)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("variableTypes", (n) -> { this.setVariableTypes(n.getObjectValue(CreateWafRateLimitRuleModelVariableTypes::createFromDiscriminatorValue)); });
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
     * Gets the requestCount property value. The requestCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRequestCount() {
        return this.requestCount;
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
     * Gets the timeframe property value. The timeframe property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTimeframe() {
        return this.timeframe;
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
     * @return a {@link CreateWafRateLimitRuleModelVariableTypes}
     */
    @jakarta.annotation.Nullable
    public CreateWafRateLimitRuleModelVariableTypes getVariableTypes() {
        return this.variableTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("blockTime", this.getBlockTime());
        writer.writeDoubleValue("operatorType", this.getOperatorType());
        writer.writeIntegerValue("requestCount", this.getRequestCount());
        writer.writeDoubleValue("severityType", this.getSeverityType());
        writer.writeDoubleValue("timeframe", this.getTimeframe());
        writer.writeCollectionOfPrimitiveValues("transformationTypes", this.getTransformationTypes());
        writer.writeStringValue("value", this.getValue());
        writer.writeObjectValue("variableTypes", this.getVariableTypes());
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
     * Sets the blockTime property value. The blockTime property
     * @param value Value to set for the blockTime property.
     */
    public void setBlockTime(@jakarta.annotation.Nullable final Double value) {
        this.blockTime = value;
    }
    /**
     * Sets the operatorType property value. The operatorType property
     * @param value Value to set for the operatorType property.
     */
    public void setOperatorType(@jakarta.annotation.Nullable final Double value) {
        this.operatorType = value;
    }
    /**
     * Sets the requestCount property value. The requestCount property
     * @param value Value to set for the requestCount property.
     */
    public void setRequestCount(@jakarta.annotation.Nullable final Integer value) {
        this.requestCount = value;
    }
    /**
     * Sets the severityType property value. The severityType property
     * @param value Value to set for the severityType property.
     */
    public void setSeverityType(@jakarta.annotation.Nullable final Double value) {
        this.severityType = value;
    }
    /**
     * Sets the timeframe property value. The timeframe property
     * @param value Value to set for the timeframe property.
     */
    public void setTimeframe(@jakarta.annotation.Nullable final Double value) {
        this.timeframe = value;
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
    public void setVariableTypes(@jakarta.annotation.Nullable final CreateWafRateLimitRuleModelVariableTypes value) {
        this.variableTypes = value;
    }
}
