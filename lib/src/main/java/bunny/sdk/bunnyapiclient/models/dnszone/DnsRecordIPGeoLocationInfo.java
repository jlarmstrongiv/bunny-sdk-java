package bunny.sdk.bunnyapiclient.models.dnszone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsRecordIPGeoLocationInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ASN property
     */
    private Long aSN;
    /**
     * The City property
     */
    private String city;
    /**
     * The Country property
     */
    private String country;
    /**
     * The CountryCode property
     */
    private String countryCode;
    /**
     * The OrganizationName property
     */
    private String organizationName;
    /**
     * Instantiates a new {@link DnsRecordIPGeoLocationInfo} and sets the default values.
     */
    public DnsRecordIPGeoLocationInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DnsRecordIPGeoLocationInfo}
     */
    @jakarta.annotation.Nonnull
    public static DnsRecordIPGeoLocationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsRecordIPGeoLocationInfo();
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
     * Gets the ASN property value. The ASN property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getASN() {
        return this.aSN;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("ASN", (n) -> { this.setASN(n.getLongValue()); });
        deserializerMap.put("City", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("Country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("CountryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("OrganizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the OrganizationName property value. The OrganizationName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.organizationName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("ASN", this.getASN());
        writer.writeStringValue("City", this.getCity());
        writer.writeStringValue("Country", this.getCountry());
        writer.writeStringValue("CountryCode", this.getCountryCode());
        writer.writeStringValue("OrganizationName", this.getOrganizationName());
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
     * Sets the ASN property value. The ASN property
     * @param value Value to set for the ASN property.
     */
    public void setASN(@jakarta.annotation.Nullable final Long value) {
        this.aSN = value;
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
     * Sets the CountryCode property value. The CountryCode property
     * @param value Value to set for the CountryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the OrganizationName property value. The OrganizationName property
     * @param value Value to set for the OrganizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.organizationName = value;
    }
}
