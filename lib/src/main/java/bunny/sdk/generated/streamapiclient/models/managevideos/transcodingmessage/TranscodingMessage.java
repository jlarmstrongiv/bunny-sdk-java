package bunny.sdk.generated.streamapiclient.models.managevideos.transcodingmessage;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TranscodingMessage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The issueCode property
     */
    private Double issueCode;
    /**
     * The level property
     */
    private Double level;
    /**
     * The message property
     */
    private String message;
    /**
     * The timeStamp property
     */
    private OffsetDateTime timeStamp;
    /**
     * The value property
     */
    private String value;
    /**
     * Instantiates a new {@link TranscodingMessage} and sets the default values.
     */
    public TranscodingMessage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TranscodingMessage}
     */
    @jakarta.annotation.Nonnull
    public static TranscodingMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranscodingMessage();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("issueCode", (n) -> { this.setIssueCode(n.getDoubleValue()); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getDoubleValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("timeStamp", (n) -> { this.setTimeStamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issueCode property value. The issueCode property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getIssueCode() {
        return this.issueCode;
    }
    /**
     * Gets the level property value. The level property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLevel() {
        return this.level;
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
     * Gets the timeStamp property value. The timeStamp property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimeStamp() {
        return this.timeStamp;
    }
    /**
     * Gets the value property value. The value property
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
        writer.writeDoubleValue("issueCode", this.getIssueCode());
        writer.writeDoubleValue("level", this.getLevel());
        writer.writeStringValue("message", this.getMessage());
        writer.writeOffsetDateTimeValue("timeStamp", this.getTimeStamp());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the issueCode property value. The issueCode property
     * @param value Value to set for the issueCode property.
     */
    public void setIssueCode(@jakarta.annotation.Nullable final Double value) {
        this.issueCode = value;
    }
    /**
     * Sets the level property value. The level property
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final Double value) {
        this.level = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the timeStamp property value. The timeStamp property
     * @param value Value to set for the timeStamp property.
     */
    public void setTimeStamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timeStamp = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
