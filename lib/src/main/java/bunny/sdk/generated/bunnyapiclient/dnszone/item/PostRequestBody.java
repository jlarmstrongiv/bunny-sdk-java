package bunny.sdk.generated.bunnyapiclient.dnszone.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The template for adding optional properties.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CustomNameserversEnabled property
     */
    private Boolean customNameserversEnabled;
    /**
     * The LogAnonymizationType property
     */
    private Double logAnonymizationType;
    /**
     * The LoggingEnabled property
     */
    private Boolean loggingEnabled;
    /**
     * Determines if the log anonymization should be enabled
     */
    private Boolean loggingIPAnonymizationEnabled;
    /**
     * The Nameserver1 property
     */
    private String nameserver1;
    /**
     * The Nameserver2 property
     */
    private String nameserver2;
    /**
     * The SoaEmail property
     */
    private String soaEmail;
    /**
     * Instantiates a new {@link PostRequestBody} and sets the default values.
     */
    public PostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static PostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PostRequestBody();
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
     * Gets the CustomNameserversEnabled property value. The CustomNameserversEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCustomNameserversEnabled() {
        return this.customNameserversEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("CustomNameserversEnabled", (n) -> { this.setCustomNameserversEnabled(n.getBooleanValue()); });
        deserializerMap.put("LogAnonymizationType", (n) -> { this.setLogAnonymizationType(n.getDoubleValue()); });
        deserializerMap.put("LoggingEnabled", (n) -> { this.setLoggingEnabled(n.getBooleanValue()); });
        deserializerMap.put("LoggingIPAnonymizationEnabled", (n) -> { this.setLoggingIPAnonymizationEnabled(n.getBooleanValue()); });
        deserializerMap.put("Nameserver1", (n) -> { this.setNameserver1(n.getStringValue()); });
        deserializerMap.put("Nameserver2", (n) -> { this.setNameserver2(n.getStringValue()); });
        deserializerMap.put("SoaEmail", (n) -> { this.setSoaEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the LogAnonymizationType property value. The LogAnonymizationType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLogAnonymizationType() {
        return this.logAnonymizationType;
    }
    /**
     * Gets the LoggingEnabled property value. The LoggingEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }
    /**
     * Gets the LoggingIPAnonymizationEnabled property value. Determines if the log anonymization should be enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLoggingIPAnonymizationEnabled() {
        return this.loggingIPAnonymizationEnabled;
    }
    /**
     * Gets the Nameserver1 property value. The Nameserver1 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameserver1() {
        return this.nameserver1;
    }
    /**
     * Gets the Nameserver2 property value. The Nameserver2 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameserver2() {
        return this.nameserver2;
    }
    /**
     * Gets the SoaEmail property value. The SoaEmail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSoaEmail() {
        return this.soaEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("CustomNameserversEnabled", this.getCustomNameserversEnabled());
        writer.writeDoubleValue("LogAnonymizationType", this.getLogAnonymizationType());
        writer.writeBooleanValue("LoggingEnabled", this.getLoggingEnabled());
        writer.writeBooleanValue("LoggingIPAnonymizationEnabled", this.getLoggingIPAnonymizationEnabled());
        writer.writeStringValue("Nameserver1", this.getNameserver1());
        writer.writeStringValue("Nameserver2", this.getNameserver2());
        writer.writeStringValue("SoaEmail", this.getSoaEmail());
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
     * Sets the CustomNameserversEnabled property value. The CustomNameserversEnabled property
     * @param value Value to set for the CustomNameserversEnabled property.
     */
    public void setCustomNameserversEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.customNameserversEnabled = value;
    }
    /**
     * Sets the LogAnonymizationType property value. The LogAnonymizationType property
     * @param value Value to set for the LogAnonymizationType property.
     */
    public void setLogAnonymizationType(@jakarta.annotation.Nullable final Double value) {
        this.logAnonymizationType = value;
    }
    /**
     * Sets the LoggingEnabled property value. The LoggingEnabled property
     * @param value Value to set for the LoggingEnabled property.
     */
    public void setLoggingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.loggingEnabled = value;
    }
    /**
     * Sets the LoggingIPAnonymizationEnabled property value. Determines if the log anonymization should be enabled
     * @param value Value to set for the LoggingIPAnonymizationEnabled property.
     */
    public void setLoggingIPAnonymizationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.loggingIPAnonymizationEnabled = value;
    }
    /**
     * Sets the Nameserver1 property value. The Nameserver1 property
     * @param value Value to set for the Nameserver1 property.
     */
    public void setNameserver1(@jakarta.annotation.Nullable final String value) {
        this.nameserver1 = value;
    }
    /**
     * Sets the Nameserver2 property value. The Nameserver2 property
     * @param value Value to set for the Nameserver2 property.
     */
    public void setNameserver2(@jakarta.annotation.Nullable final String value) {
        this.nameserver2 = value;
    }
    /**
     * Sets the SoaEmail property value. The SoaEmail property
     * @param value Value to set for the SoaEmail property.
     */
    public void setSoaEmail(@jakarta.annotation.Nullable final String value) {
        this.soaEmail = value;
    }
}
