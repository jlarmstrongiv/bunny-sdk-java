package bunny.sdk.bunnyapiclient.models.abusecases;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AbuseCase implements AdditionalDataHolder, Parsable {
    /**
     * The ActualUrl property
     */
    private String actualUrl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The DateCreated property
     */
    private OffsetDateTime dateCreated;
    /**
     * The DateUpdated property
     */
    private OffsetDateTime dateUpdated;
    /**
     * The Deadline property
     */
    private OffsetDateTime deadline;
    /**
     * The Id property
     */
    private Long id;
    /**
     * The Message property
     */
    private String message;
    /**
     * The Path property
     */
    private String path;
    /**
     * The PullZoneId property
     */
    private Long pullZoneId;
    /**
     * The PullZoneName property
     */
    private String pullZoneName;
    /**
     * The Status property
     */
    private Double status;
    /**
     * The Urls property
     */
    private java.util.List<Url> urls;
    /**
     * Instantiates a new {@link AbuseCase} and sets the default values.
     */
    public AbuseCase() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AbuseCase}
     */
    @jakarta.annotation.Nonnull
    public static AbuseCase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AbuseCase();
    }
    /**
     * Gets the ActualUrl property value. The ActualUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActualUrl() {
        return this.actualUrl;
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
     * Gets the DateCreated property value. The DateCreated property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Gets the DateUpdated property value. The DateUpdated property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Gets the Deadline property value. The Deadline property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeadline() {
        return this.deadline;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("ActualUrl", (n) -> { this.setActualUrl(n.getStringValue()); });
        deserializerMap.put("DateCreated", (n) -> { this.setDateCreated(n.getOffsetDateTimeValue()); });
        deserializerMap.put("DateUpdated", (n) -> { this.setDateUpdated(n.getOffsetDateTimeValue()); });
        deserializerMap.put("Deadline", (n) -> { this.setDeadline(n.getOffsetDateTimeValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("Message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("Path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("PullZoneId", (n) -> { this.setPullZoneId(n.getLongValue()); });
        deserializerMap.put("PullZoneName", (n) -> { this.setPullZoneName(n.getStringValue()); });
        deserializerMap.put("Status", (n) -> { this.setStatus(n.getDoubleValue()); });
        deserializerMap.put("Urls", (n) -> { this.setUrls(n.getCollectionOfObjectValues(Url::createFromDiscriminatorValue)); });
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
     * Gets the Message property value. The Message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the Path property value. The Path property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the PullZoneId property value. The PullZoneId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPullZoneId() {
        return this.pullZoneId;
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
     * Gets the Status property value. The Status property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStatus() {
        return this.status;
    }
    /**
     * Gets the Urls property value. The Urls property
     * @return a {@link java.util.List<Url>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Url> getUrls() {
        return this.urls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ActualUrl", this.getActualUrl());
        writer.writeOffsetDateTimeValue("DateCreated", this.getDateCreated());
        writer.writeOffsetDateTimeValue("DateUpdated", this.getDateUpdated());
        writer.writeOffsetDateTimeValue("Deadline", this.getDeadline());
        writer.writeLongValue("Id", this.getId());
        writer.writeStringValue("Message", this.getMessage());
        writer.writeStringValue("Path", this.getPath());
        writer.writeLongValue("PullZoneId", this.getPullZoneId());
        writer.writeStringValue("PullZoneName", this.getPullZoneName());
        writer.writeDoubleValue("Status", this.getStatus());
        writer.writeCollectionOfObjectValues("Urls", this.getUrls());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the ActualUrl property value. The ActualUrl property
     * @param value Value to set for the ActualUrl property.
     */
    public void setActualUrl(@jakarta.annotation.Nullable final String value) {
        this.actualUrl = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the DateCreated property value. The DateCreated property
     * @param value Value to set for the DateCreated property.
     */
    public void setDateCreated(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateCreated = value;
    }
    /**
     * Sets the DateUpdated property value. The DateUpdated property
     * @param value Value to set for the DateUpdated property.
     */
    public void setDateUpdated(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateUpdated = value;
    }
    /**
     * Sets the Deadline property value. The Deadline property
     * @param value Value to set for the Deadline property.
     */
    public void setDeadline(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deadline = value;
    }
    /**
     * Sets the Id property value. The Id property
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the Message property value. The Message property
     * @param value Value to set for the Message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the Path property value. The Path property
     * @param value Value to set for the Path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the PullZoneId property value. The PullZoneId property
     * @param value Value to set for the PullZoneId property.
     */
    public void setPullZoneId(@jakarta.annotation.Nullable final Long value) {
        this.pullZoneId = value;
    }
    /**
     * Sets the PullZoneName property value. The PullZoneName property
     * @param value Value to set for the PullZoneName property.
     */
    public void setPullZoneName(@jakarta.annotation.Nullable final String value) {
        this.pullZoneName = value;
    }
    /**
     * Sets the Status property value. The Status property
     * @param value Value to set for the Status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Double value) {
        this.status = value;
    }
    /**
     * Sets the Urls property value. The Urls property
     * @param value Value to set for the Urls property.
     */
    public void setUrls(@jakarta.annotation.Nullable final java.util.List<Url> value) {
        this.urls = value;
    }
}
