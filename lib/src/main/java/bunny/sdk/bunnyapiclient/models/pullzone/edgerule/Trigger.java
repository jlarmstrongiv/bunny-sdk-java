package bunny.sdk.bunnyapiclient.models.pullzone.edgerule;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Trigger implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The trigger parameter 1. The value depends on the type of trigger.
     */
    private String parameter1;
    /**
     * The list of pattern matches that will trigger the edge rule
     */
    private java.util.List<String> patternMatches;
    /**
     * The PatternMatchingType property
     */
    private Double patternMatchingType;
    /**
     * The Type property
     */
    private Double type;
    /**
     * Instantiates a new {@link Trigger} and sets the default values.
     */
    public Trigger() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Trigger}
     */
    @jakarta.annotation.Nonnull
    public static Trigger createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Trigger();
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
        deserializerMap.put("Parameter1", (n) -> { this.setParameter1(n.getStringValue()); });
        deserializerMap.put("PatternMatches", (n) -> { this.setPatternMatches(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("PatternMatchingType", (n) -> { this.setPatternMatchingType(n.getDoubleValue()); });
        deserializerMap.put("Type", (n) -> { this.setType(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Parameter1 property value. The trigger parameter 1. The value depends on the type of trigger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParameter1() {
        return this.parameter1;
    }
    /**
     * Gets the PatternMatches property value. The list of pattern matches that will trigger the edge rule
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPatternMatches() {
        return this.patternMatches;
    }
    /**
     * Gets the PatternMatchingType property value. The PatternMatchingType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPatternMatchingType() {
        return this.patternMatchingType;
    }
    /**
     * Gets the Type property value. The Type property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Parameter1", this.getParameter1());
        writer.writeCollectionOfPrimitiveValues("PatternMatches", this.getPatternMatches());
        writer.writeDoubleValue("PatternMatchingType", this.getPatternMatchingType());
        writer.writeDoubleValue("Type", this.getType());
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
     * Sets the Parameter1 property value. The trigger parameter 1. The value depends on the type of trigger.
     * @param value Value to set for the Parameter1 property.
     */
    public void setParameter1(@jakarta.annotation.Nullable final String value) {
        this.parameter1 = value;
    }
    /**
     * Sets the PatternMatches property value. The list of pattern matches that will trigger the edge rule
     * @param value Value to set for the PatternMatches property.
     */
    public void setPatternMatches(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.patternMatches = value;
    }
    /**
     * Sets the PatternMatchingType property value. The PatternMatchingType property
     * @param value Value to set for the PatternMatchingType property.
     */
    public void setPatternMatchingType(@jakarta.annotation.Nullable final Double value) {
        this.patternMatchingType = value;
    }
    /**
     * Sets the Type property value. The Type property
     * @param value Value to set for the Type property.
     */
    public void setType(@jakarta.annotation.Nullable final Double value) {
        this.type = value;
    }
}
