package bunny.sdk.generated.bunnyapiclient.models.pullzone;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BunnyAiImageBlueprintProperties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Cfg property
     */
    private String cfg;
    /**
     * The NegativePrompt property
     */
    private String negativePrompt;
    /**
     * The PostPrompt property
     */
    private String postPrompt;
    /**
     * The PrePrompt property
     */
    private String prePrompt;
    /**
     * The Steps property
     */
    private String steps;
    /**
     * Instantiates a new {@link BunnyAiImageBlueprintProperties} and sets the default values.
     */
    public BunnyAiImageBlueprintProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BunnyAiImageBlueprintProperties}
     */
    @jakarta.annotation.Nonnull
    public static BunnyAiImageBlueprintProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BunnyAiImageBlueprintProperties();
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
     * Gets the Cfg property value. The Cfg property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCfg() {
        return this.cfg;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("Cfg", (n) -> { this.setCfg(n.getStringValue()); });
        deserializerMap.put("NegativePrompt", (n) -> { this.setNegativePrompt(n.getStringValue()); });
        deserializerMap.put("PostPrompt", (n) -> { this.setPostPrompt(n.getStringValue()); });
        deserializerMap.put("PrePrompt", (n) -> { this.setPrePrompt(n.getStringValue()); });
        deserializerMap.put("Steps", (n) -> { this.setSteps(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the NegativePrompt property value. The NegativePrompt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativePrompt() {
        return this.negativePrompt;
    }
    /**
     * Gets the PostPrompt property value. The PostPrompt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostPrompt() {
        return this.postPrompt;
    }
    /**
     * Gets the PrePrompt property value. The PrePrompt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrePrompt() {
        return this.prePrompt;
    }
    /**
     * Gets the Steps property value. The Steps property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSteps() {
        return this.steps;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Cfg", this.getCfg());
        writer.writeStringValue("NegativePrompt", this.getNegativePrompt());
        writer.writeStringValue("PostPrompt", this.getPostPrompt());
        writer.writeStringValue("PrePrompt", this.getPrePrompt());
        writer.writeStringValue("Steps", this.getSteps());
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
     * Sets the Cfg property value. The Cfg property
     * @param value Value to set for the Cfg property.
     */
    public void setCfg(@jakarta.annotation.Nullable final String value) {
        this.cfg = value;
    }
    /**
     * Sets the NegativePrompt property value. The NegativePrompt property
     * @param value Value to set for the NegativePrompt property.
     */
    public void setNegativePrompt(@jakarta.annotation.Nullable final String value) {
        this.negativePrompt = value;
    }
    /**
     * Sets the PostPrompt property value. The PostPrompt property
     * @param value Value to set for the PostPrompt property.
     */
    public void setPostPrompt(@jakarta.annotation.Nullable final String value) {
        this.postPrompt = value;
    }
    /**
     * Sets the PrePrompt property value. The PrePrompt property
     * @param value Value to set for the PrePrompt property.
     */
    public void setPrePrompt(@jakarta.annotation.Nullable final String value) {
        this.prePrompt = value;
    }
    /**
     * Sets the Steps property value. The Steps property
     * @param value Value to set for the Steps property.
     */
    public void setSteps(@jakarta.annotation.Nullable final String value) {
        this.steps = value;
    }
}
