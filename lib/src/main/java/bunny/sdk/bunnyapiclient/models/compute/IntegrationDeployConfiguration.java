package bunny.sdk.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationDeployConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Branch property
     */
    private String branch;
    /**
     * The BuildCommand property
     */
    private String buildCommand;
    /**
     * The CreateWorkflow property
     */
    private Boolean createWorkflow;
    /**
     * The EntryFile property
     */
    private String entryFile;
    /**
     * The InstallCommand property
     */
    private String installCommand;
    /**
     * Instantiates a new {@link IntegrationDeployConfiguration} and sets the default values.
     */
    public IntegrationDeployConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IntegrationDeployConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IntegrationDeployConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntegrationDeployConfiguration();
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
     * Gets the Branch property value. The Branch property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBranch() {
        return this.branch;
    }
    /**
     * Gets the BuildCommand property value. The BuildCommand property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuildCommand() {
        return this.buildCommand;
    }
    /**
     * Gets the CreateWorkflow property value. The CreateWorkflow property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateWorkflow() {
        return this.createWorkflow;
    }
    /**
     * Gets the EntryFile property value. The EntryFile property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEntryFile() {
        return this.entryFile;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("Branch", (n) -> { this.setBranch(n.getStringValue()); });
        deserializerMap.put("BuildCommand", (n) -> { this.setBuildCommand(n.getStringValue()); });
        deserializerMap.put("CreateWorkflow", (n) -> { this.setCreateWorkflow(n.getBooleanValue()); });
        deserializerMap.put("EntryFile", (n) -> { this.setEntryFile(n.getStringValue()); });
        deserializerMap.put("InstallCommand", (n) -> { this.setInstallCommand(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the InstallCommand property value. The InstallCommand property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstallCommand() {
        return this.installCommand;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Branch", this.getBranch());
        writer.writeStringValue("BuildCommand", this.getBuildCommand());
        writer.writeBooleanValue("CreateWorkflow", this.getCreateWorkflow());
        writer.writeStringValue("EntryFile", this.getEntryFile());
        writer.writeStringValue("InstallCommand", this.getInstallCommand());
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
     * Sets the Branch property value. The Branch property
     * @param value Value to set for the Branch property.
     */
    public void setBranch(@jakarta.annotation.Nullable final String value) {
        this.branch = value;
    }
    /**
     * Sets the BuildCommand property value. The BuildCommand property
     * @param value Value to set for the BuildCommand property.
     */
    public void setBuildCommand(@jakarta.annotation.Nullable final String value) {
        this.buildCommand = value;
    }
    /**
     * Sets the CreateWorkflow property value. The CreateWorkflow property
     * @param value Value to set for the CreateWorkflow property.
     */
    public void setCreateWorkflow(@jakarta.annotation.Nullable final Boolean value) {
        this.createWorkflow = value;
    }
    /**
     * Sets the EntryFile property value. The EntryFile property
     * @param value Value to set for the EntryFile property.
     */
    public void setEntryFile(@jakarta.annotation.Nullable final String value) {
        this.entryFile = value;
    }
    /**
     * Sets the InstallCommand property value. The InstallCommand property
     * @param value Value to set for the InstallCommand property.
     */
    public void setInstallCommand(@jakarta.annotation.Nullable final String value) {
        this.installCommand = value;
    }
}
