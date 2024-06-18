package bunny.sdk.generated.bunnyapiclient.models.streamvideolibrary.getlanguages;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Language implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Name property
     */
    private String name;
    /**
     * The ShortCode property
     */
    private String shortCode;
    /**
     * The SupportPlayerTranslation property
     */
    private Boolean supportPlayerTranslation;
    /**
     * The SupportTranscribing property
     */
    private Boolean supportTranscribing;
    /**
     * The TranscribingAccuracy property
     */
    private Integer transcribingAccuracy;
    /**
     * Instantiates a new {@link Language} and sets the default values.
     */
    public Language() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Language}
     */
    @jakarta.annotation.Nonnull
    public static Language createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Language();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("ShortCode", (n) -> { this.setShortCode(n.getStringValue()); });
        deserializerMap.put("SupportPlayerTranslation", (n) -> { this.setSupportPlayerTranslation(n.getBooleanValue()); });
        deserializerMap.put("SupportTranscribing", (n) -> { this.setSupportTranscribing(n.getBooleanValue()); });
        deserializerMap.put("TranscribingAccuracy", (n) -> { this.setTranscribingAccuracy(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the ShortCode property value. The ShortCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShortCode() {
        return this.shortCode;
    }
    /**
     * Gets the SupportPlayerTranslation property value. The SupportPlayerTranslation property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportPlayerTranslation() {
        return this.supportPlayerTranslation;
    }
    /**
     * Gets the SupportTranscribing property value. The SupportTranscribing property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportTranscribing() {
        return this.supportTranscribing;
    }
    /**
     * Gets the TranscribingAccuracy property value. The TranscribingAccuracy property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTranscribingAccuracy() {
        return this.transcribingAccuracy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Name", this.getName());
        writer.writeStringValue("ShortCode", this.getShortCode());
        writer.writeBooleanValue("SupportPlayerTranslation", this.getSupportPlayerTranslation());
        writer.writeBooleanValue("SupportTranscribing", this.getSupportTranscribing());
        writer.writeIntegerValue("TranscribingAccuracy", this.getTranscribingAccuracy());
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
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the ShortCode property value. The ShortCode property
     * @param value Value to set for the ShortCode property.
     */
    public void setShortCode(@jakarta.annotation.Nullable final String value) {
        this.shortCode = value;
    }
    /**
     * Sets the SupportPlayerTranslation property value. The SupportPlayerTranslation property
     * @param value Value to set for the SupportPlayerTranslation property.
     */
    public void setSupportPlayerTranslation(@jakarta.annotation.Nullable final Boolean value) {
        this.supportPlayerTranslation = value;
    }
    /**
     * Sets the SupportTranscribing property value. The SupportTranscribing property
     * @param value Value to set for the SupportTranscribing property.
     */
    public void setSupportTranscribing(@jakarta.annotation.Nullable final Boolean value) {
        this.supportTranscribing = value;
    }
    /**
     * Sets the TranscribingAccuracy property value. The TranscribingAccuracy property
     * @param value Value to set for the TranscribingAccuracy property.
     */
    public void setTranscribingAccuracy(@jakarta.annotation.Nullable final Integer value) {
        this.transcribingAccuracy = value;
    }
}
