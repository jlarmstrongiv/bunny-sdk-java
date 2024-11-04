package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WafRuleGroupModel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The code property
     */
    private String code;
    /**
     * The description property
     */
    private String description;
    /**
     * The fileName property
     */
    private String fileName;
    /**
     * The id property
     */
    private Long id;
    /**
     * The mainGroup property
     */
    private String mainGroup;
    /**
     * The name property
     */
    private String name;
    /**
     * The rules property
     */
    private java.util.List<WafRuleModel> rules;
    /**
     * The ruleset property
     */
    private String ruleset;
    /**
     * Instantiates a new {@link WafRuleGroupModel} and sets the default values.
     */
    public WafRuleGroupModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WafRuleGroupModel}
     */
    @jakarta.annotation.Nonnull
    public static WafRuleGroupModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WafRuleGroupModel();
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
     * Gets the code property value. The code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("mainGroup", (n) -> { this.setMainGroup(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(WafRuleModel::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleset", (n) -> { this.setRuleset(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the mainGroup property value. The mainGroup property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMainGroup() {
        return this.mainGroup;
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
     * Gets the rules property value. The rules property
     * @return a {@link java.util.List<WafRuleModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WafRuleModel> getRules() {
        return this.rules;
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
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeLongValue("id", this.getId());
        writer.writeStringValue("mainGroup", this.getMainGroup());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
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
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the mainGroup property value. The mainGroup property
     * @param value Value to set for the mainGroup property.
     */
    public void setMainGroup(@jakarta.annotation.Nullable final String value) {
        this.mainGroup = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the rules property value. The rules property
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<WafRuleModel> value) {
        this.rules = value;
    }
    /**
     * Sets the ruleset property value. The ruleset property
     * @param value Value to set for the ruleset property.
     */
    public void setRuleset(@jakarta.annotation.Nullable final String value) {
        this.ruleset = value;
    }
}
