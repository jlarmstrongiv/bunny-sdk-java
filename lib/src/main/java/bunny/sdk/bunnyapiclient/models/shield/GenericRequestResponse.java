package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GenericRequestResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The errorKey property
     */
    private String errorKey;
    /**
     * The message property
     */
    private String message;
    /**
     * The statusCode property
     */
    private Double statusCode;
    /**
     * The success property
     */
    private Boolean success;
    /**
     * Instantiates a new {@link GenericRequestResponse} and sets the default values.
     */
    public GenericRequestResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GenericRequestResponse}
     */
    @jakarta.annotation.Nonnull
    public static GenericRequestResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GenericRequestResponse();
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
     * Gets the errorKey property value. The errorKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorKey() {
        return this.errorKey;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errorKey", (n) -> { this.setErrorKey(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getDoubleValue()); });
        deserializerMap.put("success", (n) -> { this.setSuccess(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the statusCode property value. The statusCode property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStatusCode() {
        return this.statusCode;
    }
    /**
     * Gets the success property value. The success property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccess() {
        return this.success;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("errorKey", this.getErrorKey());
        writer.writeStringValue("message", this.getMessage());
        writer.writeDoubleValue("statusCode", this.getStatusCode());
        writer.writeBooleanValue("success", this.getSuccess());
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
     * Sets the errorKey property value. The errorKey property
     * @param value Value to set for the errorKey property.
     */
    public void setErrorKey(@jakarta.annotation.Nullable final String value) {
        this.errorKey = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the statusCode property value. The statusCode property
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Double value) {
        this.statusCode = value;
    }
    /**
     * Sets the success property value. The success property
     * @param value Value to set for the success property.
     */
    public void setSuccess(@jakarta.annotation.Nullable final Boolean value) {
        this.success = value;
    }
}
