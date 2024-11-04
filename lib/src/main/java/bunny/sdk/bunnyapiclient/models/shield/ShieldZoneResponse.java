package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShieldZoneResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The customWafRulesLimit property
     */
    private Integer customWafRulesLimit;
    /**
     * The dDoSChallengeWindow property
     */
    private Integer dDoSChallengeWindow;
    /**
     * The dDoSShieldSensitivity property
     */
    private Double dDoSShieldSensitivity;
    /**
     * The learningMode property
     */
    private Boolean learningMode;
    /**
     * The learningModeUntil property
     */
    private OffsetDateTime learningModeUntil;
    /**
     * The planType property
     */
    private Double planType;
    /**
     * The pullZoneId property
     */
    private Long pullZoneId;
    /**
     * The rateLimitRulesLimit property
     */
    private Integer rateLimitRulesLimit;
    /**
     * The shieldZoneId property
     */
    private Long shieldZoneId;
    /**
     * The wafDisabledRuleGroups property
     */
    private java.util.List<String> wafDisabledRuleGroups;
    /**
     * The wafDisabledRules property
     */
    private java.util.List<String> wafDisabledRules;
    /**
     * The wafEnabled property
     */
    private Boolean wafEnabled;
    /**
     * The wafEngineConfig property
     */
    private java.util.List<PullZoneWafConfigVariableModel> wafEngineConfig;
    /**
     * The wafExecutionMode property
     */
    private Double wafExecutionMode;
    /**
     * The wafLogOnlyRules property
     */
    private java.util.List<String> wafLogOnlyRules;
    /**
     * The wafProfileId property
     */
    private Integer wafProfileId;
    /**
     * The wafRequestHeaderLoggingEnabled property
     */
    private Boolean wafRequestHeaderLoggingEnabled;
    /**
     * The wafRequestIgnoredHeaders property
     */
    private java.util.List<String> wafRequestIgnoredHeaders;
    /**
     * Instantiates a new {@link ShieldZoneResponse} and sets the default values.
     */
    public ShieldZoneResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShieldZoneResponse}
     */
    @jakarta.annotation.Nonnull
    public static ShieldZoneResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShieldZoneResponse();
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
     * Gets the customWafRulesLimit property value. The customWafRulesLimit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCustomWafRulesLimit() {
        return this.customWafRulesLimit;
    }
    /**
     * Gets the dDoSChallengeWindow property value. The dDoSChallengeWindow property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDDoSChallengeWindow() {
        return this.dDoSChallengeWindow;
    }
    /**
     * Gets the dDoSShieldSensitivity property value. The dDoSShieldSensitivity property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDDoSShieldSensitivity() {
        return this.dDoSShieldSensitivity;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("customWafRulesLimit", (n) -> { this.setCustomWafRulesLimit(n.getIntegerValue()); });
        deserializerMap.put("dDoSChallengeWindow", (n) -> { this.setDDoSChallengeWindow(n.getIntegerValue()); });
        deserializerMap.put("dDoSShieldSensitivity", (n) -> { this.setDDoSShieldSensitivity(n.getDoubleValue()); });
        deserializerMap.put("learningMode", (n) -> { this.setLearningMode(n.getBooleanValue()); });
        deserializerMap.put("learningModeUntil", (n) -> { this.setLearningModeUntil(n.getOffsetDateTimeValue()); });
        deserializerMap.put("planType", (n) -> { this.setPlanType(n.getDoubleValue()); });
        deserializerMap.put("pullZoneId", (n) -> { this.setPullZoneId(n.getLongValue()); });
        deserializerMap.put("rateLimitRulesLimit", (n) -> { this.setRateLimitRulesLimit(n.getIntegerValue()); });
        deserializerMap.put("shieldZoneId", (n) -> { this.setShieldZoneId(n.getLongValue()); });
        deserializerMap.put("wafDisabledRuleGroups", (n) -> { this.setWafDisabledRuleGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("wafDisabledRules", (n) -> { this.setWafDisabledRules(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("wafEnabled", (n) -> { this.setWafEnabled(n.getBooleanValue()); });
        deserializerMap.put("wafEngineConfig", (n) -> { this.setWafEngineConfig(n.getCollectionOfObjectValues(PullZoneWafConfigVariableModel::createFromDiscriminatorValue)); });
        deserializerMap.put("wafExecutionMode", (n) -> { this.setWafExecutionMode(n.getDoubleValue()); });
        deserializerMap.put("wafLogOnlyRules", (n) -> { this.setWafLogOnlyRules(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("wafProfileId", (n) -> { this.setWafProfileId(n.getIntegerValue()); });
        deserializerMap.put("wafRequestHeaderLoggingEnabled", (n) -> { this.setWafRequestHeaderLoggingEnabled(n.getBooleanValue()); });
        deserializerMap.put("wafRequestIgnoredHeaders", (n) -> { this.setWafRequestIgnoredHeaders(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the learningMode property value. The learningMode property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLearningMode() {
        return this.learningMode;
    }
    /**
     * Gets the learningModeUntil property value. The learningModeUntil property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLearningModeUntil() {
        return this.learningModeUntil;
    }
    /**
     * Gets the planType property value. The planType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPlanType() {
        return this.planType;
    }
    /**
     * Gets the pullZoneId property value. The pullZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPullZoneId() {
        return this.pullZoneId;
    }
    /**
     * Gets the rateLimitRulesLimit property value. The rateLimitRulesLimit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRateLimitRulesLimit() {
        return this.rateLimitRulesLimit;
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
     * Gets the wafDisabledRuleGroups property value. The wafDisabledRuleGroups property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWafDisabledRuleGroups() {
        return this.wafDisabledRuleGroups;
    }
    /**
     * Gets the wafDisabledRules property value. The wafDisabledRules property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWafDisabledRules() {
        return this.wafDisabledRules;
    }
    /**
     * Gets the wafEnabled property value. The wafEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWafEnabled() {
        return this.wafEnabled;
    }
    /**
     * Gets the wafEngineConfig property value. The wafEngineConfig property
     * @return a {@link java.util.List<PullZoneWafConfigVariableModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PullZoneWafConfigVariableModel> getWafEngineConfig() {
        return this.wafEngineConfig;
    }
    /**
     * Gets the wafExecutionMode property value. The wafExecutionMode property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWafExecutionMode() {
        return this.wafExecutionMode;
    }
    /**
     * Gets the wafLogOnlyRules property value. The wafLogOnlyRules property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWafLogOnlyRules() {
        return this.wafLogOnlyRules;
    }
    /**
     * Gets the wafProfileId property value. The wafProfileId property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWafProfileId() {
        return this.wafProfileId;
    }
    /**
     * Gets the wafRequestHeaderLoggingEnabled property value. The wafRequestHeaderLoggingEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWafRequestHeaderLoggingEnabled() {
        return this.wafRequestHeaderLoggingEnabled;
    }
    /**
     * Gets the wafRequestIgnoredHeaders property value. The wafRequestIgnoredHeaders property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWafRequestIgnoredHeaders() {
        return this.wafRequestIgnoredHeaders;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("customWafRulesLimit", this.getCustomWafRulesLimit());
        writer.writeIntegerValue("dDoSChallengeWindow", this.getDDoSChallengeWindow());
        writer.writeDoubleValue("dDoSShieldSensitivity", this.getDDoSShieldSensitivity());
        writer.writeBooleanValue("learningMode", this.getLearningMode());
        writer.writeOffsetDateTimeValue("learningModeUntil", this.getLearningModeUntil());
        writer.writeDoubleValue("planType", this.getPlanType());
        writer.writeLongValue("pullZoneId", this.getPullZoneId());
        writer.writeIntegerValue("rateLimitRulesLimit", this.getRateLimitRulesLimit());
        writer.writeLongValue("shieldZoneId", this.getShieldZoneId());
        writer.writeCollectionOfPrimitiveValues("wafDisabledRuleGroups", this.getWafDisabledRuleGroups());
        writer.writeCollectionOfPrimitiveValues("wafDisabledRules", this.getWafDisabledRules());
        writer.writeBooleanValue("wafEnabled", this.getWafEnabled());
        writer.writeCollectionOfObjectValues("wafEngineConfig", this.getWafEngineConfig());
        writer.writeDoubleValue("wafExecutionMode", this.getWafExecutionMode());
        writer.writeCollectionOfPrimitiveValues("wafLogOnlyRules", this.getWafLogOnlyRules());
        writer.writeIntegerValue("wafProfileId", this.getWafProfileId());
        writer.writeBooleanValue("wafRequestHeaderLoggingEnabled", this.getWafRequestHeaderLoggingEnabled());
        writer.writeCollectionOfPrimitiveValues("wafRequestIgnoredHeaders", this.getWafRequestIgnoredHeaders());
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
     * Sets the customWafRulesLimit property value. The customWafRulesLimit property
     * @param value Value to set for the customWafRulesLimit property.
     */
    public void setCustomWafRulesLimit(@jakarta.annotation.Nullable final Integer value) {
        this.customWafRulesLimit = value;
    }
    /**
     * Sets the dDoSChallengeWindow property value. The dDoSChallengeWindow property
     * @param value Value to set for the dDoSChallengeWindow property.
     */
    public void setDDoSChallengeWindow(@jakarta.annotation.Nullable final Integer value) {
        this.dDoSChallengeWindow = value;
    }
    /**
     * Sets the dDoSShieldSensitivity property value. The dDoSShieldSensitivity property
     * @param value Value to set for the dDoSShieldSensitivity property.
     */
    public void setDDoSShieldSensitivity(@jakarta.annotation.Nullable final Double value) {
        this.dDoSShieldSensitivity = value;
    }
    /**
     * Sets the learningMode property value. The learningMode property
     * @param value Value to set for the learningMode property.
     */
    public void setLearningMode(@jakarta.annotation.Nullable final Boolean value) {
        this.learningMode = value;
    }
    /**
     * Sets the learningModeUntil property value. The learningModeUntil property
     * @param value Value to set for the learningModeUntil property.
     */
    public void setLearningModeUntil(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.learningModeUntil = value;
    }
    /**
     * Sets the planType property value. The planType property
     * @param value Value to set for the planType property.
     */
    public void setPlanType(@jakarta.annotation.Nullable final Double value) {
        this.planType = value;
    }
    /**
     * Sets the pullZoneId property value. The pullZoneId property
     * @param value Value to set for the pullZoneId property.
     */
    public void setPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.pullZoneId = value;
    }
    /**
     * Sets the rateLimitRulesLimit property value. The rateLimitRulesLimit property
     * @param value Value to set for the rateLimitRulesLimit property.
     */
    public void setRateLimitRulesLimit(@jakarta.annotation.Nullable final Integer value) {
        this.rateLimitRulesLimit = value;
    }
    /**
     * Sets the shieldZoneId property value. The shieldZoneId property
     * @param value Value to set for the shieldZoneId property.
     */
    public void setShieldZoneId(@jakarta.annotation.Nullable final Long value) {
        this.shieldZoneId = value;
    }
    /**
     * Sets the wafDisabledRuleGroups property value. The wafDisabledRuleGroups property
     * @param value Value to set for the wafDisabledRuleGroups property.
     */
    public void setWafDisabledRuleGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.wafDisabledRuleGroups = value;
    }
    /**
     * Sets the wafDisabledRules property value. The wafDisabledRules property
     * @param value Value to set for the wafDisabledRules property.
     */
    public void setWafDisabledRules(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.wafDisabledRules = value;
    }
    /**
     * Sets the wafEnabled property value. The wafEnabled property
     * @param value Value to set for the wafEnabled property.
     */
    public void setWafEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.wafEnabled = value;
    }
    /**
     * Sets the wafEngineConfig property value. The wafEngineConfig property
     * @param value Value to set for the wafEngineConfig property.
     */
    public void setWafEngineConfig(@jakarta.annotation.Nullable final java.util.List<PullZoneWafConfigVariableModel> value) {
        this.wafEngineConfig = value;
    }
    /**
     * Sets the wafExecutionMode property value. The wafExecutionMode property
     * @param value Value to set for the wafExecutionMode property.
     */
    public void setWafExecutionMode(@jakarta.annotation.Nullable final Double value) {
        this.wafExecutionMode = value;
    }
    /**
     * Sets the wafLogOnlyRules property value. The wafLogOnlyRules property
     * @param value Value to set for the wafLogOnlyRules property.
     */
    public void setWafLogOnlyRules(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.wafLogOnlyRules = value;
    }
    /**
     * Sets the wafProfileId property value. The wafProfileId property
     * @param value Value to set for the wafProfileId property.
     */
    public void setWafProfileId(@jakarta.annotation.Nullable final Integer value) {
        this.wafProfileId = value;
    }
    /**
     * Sets the wafRequestHeaderLoggingEnabled property value. The wafRequestHeaderLoggingEnabled property
     * @param value Value to set for the wafRequestHeaderLoggingEnabled property.
     */
    public void setWafRequestHeaderLoggingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.wafRequestHeaderLoggingEnabled = value;
    }
    /**
     * Sets the wafRequestIgnoredHeaders property value. The wafRequestIgnoredHeaders property
     * @param value Value to set for the wafRequestIgnoredHeaders property.
     */
    public void setWafRequestIgnoredHeaders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.wafRequestIgnoredHeaders = value;
    }
}
