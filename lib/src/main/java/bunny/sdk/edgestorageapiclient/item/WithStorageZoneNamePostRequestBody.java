package bunny.sdk.edgestorageapiclient.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithStorageZoneNamePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Paths property
     */
    private java.util.List<String> paths;
    /**
     * The RootPath property
     */
    private String rootPath;
    /**
     * Instantiates a new {@link WithStorageZoneNamePostRequestBody} and sets the default values.
     */
    public WithStorageZoneNamePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WithStorageZoneNamePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static WithStorageZoneNamePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithStorageZoneNamePostRequestBody();
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
        deserializerMap.put("Paths", (n) -> { this.setPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("RootPath", (n) -> { this.setRootPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Paths property value. The Paths property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPaths() {
        return this.paths;
    }
    /**
     * Gets the RootPath property value. The RootPath property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRootPath() {
        return this.rootPath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("Paths", this.getPaths());
        writer.writeStringValue("RootPath", this.getRootPath());
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
     * Sets the Paths property value. The Paths property
     * @param value Value to set for the Paths property.
     */
    public void setPaths(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.paths = value;
    }
    /**
     * Sets the RootPath property value. The RootPath property
     * @param value Value to set for the RootPath property.
     */
    public void setRootPath(@jakarta.annotation.Nullable final String value) {
        this.rootPath = value;
    }
}
