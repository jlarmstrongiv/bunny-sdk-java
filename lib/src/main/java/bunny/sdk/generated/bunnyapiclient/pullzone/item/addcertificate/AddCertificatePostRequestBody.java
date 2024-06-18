package bunny.sdk.generated.bunnyapiclient.pullzone.item.addcertificate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddCertificatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Base64Url encoded binary data of the certificate file
     */
    private String certificate;
    /**
     * The Base64Url encoded binary data of the certificate key file
     */
    private String certificateKey;
    /**
     * The hostname to which the certificate will be added
     */
    private String hostname;
    /**
     * Instantiates a new {@link AddCertificatePostRequestBody} and sets the default values.
     */
    public AddCertificatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddCertificatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static AddCertificatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddCertificatePostRequestBody();
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
     * Gets the Certificate property value. The Base64Url encoded binary data of the certificate file
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Gets the CertificateKey property value. The Base64Url encoded binary data of the certificate key file
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificateKey() {
        return this.certificateKey;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("Certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("CertificateKey", (n) -> { this.setCertificateKey(n.getStringValue()); });
        deserializerMap.put("Hostname", (n) -> { this.setHostname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Hostname property value. The hostname to which the certificate will be added
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostname() {
        return this.hostname;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Certificate", this.getCertificate());
        writer.writeStringValue("CertificateKey", this.getCertificateKey());
        writer.writeStringValue("Hostname", this.getHostname());
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
     * Sets the Certificate property value. The Base64Url encoded binary data of the certificate file
     * @param value Value to set for the Certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.certificate = value;
    }
    /**
     * Sets the CertificateKey property value. The Base64Url encoded binary data of the certificate key file
     * @param value Value to set for the CertificateKey property.
     */
    public void setCertificateKey(@jakarta.annotation.Nullable final String value) {
        this.certificateKey = value;
    }
    /**
     * Sets the Hostname property value. The hostname to which the certificate will be added
     * @param value Value to set for the Hostname property.
     */
    public void setHostname(@jakarta.annotation.Nullable final String value) {
        this.hostname = value;
    }
}
