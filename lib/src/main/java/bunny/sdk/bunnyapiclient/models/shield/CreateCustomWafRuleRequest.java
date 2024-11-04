package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCustomWafRuleRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ruleConfiguration property
     */
    private CreateCustomWafRuleModel ruleConfiguration;
    /**
     * The ruleDescription property
     */
    private String ruleDescription;
    /**
     * The ruleName property
     */
    private String ruleName;
    /**
     * The shieldZoneId property
     */
    private Long shieldZoneId;
    /**
     * Instantiates a new {@link CreateCustomWafRuleRequest} and sets the default values.
     */
    public CreateCustomWafRuleRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateCustomWafRuleRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateCustomWafRuleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCustomWafRuleRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("ruleConfiguration", (n) -> { this.setRuleConfiguration(n.getObjectValue(CreateCustomWafRuleModel::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleDescription", (n) -> { this.setRuleDescription(n.getStringValue()); });
        deserializerMap.put("ruleName", (n) -> { this.setRuleName(n.getStringValue()); });
        deserializerMap.put("shieldZoneId", (n) -> { this.setShieldZoneId(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ruleConfiguration property value. The ruleConfiguration property
     * @return a {@link CreateCustomWafRuleModel}
     */
    @jakarta.annotation.Nullable
    public CreateCustomWafRuleModel getRuleConfiguration() {
        return this.ruleConfiguration;
    }
    /**
     * Gets the ruleDescription property value. The ruleDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRuleDescription() {
        return this.ruleDescription;
    }
    /**
     * Gets the ruleName property value. The ruleName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRuleName() {
        return this.ruleName;
    }
    /**
     * Gets the shieldZoneId property value. The shieldZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getShieldZoneId() {
        return this.shieldZoneId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("ruleConfiguration", this.getRuleConfiguration());
        writer.writeStringValue("ruleDescription", this.getRuleDescription());
        writer.writeStringValue("ruleName", this.getRuleName());
        writer.writeLongValue("shieldZoneId", this.getShieldZoneId());
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
     * Sets the ruleConfiguration property value. The ruleConfiguration property
     * @param value Value to set for the ruleConfiguration property.
     */
    public void setRuleConfiguration(@jakarta.annotation.Nullable final CreateCustomWafRuleModel value) {
        this.ruleConfiguration = value;
    }
    /**
     * Sets the ruleDescription property value. The ruleDescription property
     * @param value Value to set for the ruleDescription property.
     */
    public void setRuleDescription(@jakarta.annotation.Nullable final String value) {
        this.ruleDescription = value;
    }
    /**
     * Sets the ruleName property value. The ruleName property
     * @param value Value to set for the ruleName property.
     */
    public void setRuleName(@jakarta.annotation.Nullable final String value) {
        this.ruleName = value;
    }
    /**
     * Sets the shieldZoneId property value. The shieldZoneId property
     * @param value Value to set for the shieldZoneId property.
     */
    public void setShieldZoneId(@jakarta.annotation.Nullable final Long value) {
        this.shieldZoneId = value;
    }
}
