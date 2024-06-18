package bunny.sdk.generated.bunnyapiclient.videolibrary;

import bunny.sdk.generated.bunnyapiclient.models.streamvideolibrary.ReplicationRegions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideolibraryPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the Video Library.
     */
    private String name;
    /**
     * The geo-replication regions of the underlying storage zone
     */
    private java.util.List<ReplicationRegions> replicationRegions;
    /**
     * Instantiates a new {@link VideolibraryPostRequestBody} and sets the default values.
     */
    public VideolibraryPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideolibraryPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static VideolibraryPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideolibraryPostRequestBody();
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
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("ReplicationRegions", (n) -> { this.setReplicationRegions(n.getCollectionOfEnumValues(ReplicationRegions::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the Name property value. The name of the Video Library.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the ReplicationRegions property value. The geo-replication regions of the underlying storage zone
     * @return a {@link java.util.List<ReplicationRegions>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReplicationRegions> getReplicationRegions() {
        return this.replicationRegions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Name", this.getName());
        writer.writeCollectionOfEnumValues("ReplicationRegions", this.getReplicationRegions());
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
     * Sets the Name property value. The name of the Video Library.
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the ReplicationRegions property value. The geo-replication regions of the underlying storage zone
     * @param value Value to set for the ReplicationRegions property.
     */
    public void setReplicationRegions(@jakarta.annotation.Nullable final java.util.List<ReplicationRegions> value) {
        this.replicationRegions = value;
    }
}
