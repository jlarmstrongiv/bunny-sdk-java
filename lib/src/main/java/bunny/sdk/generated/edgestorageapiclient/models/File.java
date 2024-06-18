package bunny.sdk.generated.edgestorageapiclient.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class File implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ArrayNumber property
     */
    private Long arrayNumber;
    /**
     * The Checksum property
     */
    private String checksum;
    /**
     * The ContentType property
     */
    private String contentType;
    /**
     * The DateCreated property
     */
    private OffsetDateTime dateCreated;
    /**
     * The Guid property
     */
    private String guid;
    /**
     * The IsDirectory property
     */
    private Boolean isDirectory;
    /**
     * The LastChanged property
     */
    private OffsetDateTime lastChanged;
    /**
     * The Length property
     */
    private Long length;
    /**
     * The ObjectName property
     */
    private String objectName;
    /**
     * The Path property
     */
    private String path;
    /**
     * The ReplicatedZones property
     */
    private String replicatedZones;
    /**
     * The ServerId property
     */
    private Long serverId;
    /**
     * The StorageZoneId property
     */
    private Long storageZoneId;
    /**
     * The StorageZoneName property
     */
    private String storageZoneName;
    /**
     * The UserId property
     */
    private String userId;
    /**
     * Instantiates a new {@link File} and sets the default values.
     */
    public File() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link File}
     */
    @jakarta.annotation.Nonnull
    public static File createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new File();
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
     * Gets the ArrayNumber property value. The ArrayNumber property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getArrayNumber() {
        return this.arrayNumber;
    }
    /**
     * Gets the Checksum property value. The Checksum property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChecksum() {
        return this.checksum;
    }
    /**
     * Gets the ContentType property value. The ContentType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * Gets the DateCreated property value. The DateCreated property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateCreated() {
        return this.dateCreated;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("ArrayNumber", (n) -> { this.setArrayNumber(n.getLongValue()); });
        deserializerMap.put("Checksum", (n) -> { this.setChecksum(n.getStringValue()); });
        deserializerMap.put("ContentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("DateCreated", (n) -> { this.setDateCreated(n.getOffsetDateTimeValue()); });
        deserializerMap.put("Guid", (n) -> { this.setGuid(n.getStringValue()); });
        deserializerMap.put("IsDirectory", (n) -> { this.setIsDirectory(n.getBooleanValue()); });
        deserializerMap.put("LastChanged", (n) -> { this.setLastChanged(n.getOffsetDateTimeValue()); });
        deserializerMap.put("Length", (n) -> { this.setLength(n.getLongValue()); });
        deserializerMap.put("ObjectName", (n) -> { this.setObjectName(n.getStringValue()); });
        deserializerMap.put("Path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("ReplicatedZones", (n) -> { this.setReplicatedZones(n.getStringValue()); });
        deserializerMap.put("ServerId", (n) -> { this.setServerId(n.getLongValue()); });
        deserializerMap.put("StorageZoneId", (n) -> { this.setStorageZoneId(n.getLongValue()); });
        deserializerMap.put("StorageZoneName", (n) -> { this.setStorageZoneName(n.getStringValue()); });
        deserializerMap.put("UserId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Guid property value. The Guid property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGuid() {
        return this.guid;
    }
    /**
     * Gets the IsDirectory property value. The IsDirectory property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDirectory() {
        return this.isDirectory;
    }
    /**
     * Gets the LastChanged property value. The LastChanged property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastChanged() {
        return this.lastChanged;
    }
    /**
     * Gets the Length property value. The Length property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLength() {
        return this.length;
    }
    /**
     * Gets the ObjectName property value. The ObjectName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectName() {
        return this.objectName;
    }
    /**
     * Gets the Path property value. The Path property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the ReplicatedZones property value. The ReplicatedZones property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReplicatedZones() {
        return this.replicatedZones;
    }
    /**
     * Gets the ServerId property value. The ServerId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getServerId() {
        return this.serverId;
    }
    /**
     * Gets the StorageZoneId property value. The StorageZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageZoneId() {
        return this.storageZoneId;
    }
    /**
     * Gets the StorageZoneName property value. The StorageZoneName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageZoneName() {
        return this.storageZoneName;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("ArrayNumber", this.getArrayNumber());
        writer.writeStringValue("Checksum", this.getChecksum());
        writer.writeStringValue("ContentType", this.getContentType());
        writer.writeOffsetDateTimeValue("DateCreated", this.getDateCreated());
        writer.writeStringValue("Guid", this.getGuid());
        writer.writeBooleanValue("IsDirectory", this.getIsDirectory());
        writer.writeOffsetDateTimeValue("LastChanged", this.getLastChanged());
        writer.writeLongValue("Length", this.getLength());
        writer.writeStringValue("ObjectName", this.getObjectName());
        writer.writeStringValue("Path", this.getPath());
        writer.writeStringValue("ReplicatedZones", this.getReplicatedZones());
        writer.writeLongValue("ServerId", this.getServerId());
        writer.writeLongValue("StorageZoneId", this.getStorageZoneId());
        writer.writeStringValue("StorageZoneName", this.getStorageZoneName());
        writer.writeStringValue("UserId", this.getUserId());
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
     * Sets the ArrayNumber property value. The ArrayNumber property
     * @param value Value to set for the ArrayNumber property.
     */
    public void setArrayNumber(@jakarta.annotation.Nullable final Long value) {
        this.arrayNumber = value;
    }
    /**
     * Sets the Checksum property value. The Checksum property
     * @param value Value to set for the Checksum property.
     */
    public void setChecksum(@jakarta.annotation.Nullable final String value) {
        this.checksum = value;
    }
    /**
     * Sets the ContentType property value. The ContentType property
     * @param value Value to set for the ContentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the DateCreated property value. The DateCreated property
     * @param value Value to set for the DateCreated property.
     */
    public void setDateCreated(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateCreated = value;
    }
    /**
     * Sets the Guid property value. The Guid property
     * @param value Value to set for the Guid property.
     */
    public void setGuid(@jakarta.annotation.Nullable final String value) {
        this.guid = value;
    }
    /**
     * Sets the IsDirectory property value. The IsDirectory property
     * @param value Value to set for the IsDirectory property.
     */
    public void setIsDirectory(@jakarta.annotation.Nullable final Boolean value) {
        this.isDirectory = value;
    }
    /**
     * Sets the LastChanged property value. The LastChanged property
     * @param value Value to set for the LastChanged property.
     */
    public void setLastChanged(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastChanged = value;
    }
    /**
     * Sets the Length property value. The Length property
     * @param value Value to set for the Length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Long value) {
        this.length = value;
    }
    /**
     * Sets the ObjectName property value. The ObjectName property
     * @param value Value to set for the ObjectName property.
     */
    public void setObjectName(@jakarta.annotation.Nullable final String value) {
        this.objectName = value;
    }
    /**
     * Sets the Path property value. The Path property
     * @param value Value to set for the Path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the ReplicatedZones property value. The ReplicatedZones property
     * @param value Value to set for the ReplicatedZones property.
     */
    public void setReplicatedZones(@jakarta.annotation.Nullable final String value) {
        this.replicatedZones = value;
    }
    /**
     * Sets the ServerId property value. The ServerId property
     * @param value Value to set for the ServerId property.
     */
    public void setServerId(@jakarta.annotation.Nullable final Long value) {
        this.serverId = value;
    }
    /**
     * Sets the StorageZoneId property value. The StorageZoneId property
     * @param value Value to set for the StorageZoneId property.
     */
    public void setStorageZoneId(@jakarta.annotation.Nullable final Long value) {
        this.storageZoneId = value;
    }
    /**
     * Sets the StorageZoneName property value. The StorageZoneName property
     * @param value Value to set for the StorageZoneName property.
     */
    public void setStorageZoneName(@jakarta.annotation.Nullable final String value) {
        this.storageZoneName = value;
    }
    /**
     * Sets the UserId property value. The UserId property
     * @param value Value to set for the UserId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
