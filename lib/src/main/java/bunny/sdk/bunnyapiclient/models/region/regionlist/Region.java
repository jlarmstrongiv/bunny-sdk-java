package bunny.sdk.bunnyapiclient.models.region.regionlist;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Region implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The AllowLatencyRouting property
     */
    private Boolean allowLatencyRouting;
    /**
     * The ContinentCode property
     */
    private String continentCode;
    /**
     * The CountryCode property
     */
    private String countryCode;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Latitude property
     */
    private Double latitude;
    /**
     * The Longitude property
     */
    private Double longitude;
    /**
     * The Name property
     */
    private String name;
    /**
     * The PricePerGigabyte property
     */
    private Double pricePerGigabyte;
    /**
     * The RegionCode property
     */
    private String regionCode;
    /**
     * Instantiates a new {@link Region} and sets the default values.
     */
    public Region() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Region}
     */
    @jakarta.annotation.Nonnull
    public static Region createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Region();
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
     * Gets the AllowLatencyRouting property value. The AllowLatencyRouting property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLatencyRouting() {
        return this.allowLatencyRouting;
    }
    /**
     * Gets the ContinentCode property value. The ContinentCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContinentCode() {
        return this.continentCode;
    }
    /**
     * Gets the CountryCode property value. The CountryCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("AllowLatencyRouting", (n) -> { this.setAllowLatencyRouting(n.getBooleanValue()); });
        deserializerMap.put("ContinentCode", (n) -> { this.setContinentCode(n.getStringValue()); });
        deserializerMap.put("CountryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("Longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("PricePerGigabyte", (n) -> { this.setPricePerGigabyte(n.getDoubleValue()); });
        deserializerMap.put("RegionCode", (n) -> { this.setRegionCode(n.getStringValue()); });
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
     * Gets the Latitude property value. The Latitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the Longitude property value. The Longitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
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
     * Gets the PricePerGigabyte property value. The PricePerGigabyte property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPricePerGigabyte() {
        return this.pricePerGigabyte;
    }
    /**
     * Gets the RegionCode property value. The RegionCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionCode() {
        return this.regionCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("AllowLatencyRouting", this.getAllowLatencyRouting());
        writer.writeStringValue("ContinentCode", this.getContinentCode());
        writer.writeStringValue("CountryCode", this.getCountryCode());
        writer.writeLongValue("Id", this.getId());
        writer.writeDoubleValue("Latitude", this.getLatitude());
        writer.writeDoubleValue("Longitude", this.getLongitude());
        writer.writeStringValue("Name", this.getName());
        writer.writeDoubleValue("PricePerGigabyte", this.getPricePerGigabyte());
        writer.writeStringValue("RegionCode", this.getRegionCode());
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
     * Sets the AllowLatencyRouting property value. The AllowLatencyRouting property
     * @param value Value to set for the AllowLatencyRouting property.
     */
    public void setAllowLatencyRouting(@jakarta.annotation.Nullable final Boolean value) {
        this.allowLatencyRouting = value;
    }
    /**
     * Sets the ContinentCode property value. The ContinentCode property
     * @param value Value to set for the ContinentCode property.
     */
    public void setContinentCode(@jakarta.annotation.Nullable final String value) {
        this.continentCode = value;
    }
    /**
     * Sets the CountryCode property value. The CountryCode property
     * @param value Value to set for the CountryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Latitude property value. The Latitude property
     * @param value Value to set for the Latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the Longitude property value. The Longitude property
     * @param value Value to set for the Longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the PricePerGigabyte property value. The PricePerGigabyte property
     * @param value Value to set for the PricePerGigabyte property.
     */
    public void setPricePerGigabyte(@jakarta.annotation.Nullable final Double value) {
        this.pricePerGigabyte = value;
    }
    /**
     * Sets the RegionCode property value. The RegionCode property
     * @param value Value to set for the RegionCode property.
     */
    public void setRegionCode(@jakarta.annotation.Nullable final String value) {
        this.regionCode = value;
    }
}
