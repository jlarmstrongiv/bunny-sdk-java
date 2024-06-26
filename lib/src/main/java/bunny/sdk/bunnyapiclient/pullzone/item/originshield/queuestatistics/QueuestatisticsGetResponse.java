package bunny.sdk.bunnyapiclient.pullzone.item.originshield.queuestatistics;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueuestatisticsGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The constructed chart of origin shield concurrent requests
     */
    private QueuestatisticsGetResponseConcurrentRequestsChart concurrentRequestsChart;
    /**
     * The constructed chart of origin shield requests chart
     */
    private QueuestatisticsGetResponseQueuedRequestsChart queuedRequestsChart;
    /**
     * Instantiates a new {@link QueuestatisticsGetResponse} and sets the default values.
     */
    public QueuestatisticsGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QueuestatisticsGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static QueuestatisticsGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QueuestatisticsGetResponse();
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
     * Gets the ConcurrentRequestsChart property value. The constructed chart of origin shield concurrent requests
     * @return a {@link QueuestatisticsGetResponseConcurrentRequestsChart}
     */
    @jakarta.annotation.Nullable
    public QueuestatisticsGetResponseConcurrentRequestsChart getConcurrentRequestsChart() {
        return this.concurrentRequestsChart;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("ConcurrentRequestsChart", (n) -> { this.setConcurrentRequestsChart(n.getObjectValue(QueuestatisticsGetResponseConcurrentRequestsChart::createFromDiscriminatorValue)); });
        deserializerMap.put("QueuedRequestsChart", (n) -> { this.setQueuedRequestsChart(n.getObjectValue(QueuestatisticsGetResponseQueuedRequestsChart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the QueuedRequestsChart property value. The constructed chart of origin shield requests chart
     * @return a {@link QueuestatisticsGetResponseQueuedRequestsChart}
     */
    @jakarta.annotation.Nullable
    public QueuestatisticsGetResponseQueuedRequestsChart getQueuedRequestsChart() {
        return this.queuedRequestsChart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("ConcurrentRequestsChart", this.getConcurrentRequestsChart());
        writer.writeObjectValue("QueuedRequestsChart", this.getQueuedRequestsChart());
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
     * Sets the ConcurrentRequestsChart property value. The constructed chart of origin shield concurrent requests
     * @param value Value to set for the ConcurrentRequestsChart property.
     */
    public void setConcurrentRequestsChart(@jakarta.annotation.Nullable final QueuestatisticsGetResponseConcurrentRequestsChart value) {
        this.concurrentRequestsChart = value;
    }
    /**
     * Sets the QueuedRequestsChart property value. The constructed chart of origin shield requests chart
     * @param value Value to set for the QueuedRequestsChart property.
     */
    public void setQueuedRequestsChart(@jakarta.annotation.Nullable final QueuestatisticsGetResponseQueuedRequestsChart value) {
        this.queuedRequestsChart = value;
    }
}
