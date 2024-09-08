package bunny.sdk.bunnyapiclient.models.billing.getaffiliatedetails;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AffiliateDetailsResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amount of affiliate credits on the account
     */
    private Double affiliateBalance;
    /**
     * The constructed affiliate click history chart data
     */
    private AffiliateDetailsResultAffiliateClicksChart affiliateClicksChart;
    /**
     * The constructed affiliate signup history chart data
     */
    private AffiliateDetailsResultAffiliateSignupsChart affiliateSignupsChart;
    /**
     * The affiliate URL for the currently authenticated user
     */
    private String affiliateUrl;
    /**
     * Instantiates a new {@link AffiliateDetailsResult} and sets the default values.
     */
    public AffiliateDetailsResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AffiliateDetailsResult}
     */
    @jakarta.annotation.Nonnull
    public static AffiliateDetailsResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AffiliateDetailsResult();
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
     * Gets the AffiliateBalance property value. The amount of affiliate credits on the account
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAffiliateBalance() {
        return this.affiliateBalance;
    }
    /**
     * Gets the AffiliateClicksChart property value. The constructed affiliate click history chart data
     * @return a {@link AffiliateDetailsResultAffiliateClicksChart}
     */
    @jakarta.annotation.Nullable
    public AffiliateDetailsResultAffiliateClicksChart getAffiliateClicksChart() {
        return this.affiliateClicksChart;
    }
    /**
     * Gets the AffiliateSignupsChart property value. The constructed affiliate signup history chart data
     * @return a {@link AffiliateDetailsResultAffiliateSignupsChart}
     */
    @jakarta.annotation.Nullable
    public AffiliateDetailsResultAffiliateSignupsChart getAffiliateSignupsChart() {
        return this.affiliateSignupsChart;
    }
    /**
     * Gets the AffiliateUrl property value. The affiliate URL for the currently authenticated user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAffiliateUrl() {
        return this.affiliateUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("AffiliateBalance", (n) -> { this.setAffiliateBalance(n.getDoubleValue()); });
        deserializerMap.put("AffiliateClicksChart", (n) -> { this.setAffiliateClicksChart(n.getObjectValue(AffiliateDetailsResultAffiliateClicksChart::createFromDiscriminatorValue)); });
        deserializerMap.put("AffiliateSignupsChart", (n) -> { this.setAffiliateSignupsChart(n.getObjectValue(AffiliateDetailsResultAffiliateSignupsChart::createFromDiscriminatorValue)); });
        deserializerMap.put("AffiliateUrl", (n) -> { this.setAffiliateUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("AffiliateBalance", this.getAffiliateBalance());
        writer.writeObjectValue("AffiliateClicksChart", this.getAffiliateClicksChart());
        writer.writeObjectValue("AffiliateSignupsChart", this.getAffiliateSignupsChart());
        writer.writeStringValue("AffiliateUrl", this.getAffiliateUrl());
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
     * Sets the AffiliateBalance property value. The amount of affiliate credits on the account
     * @param value Value to set for the AffiliateBalance property.
     */
    public void setAffiliateBalance(@jakarta.annotation.Nullable final Double value) {
        this.affiliateBalance = value;
    }
    /**
     * Sets the AffiliateClicksChart property value. The constructed affiliate click history chart data
     * @param value Value to set for the AffiliateClicksChart property.
     */
    public void setAffiliateClicksChart(@jakarta.annotation.Nullable final AffiliateDetailsResultAffiliateClicksChart value) {
        this.affiliateClicksChart = value;
    }
    /**
     * Sets the AffiliateSignupsChart property value. The constructed affiliate signup history chart data
     * @param value Value to set for the AffiliateSignupsChart property.
     */
    public void setAffiliateSignupsChart(@jakarta.annotation.Nullable final AffiliateDetailsResultAffiliateSignupsChart value) {
        this.affiliateSignupsChart = value;
    }
    /**
     * Sets the AffiliateUrl property value. The affiliate URL for the currently authenticated user
     * @param value Value to set for the AffiliateUrl property.
     */
    public void setAffiliateUrl(@jakarta.annotation.Nullable final String value) {
        this.affiliateUrl = value;
    }
}
