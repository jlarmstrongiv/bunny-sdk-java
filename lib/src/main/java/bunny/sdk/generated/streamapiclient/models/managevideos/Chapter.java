package bunny.sdk.generated.streamapiclient.models.managevideos;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Chapter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The end time of the chapter in seconds
     */
    private Integer end;
    /**
     * The start time of the chapter in seconds
     */
    private Integer start;
    /**
     * The title of the chapter
     */
    private String title;
    /**
     * Instantiates a new {@link Chapter} and sets the default values.
     */
    public Chapter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Chapter}
     */
    @jakarta.annotation.Nonnull
    public static Chapter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Chapter();
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
     * Gets the end property value. The end time of the chapter in seconds
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEnd() {
        return this.end;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("end", (n) -> { this.setEnd(n.getIntegerValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getIntegerValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the start property value. The start time of the chapter in seconds
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStart() {
        return this.start;
    }
    /**
     * Gets the title property value. The title of the chapter
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("end", this.getEnd());
        writer.writeIntegerValue("start", this.getStart());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the end property value. The end time of the chapter in seconds
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final Integer value) {
        this.end = value;
    }
    /**
     * Sets the start property value. The start time of the chapter in seconds
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final Integer value) {
        this.start = value;
    }
    /**
     * Sets the title property value. The title of the chapter
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
