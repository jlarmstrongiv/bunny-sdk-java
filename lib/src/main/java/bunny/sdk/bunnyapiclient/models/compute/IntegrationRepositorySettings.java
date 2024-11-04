package bunny.sdk.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationRepositorySettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Name property
     */
    private String name;
    /**
     * The Private property
     */
    private Boolean privateEscaped;
    /**
     * The TemplateUrl property
     */
    private String templateUrl;
    /**
     * Instantiates a new {@link IntegrationRepositorySettings} and sets the default values.
     */
    public IntegrationRepositorySettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IntegrationRepositorySettings}
     */
    @jakarta.annotation.Nonnull
    public static IntegrationRepositorySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntegrationRepositorySettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("Private", (n) -> { this.setPrivate(n.getBooleanValue()); });
        deserializerMap.put("TemplateUrl", (n) -> { this.setTemplateUrl(n.getStringValue()); });
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
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the Private property value. The Private property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivate() {
        return this.privateEscaped;
    }
    /**
     * Gets the TemplateUrl property value. The TemplateUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateUrl() {
        return this.templateUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Name", this.getName());
        writer.writeBooleanValue("Private", this.getPrivate());
        writer.writeStringValue("TemplateUrl", this.getTemplateUrl());
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
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the Private property value. The Private property
     * @param value Value to set for the Private property.
     */
    public void setPrivate(@jakarta.annotation.Nullable final Boolean value) {
        this.privateEscaped = value;
    }
    /**
     * Sets the TemplateUrl property value. The TemplateUrl property
     * @param value Value to set for the TemplateUrl property.
     */
    public void setTemplateUrl(@jakarta.annotation.Nullable final String value) {
        this.templateUrl = value;
    }
}
