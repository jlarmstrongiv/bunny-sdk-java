package bunny.sdk.generated.bunnyapiclient.models.storagezone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorageZoneCreate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Custom404FilePath property
     */
    private String custom404FilePath;
    /**
     * The Name property
     */
    private String name;
    /**
     * The OriginUrl property
     */
    private String originUrl;
    /**
     * The Region property
     */
    private StandardRegions region;
    /**
     * The ReplicationRegions property
     */
    private java.util.List<EdgeReplicationRegions> replicationRegions;
    /**
     * The Rewrite404To200 property
     */
    private Boolean rewrite404To200;
    /**
     * The ZoneTier property
     */
    private Double zoneTier;
    /**
     * Instantiates a new {@link StorageZoneCreate} and sets the default values.
     */
    public StorageZoneCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StorageZoneCreate}
     */
    @jakarta.annotation.Nonnull
    public static StorageZoneCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StorageZoneCreate();
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
     * Gets the Custom404FilePath property value. The Custom404FilePath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustom404FilePath() {
        return this.custom404FilePath;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("Custom404FilePath", (n) -> { this.setCustom404FilePath(n.getStringValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("OriginUrl", (n) -> { this.setOriginUrl(n.getStringValue()); });
        deserializerMap.put("Region", (n) -> { this.setRegion(n.getEnumValue(StandardRegions::forValue)); });
        deserializerMap.put("ReplicationRegions", (n) -> { this.setReplicationRegions(n.getCollectionOfEnumValues(EdgeReplicationRegions::forValue)); });
        deserializerMap.put("Rewrite404To200", (n) -> { this.setRewrite404To200(n.getBooleanValue()); });
        deserializerMap.put("ZoneTier", (n) -> { this.setZoneTier(n.getDoubleValue()); });
        return deserializerMap;
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
     * Gets the OriginUrl property value. The OriginUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginUrl() {
        return this.originUrl;
    }
    /**
     * Gets the Region property value. The Region property
     * @return a {@link StandardRegions}
     */
    @jakarta.annotation.Nullable
    public StandardRegions getRegion() {
        return this.region;
    }
    /**
     * Gets the ReplicationRegions property value. The ReplicationRegions property
     * @return a {@link java.util.List<EdgeReplicationRegions>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdgeReplicationRegions> getReplicationRegions() {
        return this.replicationRegions;
    }
    /**
     * Gets the Rewrite404To200 property value. The Rewrite404To200 property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRewrite404To200() {
        return this.rewrite404To200;
    }
    /**
     * Gets the ZoneTier property value. The ZoneTier property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getZoneTier() {
        return this.zoneTier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Custom404FilePath", this.getCustom404FilePath());
        writer.writeStringValue("Name", this.getName());
        writer.writeStringValue("OriginUrl", this.getOriginUrl());
        writer.writeEnumValue("Region", this.getRegion());
        writer.writeCollectionOfEnumValues("ReplicationRegions", this.getReplicationRegions());
        writer.writeBooleanValue("Rewrite404To200", this.getRewrite404To200());
        writer.writeDoubleValue("ZoneTier", this.getZoneTier());
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
     * Sets the Custom404FilePath property value. The Custom404FilePath property
     * @param value Value to set for the Custom404FilePath property.
     */
    public void setCustom404FilePath(@jakarta.annotation.Nullable final String value) {
        this.custom404FilePath = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the OriginUrl property value. The OriginUrl property
     * @param value Value to set for the OriginUrl property.
     */
    public void setOriginUrl(@jakarta.annotation.Nullable final String value) {
        this.originUrl = value;
    }
    /**
     * Sets the Region property value. The Region property
     * @param value Value to set for the Region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final StandardRegions value) {
        this.region = value;
    }
    /**
     * Sets the ReplicationRegions property value. The ReplicationRegions property
     * @param value Value to set for the ReplicationRegions property.
     */
    public void setReplicationRegions(@jakarta.annotation.Nullable final java.util.List<EdgeReplicationRegions> value) {
        this.replicationRegions = value;
    }
    /**
     * Sets the Rewrite404To200 property value. The Rewrite404To200 property
     * @param value Value to set for the Rewrite404To200 property.
     */
    public void setRewrite404To200(@jakarta.annotation.Nullable final Boolean value) {
        this.rewrite404To200 = value;
    }
    /**
     * Sets the ZoneTier property value. The ZoneTier property
     * @param value Value to set for the ZoneTier property.
     */
    public void setZoneTier(@jakarta.annotation.Nullable final Double value) {
        this.zoneTier = value;
    }
}
