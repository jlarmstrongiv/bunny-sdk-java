package bunny.sdk.generated.bunnyapiclient.models.dnszone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsRecordGeolocationInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The City property
     */
    private String city;
    /**
     * The Country property
     */
    private String country;
    /**
     * The Latitude property
     */
    private Double latitude;
    /**
     * The Longitude property
     */
    private Double longitude;
    /**
     * Instantiates a new {@link DnsRecordGeolocationInfo} and sets the default values.
     */
    public DnsRecordGeolocationInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DnsRecordGeolocationInfo}
     */
    @jakarta.annotation.Nonnull
    public static DnsRecordGeolocationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsRecordGeolocationInfo();
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
     * Gets the City property value. The City property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the Country property value. The Country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("City", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("Country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("Latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("Longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("City", this.getCity());
        writer.writeStringValue("Country", this.getCountry());
        writer.writeDoubleValue("Latitude", this.getLatitude());
        writer.writeDoubleValue("Longitude", this.getLongitude());
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
     * Sets the City property value. The City property
     * @param value Value to set for the City property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the Country property value. The Country property
     * @param value Value to set for the Country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
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
}
