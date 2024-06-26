package bunny.sdk.bunnyapiclient.pullzone.item.safehop.statistics;

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
     * The constructed chart of requests retried
     */
    private StatisticsGetResponseRequestsRetriedChart requestsRetriedChart;
    /**
     * The constructed chart of requests saved
     */
    private StatisticsGetResponseRequestsSavedChart requestsSavedChart;
    /**
     * The total number of retried requests
     */
    private Long totalRequestsRetried;
    /**
     * The total number of saved requests
     */
    private Long totalRequestsSaved;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("RequestsRetriedChart", (n) -> { this.setRequestsRetriedChart(n.getObjectValue(StatisticsGetResponseRequestsRetriedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("RequestsSavedChart", (n) -> { this.setRequestsSavedChart(n.getObjectValue(StatisticsGetResponseRequestsSavedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("TotalRequestsRetried", (n) -> { this.setTotalRequestsRetried(n.getLongValue()); });
        deserializerMap.put("TotalRequestsSaved", (n) -> { this.setTotalRequestsSaved(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the RequestsRetriedChart property value. The constructed chart of requests retried
     * @return a {@link StatisticsGetResponseRequestsRetriedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseRequestsRetriedChart getRequestsRetriedChart() {
        return this.requestsRetriedChart;
    }
    /**
     * Gets the RequestsSavedChart property value. The constructed chart of requests saved
     * @return a {@link StatisticsGetResponseRequestsSavedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseRequestsSavedChart getRequestsSavedChart() {
        return this.requestsSavedChart;
    }
    /**
     * Gets the TotalRequestsRetried property value. The total number of retried requests
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalRequestsRetried() {
        return this.totalRequestsRetried;
    }
    /**
     * Gets the TotalRequestsSaved property value. The total number of saved requests
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalRequestsSaved() {
        return this.totalRequestsSaved;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("RequestsRetriedChart", this.getRequestsRetriedChart());
        writer.writeObjectValue("RequestsSavedChart", this.getRequestsSavedChart());
        writer.writeLongValue("TotalRequestsRetried", this.getTotalRequestsRetried());
        writer.writeLongValue("TotalRequestsSaved", this.getTotalRequestsSaved());
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
     * Sets the RequestsRetriedChart property value. The constructed chart of requests retried
     * @param value Value to set for the RequestsRetriedChart property.
     */
    public void setRequestsRetriedChart(@jakarta.annotation.Nullable final StatisticsGetResponseRequestsRetriedChart value) {
        this.requestsRetriedChart = value;
    }
    /**
     * Sets the RequestsSavedChart property value. The constructed chart of requests saved
     * @param value Value to set for the RequestsSavedChart property.
     */
    public void setRequestsSavedChart(@jakarta.annotation.Nullable final StatisticsGetResponseRequestsSavedChart value) {
        this.requestsSavedChart = value;
    }
    /**
     * Sets the TotalRequestsRetried property value. The total number of retried requests
     * @param value Value to set for the TotalRequestsRetried property.
     */
    public void setTotalRequestsRetried(@jakarta.annotation.Nullable final Long value) {
        this.totalRequestsRetried = value;
    }
    /**
     * Sets the TotalRequestsSaved property value. The total number of saved requests
     * @param value Value to set for the TotalRequestsSaved property.
     */
    public void setTotalRequestsSaved(@jakarta.annotation.Nullable final Long value) {
        this.totalRequestsSaved = value;
    }
}
