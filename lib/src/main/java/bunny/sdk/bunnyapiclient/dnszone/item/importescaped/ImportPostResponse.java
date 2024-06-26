package bunny.sdk.bunnyapiclient.dnszone.item.importescaped;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImportPostResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The RecordsFailed property
     */
    private Integer recordsFailed;
    /**
     * The RecordsSkipped property
     */
    private Integer recordsSkipped;
    /**
     * The RecordsSuccessful property
     */
    private Integer recordsSuccessful;
    /**
     * Instantiates a new {@link ImportPostResponse} and sets the default values.
     */
    public ImportPostResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImportPostResponse}
     */
    @jakarta.annotation.Nonnull
    public static ImportPostResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportPostResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("RecordsFailed", (n) -> { this.setRecordsFailed(n.getIntegerValue()); });
        deserializerMap.put("RecordsSkipped", (n) -> { this.setRecordsSkipped(n.getIntegerValue()); });
        deserializerMap.put("RecordsSuccessful", (n) -> { this.setRecordsSuccessful(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the RecordsFailed property value. The RecordsFailed property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRecordsFailed() {
        return this.recordsFailed;
    }
    /**
     * Gets the RecordsSkipped property value. The RecordsSkipped property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRecordsSkipped() {
        return this.recordsSkipped;
    }
    /**
     * Gets the RecordsSuccessful property value. The RecordsSuccessful property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRecordsSuccessful() {
        return this.recordsSuccessful;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("RecordsFailed", this.getRecordsFailed());
        writer.writeIntegerValue("RecordsSkipped", this.getRecordsSkipped());
        writer.writeIntegerValue("RecordsSuccessful", this.getRecordsSuccessful());
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
     * Sets the RecordsFailed property value. The RecordsFailed property
     * @param value Value to set for the RecordsFailed property.
     */
    public void setRecordsFailed(@jakarta.annotation.Nullable final Integer value) {
        this.recordsFailed = value;
    }
    /**
     * Sets the RecordsSkipped property value. The RecordsSkipped property
     * @param value Value to set for the RecordsSkipped property.
     */
    public void setRecordsSkipped(@jakarta.annotation.Nullable final Integer value) {
        this.recordsSkipped = value;
    }
    /**
     * Sets the RecordsSuccessful property value. The RecordsSuccessful property
     * @param value Value to set for the RecordsSuccessful property.
     */
    public void setRecordsSuccessful(@jakarta.annotation.Nullable final Integer value) {
        this.recordsSuccessful = value;
    }
}
