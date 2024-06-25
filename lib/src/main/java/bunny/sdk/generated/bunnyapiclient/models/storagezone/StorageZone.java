package bunny.sdk.generated.bunnyapiclient.models.storagezone;

import bunny.sdk.generated.bunnyapiclient.models.pullzone.PullZone;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorageZone implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Custom404FilePath property
     */
    private String custom404FilePath;
    /**
     * The DateModified property
     */
    private OffsetDateTime dateModified;
    /**
     * The Deleted property
     */
    private Boolean deleted;
    /**
     * The Discount property
     */
    private Integer discount;
    /**
     * The FilesStored property
     */
    private Long filesStored;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Name property
     */
    private String name;
    /**
     * The Password property
     */
    private String password;
    /**
     * The PriceOverride property
     */
    private Double priceOverride;
    /**
     * The PullZones property
     */
    private java.util.List<PullZone> pullZones;
    /**
     * The ReadOnlyPassword property
     */
    private String readOnlyPassword;
    /**
     * The Region property
     */
    private StandardRegions region;
    /**
     * The ReplicationChangeInProgress property
     */
    private Boolean replicationChangeInProgress;
    /**
     * The ReplicationRegions property
     */
    private java.util.List<EdgeReplicationRegions> replicationRegions;
    /**
     * The Rewrite404To200 property
     */
    private Boolean rewrite404To200;
    /**
     * The StorageHostname property
     */
    private String storageHostname;
    /**
     * The StorageUsed property
     */
    private Long storageUsed;
    /**
     * The UserId property
     */
    private String userId;
    /**
     * The ZoneTier property
     */
    private Double zoneTier;
    /**
     * Instantiates a new {@link StorageZone} and sets the default values.
     */
    public StorageZone() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StorageZone}
     */
    @jakarta.annotation.Nonnull
    public static StorageZone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StorageZone();
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
     * Gets the DateModified property value. The DateModified property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateModified() {
        return this.dateModified;
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
     * Gets the Discount property value. The Discount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDiscount() {
        return this.discount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("Custom404FilePath", (n) -> { this.setCustom404FilePath(n.getStringValue()); });
        deserializerMap.put("DateModified", (n) -> { this.setDateModified(n.getOffsetDateTimeValue()); });
        deserializerMap.put("Deleted", (n) -> { this.setDeleted(n.getBooleanValue()); });
        deserializerMap.put("Discount", (n) -> { this.setDiscount(n.getIntegerValue()); });
        deserializerMap.put("FilesStored", (n) -> { this.setFilesStored(n.getLongValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("Password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("PriceOverride", (n) -> { this.setPriceOverride(n.getDoubleValue()); });
        deserializerMap.put("PullZones", (n) -> { this.setPullZones(n.getCollectionOfObjectValues(PullZone::createFromDiscriminatorValue)); });
        deserializerMap.put("ReadOnlyPassword", (n) -> { this.setReadOnlyPassword(n.getStringValue()); });
        deserializerMap.put("Region", (n) -> { this.setRegion(n.getEnumValue(StandardRegions::forValue)); });
        deserializerMap.put("ReplicationChangeInProgress", (n) -> { this.setReplicationChangeInProgress(n.getBooleanValue()); });
        deserializerMap.put("ReplicationRegions", (n) -> { this.setReplicationRegions(n.getCollectionOfEnumValues(EdgeReplicationRegions::forValue)); });
        deserializerMap.put("Rewrite404To200", (n) -> { this.setRewrite404To200(n.getBooleanValue()); });
        deserializerMap.put("StorageHostname", (n) -> { this.setStorageHostname(n.getStringValue()); });
        deserializerMap.put("StorageUsed", (n) -> { this.setStorageUsed(n.getLongValue()); });
        deserializerMap.put("UserId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("ZoneTier", (n) -> { this.setZoneTier(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FilesStored property value. The FilesStored property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFilesStored() {
        return this.filesStored;
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
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the Password property value. The Password property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the PriceOverride property value. The PriceOverride property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPriceOverride() {
        return this.priceOverride;
    }
    /**
     * Gets the PullZones property value. The PullZones property
     * @return a {@link java.util.List<PullZone>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PullZone> getPullZones() {
        return this.pullZones;
    }
    /**
     * Gets the ReadOnlyPassword property value. The ReadOnlyPassword property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReadOnlyPassword() {
        return this.readOnlyPassword;
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
     * Gets the ReplicationChangeInProgress property value. The ReplicationChangeInProgress property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReplicationChangeInProgress() {
        return this.replicationChangeInProgress;
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
     * Gets the StorageHostname property value. The StorageHostname property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageHostname() {
        return this.storageHostname;
    }
    /**
     * Gets the StorageUsed property value. The StorageUsed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageUsed() {
        return this.storageUsed;
    }
    /**
     * Gets the UserId property value. The UserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
     * Sets the DateModified property value. The DateModified property
     * @param value Value to set for the DateModified property.
     */
    public void setDateModified(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateModified = value;
    }
    /**
     * Sets the Deleted property value. The Deleted property
     * @param value Value to set for the Deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.deleted = value;
    }
    /**
     * Sets the Discount property value. The Discount property
     * @param value Value to set for the Discount property.
     */
    public void setDiscount(@jakarta.annotation.Nullable final Integer value) {
        this.discount = value;
    }
    /**
     * Sets the FilesStored property value. The FilesStored property
     * @param value Value to set for the FilesStored property.
     */
    public void setFilesStored(@jakarta.annotation.Nullable final Long value) {
        this.filesStored = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the Password property value. The Password property
     * @param value Value to set for the Password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the PriceOverride property value. The PriceOverride property
     * @param value Value to set for the PriceOverride property.
     */
    public void setPriceOverride(@jakarta.annotation.Nullable final Double value) {
        this.priceOverride = value;
    }
    /**
     * Sets the PullZones property value. The PullZones property
     * @param value Value to set for the PullZones property.
     */
    public void setPullZones(@jakarta.annotation.Nullable final java.util.List<PullZone> value) {
        this.pullZones = value;
    }
    /**
     * Sets the ReadOnlyPassword property value. The ReadOnlyPassword property
     * @param value Value to set for the ReadOnlyPassword property.
     */
    public void setReadOnlyPassword(@jakarta.annotation.Nullable final String value) {
        this.readOnlyPassword = value;
    }
    /**
     * Sets the Region property value. The Region property
     * @param value Value to set for the Region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final StandardRegions value) {
        this.region = value;
    }
    /**
     * Sets the ReplicationChangeInProgress property value. The ReplicationChangeInProgress property
     * @param value Value to set for the ReplicationChangeInProgress property.
     */
    public void setReplicationChangeInProgress(@jakarta.annotation.Nullable final Boolean value) {
        this.replicationChangeInProgress = value;
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
     * Sets the StorageHostname property value. The StorageHostname property
     * @param value Value to set for the StorageHostname property.
     */
    public void setStorageHostname(@jakarta.annotation.Nullable final String value) {
        this.storageHostname = value;
    }
    /**
     * Sets the StorageUsed property value. The StorageUsed property
     * @param value Value to set for the StorageUsed property.
     */
    public void setStorageUsed(@jakarta.annotation.Nullable final Long value) {
        this.storageUsed = value;
    }
    /**
     * Sets the UserId property value. The UserId property
     * @param value Value to set for the UserId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the ZoneTier property value. The ZoneTier property
     * @param value Value to set for the ZoneTier property.
     */
    public void setZoneTier(@jakarta.annotation.Nullable final Double value) {
        this.zoneTier = value;
    }
}
