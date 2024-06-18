package bunny.sdk.generated.bunnyapiclient.models.streamvideolibrary;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoLibraryGoogleWidevineDrm implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CertificateExpirationDate property
     */
    private OffsetDateTime certificateExpirationDate;
    /**
     * The CertificateId property
     */
    private Long certificateId;
    /**
     * The Enabled property
     */
    private Boolean enabled;
    /**
     * The MinClientSecurityLevel property
     */
    private Double minClientSecurityLevel;
    /**
     * The Provider property
     */
    private String provider;
    /**
     * The SdOnlyForL3 property
     */
    private Boolean sdOnlyForL3;
    /**
     * Instantiates a new {@link VideoLibraryGoogleWidevineDrm} and sets the default values.
     */
    public VideoLibraryGoogleWidevineDrm() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoLibraryGoogleWidevineDrm}
     */
    @jakarta.annotation.Nonnull
    public static VideoLibraryGoogleWidevineDrm createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoLibraryGoogleWidevineDrm();
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
     * Gets the CertificateExpirationDate property value. The CertificateExpirationDate property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateExpirationDate() {
        return this.certificateExpirationDate;
    }
    /**
     * Gets the CertificateId property value. The CertificateId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCertificateId() {
        return this.certificateId;
    }
    /**
     * Gets the Enabled property value. The Enabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("CertificateExpirationDate", (n) -> { this.setCertificateExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("CertificateId", (n) -> { this.setCertificateId(n.getLongValue()); });
        deserializerMap.put("Enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("MinClientSecurityLevel", (n) -> { this.setMinClientSecurityLevel(n.getDoubleValue()); });
        deserializerMap.put("Provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("SdOnlyForL3", (n) -> { this.setSdOnlyForL3(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the MinClientSecurityLevel property value. The MinClientSecurityLevel property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinClientSecurityLevel() {
        return this.minClientSecurityLevel;
    }
    /**
     * Gets the Provider property value. The Provider property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the SdOnlyForL3 property value. The SdOnlyForL3 property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSdOnlyForL3() {
        return this.sdOnlyForL3;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("CertificateExpirationDate", this.getCertificateExpirationDate());
        writer.writeLongValue("CertificateId", this.getCertificateId());
        writer.writeBooleanValue("Enabled", this.getEnabled());
        writer.writeDoubleValue("MinClientSecurityLevel", this.getMinClientSecurityLevel());
        writer.writeStringValue("Provider", this.getProvider());
        writer.writeBooleanValue("SdOnlyForL3", this.getSdOnlyForL3());
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
     * Sets the CertificateExpirationDate property value. The CertificateExpirationDate property
     * @param value Value to set for the CertificateExpirationDate property.
     */
    public void setCertificateExpirationDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.certificateExpirationDate = value;
    }
    /**
     * Sets the CertificateId property value. The CertificateId property
     * @param value Value to set for the CertificateId property.
     */
    public void setCertificateId(@jakarta.annotation.Nullable final Long value) {
        this.certificateId = value;
    }
    /**
     * Sets the Enabled property value. The Enabled property
     * @param value Value to set for the Enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the MinClientSecurityLevel property value. The MinClientSecurityLevel property
     * @param value Value to set for the MinClientSecurityLevel property.
     */
    public void setMinClientSecurityLevel(@jakarta.annotation.Nullable final Double value) {
        this.minClientSecurityLevel = value;
    }
    /**
     * Sets the Provider property value. The Provider property
     * @param value Value to set for the Provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the SdOnlyForL3 property value. The SdOnlyForL3 property
     * @param value Value to set for the SdOnlyForL3 property.
     */
    public void setSdOnlyForL3(@jakarta.annotation.Nullable final Boolean value) {
        this.sdOnlyForL3 = value;
    }
}
