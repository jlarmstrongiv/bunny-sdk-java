package bunny.sdk.generated.bunnyapiclient.models.dnszone.updatednsrecord;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The template for adding optional properties.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OptionalParameters implements AdditionalDataHolder, Parsable {
    /**
     * The Accelerated property
     */
    private Boolean accelerated;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Comment property
     */
    private String comment;
    /**
     * The Disabled property
     */
    private Boolean disabled;
    /**
     * The EnviromentalVariables property
     */
    private java.util.List<OptionalParametersEnviromentalVariables> enviromentalVariables;
    /**
     * The Flags property
     */
    private Integer flags;
    /**
     * The GeolocationLatitude property
     */
    private Double geolocationLatitude;
    /**
     * The GeolocationLongitude property
     */
    private Double geolocationLongitude;
    /**
     * The LatencyZone property
     */
    private String latencyZone;
    /**
     * The MonitorType property
     */
    private Double monitorType;
    /**
     * The Port property
     */
    private Integer port;
    /**
     * The Priority property
     */
    private Integer priority;
    /**
     * The PullZoneId property
     */
    private Long pullZoneId;
    /**
     * The ScriptId property
     */
    private Long scriptId;
    /**
     * The SmartRoutingType property
     */
    private Double smartRoutingType;
    /**
     * The Tag property
     */
    private String tag;
    /**
     * The Ttl property
     */
    private Double ttl;
    /**
     * The Weight property
     */
    private Integer weight;
    /**
     * Instantiates a new {@link OptionalParameters} and sets the default values.
     */
    public OptionalParameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OptionalParameters}
     */
    @jakarta.annotation.Nonnull
    public static OptionalParameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OptionalParameters();
    }
    /**
     * Gets the Accelerated property value. The Accelerated property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAccelerated() {
        return this.accelerated;
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
     * Gets the Comment property value. The Comment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * Gets the Disabled property value. The Disabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Gets the EnviromentalVariables property value. The EnviromentalVariables property
     * @return a {@link java.util.List<OptionalParametersEnviromentalVariables>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OptionalParametersEnviromentalVariables> getEnviromentalVariables() {
        return this.enviromentalVariables;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("Accelerated", (n) -> { this.setAccelerated(n.getBooleanValue()); });
        deserializerMap.put("Comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("Disabled", (n) -> { this.setDisabled(n.getBooleanValue()); });
        deserializerMap.put("EnviromentalVariables", (n) -> { this.setEnviromentalVariables(n.getCollectionOfObjectValues(OptionalParametersEnviromentalVariables::createFromDiscriminatorValue)); });
        deserializerMap.put("Flags", (n) -> { this.setFlags(n.getIntegerValue()); });
        deserializerMap.put("GeolocationLatitude", (n) -> { this.setGeolocationLatitude(n.getDoubleValue()); });
        deserializerMap.put("GeolocationLongitude", (n) -> { this.setGeolocationLongitude(n.getDoubleValue()); });
        deserializerMap.put("LatencyZone", (n) -> { this.setLatencyZone(n.getStringValue()); });
        deserializerMap.put("MonitorType", (n) -> { this.setMonitorType(n.getDoubleValue()); });
        deserializerMap.put("Port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("Priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("PullZoneId", (n) -> { this.setPullZoneId(n.getLongValue()); });
        deserializerMap.put("ScriptId", (n) -> { this.setScriptId(n.getLongValue()); });
        deserializerMap.put("SmartRoutingType", (n) -> { this.setSmartRoutingType(n.getDoubleValue()); });
        deserializerMap.put("Tag", (n) -> { this.setTag(n.getStringValue()); });
        deserializerMap.put("Ttl", (n) -> { this.setTtl(n.getDoubleValue()); });
        deserializerMap.put("Weight", (n) -> { this.setWeight(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Flags property value. The Flags property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFlags() {
        return this.flags;
    }
    /**
     * Gets the GeolocationLatitude property value. The GeolocationLatitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getGeolocationLatitude() {
        return this.geolocationLatitude;
    }
    /**
     * Gets the GeolocationLongitude property value. The GeolocationLongitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getGeolocationLongitude() {
        return this.geolocationLongitude;
    }
    /**
     * Gets the LatencyZone property value. The LatencyZone property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLatencyZone() {
        return this.latencyZone;
    }
    /**
     * Gets the MonitorType property value. The MonitorType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonitorType() {
        return this.monitorType;
    }
    /**
     * Gets the Port property value. The Port property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the Priority property value. The Priority property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the PullZoneId property value. The PullZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPullZoneId() {
        return this.pullZoneId;
    }
    /**
     * Gets the ScriptId property value. The ScriptId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getScriptId() {
        return this.scriptId;
    }
    /**
     * Gets the SmartRoutingType property value. The SmartRoutingType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSmartRoutingType() {
        return this.smartRoutingType;
    }
    /**
     * Gets the Tag property value. The Tag property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTag() {
        return this.tag;
    }
    /**
     * Gets the Ttl property value. The Ttl property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTtl() {
        return this.ttl;
    }
    /**
     * Gets the Weight property value. The Weight property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("Accelerated", this.getAccelerated());
        writer.writeStringValue("Comment", this.getComment());
        writer.writeBooleanValue("Disabled", this.getDisabled());
        writer.writeCollectionOfObjectValues("EnviromentalVariables", this.getEnviromentalVariables());
        writer.writeIntegerValue("Flags", this.getFlags());
        writer.writeDoubleValue("GeolocationLatitude", this.getGeolocationLatitude());
        writer.writeDoubleValue("GeolocationLongitude", this.getGeolocationLongitude());
        writer.writeStringValue("LatencyZone", this.getLatencyZone());
        writer.writeDoubleValue("MonitorType", this.getMonitorType());
        writer.writeIntegerValue("Port", this.getPort());
        writer.writeIntegerValue("Priority", this.getPriority());
        writer.writeLongValue("PullZoneId", this.getPullZoneId());
        writer.writeLongValue("ScriptId", this.getScriptId());
        writer.writeDoubleValue("SmartRoutingType", this.getSmartRoutingType());
        writer.writeStringValue("Tag", this.getTag());
        writer.writeDoubleValue("Ttl", this.getTtl());
        writer.writeIntegerValue("Weight", this.getWeight());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the Accelerated property value. The Accelerated property
     * @param value Value to set for the Accelerated property.
     */
    public void setAccelerated(@jakarta.annotation.Nullable final Boolean value) {
        this.accelerated = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the Comment property value. The Comment property
     * @param value Value to set for the Comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the Disabled property value. The Disabled property
     * @param value Value to set for the Disabled property.
     */
    public void setDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.disabled = value;
    }
    /**
     * Sets the EnviromentalVariables property value. The EnviromentalVariables property
     * @param value Value to set for the EnviromentalVariables property.
     */
    public void setEnviromentalVariables(@jakarta.annotation.Nullable final java.util.List<OptionalParametersEnviromentalVariables> value) {
        this.enviromentalVariables = value;
    }
    /**
     * Sets the Flags property value. The Flags property
     * @param value Value to set for the Flags property.
     */
    public void setFlags(@jakarta.annotation.Nullable final Integer value) {
        this.flags = value;
    }
    /**
     * Sets the GeolocationLatitude property value. The GeolocationLatitude property
     * @param value Value to set for the GeolocationLatitude property.
     */
    public void setGeolocationLatitude(@jakarta.annotation.Nullable final Double value) {
        this.geolocationLatitude = value;
    }
    /**
     * Sets the GeolocationLongitude property value. The GeolocationLongitude property
     * @param value Value to set for the GeolocationLongitude property.
     */
    public void setGeolocationLongitude(@jakarta.annotation.Nullable final Double value) {
        this.geolocationLongitude = value;
    }
    /**
     * Sets the LatencyZone property value. The LatencyZone property
     * @param value Value to set for the LatencyZone property.
     */
    public void setLatencyZone(@jakarta.annotation.Nullable final String value) {
        this.latencyZone = value;
    }
    /**
     * Sets the MonitorType property value. The MonitorType property
     * @param value Value to set for the MonitorType property.
     */
    public void setMonitorType(@jakarta.annotation.Nullable final Double value) {
        this.monitorType = value;
    }
    /**
     * Sets the Port property value. The Port property
     * @param value Value to set for the Port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the Priority property value. The Priority property
     * @param value Value to set for the Priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the PullZoneId property value. The PullZoneId property
     * @param value Value to set for the PullZoneId property.
     */
    public void setPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.pullZoneId = value;
    }
    /**
     * Sets the ScriptId property value. The ScriptId property
     * @param value Value to set for the ScriptId property.
     */
    public void setScriptId(@jakarta.annotation.Nullable final Long value) {
        this.scriptId = value;
    }
    /**
     * Sets the SmartRoutingType property value. The SmartRoutingType property
     * @param value Value to set for the SmartRoutingType property.
     */
    public void setSmartRoutingType(@jakarta.annotation.Nullable final Double value) {
        this.smartRoutingType = value;
    }
    /**
     * Sets the Tag property value. The Tag property
     * @param value Value to set for the Tag property.
     */
    public void setTag(@jakarta.annotation.Nullable final String value) {
        this.tag = value;
    }
    /**
     * Sets the Ttl property value. The Ttl property
     * @param value Value to set for the Ttl property.
     */
    public void setTtl(@jakarta.annotation.Nullable final Double value) {
        this.ttl = value;
    }
    /**
     * Sets the Weight property value. The Weight property
     * @param value Value to set for the Weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Integer value) {
        this.weight = value;
    }
}
