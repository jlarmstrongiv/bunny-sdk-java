package bunny.sdk.generated.bunnyapiclient.models.storagezone.getstoragezoneconnections;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Connection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ConnectionType property
     */
    private Double connectionType;
    /**
     * The main custom connected CDN domain
     */
    private String mainCustomDomain;
    /**
     * The total amount of bandwidth served by this zone this month
     */
    private Double monthlyBandwidthUsed;
    /**
     * The total monthly charges incurred by this zone
     */
    private Double monthlyCharges;
    /**
     * The ID of the connected pull zone
     */
    private Long pullZoneId;
    /**
     * The name of the connected pull zone
     */
    private String pullZoneName;
    /**
     * The Tier property
     */
    private Double tier;
    /**
     * Instantiates a new {@link Connection} and sets the default values.
     */
    public Connection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Connection}
     */
    @jakarta.annotation.Nonnull
    public static Connection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Connection();
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
     * Gets the ConnectionType property value. The ConnectionType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConnectionType() {
        return this.connectionType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("ConnectionType", (n) -> { this.setConnectionType(n.getDoubleValue()); });
        deserializerMap.put("MainCustomDomain", (n) -> { this.setMainCustomDomain(n.getStringValue()); });
        deserializerMap.put("MonthlyBandwidthUsed", (n) -> { this.setMonthlyBandwidthUsed(n.getDoubleValue()); });
        deserializerMap.put("MonthlyCharges", (n) -> { this.setMonthlyCharges(n.getDoubleValue()); });
        deserializerMap.put("PullZoneId", (n) -> { this.setPullZoneId(n.getLongValue()); });
        deserializerMap.put("PullZoneName", (n) -> { this.setPullZoneName(n.getStringValue()); });
        deserializerMap.put("Tier", (n) -> { this.setTier(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the MainCustomDomain property value. The main custom connected CDN domain
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMainCustomDomain() {
        return this.mainCustomDomain;
    }
    /**
     * Gets the MonthlyBandwidthUsed property value. The total amount of bandwidth served by this zone this month
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlyBandwidthUsed() {
        return this.monthlyBandwidthUsed;
    }
    /**
     * Gets the MonthlyCharges property value. The total monthly charges incurred by this zone
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlyCharges() {
        return this.monthlyCharges;
    }
    /**
     * Gets the PullZoneId property value. The ID of the connected pull zone
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPullZoneId() {
        return this.pullZoneId;
    }
    /**
     * Gets the PullZoneName property value. The name of the connected pull zone
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPullZoneName() {
        return this.pullZoneName;
    }
    /**
     * Gets the Tier property value. The Tier property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTier() {
        return this.tier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("ConnectionType", this.getConnectionType());
        writer.writeStringValue("MainCustomDomain", this.getMainCustomDomain());
        writer.writeDoubleValue("MonthlyBandwidthUsed", this.getMonthlyBandwidthUsed());
        writer.writeDoubleValue("MonthlyCharges", this.getMonthlyCharges());
        writer.writeLongValue("PullZoneId", this.getPullZoneId());
        writer.writeStringValue("PullZoneName", this.getPullZoneName());
        writer.writeDoubleValue("Tier", this.getTier());
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
     * Sets the ConnectionType property value. The ConnectionType property
     * @param value Value to set for the ConnectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final Double value) {
        this.connectionType = value;
    }
    /**
     * Sets the MainCustomDomain property value. The main custom connected CDN domain
     * @param value Value to set for the MainCustomDomain property.
     */
    public void setMainCustomDomain(@jakarta.annotation.Nullable final String value) {
        this.mainCustomDomain = value;
    }
    /**
     * Sets the MonthlyBandwidthUsed property value. The total amount of bandwidth served by this zone this month
     * @param value Value to set for the MonthlyBandwidthUsed property.
     */
    public void setMonthlyBandwidthUsed(@jakarta.annotation.Nullable final Double value) {
        this.monthlyBandwidthUsed = value;
    }
    /**
     * Sets the MonthlyCharges property value. The total monthly charges incurred by this zone
     * @param value Value to set for the MonthlyCharges property.
     */
    public void setMonthlyCharges(@jakarta.annotation.Nullable final Double value) {
        this.monthlyCharges = value;
    }
    /**
     * Sets the PullZoneId property value. The ID of the connected pull zone
     * @param value Value to set for the PullZoneId property.
     */
    public void setPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.pullZoneId = value;
    }
    /**
     * Sets the PullZoneName property value. The name of the connected pull zone
     * @param value Value to set for the PullZoneName property.
     */
    public void setPullZoneName(@jakarta.annotation.Nullable final String value) {
        this.pullZoneName = value;
    }
    /**
     * Sets the Tier property value. The Tier property
     * @param value Value to set for the Tier property.
     */
    public void setTier(@jakarta.annotation.Nullable final Double value) {
        this.tier = value;
    }
}
