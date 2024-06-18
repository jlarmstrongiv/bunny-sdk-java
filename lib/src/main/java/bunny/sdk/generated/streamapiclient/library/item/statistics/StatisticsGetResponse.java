package bunny.sdk.generated.streamapiclient.library.item.statistics;

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
     * The countryViewCounts property
     */
    private StatisticsGetResponseCountryViewCounts countryViewCounts;
    /**
     * The countryWatchTime property
     */
    private StatisticsGetResponseCountryWatchTime countryWatchTime;
    /**
     * The engagementScore property
     */
    private Integer engagementScore;
    /**
     * The viewsChart property
     */
    private StatisticsGetResponseViewsChart viewsChart;
    /**
     * The watchTimeChart property
     */
    private StatisticsGetResponseWatchTimeChart watchTimeChart;
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
     * Gets the countryViewCounts property value. The countryViewCounts property
     * @return a {@link StatisticsGetResponseCountryViewCounts}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseCountryViewCounts getCountryViewCounts() {
        return this.countryViewCounts;
    }
    /**
     * Gets the countryWatchTime property value. The countryWatchTime property
     * @return a {@link StatisticsGetResponseCountryWatchTime}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseCountryWatchTime getCountryWatchTime() {
        return this.countryWatchTime;
    }
    /**
     * Gets the engagementScore property value. The engagementScore property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEngagementScore() {
        return this.engagementScore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("countryViewCounts", (n) -> { this.setCountryViewCounts(n.getObjectValue(StatisticsGetResponseCountryViewCounts::createFromDiscriminatorValue)); });
        deserializerMap.put("countryWatchTime", (n) -> { this.setCountryWatchTime(n.getObjectValue(StatisticsGetResponseCountryWatchTime::createFromDiscriminatorValue)); });
        deserializerMap.put("engagementScore", (n) -> { this.setEngagementScore(n.getIntegerValue()); });
        deserializerMap.put("viewsChart", (n) -> { this.setViewsChart(n.getObjectValue(StatisticsGetResponseViewsChart::createFromDiscriminatorValue)); });
        deserializerMap.put("watchTimeChart", (n) -> { this.setWatchTimeChart(n.getObjectValue(StatisticsGetResponseWatchTimeChart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the viewsChart property value. The viewsChart property
     * @return a {@link StatisticsGetResponseViewsChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseViewsChart getViewsChart() {
        return this.viewsChart;
    }
    /**
     * Gets the watchTimeChart property value. The watchTimeChart property
     * @return a {@link StatisticsGetResponseWatchTimeChart}
     */
    @jakarta.annotation.Nullable
    public StatisticsGetResponseWatchTimeChart getWatchTimeChart() {
        return this.watchTimeChart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("countryViewCounts", this.getCountryViewCounts());
        writer.writeObjectValue("countryWatchTime", this.getCountryWatchTime());
        writer.writeIntegerValue("engagementScore", this.getEngagementScore());
        writer.writeObjectValue("viewsChart", this.getViewsChart());
        writer.writeObjectValue("watchTimeChart", this.getWatchTimeChart());
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
     * Sets the countryViewCounts property value. The countryViewCounts property
     * @param value Value to set for the countryViewCounts property.
     */
    public void setCountryViewCounts(@jakarta.annotation.Nullable final StatisticsGetResponseCountryViewCounts value) {
        this.countryViewCounts = value;
    }
    /**
     * Sets the countryWatchTime property value. The countryWatchTime property
     * @param value Value to set for the countryWatchTime property.
     */
    public void setCountryWatchTime(@jakarta.annotation.Nullable final StatisticsGetResponseCountryWatchTime value) {
        this.countryWatchTime = value;
    }
    /**
     * Sets the engagementScore property value. The engagementScore property
     * @param value Value to set for the engagementScore property.
     */
    public void setEngagementScore(@jakarta.annotation.Nullable final Integer value) {
        this.engagementScore = value;
    }
    /**
     * Sets the viewsChart property value. The viewsChart property
     * @param value Value to set for the viewsChart property.
     */
    public void setViewsChart(@jakarta.annotation.Nullable final StatisticsGetResponseViewsChart value) {
        this.viewsChart = value;
    }
    /**
     * Sets the watchTimeChart property value. The watchTimeChart property
     * @param value Value to set for the watchTimeChart property.
     */
    public void setWatchTimeChart(@jakarta.annotation.Nullable final StatisticsGetResponseWatchTimeChart value) {
        this.watchTimeChart = value;
    }
}
