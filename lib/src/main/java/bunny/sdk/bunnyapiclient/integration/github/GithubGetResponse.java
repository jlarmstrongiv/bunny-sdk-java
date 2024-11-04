package bunny.sdk.bunnyapiclient.integration.github;

import bunny.sdk.bunnyapiclient.models.integrations.Account;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GithubGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * The Accounts property
     */
    private java.util.List<Account> accounts;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new {@link GithubGetResponse} and sets the default values.
     */
    public GithubGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GithubGetResponse}
     */
    @jakarta.annotation.Nonnull
    public static GithubGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GithubGetResponse();
    }
    /**
     * Gets the Accounts property value. The Accounts property
     * @return a {@link java.util.List<Account>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Account> getAccounts() {
        return this.accounts;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("Accounts", (n) -> { this.setAccounts(n.getCollectionOfObjectValues(Account::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("Accounts", this.getAccounts());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the Accounts property value. The Accounts property
     * @param value Value to set for the Accounts property.
     */
    public void setAccounts(@jakarta.annotation.Nullable final java.util.List<Account> value) {
        this.accounts = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
