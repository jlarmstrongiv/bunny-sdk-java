package bunny.sdk.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScriptCreate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Code property
     */
    private String code;
    /**
     * The CreateLinkedPullZone property
     */
    private Boolean createLinkedPullZone;
    /**
     * The Integration property
     */
    private Integration integration;
    /**
     * The Name property
     */
    private String name;
    /**
     * The ScriptType property
     */
    private Double scriptType;
    /**
     * Instantiates a new {@link ScriptCreate} and sets the default values.
     */
    public ScriptCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ScriptCreate}
     */
    @jakarta.annotation.Nonnull
    public static ScriptCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScriptCreate();
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
     * Gets the Code property value. The Code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the CreateLinkedPullZone property value. The CreateLinkedPullZone property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateLinkedPullZone() {
        return this.createLinkedPullZone;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("Code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("CreateLinkedPullZone", (n) -> { this.setCreateLinkedPullZone(n.getBooleanValue()); });
        deserializerMap.put("Integration", (n) -> { this.setIntegration(n.getObjectValue(Integration::createFromDiscriminatorValue)); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("ScriptType", (n) -> { this.setScriptType(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Integration property value. The Integration property
     * @return a {@link Integration}
     */
    @jakarta.annotation.Nullable
    public Integration getIntegration() {
        return this.integration;
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
     * Gets the ScriptType property value. The ScriptType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getScriptType() {
        return this.scriptType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Code", this.getCode());
        writer.writeBooleanValue("CreateLinkedPullZone", this.getCreateLinkedPullZone());
        writer.writeObjectValue("Integration", this.getIntegration());
        writer.writeStringValue("Name", this.getName());
        writer.writeDoubleValue("ScriptType", this.getScriptType());
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
     * Sets the Code property value. The Code property
     * @param value Value to set for the Code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the CreateLinkedPullZone property value. The CreateLinkedPullZone property
     * @param value Value to set for the CreateLinkedPullZone property.
     */
    public void setCreateLinkedPullZone(@jakarta.annotation.Nullable final Boolean value) {
        this.createLinkedPullZone = value;
    }
    /**
     * Sets the Integration property value. The Integration property
     * @param value Value to set for the Integration property.
     */
    public void setIntegration(@jakarta.annotation.Nullable final Integration value) {
        this.integration = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the ScriptType property value. The ScriptType property
     * @param value Value to set for the ScriptType property.
     */
    public void setScriptType(@jakarta.annotation.Nullable final Double value) {
        this.scriptType = value;
    }
}
