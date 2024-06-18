package bunny.sdk.generated.bunnyapiclient.dnszone.item.statistics;

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
     * The QueriesByTypeChart property
     */
    private StatisticsGetResponseQueriesByTypeChart queriesByTypeChart;
    /**
     * The QueriesServedChart property
     */
    private StatisticsGetResponseQueriesServedChart queriesServedChart;
    /**
     * The TotalQueriesServed property
     */
    private Long totalQueriesServed;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("QueriesByTypeChart", (n) -> { this.setQueriesByTypeChart(n.getObjectValue(StatisticsGetResponseQueriesByTypeChart::createFromDiscriminatorValue)); });
        deserializerMap.put("QueriesServedChart", (n) -> { this.setQueriesServedChart(n.getObjectValue(StatisticsGetResponseQueriesServedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("TotalQueriesServed", (n) -> { this.setTotalQueriesServed(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the QueriesByTypeChart property value. The QueriesByTypeChart property
     * @return a {@link StatisticsGetResponseQueriesByTypeChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseQueriesByTypeChart getQueriesByTypeChart() {
        return this.queriesByTypeChart;
    }
    /**
     * Gets the QueriesServedChart property value. The QueriesServedChart property
     * @return a {@link StatisticsGetResponseQueriesServedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseQueriesServedChart getQueriesServedChart() {
        return this.queriesServedChart;
    }
    /**
     * Gets the TotalQueriesServed property value. The TotalQueriesServed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalQueriesServed() {
        return this.totalQueriesServed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("QueriesByTypeChart", this.getQueriesByTypeChart());
        writer.writeObjectValue("QueriesServedChart", this.getQueriesServedChart());
        writer.writeLongValue("TotalQueriesServed", this.getTotalQueriesServed());
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
     * Sets the QueriesByTypeChart property value. The QueriesByTypeChart property
     * @param value Value to set for the QueriesByTypeChart property.
     */
    public void setQueriesByTypeChart(@jakarta.annotation.Nullable final StatisticsGetResponseQueriesByTypeChart value) {
        this.queriesByTypeChart = value;
    }
    /**
     * Sets the QueriesServedChart property value. The QueriesServedChart property
     * @param value Value to set for the QueriesServedChart property.
     */
    public void setQueriesServedChart(@jakarta.annotation.Nullable final StatisticsGetResponseQueriesServedChart value) {
        this.queriesServedChart = value;
    }
    /**
     * Sets the TotalQueriesServed property value. The TotalQueriesServed property
     * @param value Value to set for the TotalQueriesServed property.
     */
    public void setTotalQueriesServed(@jakarta.annotation.Nullable final Long value) {
        this.totalQueriesServed = value;
    }
}
