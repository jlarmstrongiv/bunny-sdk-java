package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateShieldZoneRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The pullZoneId property
     */
    private Long pullZoneId;
    /**
     * The shieldZone property
     */
    private ShieldZoneRequest shieldZone;
    /**
     * Instantiates a new {@link CreateShieldZoneRequest} and sets the default values.
     */
    public CreateShieldZoneRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateShieldZoneRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateShieldZoneRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateShieldZoneRequest();
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
        deserializerMap.put("pullZoneId", (n) -> { this.setPullZoneId(n.getLongValue()); });
        deserializerMap.put("shieldZone", (n) -> { this.setShieldZone(n.getObjectValue(ShieldZoneRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pullZoneId property value. The pullZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPullZoneId() {
        return this.pullZoneId;
    }
    /**
     * Gets the shieldZone property value. The shieldZone property
     * @return a {@link ShieldZoneRequest}
     */
    @jakarta.annotation.Nullable
    public ShieldZoneRequest getShieldZone() {
        return this.shieldZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("pullZoneId", this.getPullZoneId());
        writer.writeObjectValue("shieldZone", this.getShieldZone());
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
     * Sets the pullZoneId property value. The pullZoneId property
     * @param value Value to set for the pullZoneId property.
     */
    public void setPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.pullZoneId = value;
    }
    /**
     * Sets the shieldZone property value. The shieldZone property
     * @param value Value to set for the shieldZone property.
     */
    public void setShieldZone(@jakarta.annotation.Nullable final ShieldZoneRequest value) {
        this.shieldZone = value;
    }
}
