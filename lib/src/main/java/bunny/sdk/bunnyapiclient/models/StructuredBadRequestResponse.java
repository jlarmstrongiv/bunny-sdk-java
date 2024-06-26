package bunny.sdk.bunnyapiclient.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The server could not understand the request due to invalid syntax.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StructuredBadRequestResponse extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ErrorKey property
     */
    private String errorKey;
    /**
     * The Field property
     */
    private String field;
    /**
     * The Message property
     */
    private String message;
    /**
     * Instantiates a new {@link StructuredBadRequestResponse} and sets the default values.
     */
    public StructuredBadRequestResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StructuredBadRequestResponse}
     */
    @jakarta.annotation.Nonnull
    public static StructuredBadRequestResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StructuredBadRequestResponse();
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
     * Gets the ErrorKey property value. The ErrorKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorKey() {
        return this.errorKey;
    }
    /**
     * Gets the Field property value. The Field property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getField() {
        return this.field;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("ErrorKey", (n) -> { this.setErrorKey(n.getStringValue()); });
        deserializerMap.put("Field", (n) -> { this.setField(n.getStringValue()); });
        deserializerMap.put("Message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * The primary error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nonnull
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    /**
     * Gets the Message property value. The Message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageEscaped() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ErrorKey", this.getErrorKey());
        writer.writeStringValue("Field", this.getField());
        writer.writeStringValue("Message", this.getMessageEscaped());
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
     * Sets the ErrorKey property value. The ErrorKey property
     * @param value Value to set for the ErrorKey property.
     */
    public void setErrorKey(@jakarta.annotation.Nullable final String value) {
        this.errorKey = value;
    }
    /**
     * Sets the Field property value. The Field property
     * @param value Value to set for the Field property.
     */
    public void setField(@jakarta.annotation.Nullable final String value) {
        this.field = value;
    }
    /**
     * Sets the Message property value. The Message property
     * @param value Value to set for the Message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
