package bunny.sdk.streamapiclient.library.item.videos.item.captions.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSrclangPathParameterPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Base64 encoded captions file
     */
    private String captionsFile;
    /**
     * The text description label for the caption
     */
    private String label;
    /**
     * The unique srclang shortcode for the caption
     */
    private String srclang;
    /**
     * Instantiates a new {@link WithSrclangPathParameterPostRequestBody} and sets the default values.
     */
    public WithSrclangPathParameterPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WithSrclangPathParameterPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static WithSrclangPathParameterPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithSrclangPathParameterPostRequestBody();
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
     * Gets the captionsFile property value. Base64 encoded captions file
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptionsFile() {
        return this.captionsFile;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("captionsFile", (n) -> { this.setCaptionsFile(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("srclang", (n) -> { this.setSrclang(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. The text description label for the caption
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the srclang property value. The unique srclang shortcode for the caption
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSrclang() {
        return this.srclang;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("captionsFile", this.getCaptionsFile());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("srclang", this.getSrclang());
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
     * Sets the captionsFile property value. Base64 encoded captions file
     * @param value Value to set for the captionsFile property.
     */
    public void setCaptionsFile(@jakarta.annotation.Nullable final String value) {
        this.captionsFile = value;
    }
    /**
     * Sets the label property value. The text description label for the caption
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the srclang property value. The unique srclang shortcode for the caption
     * @param value Value to set for the srclang property.
     */
    public void setSrclang(@jakarta.annotation.Nullable final String value) {
        this.srclang = value;
    }
}
