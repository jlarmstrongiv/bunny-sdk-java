package bunny.sdk.bunnyapiclient.models.dnszone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsRecord implements AdditionalDataHolder, Parsable {
    /**
     * The Accelerated property
     */
    private Boolean accelerated;
    /**
     * The AcceleratedPullZoneId property
     */
    private Long acceleratedPullZoneId;
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
    private java.util.List<DnsRecordEnviromentalVariables> enviromentalVariables;
    /**
     * The Flags property
     */
    private Integer flags;
    /**
     * The GeolocationInfo property
     */
    private DnsRecordGeolocationInfo geolocationInfo;
    /**
     * The GeolocationLatitude property
     */
    private Double geolocationLatitude;
    /**
     * The GeolocationLongitude property
     */
    private Double geolocationLongitude;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The IPGeoLocationInfo property
     */
    private DnsRecordIPGeoLocationInfo iPGeoLocationInfo;
    /**
     * The LatencyZone property
     */
    private String latencyZone;
    /**
     * The LinkName property
     */
    private String linkName;
    /**
     * The MonitorStatus property
     */
    private Double monitorStatus;
    /**
     * The MonitorType property
     */
    private Double monitorType;
    /**
     * The Name property
     */
    private String name;
    /**
     * The Port property
     */
    private Integer port;
    /**
     * The Priority property
     */
    private Integer priority;
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
     * The Type property
     */
    private Double type;
    /**
     * The Value property
     */
    private String value;
    /**
     * The Weight property
     */
    private Integer weight;
    /**
     * Instantiates a new {@link DnsRecord} and sets the default values.
     */
    public DnsRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DnsRecord}
     */
    @jakarta.annotation.Nonnull
    public static DnsRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsRecord();
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
     * Gets the AcceleratedPullZoneId property value. The AcceleratedPullZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAcceleratedPullZoneId() {
        return this.acceleratedPullZoneId;
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
     * @return a {@link java.util.List<DnsRecordEnviromentalVariables>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DnsRecordEnviromentalVariables> getEnviromentalVariables() {
        return this.enviromentalVariables;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("Accelerated", (n) -> { this.setAccelerated(n.getBooleanValue()); });
        deserializerMap.put("AcceleratedPullZoneId", (n) -> { this.setAcceleratedPullZoneId(n.getLongValue()); });
        deserializerMap.put("Comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("Disabled", (n) -> { this.setDisabled(n.getBooleanValue()); });
        deserializerMap.put("EnviromentalVariables", (n) -> { this.setEnviromentalVariables(n.getCollectionOfObjectValues(DnsRecordEnviromentalVariables::createFromDiscriminatorValue)); });
        deserializerMap.put("Flags", (n) -> { this.setFlags(n.getIntegerValue()); });
        deserializerMap.put("GeolocationInfo", (n) -> { this.setGeolocationInfo(n.getObjectValue(DnsRecordGeolocationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("GeolocationLatitude", (n) -> { this.setGeolocationLatitude(n.getDoubleValue()); });
        deserializerMap.put("GeolocationLongitude", (n) -> { this.setGeolocationLongitude(n.getDoubleValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("IPGeoLocationInfo", (n) -> { this.setIPGeoLocationInfo(n.getObjectValue(DnsRecordIPGeoLocationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("LatencyZone", (n) -> { this.setLatencyZone(n.getStringValue()); });
        deserializerMap.put("LinkName", (n) -> { this.setLinkName(n.getStringValue()); });
        deserializerMap.put("MonitorStatus", (n) -> { this.setMonitorStatus(n.getDoubleValue()); });
        deserializerMap.put("MonitorType", (n) -> { this.setMonitorType(n.getDoubleValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("Port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("Priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("SmartRoutingType", (n) -> { this.setSmartRoutingType(n.getDoubleValue()); });
        deserializerMap.put("Tag", (n) -> { this.setTag(n.getStringValue()); });
        deserializerMap.put("Ttl", (n) -> { this.setTtl(n.getDoubleValue()); });
        deserializerMap.put("Type", (n) -> { this.setType(n.getDoubleValue()); });
        deserializerMap.put("Value", (n) -> { this.setValue(n.getStringValue()); });
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
     * Gets the GeolocationInfo property value. The GeolocationInfo property
     * @return a {@link DnsRecordGeolocationInfo}
     */
    @jakarta.annotation.Nullable
    public DnsRecordGeolocationInfo getGeolocationInfo() {
        return this.geolocationInfo;
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
     * Gets the Id property value. The Id property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the IPGeoLocationInfo property value. The IPGeoLocationInfo property
     * @return a {@link DnsRecordIPGeoLocationInfo}
     */
    @jakarta.annotation.Nullable
    public DnsRecordIPGeoLocationInfo getIPGeoLocationInfo() {
        return this.iPGeoLocationInfo;
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
     * Gets the LinkName property value. The LinkName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkName() {
        return this.linkName;
    }
    /**
     * Gets the MonitorStatus property value. The MonitorStatus property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonitorStatus() {
        return this.monitorStatus;
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
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the Type property value. The Type property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getType() {
        return this.type;
    }
    /**
     * Gets the Value property value. The Value property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
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
        writer.writeStringValue("Name", this.getName());
        writer.writeIntegerValue("Port", this.getPort());
        writer.writeIntegerValue("Priority", this.getPriority());
        writer.writeDoubleValue("SmartRoutingType", this.getSmartRoutingType());
        writer.writeStringValue("Tag", this.getTag());
        writer.writeDoubleValue("Ttl", this.getTtl());
        writer.writeDoubleValue("Type", this.getType());
        writer.writeStringValue("Value", this.getValue());
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
     * Sets the AcceleratedPullZoneId property value. The AcceleratedPullZoneId property
     * @param value Value to set for the AcceleratedPullZoneId property.
     */
    public void setAcceleratedPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.acceleratedPullZoneId = value;
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
    public void setEnviromentalVariables(@jakarta.annotation.Nullable final java.util.List<DnsRecordEnviromentalVariables> value) {
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
     * Sets the GeolocationInfo property value. The GeolocationInfo property
     * @param value Value to set for the GeolocationInfo property.
     */
    public void setGeolocationInfo(@jakarta.annotation.Nullable final DnsRecordGeolocationInfo value) {
        this.geolocationInfo = value;
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
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the IPGeoLocationInfo property value. The IPGeoLocationInfo property
     * @param value Value to set for the IPGeoLocationInfo property.
     */
    public void setIPGeoLocationInfo(@jakarta.annotation.Nullable final DnsRecordIPGeoLocationInfo value) {
        this.iPGeoLocationInfo = value;
    }
    /**
     * Sets the LatencyZone property value. The LatencyZone property
     * @param value Value to set for the LatencyZone property.
     */
    public void setLatencyZone(@jakarta.annotation.Nullable final String value) {
        this.latencyZone = value;
    }
    /**
     * Sets the LinkName property value. The LinkName property
     * @param value Value to set for the LinkName property.
     */
    public void setLinkName(@jakarta.annotation.Nullable final String value) {
        this.linkName = value;
    }
    /**
     * Sets the MonitorStatus property value. The MonitorStatus property
     * @param value Value to set for the MonitorStatus property.
     */
    public void setMonitorStatus(@jakarta.annotation.Nullable final Double value) {
        this.monitorStatus = value;
    }
    /**
     * Sets the MonitorType property value. The MonitorType property
     * @param value Value to set for the MonitorType property.
     */
    public void setMonitorType(@jakarta.annotation.Nullable final Double value) {
        this.monitorType = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the Type property value. The Type property
     * @param value Value to set for the Type property.
     */
    public void setType(@jakarta.annotation.Nullable final Double value) {
        this.type = value;
    }
    /**
     * Sets the Value property value. The Value property
     * @param value Value to set for the Value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
    /**
     * Sets the Weight property value. The Weight property
     * @param value Value to set for the Weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Integer value) {
        this.weight = value;
    }
}
