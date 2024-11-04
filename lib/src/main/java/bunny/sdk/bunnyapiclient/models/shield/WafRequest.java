package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WafRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dateTime property
     */
    private OffsetDateTime dateTime;
    /**
     * The requestCount property
     */
    private Double requestCount;
    /**
     * Instantiates a new {@link WafRequest} and sets the default values.
     */
    public WafRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WafRequest}
     */
    @jakarta.annotation.Nonnull
    public static WafRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WafRequest();
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
     * Gets the dateTime property value. The dateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dateTime", (n) -> { this.setDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestCount", (n) -> { this.setRequestCount(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the requestCount property value. The requestCount property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getRequestCount() {
        return this.requestCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeDoubleValue("requestCount", this.getRequestCount());
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
     * Sets the dateTime property value. The dateTime property
     * @param value Value to set for the dateTime property.
     */
    public void setDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateTime = value;
    }
    /**
     * Sets the requestCount property value. The requestCount property
     * @param value Value to set for the requestCount property.
     */
    public void setRequestCount(@jakarta.annotation.Nullable final Double value) {
        this.requestCount = value;
    }
}
