package bunny.sdk.bunnyapiclient.videolibrary.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideolibraryPostRequestBodyAppleFairPlayDrm implements AdditionalDataHolder, Parsable {
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
     * The Provider property
     */
    private String provider;
    /**
     * Instantiates a new {@link VideolibraryPostRequestBodyAppleFairPlayDrm} and sets the default values.
     */
    public VideolibraryPostRequestBodyAppleFairPlayDrm() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideolibraryPostRequestBodyAppleFairPlayDrm}
     */
    @jakarta.annotation.Nonnull
    public static VideolibraryPostRequestBodyAppleFairPlayDrm createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideolibraryPostRequestBodyAppleFairPlayDrm();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("CertificateExpirationDate", (n) -> { this.setCertificateExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("CertificateId", (n) -> { this.setCertificateId(n.getLongValue()); });
        deserializerMap.put("Enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("Provider", (n) -> { this.setProvider(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("CertificateExpirationDate", this.getCertificateExpirationDate());
        writer.writeLongValue("CertificateId", this.getCertificateId());
        writer.writeBooleanValue("Enabled", this.getEnabled());
        writer.writeStringValue("Provider", this.getProvider());
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
     * Sets the Provider property value. The Provider property
     * @param value Value to set for the Provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
}
