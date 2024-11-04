package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaginationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The currentPage property
     */
    private Integer currentPage;
    /**
     * The nextPage property
     */
    private Integer nextPage;
    /**
     * The pageSize property
     */
    private Integer pageSize;
    /**
     * The totalCount property
     */
    private Integer totalCount;
    /**
     * The totalPages property
     */
    private Integer totalPages;
    /**
     * Instantiates a new {@link PaginationResponse} and sets the default values.
     */
    public PaginationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaginationResponse}
     */
    @jakarta.annotation.Nonnull
    public static PaginationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaginationResponse();
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
     * Gets the currentPage property value. The currentPage property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCurrentPage() {
        return this.currentPage;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("currentPage", (n) -> { this.setCurrentPage(n.getIntegerValue()); });
        deserializerMap.put("nextPage", (n) -> { this.setNextPage(n.getIntegerValue()); });
        deserializerMap.put("pageSize", (n) -> { this.setPageSize(n.getIntegerValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getIntegerValue()); });
        deserializerMap.put("totalPages", (n) -> { this.setTotalPages(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nextPage property value. The nextPage property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNextPage() {
        return this.nextPage;
    }
    /**
     * Gets the pageSize property value. The pageSize property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPageSize() {
        return this.pageSize;
    }
    /**
     * Gets the totalCount property value. The totalCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCount() {
        return this.totalCount;
    }
    /**
     * Gets the totalPages property value. The totalPages property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalPages() {
        return this.totalPages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("currentPage", this.getCurrentPage());
        writer.writeIntegerValue("nextPage", this.getNextPage());
        writer.writeIntegerValue("pageSize", this.getPageSize());
        writer.writeIntegerValue("totalCount", this.getTotalCount());
        writer.writeIntegerValue("totalPages", this.getTotalPages());
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
     * Sets the currentPage property value. The currentPage property
     * @param value Value to set for the currentPage property.
     */
    public void setCurrentPage(@jakarta.annotation.Nullable final Integer value) {
        this.currentPage = value;
    }
    /**
     * Sets the nextPage property value. The nextPage property
     * @param value Value to set for the nextPage property.
     */
    public void setNextPage(@jakarta.annotation.Nullable final Integer value) {
        this.nextPage = value;
    }
    /**
     * Sets the pageSize property value. The pageSize property
     * @param value Value to set for the pageSize property.
     */
    public void setPageSize(@jakarta.annotation.Nullable final Integer value) {
        this.pageSize = value;
    }
    /**
     * Sets the totalCount property value. The totalCount property
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalCount = value;
    }
    /**
     * Sets the totalPages property value. The totalPages property
     * @param value Value to set for the totalPages property.
     */
    public void setTotalPages(@jakarta.annotation.Nullable final Integer value) {
        this.totalPages = value;
    }
}
