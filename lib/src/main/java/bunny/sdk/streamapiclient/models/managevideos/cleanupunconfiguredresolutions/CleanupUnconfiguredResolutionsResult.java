package bunny.sdk.streamapiclient.models.managevideos.cleanupunconfiguredresolutions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CleanupUnconfiguredResolutionsResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The resolutions were successfully deleted
     */
    private CleanupUnconfiguredResolutionsResultData data;
    /**
     * Response message description
     */
    private String message;
    /**
     * The response status code
     */
    private Integer statusCode;
    /**
     * Determines if the request was successful
     */
    private Boolean success;
    /**
     * Instantiates a new {@link CleanupUnconfiguredResolutionsResult} and sets the default values.
     */
    public CleanupUnconfiguredResolutionsResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CleanupUnconfiguredResolutionsResult}
     */
    @jakarta.annotation.Nonnull
    public static CleanupUnconfiguredResolutionsResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CleanupUnconfiguredResolutionsResult();
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
     * Gets the data property value. The resolutions were successfully deleted
     * @return a {@link CleanupUnconfiguredResolutionsResultData}
     */
    @jakarta.annotation.Nullable
    public CleanupUnconfiguredResolutionsResultData getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("data", (n) -> { this.setData(n.getObjectValue(CleanupUnconfiguredResolutionsResultData::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        deserializerMap.put("success", (n) -> { this.setSuccess(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Response message description
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the statusCode property value. The response status code
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Gets the success property value. Determines if the request was successful
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
        writer.writeObjectValue("data", this.getData());
        writer.writeStringValue("message", this.getMessage());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
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
     * Sets the data property value. The resolutions were successfully deleted
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final CleanupUnconfiguredResolutionsResultData value) {
        this.data = value;
    }
    /**
     * Sets the message property value. Response message description
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the statusCode property value. The response status code
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
    /**
     * Sets the success property value. Determines if the request was successful
     * @param value Value to set for the success property.
     */
    public void setSuccess(@jakarta.annotation.Nullable final Boolean value) {
        this.success = value;
    }
}
