package bunny.sdk.generated.bunnyapiclient.models.pullzone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Hostname implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains the Base64Url encoded certificate for the hostname
     */
    private String certificate;
    /**
     * Contains the Base64Url encoded certificate key for the hostname
     */
    private String certificateKey;
    /**
     * Determines if the Force SSL feature is enabled
     */
    private Boolean forceSSL;
    /**
     * Determines if the hostname has an SSL certificate configured
     */
    private Boolean hasCertificate;
    /**
     * The unique ID of the hostname
     */
    private Long id;
    /**
     * Determines if this is a system hostname controlled by bunny.net
     */
    private Boolean isSystemHostname;
    /**
     * The hostname value for the domain name
     */
    private String value;
    /**
     * Instantiates a new {@link Hostname} and sets the default values.
     */
    public Hostname() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Hostname}
     */
    @jakarta.annotation.Nonnull
    public static Hostname createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Hostname();
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
     * Gets the Certificate property value. Contains the Base64Url encoded certificate for the hostname
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Gets the CertificateKey property value. Contains the Base64Url encoded certificate key for the hostname
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("Certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("CertificateKey", (n) -> { this.setCertificateKey(n.getStringValue()); });
        deserializerMap.put("ForceSSL", (n) -> { this.setForceSSL(n.getBooleanValue()); });
        deserializerMap.put("HasCertificate", (n) -> { this.setHasCertificate(n.getBooleanValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("IsSystemHostname", (n) -> { this.setIsSystemHostname(n.getBooleanValue()); });
        deserializerMap.put("Value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ForceSSL property value. Determines if the Force SSL feature is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getForceSSL() {
        return this.forceSSL;
    }
    /**
     * Gets the HasCertificate property value. Determines if the hostname has an SSL certificate configured
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasCertificate() {
        return this.hasCertificate;
    }
    /**
     * Gets the Id property value. The unique ID of the hostname
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the IsSystemHostname property value. Determines if this is a system hostname controlled by bunny.net
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemHostname() {
        return this.isSystemHostname;
    }
    /**
     * Gets the Value property value. The hostname value for the domain name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Certificate", this.getCertificate());
        writer.writeStringValue("CertificateKey", this.getCertificateKey());
        writer.writeBooleanValue("ForceSSL", this.getForceSSL());
        writer.writeBooleanValue("HasCertificate", this.getHasCertificate());
        writer.writeLongValue("Id", this.getId());
        writer.writeBooleanValue("IsSystemHostname", this.getIsSystemHostname());
        writer.writeStringValue("Value", this.getValue());
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
     * Sets the Certificate property value. Contains the Base64Url encoded certificate for the hostname
     * @param value Value to set for the Certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.certificate = value;
    }
    /**
     * Sets the CertificateKey property value. Contains the Base64Url encoded certificate key for the hostname
     * @param value Value to set for the CertificateKey property.
     */
    public void setCertificateKey(@jakarta.annotation.Nullable final String value) {
        this.certificateKey = value;
    }
    /**
     * Sets the ForceSSL property value. Determines if the Force SSL feature is enabled
     * @param value Value to set for the ForceSSL property.
     */
    public void setForceSSL(@jakarta.annotation.Nullable final Boolean value) {
        this.forceSSL = value;
    }
    /**
     * Sets the HasCertificate property value. Determines if the hostname has an SSL certificate configured
     * @param value Value to set for the HasCertificate property.
     */
    public void setHasCertificate(@jakarta.annotation.Nullable final Boolean value) {
        this.hasCertificate = value;
    }
    /**
     * Sets the Id property value. The unique ID of the hostname
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the IsSystemHostname property value. Determines if this is a system hostname controlled by bunny.net
     * @param value Value to set for the IsSystemHostname property.
     */
    public void setIsSystemHostname(@jakarta.annotation.Nullable final Boolean value) {
        this.isSystemHostname = value;
    }
    /**
     * Sets the Value property value. The hostname value for the domain name
     * @param value Value to set for the Value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
