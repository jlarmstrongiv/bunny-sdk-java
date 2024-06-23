package bunny.sdk.generated.bunnyapiclient.models.compute;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScriptRelease implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Author property
     */
    private String author;
    /**
     * The AuthorEmail property
     */
    private String authorEmail;
    /**
     * The Code property
     */
    private String code;
    /**
     * The DatePublished property
     */
    private OffsetDateTime datePublished;
    /**
     * The DateReleased property
     */
    private OffsetDateTime dateReleased;
    /**
     * The Deleted property
     */
    private Boolean deleted;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Note property
     */
    private String note;
    /**
     * The Status property
     */
    private Double status;
    /**
     * The Uuid property
     */
    private String uuid;
    /**
     * Instantiates a new {@link ScriptRelease} and sets the default values.
     */
    public ScriptRelease() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ScriptRelease}
     */
    @jakarta.annotation.Nonnull
    public static ScriptRelease createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScriptRelease();
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
     * Gets the Author property value. The Author property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthor() {
        return this.author;
    }
    /**
     * Gets the AuthorEmail property value. The AuthorEmail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthorEmail() {
        return this.authorEmail;
    }
    /**
     * Gets the Code property value. The Code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the DatePublished property value. The DatePublished property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDatePublished() {
        return this.datePublished;
    }
    /**
     * Gets the DateReleased property value. The DateReleased property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateReleased() {
        return this.dateReleased;
    }
    /**
     * Gets the Deleted property value. The Deleted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeleted() {
        return this.deleted;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("Author", (n) -> { this.setAuthor(n.getStringValue()); });
        deserializerMap.put("AuthorEmail", (n) -> { this.setAuthorEmail(n.getStringValue()); });
        deserializerMap.put("Code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("DatePublished", (n) -> { this.setDatePublished(n.getOffsetDateTimeValue()); });
        deserializerMap.put("DateReleased", (n) -> { this.setDateReleased(n.getOffsetDateTimeValue()); });
        deserializerMap.put("Deleted", (n) -> { this.setDeleted(n.getBooleanValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("Status", (n) -> { this.setStatus(n.getDoubleValue()); });
        deserializerMap.put("Uuid", (n) -> { this.setUuid(n.getStringValue()); });
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
     * Gets the Note property value. The Note property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNote() {
        return this.note;
    }
    /**
     * Gets the Status property value. The Status property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStatus() {
        return this.status;
    }
    /**
     * Gets the Uuid property value. The Uuid property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUuid() {
        return this.uuid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Author", this.getAuthor());
        writer.writeStringValue("AuthorEmail", this.getAuthorEmail());
        writer.writeStringValue("Code", this.getCode());
        writer.writeOffsetDateTimeValue("DatePublished", this.getDatePublished());
        writer.writeOffsetDateTimeValue("DateReleased", this.getDateReleased());
        writer.writeBooleanValue("Deleted", this.getDeleted());
        writer.writeLongValue("Id", this.getId());
        writer.writeStringValue("Note", this.getNote());
        writer.writeDoubleValue("Status", this.getStatus());
        writer.writeStringValue("Uuid", this.getUuid());
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
     * Sets the Author property value. The Author property
     * @param value Value to set for the Author property.
     */
    public void setAuthor(@jakarta.annotation.Nullable final String value) {
        this.author = value;
    }
    /**
     * Sets the AuthorEmail property value. The AuthorEmail property
     * @param value Value to set for the AuthorEmail property.
     */
    public void setAuthorEmail(@jakarta.annotation.Nullable final String value) {
        this.authorEmail = value;
    }
    /**
     * Sets the Code property value. The Code property
     * @param value Value to set for the Code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the DatePublished property value. The DatePublished property
     * @param value Value to set for the DatePublished property.
     */
    public void setDatePublished(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.datePublished = value;
    }
    /**
     * Sets the DateReleased property value. The DateReleased property
     * @param value Value to set for the DateReleased property.
     */
    public void setDateReleased(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateReleased = value;
    }
    /**
     * Sets the Deleted property value. The Deleted property
     * @param value Value to set for the Deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.deleted = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Note property value. The Note property
     * @param value Value to set for the Note property.
     */
    public void setNote(@jakarta.annotation.Nullable final String value) {
        this.note = value;
    }
    /**
     * Sets the Status property value. The Status property
     * @param value Value to set for the Status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Double value) {
        this.status = value;
    }
    /**
     * Sets the Uuid property value. The Uuid property
     * @param value Value to set for the Uuid property.
     */
    public void setUuid(@jakarta.annotation.Nullable final String value) {
        this.uuid = value;
    }
}
