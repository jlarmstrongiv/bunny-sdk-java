package bunny.sdk.bunnyapiclient.models.compute;

import bunny.sdk.bunnyapiclient.models.pullzone.PullZone;
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
     * The EdgeScriptVariables property
     */
    private java.util.List<EdgeScriptVariable> edgeScriptVariables;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The LastModified property
     */
    private OffsetDateTime lastModified;
    /**
     * The LinkedPullZones property
     */
    private java.util.List<PullZone> linkedPullZones;
    /**
     * The Name property
     */
    private String name;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("CurrentReleaseId", (n) -> { this.setCurrentReleaseId(n.getLongValue()); });
        deserializerMap.put("DefaultHostname", (n) -> { this.setDefaultHostname(n.getStringValue()); });
        deserializerMap.put("Deleted", (n) -> { this.setDeleted(n.getBooleanValue()); });
        deserializerMap.put("EdgeScriptVariables", (n) -> { this.setEdgeScriptVariables(n.getCollectionOfObjectValues(EdgeScriptVariable::createFromDiscriminatorValue)); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("LastModified", (n) -> { this.setLastModified(n.getOffsetDateTimeValue()); });
        deserializerMap.put("LinkedPullZones", (n) -> { this.setLinkedPullZones(n.getCollectionOfObjectValues(PullZone::createFromDiscriminatorValue)); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
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
     * Gets the LastModified property value. The LastModified property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }
    /**
     * Gets the LinkedPullZones property value. The LinkedPullZones property
     * @return a {@link java.util.List<PullZone>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PullZone> getLinkedPullZones() {
        return this.linkedPullZones;
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
    public void setLinkedPullZones(@jakarta.annotation.Nullable final java.util.List<PullZone> value) {
        this.linkedPullZones = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
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
