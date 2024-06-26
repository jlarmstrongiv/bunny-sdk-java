package bunny.sdk.bunnyapiclient.pullzone.item.waf.statistics;

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
     * The ThreatsBlockedChart property
     */
    private StatisticsGetResponseThreatsBlockedChart threatsBlockedChart;
    /**
     * The ThreatsCheckedChart property
     */
    private StatisticsGetResponseThreatsCheckedChart threatsCheckedChart;
    /**
     * The TotalBlockedRequests property
     */
    private Long totalBlockedRequests;
    /**
     * The TotalCheckedRequests property
     */
    private Long totalCheckedRequests;
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
        deserializerMap.put("ThreatsBlockedChart", (n) -> { this.setThreatsBlockedChart(n.getObjectValue(StatisticsGetResponseThreatsBlockedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("ThreatsCheckedChart", (n) -> { this.setThreatsCheckedChart(n.getObjectValue(StatisticsGetResponseThreatsCheckedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("TotalBlockedRequests", (n) -> { this.setTotalBlockedRequests(n.getLongValue()); });
        deserializerMap.put("TotalCheckedRequests", (n) -> { this.setTotalCheckedRequests(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ThreatsBlockedChart property value. The ThreatsBlockedChart property
     * @return a {@link StatisticsGetResponseThreatsBlockedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseThreatsBlockedChart getThreatsBlockedChart() {
        return this.threatsBlockedChart;
    }
    /**
     * Gets the ThreatsCheckedChart property value. The ThreatsCheckedChart property
     * @return a {@link StatisticsGetResponseThreatsCheckedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseThreatsCheckedChart getThreatsCheckedChart() {
        return this.threatsCheckedChart;
    }
    /**
     * Gets the TotalBlockedRequests property value. The TotalBlockedRequests property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBlockedRequests() {
        return this.totalBlockedRequests;
    }
    /**
     * Gets the TotalCheckedRequests property value. The TotalCheckedRequests property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalCheckedRequests() {
        return this.totalCheckedRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("ThreatsBlockedChart", this.getThreatsBlockedChart());
        writer.writeObjectValue("ThreatsCheckedChart", this.getThreatsCheckedChart());
        writer.writeLongValue("TotalBlockedRequests", this.getTotalBlockedRequests());
        writer.writeLongValue("TotalCheckedRequests", this.getTotalCheckedRequests());
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
     * Sets the ThreatsBlockedChart property value. The ThreatsBlockedChart property
     * @param value Value to set for the ThreatsBlockedChart property.
     */
    public void setThreatsBlockedChart(@jakarta.annotation.Nullable final StatisticsGetResponseThreatsBlockedChart value) {
        this.threatsBlockedChart = value;
    }
    /**
     * Sets the ThreatsCheckedChart property value. The ThreatsCheckedChart property
     * @param value Value to set for the ThreatsCheckedChart property.
     */
    public void setThreatsCheckedChart(@jakarta.annotation.Nullable final StatisticsGetResponseThreatsCheckedChart value) {
        this.threatsCheckedChart = value;
    }
    /**
     * Sets the TotalBlockedRequests property value. The TotalBlockedRequests property
     * @param value Value to set for the TotalBlockedRequests property.
     */
    public void setTotalBlockedRequests(@jakarta.annotation.Nullable final Long value) {
        this.totalBlockedRequests = value;
    }
    /**
     * Sets the TotalCheckedRequests property value. The TotalCheckedRequests property
     * @param value Value to set for the TotalCheckedRequests property.
     */
    public void setTotalCheckedRequests(@jakarta.annotation.Nullable final Long value) {
        this.totalCheckedRequests = value;
    }
}
