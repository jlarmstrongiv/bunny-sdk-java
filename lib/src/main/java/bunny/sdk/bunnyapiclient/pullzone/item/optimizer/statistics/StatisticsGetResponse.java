package bunny.sdk.bunnyapiclient.pullzone.item.optimizer.statistics;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatisticsGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Average compression chart of the responses
     */
    private StatisticsGetResponseAverageCompressionChart averageCompressionChart;
    /**
     * The average compression ratio of CDN responses
     */
    private Double averageCompressionRatio;
    /**
     * The average processing time of each request
     */
    private Double averageProcessingTime;
    /**
     * The AverageProcessingTimeChart property
     */
    private StatisticsGetResponseAverageProcessingTimeChart averageProcessingTimeChart;
    /**
     * The constructed chart of optimized requests
     */
    private StatisticsGetResponseRequestsOptimizedChart requestsOptimizedChart;
    /**
     * The total number of optimized requests
     */
    private Double totalRequestsOptimized;
    /**
     * The total requests saved
     */
    private Double totalTrafficSaved;
    /**
     * The constructed chart of saved traffic
     */
    private StatisticsGetResponseTrafficSavedChart trafficSavedChart;
    /**
     * Instantiates a new {@link StatisticsGetResponse} and sets the default values.
     */
    public StatisticsGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StatisticsGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static StatisticsGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StatisticsGetResponse();
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
     * Gets the AverageCompressionChart property value. Average compression chart of the responses
     * @return a {@link StatisticsGetResponseAverageCompressionChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseAverageCompressionChart getAverageCompressionChart() {
        return this.averageCompressionChart;
    }
    /**
     * Gets the AverageCompressionRatio property value. The average compression ratio of CDN responses
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageCompressionRatio() {
        return this.averageCompressionRatio;
    }
    /**
     * Gets the AverageProcessingTime property value. The average processing time of each request
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageProcessingTime() {
        return this.averageProcessingTime;
    }
    /**
     * Gets the AverageProcessingTimeChart property value. The AverageProcessingTimeChart property
     * @return a {@link StatisticsGetResponseAverageProcessingTimeChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseAverageProcessingTimeChart getAverageProcessingTimeChart() {
        return this.averageProcessingTimeChart;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("AverageCompressionChart", (n) -> { this.setAverageCompressionChart(n.getObjectValue(StatisticsGetResponseAverageCompressionChart::createFromDiscriminatorValue)); });
        deserializerMap.put("AverageCompressionRatio", (n) -> { this.setAverageCompressionRatio(n.getDoubleValue()); });
        deserializerMap.put("AverageProcessingTime", (n) -> { this.setAverageProcessingTime(n.getDoubleValue()); });
        deserializerMap.put("AverageProcessingTimeChart", (n) -> { this.setAverageProcessingTimeChart(n.getObjectValue(StatisticsGetResponseAverageProcessingTimeChart::createFromDiscriminatorValue)); });
        deserializerMap.put("RequestsOptimizedChart", (n) -> { this.setRequestsOptimizedChart(n.getObjectValue(StatisticsGetResponseRequestsOptimizedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("TotalRequestsOptimized", (n) -> { this.setTotalRequestsOptimized(n.getDoubleValue()); });
        deserializerMap.put("TotalTrafficSaved", (n) -> { this.setTotalTrafficSaved(n.getDoubleValue()); });
        deserializerMap.put("TrafficSavedChart", (n) -> { this.setTrafficSavedChart(n.getObjectValue(StatisticsGetResponseTrafficSavedChart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the RequestsOptimizedChart property value. The constructed chart of optimized requests
     * @return a {@link StatisticsGetResponseRequestsOptimizedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseRequestsOptimizedChart getRequestsOptimizedChart() {
        return this.requestsOptimizedChart;
    }
    /**
     * Gets the TotalRequestsOptimized property value. The total number of optimized requests
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalRequestsOptimized() {
        return this.totalRequestsOptimized;
    }
    /**
     * Gets the TotalTrafficSaved property value. The total requests saved
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalTrafficSaved() {
        return this.totalTrafficSaved;
    }
    /**
     * Gets the TrafficSavedChart property value. The constructed chart of saved traffic
     * @return a {@link StatisticsGetResponseTrafficSavedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseTrafficSavedChart getTrafficSavedChart() {
        return this.trafficSavedChart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("AverageCompressionChart", this.getAverageCompressionChart());
        writer.writeDoubleValue("AverageCompressionRatio", this.getAverageCompressionRatio());
        writer.writeDoubleValue("AverageProcessingTime", this.getAverageProcessingTime());
        writer.writeObjectValue("AverageProcessingTimeChart", this.getAverageProcessingTimeChart());
        writer.writeObjectValue("RequestsOptimizedChart", this.getRequestsOptimizedChart());
        writer.writeDoubleValue("TotalRequestsOptimized", this.getTotalRequestsOptimized());
        writer.writeDoubleValue("TotalTrafficSaved", this.getTotalTrafficSaved());
        writer.writeObjectValue("TrafficSavedChart", this.getTrafficSavedChart());
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
     * Sets the AverageCompressionChart property value. Average compression chart of the responses
     * @param value Value to set for the AverageCompressionChart property.
     */
    public void setAverageCompressionChart(@jakarta.annotation.Nullable final StatisticsGetResponseAverageCompressionChart value) {
        this.averageCompressionChart = value;
    }
    /**
     * Sets the AverageCompressionRatio property value. The average compression ratio of CDN responses
     * @param value Value to set for the AverageCompressionRatio property.
     */
    public void setAverageCompressionRatio(@jakarta.annotation.Nullable final Double value) {
        this.averageCompressionRatio = value;
    }
    /**
     * Sets the AverageProcessingTime property value. The average processing time of each request
     * @param value Value to set for the AverageProcessingTime property.
     */
    public void setAverageProcessingTime(@jakarta.annotation.Nullable final Double value) {
        this.averageProcessingTime = value;
    }
    /**
     * Sets the AverageProcessingTimeChart property value. The AverageProcessingTimeChart property
     * @param value Value to set for the AverageProcessingTimeChart property.
     */
    public void setAverageProcessingTimeChart(@jakarta.annotation.Nullable final StatisticsGetResponseAverageProcessingTimeChart value) {
        this.averageProcessingTimeChart = value;
    }
    /**
     * Sets the RequestsOptimizedChart property value. The constructed chart of optimized requests
     * @param value Value to set for the RequestsOptimizedChart property.
     */
    public void setRequestsOptimizedChart(@jakarta.annotation.Nullable final StatisticsGetResponseRequestsOptimizedChart value) {
        this.requestsOptimizedChart = value;
    }
    /**
     * Sets the TotalRequestsOptimized property value. The total number of optimized requests
     * @param value Value to set for the TotalRequestsOptimized property.
     */
    public void setTotalRequestsOptimized(@jakarta.annotation.Nullable final Double value) {
        this.totalRequestsOptimized = value;
    }
    /**
     * Sets the TotalTrafficSaved property value. The total requests saved
     * @param value Value to set for the TotalTrafficSaved property.
     */
    public void setTotalTrafficSaved(@jakarta.annotation.Nullable final Double value) {
        this.totalTrafficSaved = value;
    }
    /**
     * Sets the TrafficSavedChart property value. The constructed chart of saved traffic
     * @param value Value to set for the TrafficSavedChart property.
     */
    public void setTrafficSavedChart(@jakarta.annotation.Nullable final StatisticsGetResponseTrafficSavedChart value) {
        this.trafficSavedChart = value;
    }
}
