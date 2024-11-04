package bunny.sdk.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Integration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The DeployConfiguration property
     */
    private IntegrationDeployConfiguration deployConfiguration;
    /**
     * The IntegrationId property
     */
    private Long integrationId;
    /**
     * The RepositorySettings property
     */
    private IntegrationRepositorySettings repositorySettings;
    /**
     * Instantiates a new {@link Integration} and sets the default values.
     */
    public Integration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Integration}
     */
    @jakarta.annotation.Nonnull
    public static Integration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Integration();
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
     * Gets the DeployConfiguration property value. The DeployConfiguration property
     * @return a {@link IntegrationDeployConfiguration}
     */
    @jakarta.annotation.Nullable
    public IntegrationDeployConfiguration getDeployConfiguration() {
        return this.deployConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("DeployConfiguration", (n) -> { this.setDeployConfiguration(n.getObjectValue(IntegrationDeployConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("IntegrationId", (n) -> { this.setIntegrationId(n.getLongValue()); });
        deserializerMap.put("RepositorySettings", (n) -> { this.setRepositorySettings(n.getObjectValue(IntegrationRepositorySettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the IntegrationId property value. The IntegrationId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIntegrationId() {
        return this.integrationId;
    }
    /**
     * Gets the RepositorySettings property value. The RepositorySettings property
     * @return a {@link IntegrationRepositorySettings}
     */
    @jakarta.annotation.Nullable
    public IntegrationRepositorySettings getRepositorySettings() {
        return this.repositorySettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("IntegrationId", this.getIntegrationId());
        writer.writeObjectValue("RepositorySettings", this.getRepositorySettings());
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
     * Sets the DeployConfiguration property value. The DeployConfiguration property
     * @param value Value to set for the DeployConfiguration property.
     */
    public void setDeployConfiguration(@jakarta.annotation.Nullable final IntegrationDeployConfiguration value) {
        this.deployConfiguration = value;
    }
    /**
     * Sets the IntegrationId property value. The IntegrationId property
     * @param value Value to set for the IntegrationId property.
     */
    public void setIntegrationId(@jakarta.annotation.Nullable final Long value) {
        this.integrationId = value;
    }
    /**
     * Sets the RepositorySettings property value. The RepositorySettings property
     * @param value Value to set for the RepositorySettings property.
     */
    public void setRepositorySettings(@jakarta.annotation.Nullable final IntegrationRepositorySettings value) {
        this.repositorySettings = value;
    }
}
