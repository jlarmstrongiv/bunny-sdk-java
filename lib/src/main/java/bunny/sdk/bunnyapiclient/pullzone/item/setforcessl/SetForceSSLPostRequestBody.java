package bunny.sdk.bunnyapiclient.pullzone.item.setforcessl;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetForceSSLPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Set to true to force SSL on the given pull zone hostname
     */
    private Boolean forceSSL;
    /**
     * The hostname that will be updated
     */
    private String hostname;
    /**
     * Instantiates a new {@link SetForceSSLPostRequestBody} and sets the default values.
     */
    public SetForceSSLPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetForceSSLPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SetForceSSLPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetForceSSLPostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("ForceSSL", (n) -> { this.setForceSSL(n.getBooleanValue()); });
        deserializerMap.put("Hostname", (n) -> { this.setHostname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ForceSSL property value. Set to true to force SSL on the given pull zone hostname
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getForceSSL() {
        return this.forceSSL;
    }
    /**
     * Gets the Hostname property value. The hostname that will be updated
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
        writer.writeBooleanValue("ForceSSL", this.getForceSSL());
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
     * Sets the ForceSSL property value. Set to true to force SSL on the given pull zone hostname
     * @param value Value to set for the ForceSSL property.
     */
    public void setForceSSL(@jakarta.annotation.Nullable final Boolean value) {
        this.forceSSL = value;
    }
    /**
     * Sets the Hostname property value. The hostname that will be updated
     * @param value Value to set for the Hostname property.
     */
    public void setHostname(@jakarta.annotation.Nullable final String value) {
        this.hostname = value;
    }
}
