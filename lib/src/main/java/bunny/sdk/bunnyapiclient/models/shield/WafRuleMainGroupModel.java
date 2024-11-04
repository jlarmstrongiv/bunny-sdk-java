package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WafRuleMainGroupModel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name property
     */
    private String name;
    /**
     * The ruleGroups property
     */
    private java.util.List<WafRuleGroupModel> ruleGroups;
    /**
     * The ruleset property
     */
    private String ruleset;
    /**
     * Instantiates a new {@link WafRuleMainGroupModel} and sets the default values.
     */
    public WafRuleMainGroupModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WafRuleMainGroupModel}
     */
    @jakarta.annotation.Nonnull
    public static WafRuleMainGroupModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WafRuleMainGroupModel();
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
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("ruleGroups", (n) -> { this.setRuleGroups(n.getCollectionOfObjectValues(WafRuleGroupModel::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleset", (n) -> { this.setRuleset(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the ruleGroups property value. The ruleGroups property
     * @return a {@link java.util.List<WafRuleGroupModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WafRuleGroupModel> getRuleGroups() {
        return this.ruleGroups;
    }
    /**
     * Gets the ruleset property value. The ruleset property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRuleset() {
        return this.ruleset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("ruleGroups", this.getRuleGroups());
        writer.writeStringValue("ruleset", this.getRuleset());
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
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the ruleGroups property value. The ruleGroups property
     * @param value Value to set for the ruleGroups property.
     */
    public void setRuleGroups(@jakarta.annotation.Nullable final java.util.List<WafRuleGroupModel> value) {
        this.ruleGroups = value;
    }
    /**
     * Sets the ruleset property value. The ruleset property
     * @param value Value to set for the ruleset property.
     */
    public void setRuleset(@jakarta.annotation.Nullable final String value) {
        this.ruleset = value;
    }
}
