package bunny.sdk.bunnyapiclient.pullzone.setzonesecurityenabled;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetZoneSecurityEnabledPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the requested Pull Zone
     */
    private Long id;
    /**
     * Set to true to enable Token Authentication
     */
    private Boolean value;
    /**
     * Instantiates a new {@link SetZoneSecurityEnabledPostRequestBody} and sets the default values.
     */
    public SetZoneSecurityEnabledPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetZoneSecurityEnabledPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SetZoneSecurityEnabledPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetZoneSecurityEnabledPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Value", (n) -> { this.setValue(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Id property value. The ID of the requested Pull Zone
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the Value property value. Set to true to enable Token Authentication
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("Id", this.getId());
        writer.writeBooleanValue("Value", this.getValue());
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
     * Sets the Id property value. The ID of the requested Pull Zone
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Value property value. Set to true to enable Token Authentication
     * @param value Value to set for the Value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Boolean value) {
        this.value = value;
    }
}
