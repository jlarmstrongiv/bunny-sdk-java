package bunny.sdk.bunnyapiclient.models.statistics.getstatistics;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Statistics implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The AverageOriginResponseTime property
     */
    private Integer averageOriginResponseTime;
    /**
     * The BandwidthCachedChart property
     */
    private StatisticsBandwidthCachedChart bandwidthCachedChart;
    /**
     * The BandwidthUsedChart property
     */
    private StatisticsBandwidthUsedChart bandwidthUsedChart;
    /**
     * The CacheHitRate property
     */
    private Double cacheHitRate;
    /**
     * The CacheHitRateChart property
     */
    private StatisticsCacheHitRateChart cacheHitRateChart;
    /**
     * The Error3xxChart property
     */
    private StatisticsError3xxChart error3xxChart;
    /**
     * The Error4xxChart property
     */
    private StatisticsError4xxChart error4xxChart;
    /**
     * The Error5xxChart property
     */
    private StatisticsError5xxChart error5xxChart;
    /**
     * The GeoTrafficDistribution property
     */
    private StatisticsGeoTrafficDistribution geoTrafficDistribution;
    /**
     * The OriginResponseTimeChart property
     */
    private StatisticsOriginResponseTimeChart originResponseTimeChart;
    /**
     * The OriginShieldBandwidthUsedChart property
     */
    private StatisticsOriginShieldBandwidthUsedChart originShieldBandwidthUsedChart;
    /**
     * The OriginShieldInternalBandwidthUsedChart property
     */
    private StatisticsOriginShieldInternalBandwidthUsedChart originShieldInternalBandwidthUsedChart;
    /**
     * The OriginTrafficChart property
     */
    private StatisticsOriginTrafficChart originTrafficChart;
    /**
     * The PullRequestsPulledChart property
     */
    private StatisticsPullRequestsPulledChart pullRequestsPulledChart;
    /**
     * The RequestsServedChart property
     */
    private StatisticsRequestsServedChart requestsServedChart;
    /**
     * The TotalBandwidthUsed property
     */
    private Long totalBandwidthUsed;
    /**
     * The TotalOriginTraffic property
     */
    private Long totalOriginTraffic;
    /**
     * The TotalRequestsServed property
     */
    private Long totalRequestsServed;
    /**
     * The UserBalanceHistoryChart property
     */
    private StatisticsUserBalanceHistoryChart userBalanceHistoryChart;
    /**
     * Instantiates a new {@link Statistics} and sets the default values.
     */
    public Statistics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Statistics}
     */
    @jakarta.annotation.Nonnull
    public static Statistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Statistics();
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
     * Gets the AverageOriginResponseTime property value. The AverageOriginResponseTime property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAverageOriginResponseTime() {
        return this.averageOriginResponseTime;
    }
    /**
     * Gets the BandwidthCachedChart property value. The BandwidthCachedChart property
     * @return a {@link StatisticsBandwidthCachedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsBandwidthCachedChart getBandwidthCachedChart() {
        return this.bandwidthCachedChart;
    }
    /**
     * Gets the BandwidthUsedChart property value. The BandwidthUsedChart property
     * @return a {@link StatisticsBandwidthUsedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsBandwidthUsedChart getBandwidthUsedChart() {
        return this.bandwidthUsedChart;
    }
    /**
     * Gets the CacheHitRate property value. The CacheHitRate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCacheHitRate() {
        return this.cacheHitRate;
    }
    /**
     * Gets the CacheHitRateChart property value. The CacheHitRateChart property
     * @return a {@link StatisticsCacheHitRateChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsCacheHitRateChart getCacheHitRateChart() {
        return this.cacheHitRateChart;
    }
    /**
     * Gets the Error3xxChart property value. The Error3xxChart property
     * @return a {@link StatisticsError3xxChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsError3xxChart getError3xxChart() {
        return this.error3xxChart;
    }
    /**
     * Gets the Error4xxChart property value. The Error4xxChart property
     * @return a {@link StatisticsError4xxChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsError4xxChart getError4xxChart() {
        return this.error4xxChart;
    }
    /**
     * Gets the Error5xxChart property value. The Error5xxChart property
     * @return a {@link StatisticsError5xxChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsError5xxChart getError5xxChart() {
        return this.error5xxChart;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("AverageOriginResponseTime", (n) -> { this.setAverageOriginResponseTime(n.getIntegerValue()); });
        deserializerMap.put("BandwidthCachedChart", (n) -> { this.setBandwidthCachedChart(n.getObjectValue(StatisticsBandwidthCachedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("BandwidthUsedChart", (n) -> { this.setBandwidthUsedChart(n.getObjectValue(StatisticsBandwidthUsedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("CacheHitRate", (n) -> { this.setCacheHitRate(n.getDoubleValue()); });
        deserializerMap.put("CacheHitRateChart", (n) -> { this.setCacheHitRateChart(n.getObjectValue(StatisticsCacheHitRateChart::createFromDiscriminatorValue)); });
        deserializerMap.put("Error3xxChart", (n) -> { this.setError3xxChart(n.getObjectValue(StatisticsError3xxChart::createFromDiscriminatorValue)); });
        deserializerMap.put("Error4xxChart", (n) -> { this.setError4xxChart(n.getObjectValue(StatisticsError4xxChart::createFromDiscriminatorValue)); });
        deserializerMap.put("Error5xxChart", (n) -> { this.setError5xxChart(n.getObjectValue(StatisticsError5xxChart::createFromDiscriminatorValue)); });
        deserializerMap.put("GeoTrafficDistribution", (n) -> { this.setGeoTrafficDistribution(n.getObjectValue(StatisticsGeoTrafficDistribution::createFromDiscriminatorValue)); });
        deserializerMap.put("OriginResponseTimeChart", (n) -> { this.setOriginResponseTimeChart(n.getObjectValue(StatisticsOriginResponseTimeChart::createFromDiscriminatorValue)); });
        deserializerMap.put("OriginShieldBandwidthUsedChart", (n) -> { this.setOriginShieldBandwidthUsedChart(n.getObjectValue(StatisticsOriginShieldBandwidthUsedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("OriginShieldInternalBandwidthUsedChart", (n) -> { this.setOriginShieldInternalBandwidthUsedChart(n.getObjectValue(StatisticsOriginShieldInternalBandwidthUsedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("OriginTrafficChart", (n) -> { this.setOriginTrafficChart(n.getObjectValue(StatisticsOriginTrafficChart::createFromDiscriminatorValue)); });
        deserializerMap.put("PullRequestsPulledChart", (n) -> { this.setPullRequestsPulledChart(n.getObjectValue(StatisticsPullRequestsPulledChart::createFromDiscriminatorValue)); });
        deserializerMap.put("RequestsServedChart", (n) -> { this.setRequestsServedChart(n.getObjectValue(StatisticsRequestsServedChart::createFromDiscriminatorValue)); });
        deserializerMap.put("TotalBandwidthUsed", (n) -> { this.setTotalBandwidthUsed(n.getLongValue()); });
        deserializerMap.put("TotalOriginTraffic", (n) -> { this.setTotalOriginTraffic(n.getLongValue()); });
        deserializerMap.put("TotalRequestsServed", (n) -> { this.setTotalRequestsServed(n.getLongValue()); });
        deserializerMap.put("UserBalanceHistoryChart", (n) -> { this.setUserBalanceHistoryChart(n.getObjectValue(StatisticsUserBalanceHistoryChart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the GeoTrafficDistribution property value. The GeoTrafficDistribution property
     * @return a {@link StatisticsGeoTrafficDistribution}
     */
    @jakarta.annotation.Nullable
    public StatisticsGeoTrafficDistribution getGeoTrafficDistribution() {
        return this.geoTrafficDistribution;
    }
    /**
     * Gets the OriginResponseTimeChart property value. The OriginResponseTimeChart property
     * @return a {@link StatisticsOriginResponseTimeChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsOriginResponseTimeChart getOriginResponseTimeChart() {
        return this.originResponseTimeChart;
    }
    /**
     * Gets the OriginShieldBandwidthUsedChart property value. The OriginShieldBandwidthUsedChart property
     * @return a {@link StatisticsOriginShieldBandwidthUsedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsOriginShieldBandwidthUsedChart getOriginShieldBandwidthUsedChart() {
        return this.originShieldBandwidthUsedChart;
    }
    /**
     * Gets the OriginShieldInternalBandwidthUsedChart property value. The OriginShieldInternalBandwidthUsedChart property
     * @return a {@link StatisticsOriginShieldInternalBandwidthUsedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsOriginShieldInternalBandwidthUsedChart getOriginShieldInternalBandwidthUsedChart() {
        return this.originShieldInternalBandwidthUsedChart;
    }
    /**
     * Gets the OriginTrafficChart property value. The OriginTrafficChart property
     * @return a {@link StatisticsOriginTrafficChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsOriginTrafficChart getOriginTrafficChart() {
        return this.originTrafficChart;
    }
    /**
     * Gets the PullRequestsPulledChart property value. The PullRequestsPulledChart property
     * @return a {@link StatisticsPullRequestsPulledChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsPullRequestsPulledChart getPullRequestsPulledChart() {
        return this.pullRequestsPulledChart;
    }
    /**
     * Gets the RequestsServedChart property value. The RequestsServedChart property
     * @return a {@link StatisticsRequestsServedChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsRequestsServedChart getRequestsServedChart() {
        return this.requestsServedChart;
    }
    /**
     * Gets the TotalBandwidthUsed property value. The TotalBandwidthUsed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBandwidthUsed() {
        return this.totalBandwidthUsed;
    }
    /**
     * Gets the TotalOriginTraffic property value. The TotalOriginTraffic property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalOriginTraffic() {
        return this.totalOriginTraffic;
    }
    /**
     * Gets the TotalRequestsServed property value. The TotalRequestsServed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalRequestsServed() {
        return this.totalRequestsServed;
    }
    /**
     * Gets the UserBalanceHistoryChart property value. The UserBalanceHistoryChart property
     * @return a {@link StatisticsUserBalanceHistoryChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsUserBalanceHistoryChart getUserBalanceHistoryChart() {
        return this.userBalanceHistoryChart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("AverageOriginResponseTime", this.getAverageOriginResponseTime());
        writer.writeObjectValue("BandwidthCachedChart", this.getBandwidthCachedChart());
        writer.writeObjectValue("BandwidthUsedChart", this.getBandwidthUsedChart());
        writer.writeDoubleValue("CacheHitRate", this.getCacheHitRate());
        writer.writeObjectValue("CacheHitRateChart", this.getCacheHitRateChart());
        writer.writeObjectValue("Error3xxChart", this.getError3xxChart());
        writer.writeObjectValue("Error4xxChart", this.getError4xxChart());
        writer.writeObjectValue("Error5xxChart", this.getError5xxChart());
        writer.writeObjectValue("GeoTrafficDistribution", this.getGeoTrafficDistribution());
        writer.writeObjectValue("OriginResponseTimeChart", this.getOriginResponseTimeChart());
        writer.writeObjectValue("OriginShieldBandwidthUsedChart", this.getOriginShieldBandwidthUsedChart());
        writer.writeObjectValue("OriginShieldInternalBandwidthUsedChart", this.getOriginShieldInternalBandwidthUsedChart());
        writer.writeObjectValue("OriginTrafficChart", this.getOriginTrafficChart());
        writer.writeObjectValue("PullRequestsPulledChart", this.getPullRequestsPulledChart());
        writer.writeObjectValue("RequestsServedChart", this.getRequestsServedChart());
        writer.writeLongValue("TotalBandwidthUsed", this.getTotalBandwidthUsed());
        writer.writeLongValue("TotalOriginTraffic", this.getTotalOriginTraffic());
        writer.writeLongValue("TotalRequestsServed", this.getTotalRequestsServed());
        writer.writeObjectValue("UserBalanceHistoryChart", this.getUserBalanceHistoryChart());
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
     * Sets the AverageOriginResponseTime property value. The AverageOriginResponseTime property
     * @param value Value to set for the AverageOriginResponseTime property.
     */
    public void setAverageOriginResponseTime(@jakarta.annotation.Nullable final Integer value) {
        this.averageOriginResponseTime = value;
    }
    /**
     * Sets the BandwidthCachedChart property value. The BandwidthCachedChart property
     * @param value Value to set for the BandwidthCachedChart property.
     */
    public void setBandwidthCachedChart(@jakarta.annotation.Nullable final StatisticsBandwidthCachedChart value) {
        this.bandwidthCachedChart = value;
    }
    /**
     * Sets the BandwidthUsedChart property value. The BandwidthUsedChart property
     * @param value Value to set for the BandwidthUsedChart property.
     */
    public void setBandwidthUsedChart(@jakarta.annotation.Nullable final StatisticsBandwidthUsedChart value) {
        this.bandwidthUsedChart = value;
    }
    /**
     * Sets the CacheHitRate property value. The CacheHitRate property
     * @param value Value to set for the CacheHitRate property.
     */
    public void setCacheHitRate(@jakarta.annotation.Nullable final Double value) {
        this.cacheHitRate = value;
    }
    /**
     * Sets the CacheHitRateChart property value. The CacheHitRateChart property
     * @param value Value to set for the CacheHitRateChart property.
     */
    public void setCacheHitRateChart(@jakarta.annotation.Nullable final StatisticsCacheHitRateChart value) {
        this.cacheHitRateChart = value;
    }
    /**
     * Sets the Error3xxChart property value. The Error3xxChart property
     * @param value Value to set for the Error3xxChart property.
     */
    public void setError3xxChart(@jakarta.annotation.Nullable final StatisticsError3xxChart value) {
        this.error3xxChart = value;
    }
    /**
     * Sets the Error4xxChart property value. The Error4xxChart property
     * @param value Value to set for the Error4xxChart property.
     */
    public void setError4xxChart(@jakarta.annotation.Nullable final StatisticsError4xxChart value) {
        this.error4xxChart = value;
    }
    /**
     * Sets the Error5xxChart property value. The Error5xxChart property
     * @param value Value to set for the Error5xxChart property.
     */
    public void setError5xxChart(@jakarta.annotation.Nullable final StatisticsError5xxChart value) {
        this.error5xxChart = value;
    }
    /**
     * Sets the GeoTrafficDistribution property value. The GeoTrafficDistribution property
     * @param value Value to set for the GeoTrafficDistribution property.
     */
    public void setGeoTrafficDistribution(@jakarta.annotation.Nullable final StatisticsGeoTrafficDistribution value) {
        this.geoTrafficDistribution = value;
    }
    /**
     * Sets the OriginResponseTimeChart property value. The OriginResponseTimeChart property
     * @param value Value to set for the OriginResponseTimeChart property.
     */
    public void setOriginResponseTimeChart(@jakarta.annotation.Nullable final StatisticsOriginResponseTimeChart value) {
        this.originResponseTimeChart = value;
    }
    /**
     * Sets the OriginShieldBandwidthUsedChart property value. The OriginShieldBandwidthUsedChart property
     * @param value Value to set for the OriginShieldBandwidthUsedChart property.
     */
    public void setOriginShieldBandwidthUsedChart(@jakarta.annotation.Nullable final StatisticsOriginShieldBandwidthUsedChart value) {
        this.originShieldBandwidthUsedChart = value;
    }
    /**
     * Sets the OriginShieldInternalBandwidthUsedChart property value. The OriginShieldInternalBandwidthUsedChart property
     * @param value Value to set for the OriginShieldInternalBandwidthUsedChart property.
     */
    public void setOriginShieldInternalBandwidthUsedChart(@jakarta.annotation.Nullable final StatisticsOriginShieldInternalBandwidthUsedChart value) {
        this.originShieldInternalBandwidthUsedChart = value;
    }
    /**
     * Sets the OriginTrafficChart property value. The OriginTrafficChart property
     * @param value Value to set for the OriginTrafficChart property.
     */
    public void setOriginTrafficChart(@jakarta.annotation.Nullable final StatisticsOriginTrafficChart value) {
        this.originTrafficChart = value;
    }
    /**
     * Sets the PullRequestsPulledChart property value. The PullRequestsPulledChart property
     * @param value Value to set for the PullRequestsPulledChart property.
     */
    public void setPullRequestsPulledChart(@jakarta.annotation.Nullable final StatisticsPullRequestsPulledChart value) {
        this.pullRequestsPulledChart = value;
    }
    /**
     * Sets the RequestsServedChart property value. The RequestsServedChart property
     * @param value Value to set for the RequestsServedChart property.
     */
    public void setRequestsServedChart(@jakarta.annotation.Nullable final StatisticsRequestsServedChart value) {
        this.requestsServedChart = value;
    }
    /**
     * Sets the TotalBandwidthUsed property value. The TotalBandwidthUsed property
     * @param value Value to set for the TotalBandwidthUsed property.
     */
    public void setTotalBandwidthUsed(@jakarta.annotation.Nullable final Long value) {
        this.totalBandwidthUsed = value;
    }
    /**
     * Sets the TotalOriginTraffic property value. The TotalOriginTraffic property
     * @param value Value to set for the TotalOriginTraffic property.
     */
    public void setTotalOriginTraffic(@jakarta.annotation.Nullable final Long value) {
        this.totalOriginTraffic = value;
    }
    /**
     * Sets the TotalRequestsServed property value. The TotalRequestsServed property
     * @param value Value to set for the TotalRequestsServed property.
     */
    public void setTotalRequestsServed(@jakarta.annotation.Nullable final Long value) {
        this.totalRequestsServed = value;
    }
    /**
     * Sets the UserBalanceHistoryChart property value. The UserBalanceHistoryChart property
     * @param value Value to set for the UserBalanceHistoryChart property.
     */
    public void setUserBalanceHistoryChart(@jakarta.annotation.Nullable final StatisticsUserBalanceHistoryChart value) {
        this.userBalanceHistoryChart = value;
    }
}
