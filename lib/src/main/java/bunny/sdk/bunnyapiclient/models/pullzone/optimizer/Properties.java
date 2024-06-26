package bunny.sdk.bunnyapiclient.models.pullzone.optimizer;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Properties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aspect_ratio property
     */
    private String aspectRatio;
    /**
     * The auto_optimize property
     */
    private PropertiesAutoOptimize autoOptimize;
    /**
     * The blur property
     */
    private String blur;
    /**
     * The brightness property
     */
    private String brightness;
    /**
     * The contrast property
     */
    private String contrast;
    /**
     * The crop property
     */
    private String crop;
    /**
     * The crop_gravity property
     */
    private PropertiesCropGravity cropGravity;
    /**
     * The flip property
     */
    private String flip;
    /**
     * The flop property
     */
    private String flop;
    /**
     * The gamma property
     */
    private String gamma;
    /**
     * The height property
     */
    private String height;
    /**
     * The hue property
     */
    private String hue;
    /**
     * The optimizer property
     */
    private PropertiesOptimizer optimizer;
    /**
     * The quality property
     */
    private String quality;
    /**
     * The saturation property
     */
    private String saturation;
    /**
     * The sharpen property
     */
    private String sharpen;
    /**
     * The width property
     */
    private String width;
    /**
     * Instantiates a new {@link Properties} and sets the default values.
     */
    public Properties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Properties}
     */
    @jakarta.annotation.Nonnull
    public static Properties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Properties();
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
     * Gets the aspect_ratio property value. The aspect_ratio property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAspectRatio() {
        return this.aspectRatio;
    }
    /**
     * Gets the auto_optimize property value. The auto_optimize property
     * @return a {@link PropertiesAutoOptimize}
     */
    @jakarta.annotation.Nullable
    public PropertiesAutoOptimize getAutoOptimize() {
        return this.autoOptimize;
    }
    /**
     * Gets the blur property value. The blur property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBlur() {
        return this.blur;
    }
    /**
     * Gets the brightness property value. The brightness property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrightness() {
        return this.brightness;
    }
    /**
     * Gets the contrast property value. The contrast property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContrast() {
        return this.contrast;
    }
    /**
     * Gets the crop property value. The crop property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCrop() {
        return this.crop;
    }
    /**
     * Gets the crop_gravity property value. The crop_gravity property
     * @return a {@link PropertiesCropGravity}
     */
    @jakarta.annotation.Nullable
    public PropertiesCropGravity getCropGravity() {
        return this.cropGravity;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("aspect_ratio", (n) -> { this.setAspectRatio(n.getStringValue()); });
        deserializerMap.put("auto_optimize", (n) -> { this.setAutoOptimize(n.getEnumValue(PropertiesAutoOptimize::forValue)); });
        deserializerMap.put("blur", (n) -> { this.setBlur(n.getStringValue()); });
        deserializerMap.put("brightness", (n) -> { this.setBrightness(n.getStringValue()); });
        deserializerMap.put("contrast", (n) -> { this.setContrast(n.getStringValue()); });
        deserializerMap.put("crop", (n) -> { this.setCrop(n.getStringValue()); });
        deserializerMap.put("crop_gravity", (n) -> { this.setCropGravity(n.getEnumValue(PropertiesCropGravity::forValue)); });
        deserializerMap.put("flip", (n) -> { this.setFlip(n.getStringValue()); });
        deserializerMap.put("flop", (n) -> { this.setFlop(n.getStringValue()); });
        deserializerMap.put("gamma", (n) -> { this.setGamma(n.getStringValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getStringValue()); });
        deserializerMap.put("hue", (n) -> { this.setHue(n.getStringValue()); });
        deserializerMap.put("optimizer", (n) -> { this.setOptimizer(n.getEnumValue(PropertiesOptimizer::forValue)); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getStringValue()); });
        deserializerMap.put("saturation", (n) -> { this.setSaturation(n.getStringValue()); });
        deserializerMap.put("sharpen", (n) -> { this.setSharpen(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flip property value. The flip property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFlip() {
        return this.flip;
    }
    /**
     * Gets the flop property value. The flop property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFlop() {
        return this.flop;
    }
    /**
     * Gets the gamma property value. The gamma property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGamma() {
        return this.gamma;
    }
    /**
     * Gets the height property value. The height property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeight() {
        return this.height;
    }
    /**
     * Gets the hue property value. The hue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHue() {
        return this.hue;
    }
    /**
     * Gets the optimizer property value. The optimizer property
     * @return a {@link PropertiesOptimizer}
     */
    @jakarta.annotation.Nullable
    public PropertiesOptimizer getOptimizer() {
        return this.optimizer;
    }
    /**
     * Gets the quality property value. The quality property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuality() {
        return this.quality;
    }
    /**
     * Gets the saturation property value. The saturation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSaturation() {
        return this.saturation;
    }
    /**
     * Gets the sharpen property value. The sharpen property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSharpen() {
        return this.sharpen;
    }
    /**
     * Gets the width property value. The width property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aspect_ratio", this.getAspectRatio());
        writer.writeEnumValue("auto_optimize", this.getAutoOptimize());
        writer.writeStringValue("blur", this.getBlur());
        writer.writeStringValue("brightness", this.getBrightness());
        writer.writeStringValue("contrast", this.getContrast());
        writer.writeStringValue("crop", this.getCrop());
        writer.writeEnumValue("crop_gravity", this.getCropGravity());
        writer.writeStringValue("flip", this.getFlip());
        writer.writeStringValue("flop", this.getFlop());
        writer.writeStringValue("gamma", this.getGamma());
        writer.writeStringValue("height", this.getHeight());
        writer.writeStringValue("hue", this.getHue());
        writer.writeEnumValue("optimizer", this.getOptimizer());
        writer.writeStringValue("quality", this.getQuality());
        writer.writeStringValue("saturation", this.getSaturation());
        writer.writeStringValue("sharpen", this.getSharpen());
        writer.writeStringValue("width", this.getWidth());
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
     * Sets the aspect_ratio property value. The aspect_ratio property
     * @param value Value to set for the aspect_ratio property.
     */
    public void setAspectRatio(@jakarta.annotation.Nullable final String value) {
        this.aspectRatio = value;
    }
    /**
     * Sets the auto_optimize property value. The auto_optimize property
     * @param value Value to set for the auto_optimize property.
     */
    public void setAutoOptimize(@jakarta.annotation.Nullable final PropertiesAutoOptimize value) {
        this.autoOptimize = value;
    }
    /**
     * Sets the blur property value. The blur property
     * @param value Value to set for the blur property.
     */
    public void setBlur(@jakarta.annotation.Nullable final String value) {
        this.blur = value;
    }
    /**
     * Sets the brightness property value. The brightness property
     * @param value Value to set for the brightness property.
     */
    public void setBrightness(@jakarta.annotation.Nullable final String value) {
        this.brightness = value;
    }
    /**
     * Sets the contrast property value. The contrast property
     * @param value Value to set for the contrast property.
     */
    public void setContrast(@jakarta.annotation.Nullable final String value) {
        this.contrast = value;
    }
    /**
     * Sets the crop property value. The crop property
     * @param value Value to set for the crop property.
     */
    public void setCrop(@jakarta.annotation.Nullable final String value) {
        this.crop = value;
    }
    /**
     * Sets the crop_gravity property value. The crop_gravity property
     * @param value Value to set for the crop_gravity property.
     */
    public void setCropGravity(@jakarta.annotation.Nullable final PropertiesCropGravity value) {
        this.cropGravity = value;
    }
    /**
     * Sets the flip property value. The flip property
     * @param value Value to set for the flip property.
     */
    public void setFlip(@jakarta.annotation.Nullable final String value) {
        this.flip = value;
    }
    /**
     * Sets the flop property value. The flop property
     * @param value Value to set for the flop property.
     */
    public void setFlop(@jakarta.annotation.Nullable final String value) {
        this.flop = value;
    }
    /**
     * Sets the gamma property value. The gamma property
     * @param value Value to set for the gamma property.
     */
    public void setGamma(@jakarta.annotation.Nullable final String value) {
        this.gamma = value;
    }
    /**
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final String value) {
        this.height = value;
    }
    /**
     * Sets the hue property value. The hue property
     * @param value Value to set for the hue property.
     */
    public void setHue(@jakarta.annotation.Nullable final String value) {
        this.hue = value;
    }
    /**
     * Sets the optimizer property value. The optimizer property
     * @param value Value to set for the optimizer property.
     */
    public void setOptimizer(@jakarta.annotation.Nullable final PropertiesOptimizer value) {
        this.optimizer = value;
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final String value) {
        this.quality = value;
    }
    /**
     * Sets the saturation property value. The saturation property
     * @param value Value to set for the saturation property.
     */
    public void setSaturation(@jakarta.annotation.Nullable final String value) {
        this.saturation = value;
    }
    /**
     * Sets the sharpen property value. The sharpen property
     * @param value Value to set for the sharpen property.
     */
    public void setSharpen(@jakarta.annotation.Nullable final String value) {
        this.sharpen = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final String value) {
        this.width = value;
    }
}
