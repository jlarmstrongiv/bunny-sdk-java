package bunny.sdk.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Script implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CurrentReleaseId property
     */
    private Long currentReleaseId;
    /**
     * The DefaultHostname property
     */
    private String defaultHostname;
    /**
     * The Deleted property
     */
    private Boolean deleted;
    /**
     * The DeploymentKey property
     */
    private String deploymentKey;
    /**
     * The EdgeScriptVariables property
     */
    private java.util.List<EdgeScriptVariable> edgeScriptVariables;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Integration property
     */
    private Integration integration;
    /**
     * The IntegrationId property
     */
    private Long integrationId;
    /**
     * The LastModified property
     */
    private OffsetDateTime lastModified;
    /**
     * The LinkedPullZones property
     */
    private java.util.List<LinkedPullZone> linkedPullZones;
    /**
     * The MonthlyCost property
     */
    private Double monthlyCost;
    /**
     * The MonthlyCpuTime property
     */
    private Integer monthlyCpuTime;
    /**
     * The MonthlyRequestCount property
     */
    private Integer monthlyRequestCount;
    /**
     * The Name property
     */
    private String name;
    /**
     * The RepositoryId property
     */
    private Long repositoryId;
    /**
     * The ScriptType property
     */
    private Double scriptType;
    /**
     * The SystemHostname property
     */
    private String systemHostname;
    /**
     * Instantiates a new {@link Script} and sets the default values.
     */
    public Script() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Script}
     */
    @jakarta.annotation.Nonnull
    public static Script createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Script();
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
     * Gets the CurrentReleaseId property value. The CurrentReleaseId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCurrentReleaseId() {
        return this.currentReleaseId;
    }
    /**
     * Gets the DefaultHostname property value. The DefaultHostname property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Gets the Deleted property value. The Deleted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeleted() {
        return this.deleted;
    }
    /**
     * Gets the DeploymentKey property value. The DeploymentKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeploymentKey() {
        return this.deploymentKey;
    }
    /**
     * Gets the EdgeScriptVariables property value. The EdgeScriptVariables property
     * @return a {@link java.util.List<EdgeScriptVariable>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdgeScriptVariable> getEdgeScriptVariables() {
        return this.edgeScriptVariables;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("CurrentReleaseId", (n) -> { this.setCurrentReleaseId(n.getLongValue()); });
        deserializerMap.put("DefaultHostname", (n) -> { this.setDefaultHostname(n.getStringValue()); });
        deserializerMap.put("Deleted", (n) -> { this.setDeleted(n.getBooleanValue()); });
        deserializerMap.put("DeploymentKey", (n) -> { this.setDeploymentKey(n.getStringValue()); });
        deserializerMap.put("EdgeScriptVariables", (n) -> { this.setEdgeScriptVariables(n.getCollectionOfObjectValues(EdgeScriptVariable::createFromDiscriminatorValue)); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Integration", (n) -> { this.setIntegration(n.getObjectValue(Integration::createFromDiscriminatorValue)); });
        deserializerMap.put("IntegrationId", (n) -> { this.setIntegrationId(n.getLongValue()); });
        deserializerMap.put("LastModified", (n) -> { this.setLastModified(n.getOffsetDateTimeValue()); });
        deserializerMap.put("LinkedPullZones", (n) -> { this.setLinkedPullZones(n.getCollectionOfObjectValues(LinkedPullZone::createFromDiscriminatorValue)); });
        deserializerMap.put("MonthlyCost", (n) -> { this.setMonthlyCost(n.getDoubleValue()); });
        deserializerMap.put("MonthlyCpuTime", (n) -> { this.setMonthlyCpuTime(n.getIntegerValue()); });
        deserializerMap.put("MonthlyRequestCount", (n) -> { this.setMonthlyRequestCount(n.getIntegerValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("RepositoryId", (n) -> { this.setRepositoryId(n.getLongValue()); });
        deserializerMap.put("ScriptType", (n) -> { this.setScriptType(n.getDoubleValue()); });
        deserializerMap.put("SystemHostname", (n) -> { this.setSystemHostname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Id property value. The Id property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the Integration property value. The Integration property
     * @return a {@link Integration}
     */
    @jakarta.annotation.Nullable
    public Integration getIntegration() {
        return this.integration;
    }
    /**
     * Gets the IntegrationId property value. The IntegrationId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIntegrationId() {
        return this.integrationId;
    }
    /**
     * Gets the LastModified property value. The LastModified property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }
    /**
     * Gets the LinkedPullZones property value. The LinkedPullZones property
     * @return a {@link java.util.List<LinkedPullZone>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LinkedPullZone> getLinkedPullZones() {
        return this.linkedPullZones;
    }
    /**
     * Gets the MonthlyCost property value. The MonthlyCost property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlyCost() {
        return this.monthlyCost;
    }
    /**
     * Gets the MonthlyCpuTime property value. The MonthlyCpuTime property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMonthlyCpuTime() {
        return this.monthlyCpuTime;
    }
    /**
     * Gets the MonthlyRequestCount property value. The MonthlyRequestCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMonthlyRequestCount() {
        return this.monthlyRequestCount;
    }
    /**
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the RepositoryId property value. The RepositoryId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRepositoryId() {
        return this.repositoryId;
    }
    /**
     * Gets the ScriptType property value. The ScriptType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getScriptType() {
        return this.scriptType;
    }
    /**
     * Gets the SystemHostname property value. The SystemHostname property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSystemHostname() {
        return this.systemHostname;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("Integration", this.getIntegration());
        writer.writeStringValue("Name", this.getName());
        writer.writeDoubleValue("ScriptType", this.getScriptType());
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
     * Sets the CurrentReleaseId property value. The CurrentReleaseId property
     * @param value Value to set for the CurrentReleaseId property.
     */
    public void setCurrentReleaseId(@jakarta.annotation.Nullable final Long value) {
        this.currentReleaseId = value;
    }
    /**
     * Sets the DefaultHostname property value. The DefaultHostname property
     * @param value Value to set for the DefaultHostname property.
     */
    public void setDefaultHostname(@jakarta.annotation.Nullable final String value) {
        this.defaultHostname = value;
    }
    /**
     * Sets the Deleted property value. The Deleted property
     * @param value Value to set for the Deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.deleted = value;
    }
    /**
     * Sets the DeploymentKey property value. The DeploymentKey property
     * @param value Value to set for the DeploymentKey property.
     */
    public void setDeploymentKey(@jakarta.annotation.Nullable final String value) {
        this.deploymentKey = value;
    }
    /**
     * Sets the EdgeScriptVariables property value. The EdgeScriptVariables property
     * @param value Value to set for the EdgeScriptVariables property.
     */
    public void setEdgeScriptVariables(@jakarta.annotation.Nullable final java.util.List<EdgeScriptVariable> value) {
        this.edgeScriptVariables = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Integration property value. The Integration property
     * @param value Value to set for the Integration property.
     */
    public void setIntegration(@jakarta.annotation.Nullable final Integration value) {
        this.integration = value;
    }
    /**
     * Sets the IntegrationId property value. The IntegrationId property
     * @param value Value to set for the IntegrationId property.
     */
    public void setIntegrationId(@jakarta.annotation.Nullable final Long value) {
        this.integrationId = value;
    }
    /**
     * Sets the LastModified property value. The LastModified property
     * @param value Value to set for the LastModified property.
     */
    public void setLastModified(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModified = value;
    }
    /**
     * Sets the LinkedPullZones property value. The LinkedPullZones property
     * @param value Value to set for the LinkedPullZones property.
     */
    public void setLinkedPullZones(@jakarta.annotation.Nullable final java.util.List<LinkedPullZone> value) {
        this.linkedPullZones = value;
    }
    /**
     * Sets the MonthlyCost property value. The MonthlyCost property
     * @param value Value to set for the MonthlyCost property.
     */
    public void setMonthlyCost(@jakarta.annotation.Nullable final Double value) {
        this.monthlyCost = value;
    }
    /**
     * Sets the MonthlyCpuTime property value. The MonthlyCpuTime property
     * @param value Value to set for the MonthlyCpuTime property.
     */
    public void setMonthlyCpuTime(@jakarta.annotation.Nullable final Integer value) {
        this.monthlyCpuTime = value;
    }
    /**
     * Sets the MonthlyRequestCount property value. The MonthlyRequestCount property
     * @param value Value to set for the MonthlyRequestCount property.
     */
    public void setMonthlyRequestCount(@jakarta.annotation.Nullable final Integer value) {
        this.monthlyRequestCount = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the RepositoryId property value. The RepositoryId property
     * @param value Value to set for the RepositoryId property.
     */
    public void setRepositoryId(@jakarta.annotation.Nullable final Long value) {
        this.repositoryId = value;
    }
    /**
     * Sets the ScriptType property value. The ScriptType property
     * @param value Value to set for the ScriptType property.
     */
    public void setScriptType(@jakarta.annotation.Nullable final Double value) {
        this.scriptType = value;
    }
    /**
     * Sets the SystemHostname property value. The SystemHostname property
     * @param value Value to set for the SystemHostname property.
     */
    public void setSystemHostname(@jakarta.annotation.Nullable final String value) {
        this.systemHostname = value;
    }
}
