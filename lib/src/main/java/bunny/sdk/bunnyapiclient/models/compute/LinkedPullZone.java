package bunny.sdk.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LinkedPullZone implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The DefaultHostname property
     */
    private String defaultHostname;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The PullZoneName property
     */
    private String pullZoneName;
    /**
     * Instantiates a new {@link LinkedPullZone} and sets the default values.
     */
    public LinkedPullZone() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LinkedPullZone}
     */
    @jakarta.annotation.Nonnull
    public static LinkedPullZone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkedPullZone();
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
     * Gets the DefaultHostname property value. The DefaultHostname property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("DefaultHostname", (n) -> { this.setDefaultHostname(n.getStringValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("PullZoneName", (n) -> { this.setPullZoneName(n.getStringValue()); });
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
     * Gets the PullZoneName property value. The PullZoneName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPullZoneName() {
        return this.pullZoneName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("DefaultHostname", this.getDefaultHostname());
        writer.writeLongValue("Id", this.getId());
        writer.writeStringValue("PullZoneName", this.getPullZoneName());
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
     * Sets the DefaultHostname property value. The DefaultHostname property
     * @param value Value to set for the DefaultHostname property.
     */
    public void setDefaultHostname(@jakarta.annotation.Nullable final String value) {
        this.defaultHostname = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the PullZoneName property value. The PullZoneName property
     * @param value Value to set for the PullZoneName property.
     */
    public void setPullZoneName(@jakarta.annotation.Nullable final String value) {
        this.pullZoneName = value;
    }
}
