package bunny.sdk.streamapiclient.models.managevideos.cleanupunconfiguredresolutions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CleanupUnconfiguredResolutionsData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The availableResolutionsAfter property
     */
    private java.util.List<String> availableResolutionsAfter;
    /**
     * The deletedOriginal property
     */
    private Boolean deletedOriginal;
    /**
     * The deletedStorageObjects property
     */
    private Boolean deletedStorageObjects;
    /**
     * The modifiedPlaylist property
     */
    private Boolean modifiedPlaylist;
    /**
     * The resolutionsToDelete property
     */
    private java.util.List<String> resolutionsToDelete;
    /**
     * The resolutionsToDeleteFromMp4 property
     */
    private java.util.List<String> resolutionsToDeleteFromMp4;
    /**
     * The resolutionsToDeleteFromPlaylist property
     */
    private java.util.List<String> resolutionsToDeleteFromPlaylist;
    /**
     * The resolutionsToDeleteFromStorage property
     */
    private java.util.List<String> resolutionsToDeleteFromStorage;
    /**
     * The storageObjectsToDelete property
     */
    private java.util.List<String> storageObjectsToDelete;
    /**
     * The updatedAvailableResolutions property
     */
    private Boolean updatedAvailableResolutions;
    /**
     * The videoId property
     */
    private String videoId;
    /**
     * The videoLibraryId property
     */
    private Long videoLibraryId;
    /**
     * Instantiates a new {@link CleanupUnconfiguredResolutionsData} and sets the default values.
     */
    public CleanupUnconfiguredResolutionsData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CleanupUnconfiguredResolutionsData}
     */
    @jakarta.annotation.Nonnull
    public static CleanupUnconfiguredResolutionsData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CleanupUnconfiguredResolutionsData();
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
     * Gets the availableResolutionsAfter property value. The availableResolutionsAfter property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableResolutionsAfter() {
        return this.availableResolutionsAfter;
    }
    /**
     * Gets the deletedOriginal property value. The deletedOriginal property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeletedOriginal() {
        return this.deletedOriginal;
    }
    /**
     * Gets the deletedStorageObjects property value. The deletedStorageObjects property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeletedStorageObjects() {
        return this.deletedStorageObjects;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("availableResolutionsAfter", (n) -> { this.setAvailableResolutionsAfter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deletedOriginal", (n) -> { this.setDeletedOriginal(n.getBooleanValue()); });
        deserializerMap.put("deletedStorageObjects", (n) -> { this.setDeletedStorageObjects(n.getBooleanValue()); });
        deserializerMap.put("modifiedPlaylist", (n) -> { this.setModifiedPlaylist(n.getBooleanValue()); });
        deserializerMap.put("resolutionsToDelete", (n) -> { this.setResolutionsToDelete(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resolutionsToDeleteFromMp4", (n) -> { this.setResolutionsToDeleteFromMp4(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resolutionsToDeleteFromPlaylist", (n) -> { this.setResolutionsToDeleteFromPlaylist(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resolutionsToDeleteFromStorage", (n) -> { this.setResolutionsToDeleteFromStorage(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("storageObjectsToDelete", (n) -> { this.setStorageObjectsToDelete(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updatedAvailableResolutions", (n) -> { this.setUpdatedAvailableResolutions(n.getBooleanValue()); });
        deserializerMap.put("videoId", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("videoLibraryId", (n) -> { this.setVideoLibraryId(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedPlaylist property value. The modifiedPlaylist property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getModifiedPlaylist() {
        return this.modifiedPlaylist;
    }
    /**
     * Gets the resolutionsToDelete property value. The resolutionsToDelete property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResolutionsToDelete() {
        return this.resolutionsToDelete;
    }
    /**
     * Gets the resolutionsToDeleteFromMp4 property value. The resolutionsToDeleteFromMp4 property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResolutionsToDeleteFromMp4() {
        return this.resolutionsToDeleteFromMp4;
    }
    /**
     * Gets the resolutionsToDeleteFromPlaylist property value. The resolutionsToDeleteFromPlaylist property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResolutionsToDeleteFromPlaylist() {
        return this.resolutionsToDeleteFromPlaylist;
    }
    /**
     * Gets the resolutionsToDeleteFromStorage property value. The resolutionsToDeleteFromStorage property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResolutionsToDeleteFromStorage() {
        return this.resolutionsToDeleteFromStorage;
    }
    /**
     * Gets the storageObjectsToDelete property value. The storageObjectsToDelete property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStorageObjectsToDelete() {
        return this.storageObjectsToDelete;
    }
    /**
     * Gets the updatedAvailableResolutions property value. The updatedAvailableResolutions property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUpdatedAvailableResolutions() {
        return this.updatedAvailableResolutions;
    }
    /**
     * Gets the videoId property value. The videoId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the videoLibraryId property value. The videoLibraryId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getVideoLibraryId() {
        return this.videoLibraryId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("availableResolutionsAfter", this.getAvailableResolutionsAfter());
        writer.writeBooleanValue("deletedOriginal", this.getDeletedOriginal());
        writer.writeBooleanValue("deletedStorageObjects", this.getDeletedStorageObjects());
        writer.writeBooleanValue("modifiedPlaylist", this.getModifiedPlaylist());
        writer.writeCollectionOfPrimitiveValues("resolutionsToDelete", this.getResolutionsToDelete());
        writer.writeCollectionOfPrimitiveValues("resolutionsToDeleteFromMp4", this.getResolutionsToDeleteFromMp4());
        writer.writeCollectionOfPrimitiveValues("resolutionsToDeleteFromPlaylist", this.getResolutionsToDeleteFromPlaylist());
        writer.writeCollectionOfPrimitiveValues("resolutionsToDeleteFromStorage", this.getResolutionsToDeleteFromStorage());
        writer.writeCollectionOfPrimitiveValues("storageObjectsToDelete", this.getStorageObjectsToDelete());
        writer.writeBooleanValue("updatedAvailableResolutions", this.getUpdatedAvailableResolutions());
        writer.writeStringValue("videoId", this.getVideoId());
        writer.writeLongValue("videoLibraryId", this.getVideoLibraryId());
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
     * Sets the availableResolutionsAfter property value. The availableResolutionsAfter property
     * @param value Value to set for the availableResolutionsAfter property.
     */
    public void setAvailableResolutionsAfter(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.availableResolutionsAfter = value;
    }
    /**
     * Sets the deletedOriginal property value. The deletedOriginal property
     * @param value Value to set for the deletedOriginal property.
     */
    public void setDeletedOriginal(@jakarta.annotation.Nullable final Boolean value) {
        this.deletedOriginal = value;
    }
    /**
     * Sets the deletedStorageObjects property value. The deletedStorageObjects property
     * @param value Value to set for the deletedStorageObjects property.
     */
    public void setDeletedStorageObjects(@jakarta.annotation.Nullable final Boolean value) {
        this.deletedStorageObjects = value;
    }
    /**
     * Sets the modifiedPlaylist property value. The modifiedPlaylist property
     * @param value Value to set for the modifiedPlaylist property.
     */
    public void setModifiedPlaylist(@jakarta.annotation.Nullable final Boolean value) {
        this.modifiedPlaylist = value;
    }
    /**
     * Sets the resolutionsToDelete property value. The resolutionsToDelete property
     * @param value Value to set for the resolutionsToDelete property.
     */
    public void setResolutionsToDelete(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.resolutionsToDelete = value;
    }
    /**
     * Sets the resolutionsToDeleteFromMp4 property value. The resolutionsToDeleteFromMp4 property
     * @param value Value to set for the resolutionsToDeleteFromMp4 property.
     */
    public void setResolutionsToDeleteFromMp4(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.resolutionsToDeleteFromMp4 = value;
    }
    /**
     * Sets the resolutionsToDeleteFromPlaylist property value. The resolutionsToDeleteFromPlaylist property
     * @param value Value to set for the resolutionsToDeleteFromPlaylist property.
     */
    public void setResolutionsToDeleteFromPlaylist(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.resolutionsToDeleteFromPlaylist = value;
    }
    /**
     * Sets the resolutionsToDeleteFromStorage property value. The resolutionsToDeleteFromStorage property
     * @param value Value to set for the resolutionsToDeleteFromStorage property.
     */
    public void setResolutionsToDeleteFromStorage(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.resolutionsToDeleteFromStorage = value;
    }
    /**
     * Sets the storageObjectsToDelete property value. The storageObjectsToDelete property
     * @param value Value to set for the storageObjectsToDelete property.
     */
    public void setStorageObjectsToDelete(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.storageObjectsToDelete = value;
    }
    /**
     * Sets the updatedAvailableResolutions property value. The updatedAvailableResolutions property
     * @param value Value to set for the updatedAvailableResolutions property.
     */
    public void setUpdatedAvailableResolutions(@jakarta.annotation.Nullable final Boolean value) {
        this.updatedAvailableResolutions = value;
    }
    /**
     * Sets the videoId property value. The videoId property
     * @param value Value to set for the videoId property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the videoLibraryId property value. The videoLibraryId property
     * @param value Value to set for the videoLibraryId property.
     */
    public void setVideoLibraryId(@jakarta.annotation.Nullable final Long value) {
        this.videoLibraryId = value;
    }
}
