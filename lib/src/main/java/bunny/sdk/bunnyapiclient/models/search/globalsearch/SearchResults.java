package bunny.sdk.bunnyapiclient.models.search.globalsearch;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchResults implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of results skipped in the search query
     */
    private Integer from;
    /**
     * The input query for the search request
     */
    private String query;
    /**
     * The list of search results found for the query
     */
    private java.util.List<SearchResult> searchResults;
    /**
     * The size of the result set
     */
    private Integer size;
    /**
     * The total number of search results found matching the query
     */
    private Integer total;
    /**
     * Instantiates a new {@link SearchResults} and sets the default values.
     */
    public SearchResults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SearchResults}
     */
    @jakarta.annotation.Nonnull
    public static SearchResults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchResults();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("From", (n) -> { this.setFrom(n.getIntegerValue()); });
        deserializerMap.put("Query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("SearchResults", (n) -> { this.setSearchResults(n.getCollectionOfObjectValues(SearchResult::createFromDiscriminatorValue)); });
        deserializerMap.put("Size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("Total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the From property value. The number of results skipped in the search query
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFrom() {
        return this.from;
    }
    /**
     * Gets the Query property value. The input query for the search request
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the SearchResults property value. The list of search results found for the query
     * @return a {@link java.util.List<SearchResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SearchResult> getSearchResults() {
        return this.searchResults;
    }
    /**
     * Gets the Size property value. The size of the result set
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Gets the Total property value. The total number of search results found matching the query
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("From", this.getFrom());
        writer.writeStringValue("Query", this.getQuery());
        writer.writeCollectionOfObjectValues("SearchResults", this.getSearchResults());
        writer.writeIntegerValue("Size", this.getSize());
        writer.writeIntegerValue("Total", this.getTotal());
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
     * Sets the From property value. The number of results skipped in the search query
     * @param value Value to set for the From property.
     */
    public void setFrom(@jakarta.annotation.Nullable final Integer value) {
        this.from = value;
    }
    /**
     * Sets the Query property value. The input query for the search request
     * @param value Value to set for the Query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the SearchResults property value. The list of search results found for the query
     * @param value Value to set for the SearchResults property.
     */
    public void setSearchResults(@jakarta.annotation.Nullable final java.util.List<SearchResult> value) {
        this.searchResults = value;
    }
    /**
     * Sets the Size property value. The size of the result set
     * @param value Value to set for the Size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.size = value;
    }
    /**
     * Sets the Total property value. The total number of search results found matching the query
     * @param value Value to set for the Total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
