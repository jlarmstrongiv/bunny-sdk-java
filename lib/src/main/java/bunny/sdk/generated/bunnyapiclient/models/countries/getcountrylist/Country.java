package bunny.sdk.generated.bunnyapiclient.models.countries.getcountrylist;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Country implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The FlagUrl property
     */
    private String flagUrl;
    /**
     * The IsEU property
     */
    private Boolean isEU;
    /**
     * The IsoCode property
     */
    private String isoCode;
    /**
     * The Name property
     */
    private String name;
    /**
     * The PopList property
     */
    private java.util.List<String> popList;
    /**
     * The TaxPrefix property
     */
    private String taxPrefix;
    /**
     * The TaxRate property
     */
    private Double taxRate;
    /**
     * Instantiates a new {@link Country} and sets the default values.
     */
    public Country() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Country}
     */
    @jakarta.annotation.Nonnull
    public static Country createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Country();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("FlagUrl", (n) -> { this.setFlagUrl(n.getStringValue()); });
        deserializerMap.put("IsEU", (n) -> { this.setIsEU(n.getBooleanValue()); });
        deserializerMap.put("IsoCode", (n) -> { this.setIsoCode(n.getStringValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("PopList", (n) -> { this.setPopList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("TaxPrefix", (n) -> { this.setTaxPrefix(n.getStringValue()); });
        deserializerMap.put("TaxRate", (n) -> { this.setTaxRate(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FlagUrl property value. The FlagUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFlagUrl() {
        return this.flagUrl;
    }
    /**
     * Gets the IsEU property value. The IsEU property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEU() {
        return this.isEU;
    }
    /**
     * Gets the IsoCode property value. The IsoCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIsoCode() {
        return this.isoCode;
    }
    /**
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the PopList property value. The PopList property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPopList() {
        return this.popList;
    }
    /**
     * Gets the TaxPrefix property value. The TaxPrefix property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxPrefix() {
        return this.taxPrefix;
    }
    /**
     * Gets the TaxRate property value. The TaxRate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTaxRate() {
        return this.taxRate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("FlagUrl", this.getFlagUrl());
        writer.writeBooleanValue("IsEU", this.getIsEU());
        writer.writeStringValue("IsoCode", this.getIsoCode());
        writer.writeStringValue("Name", this.getName());
        writer.writeCollectionOfPrimitiveValues("PopList", this.getPopList());
        writer.writeStringValue("TaxPrefix", this.getTaxPrefix());
        writer.writeDoubleValue("TaxRate", this.getTaxRate());
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
     * Sets the FlagUrl property value. The FlagUrl property
     * @param value Value to set for the FlagUrl property.
     */
    public void setFlagUrl(@jakarta.annotation.Nullable final String value) {
        this.flagUrl = value;
    }
    /**
     * Sets the IsEU property value. The IsEU property
     * @param value Value to set for the IsEU property.
     */
    public void setIsEU(@jakarta.annotation.Nullable final Boolean value) {
        this.isEU = value;
    }
    /**
     * Sets the IsoCode property value. The IsoCode property
     * @param value Value to set for the IsoCode property.
     */
    public void setIsoCode(@jakarta.annotation.Nullable final String value) {
        this.isoCode = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the PopList property value. The PopList property
     * @param value Value to set for the PopList property.
     */
    public void setPopList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.popList = value;
    }
    /**
     * Sets the TaxPrefix property value. The TaxPrefix property
     * @param value Value to set for the TaxPrefix property.
     */
    public void setTaxPrefix(@jakarta.annotation.Nullable final String value) {
        this.taxPrefix = value;
    }
    /**
     * Sets the TaxRate property value. The TaxRate property
     * @param value Value to set for the TaxRate property.
     */
    public void setTaxRate(@jakarta.annotation.Nullable final Double value) {
        this.taxRate = value;
    }
}
