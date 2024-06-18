package bunny.sdk.generated.bunnyapiclient.models.apikeys.listapikeys;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiKey implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Key property
     */
    private String key;
    /**
     * The Roles property
     */
    private java.util.List<String> roles;
    /**
     * Instantiates a new {@link ApiKey} and sets the default values.
     */
    public ApiKey() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApiKey}
     */
    @jakarta.annotation.Nonnull
    public static ApiKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApiKey();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("Roles", (n) -> { this.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the Id property value. The Id property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the Key property value. The Key property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the Roles property value. The Roles property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.roles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("Id", this.getId());
        writer.writeStringValue("Key", this.getKey());
        writer.writeCollectionOfPrimitiveValues("Roles", this.getRoles());
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
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Key property value. The Key property
     * @param value Value to set for the Key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the Roles property value. The Roles property
     * @param value Value to set for the Roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roles = value;
    }
}
