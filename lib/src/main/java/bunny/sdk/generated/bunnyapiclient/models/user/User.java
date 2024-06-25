package bunny.sdk.generated.bunnyapiclient.models.user;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class User implements AdditionalDataHolder, Parsable {
    /**
     * The Id of the user
     */
    private String accountId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The remaining balance on the user's account
     */
    private Double balance;
    /**
     * The email where the invoices and billing messages will be sent
     */
    private String billingEmail;
    /**
     * The end date of the account's free trial. If this is in the past, the free trial has expired.
     */
    private OffsetDateTime billingFreeUntilDate;
    /**
     * The BillingType property
     */
    private Double billingType;
    /**
     * The city of the user
     */
    private String city;
    /**
     * The country name that the user is from
     */
    private String companyName;
    /**
     * The Alpha2 country code that the user is from
     */
    private String country;
    /**
     * The date when the user joined bunny.net
     */
    private OffsetDateTime dateJoined;
    /**
     * Determines if the DPA was accepted by the user or not
     */
    private Boolean dpaAccepted;
    /**
     * Determines the date on which the DPA was accepted
     */
    private OffsetDateTime dpaDateAccepted;
    /**
     * Determines which version of the DPA was accepted
     */
    private Integer dpaVersionAccepted;
    /**
     * The email of the user
     */
    private String email;
    /**
     * Determines if the account's email has been successfully verified
     */
    private Boolean emailVerified;
    /**
     * Contains the list of available payment types for this account
     */
    private java.util.List<String> enabledPaymentTypes;
    /**
     * The list of features that the user has enabled
     */
    private java.util.List<String> featureFlags;
    /**
     * The first name of the user
     */
    private String firstName;
    /**
     * The FreeTrialExtendedDate property
     */
    private OffsetDateTime freeTrialExtendedDate;
    /**
     * The HasCompleteBillingProfile property
     */
    private Boolean hasCompleteBillingProfile;
    /**
     * The Id of the user
     */
    private String id;
    /**
     * Determines whether the user used a Single Sign On account
     */
    private Boolean isSsoAccount;
    /**
     * The last name of the user
     */
    private String lastName;
    /**
     * Determines if the payments are disabled on this account
     */
    private Boolean paymentsDisabled;
    /**
     * Determines if the account should receive notification emails from bunny.net
     */
    private Boolean receiveNotificationEmails;
    /**
     * Determines if the account should receive promotional emails from bunny.net
     */
    private Boolean receivePromotionalEmails;
    /**
     * Determines the roles that the user belongs to
     */
    private java.util.List<String> roles;
    /**
     * The street address of the user
     */
    private String streetAddress;
    /**
     * Determines if the user's account is suspended
     */
    private Boolean suspended;
    /**
     * The total bandwidth used by the account.
     */
    private Long totalBandwidthUsed;
    /**
     * The total free trial bandwidth limit for this account
     */
    private Long trialBandwidthLimit;
    /**
     * Determines if the account has 2FA enabled
     */
    private Boolean twoFactorAuthenticationEnabled;
    /**
     * Returns the number of unread tickets on the user's account
     */
    private Integer unreadSupportTicketCount;
    /**
     * The billing VAT number of the account
     */
    private String vATNumber;
    /**
     * The address zip code of the user
     */
    private String zipCode;
    /**
     * Instantiates a new {@link User} and sets the default values.
     */
    public User() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link User}
     */
    @jakarta.annotation.Nonnull
    public static User createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new User();
    }
    /**
     * Gets the AccountId property value. The Id of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
     * Gets the Balance property value. The remaining balance on the user's account
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBalance() {
        return this.balance;
    }
    /**
     * Gets the BillingEmail property value. The email where the invoices and billing messages will be sent
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingEmail() {
        return this.billingEmail;
    }
    /**
     * Gets the BillingFreeUntilDate property value. The end date of the account's free trial. If this is in the past, the free trial has expired.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBillingFreeUntilDate() {
        return this.billingFreeUntilDate;
    }
    /**
     * Gets the BillingType property value. The BillingType property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBillingType() {
        return this.billingType;
    }
    /**
     * Gets the City property value. The city of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the CompanyName property value. The country name that the user is from
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the Country property value. The Alpha2 country code that the user is from
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the DateJoined property value. The date when the user joined bunny.net
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateJoined() {
        return this.dateJoined;
    }
    /**
     * Gets the DpaAccepted property value. Determines if the DPA was accepted by the user or not
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDpaAccepted() {
        return this.dpaAccepted;
    }
    /**
     * Gets the DpaDateAccepted property value. Determines the date on which the DPA was accepted
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDpaDateAccepted() {
        return this.dpaDateAccepted;
    }
    /**
     * Gets the DpaVersionAccepted property value. Determines which version of the DPA was accepted
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDpaVersionAccepted() {
        return this.dpaVersionAccepted;
    }
    /**
     * Gets the Email property value. The email of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the EmailVerified property value. Determines if the account's email has been successfully verified
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }
    /**
     * Gets the EnabledPaymentTypes property value. Contains the list of available payment types for this account
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnabledPaymentTypes() {
        return this.enabledPaymentTypes;
    }
    /**
     * Gets the FeatureFlags property value. The list of features that the user has enabled
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFeatureFlags() {
        return this.featureFlags;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(34);
        deserializerMap.put("AccountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("Balance", (n) -> { this.setBalance(n.getDoubleValue()); });
        deserializerMap.put("BillingEmail", (n) -> { this.setBillingEmail(n.getStringValue()); });
        deserializerMap.put("BillingFreeUntilDate", (n) -> { this.setBillingFreeUntilDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("BillingType", (n) -> { this.setBillingType(n.getDoubleValue()); });
        deserializerMap.put("City", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("CompanyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("Country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("DateJoined", (n) -> { this.setDateJoined(n.getOffsetDateTimeValue()); });
        deserializerMap.put("DpaAccepted", (n) -> { this.setDpaAccepted(n.getBooleanValue()); });
        deserializerMap.put("DpaDateAccepted", (n) -> { this.setDpaDateAccepted(n.getOffsetDateTimeValue()); });
        deserializerMap.put("DpaVersionAccepted", (n) -> { this.setDpaVersionAccepted(n.getIntegerValue()); });
        deserializerMap.put("Email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("EmailVerified", (n) -> { this.setEmailVerified(n.getBooleanValue()); });
        deserializerMap.put("EnabledPaymentTypes", (n) -> { this.setEnabledPaymentTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("FeatureFlags", (n) -> { this.setFeatureFlags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("FirstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("FreeTrialExtendedDate", (n) -> { this.setFreeTrialExtendedDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("HasCompleteBillingProfile", (n) -> { this.setHasCompleteBillingProfile(n.getBooleanValue()); });
        deserializerMap.put("Id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("IsSsoAccount", (n) -> { this.setIsSsoAccount(n.getBooleanValue()); });
        deserializerMap.put("LastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("PaymentsDisabled", (n) -> { this.setPaymentsDisabled(n.getBooleanValue()); });
        deserializerMap.put("ReceiveNotificationEmails", (n) -> { this.setReceiveNotificationEmails(n.getBooleanValue()); });
        deserializerMap.put("ReceivePromotionalEmails", (n) -> { this.setReceivePromotionalEmails(n.getBooleanValue()); });
        deserializerMap.put("Roles", (n) -> { this.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("StreetAddress", (n) -> { this.setStreetAddress(n.getStringValue()); });
        deserializerMap.put("Suspended", (n) -> { this.setSuspended(n.getBooleanValue()); });
        deserializerMap.put("TotalBandwidthUsed", (n) -> { this.setTotalBandwidthUsed(n.getLongValue()); });
        deserializerMap.put("TrialBandwidthLimit", (n) -> { this.setTrialBandwidthLimit(n.getLongValue()); });
        deserializerMap.put("TwoFactorAuthenticationEnabled", (n) -> { this.setTwoFactorAuthenticationEnabled(n.getBooleanValue()); });
        deserializerMap.put("UnreadSupportTicketCount", (n) -> { this.setUnreadSupportTicketCount(n.getIntegerValue()); });
        deserializerMap.put("VATNumber", (n) -> { this.setVATNumber(n.getStringValue()); });
        deserializerMap.put("ZipCode", (n) -> { this.setZipCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FirstName property value. The first name of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the FreeTrialExtendedDate property value. The FreeTrialExtendedDate property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFreeTrialExtendedDate() {
        return this.freeTrialExtendedDate;
    }
    /**
     * Gets the HasCompleteBillingProfile property value. The HasCompleteBillingProfile property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasCompleteBillingProfile() {
        return this.hasCompleteBillingProfile;
    }
    /**
     * Gets the Id property value. The Id of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the IsSsoAccount property value. Determines whether the user used a Single Sign On account
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSsoAccount() {
        return this.isSsoAccount;
    }
    /**
     * Gets the LastName property value. The last name of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the PaymentsDisabled property value. Determines if the payments are disabled on this account
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPaymentsDisabled() {
        return this.paymentsDisabled;
    }
    /**
     * Gets the ReceiveNotificationEmails property value. Determines if the account should receive notification emails from bunny.net
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReceiveNotificationEmails() {
        return this.receiveNotificationEmails;
    }
    /**
     * Gets the ReceivePromotionalEmails property value. Determines if the account should receive promotional emails from bunny.net
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReceivePromotionalEmails() {
        return this.receivePromotionalEmails;
    }
    /**
     * Gets the Roles property value. Determines the roles that the user belongs to
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.roles;
    }
    /**
     * Gets the StreetAddress property value. The street address of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreetAddress() {
        return this.streetAddress;
    }
    /**
     * Gets the Suspended property value. Determines if the user's account is suspended
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSuspended() {
        return this.suspended;
    }
    /**
     * Gets the TotalBandwidthUsed property value. The total bandwidth used by the account.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBandwidthUsed() {
        return this.totalBandwidthUsed;
    }
    /**
     * Gets the TrialBandwidthLimit property value. The total free trial bandwidth limit for this account
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTrialBandwidthLimit() {
        return this.trialBandwidthLimit;
    }
    /**
     * Gets the TwoFactorAuthenticationEnabled property value. Determines if the account has 2FA enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTwoFactorAuthenticationEnabled() {
        return this.twoFactorAuthenticationEnabled;
    }
    /**
     * Gets the UnreadSupportTicketCount property value. Returns the number of unread tickets on the user's account
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnreadSupportTicketCount() {
        return this.unreadSupportTicketCount;
    }
    /**
     * Gets the VATNumber property value. The billing VAT number of the account
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVATNumber() {
        return this.vATNumber;
    }
    /**
     * Gets the ZipCode property value. The address zip code of the user
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZipCode() {
        return this.zipCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("AccountId", this.getAccountId());
        writer.writeDoubleValue("Balance", this.getBalance());
        writer.writeStringValue("BillingEmail", this.getBillingEmail());
        writer.writeOffsetDateTimeValue("BillingFreeUntilDate", this.getBillingFreeUntilDate());
        writer.writeDoubleValue("BillingType", this.getBillingType());
        writer.writeStringValue("City", this.getCity());
        writer.writeStringValue("CompanyName", this.getCompanyName());
        writer.writeStringValue("Country", this.getCountry());
        writer.writeOffsetDateTimeValue("DateJoined", this.getDateJoined());
        writer.writeBooleanValue("DpaAccepted", this.getDpaAccepted());
        writer.writeOffsetDateTimeValue("DpaDateAccepted", this.getDpaDateAccepted());
        writer.writeIntegerValue("DpaVersionAccepted", this.getDpaVersionAccepted());
        writer.writeStringValue("Email", this.getEmail());
        writer.writeBooleanValue("EmailVerified", this.getEmailVerified());
        writer.writeCollectionOfPrimitiveValues("EnabledPaymentTypes", this.getEnabledPaymentTypes());
        writer.writeCollectionOfPrimitiveValues("FeatureFlags", this.getFeatureFlags());
        writer.writeStringValue("FirstName", this.getFirstName());
        writer.writeOffsetDateTimeValue("FreeTrialExtendedDate", this.getFreeTrialExtendedDate());
        writer.writeBooleanValue("HasCompleteBillingProfile", this.getHasCompleteBillingProfile());
        writer.writeStringValue("Id", this.getId());
        writer.writeBooleanValue("IsSsoAccount", this.getIsSsoAccount());
        writer.writeStringValue("LastName", this.getLastName());
        writer.writeBooleanValue("PaymentsDisabled", this.getPaymentsDisabled());
        writer.writeBooleanValue("ReceiveNotificationEmails", this.getReceiveNotificationEmails());
        writer.writeBooleanValue("ReceivePromotionalEmails", this.getReceivePromotionalEmails());
        writer.writeCollectionOfPrimitiveValues("Roles", this.getRoles());
        writer.writeStringValue("StreetAddress", this.getStreetAddress());
        writer.writeBooleanValue("Suspended", this.getSuspended());
        writer.writeLongValue("TotalBandwidthUsed", this.getTotalBandwidthUsed());
        writer.writeLongValue("TrialBandwidthLimit", this.getTrialBandwidthLimit());
        writer.writeBooleanValue("TwoFactorAuthenticationEnabled", this.getTwoFactorAuthenticationEnabled());
        writer.writeIntegerValue("UnreadSupportTicketCount", this.getUnreadSupportTicketCount());
        writer.writeStringValue("VATNumber", this.getVATNumber());
        writer.writeStringValue("ZipCode", this.getZipCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AccountId property value. The Id of the user
     * @param value Value to set for the AccountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the Balance property value. The remaining balance on the user's account
     * @param value Value to set for the Balance property.
     */
    public void setBalance(@jakarta.annotation.Nullable final Double value) {
        this.balance = value;
    }
    /**
     * Sets the BillingEmail property value. The email where the invoices and billing messages will be sent
     * @param value Value to set for the BillingEmail property.
     */
    public void setBillingEmail(@jakarta.annotation.Nullable final String value) {
        this.billingEmail = value;
    }
    /**
     * Sets the BillingFreeUntilDate property value. The end date of the account's free trial. If this is in the past, the free trial has expired.
     * @param value Value to set for the BillingFreeUntilDate property.
     */
    public void setBillingFreeUntilDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.billingFreeUntilDate = value;
    }
    /**
     * Sets the BillingType property value. The BillingType property
     * @param value Value to set for the BillingType property.
     */
    public void setBillingType(@jakarta.annotation.Nullable final Double value) {
        this.billingType = value;
    }
    /**
     * Sets the City property value. The city of the user
     * @param value Value to set for the City property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the CompanyName property value. The country name that the user is from
     * @param value Value to set for the CompanyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the Country property value. The Alpha2 country code that the user is from
     * @param value Value to set for the Country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the DateJoined property value. The date when the user joined bunny.net
     * @param value Value to set for the DateJoined property.
     */
    public void setDateJoined(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateJoined = value;
    }
    /**
     * Sets the DpaAccepted property value. Determines if the DPA was accepted by the user or not
     * @param value Value to set for the DpaAccepted property.
     */
    public void setDpaAccepted(@jakarta.annotation.Nullable final Boolean value) {
        this.dpaAccepted = value;
    }
    /**
     * Sets the DpaDateAccepted property value. Determines the date on which the DPA was accepted
     * @param value Value to set for the DpaDateAccepted property.
     */
    public void setDpaDateAccepted(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dpaDateAccepted = value;
    }
    /**
     * Sets the DpaVersionAccepted property value. Determines which version of the DPA was accepted
     * @param value Value to set for the DpaVersionAccepted property.
     */
    public void setDpaVersionAccepted(@jakarta.annotation.Nullable final Integer value) {
        this.dpaVersionAccepted = value;
    }
    /**
     * Sets the Email property value. The email of the user
     * @param value Value to set for the Email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the EmailVerified property value. Determines if the account's email has been successfully verified
     * @param value Value to set for the EmailVerified property.
     */
    public void setEmailVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.emailVerified = value;
    }
    /**
     * Sets the EnabledPaymentTypes property value. Contains the list of available payment types for this account
     * @param value Value to set for the EnabledPaymentTypes property.
     */
    public void setEnabledPaymentTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.enabledPaymentTypes = value;
    }
    /**
     * Sets the FeatureFlags property value. The list of features that the user has enabled
     * @param value Value to set for the FeatureFlags property.
     */
    public void setFeatureFlags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.featureFlags = value;
    }
    /**
     * Sets the FirstName property value. The first name of the user
     * @param value Value to set for the FirstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the FreeTrialExtendedDate property value. The FreeTrialExtendedDate property
     * @param value Value to set for the FreeTrialExtendedDate property.
     */
    public void setFreeTrialExtendedDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.freeTrialExtendedDate = value;
    }
    /**
     * Sets the HasCompleteBillingProfile property value. The HasCompleteBillingProfile property
     * @param value Value to set for the HasCompleteBillingProfile property.
     */
    public void setHasCompleteBillingProfile(@jakarta.annotation.Nullable final Boolean value) {
        this.hasCompleteBillingProfile = value;
    }
    /**
     * Sets the Id property value. The Id of the user
     * @param value Value to set for the Id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the IsSsoAccount property value. Determines whether the user used a Single Sign On account
     * @param value Value to set for the IsSsoAccount property.
     */
    public void setIsSsoAccount(@jakarta.annotation.Nullable final Boolean value) {
        this.isSsoAccount = value;
    }
    /**
     * Sets the LastName property value. The last name of the user
     * @param value Value to set for the LastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the PaymentsDisabled property value. Determines if the payments are disabled on this account
     * @param value Value to set for the PaymentsDisabled property.
     */
    public void setPaymentsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.paymentsDisabled = value;
    }
    /**
     * Sets the ReceiveNotificationEmails property value. Determines if the account should receive notification emails from bunny.net
     * @param value Value to set for the ReceiveNotificationEmails property.
     */
    public void setReceiveNotificationEmails(@jakarta.annotation.Nullable final Boolean value) {
        this.receiveNotificationEmails = value;
    }
    /**
     * Sets the ReceivePromotionalEmails property value. Determines if the account should receive promotional emails from bunny.net
     * @param value Value to set for the ReceivePromotionalEmails property.
     */
    public void setReceivePromotionalEmails(@jakarta.annotation.Nullable final Boolean value) {
        this.receivePromotionalEmails = value;
    }
    /**
     * Sets the Roles property value. Determines the roles that the user belongs to
     * @param value Value to set for the Roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roles = value;
    }
    /**
     * Sets the StreetAddress property value. The street address of the user
     * @param value Value to set for the StreetAddress property.
     */
    public void setStreetAddress(@jakarta.annotation.Nullable final String value) {
        this.streetAddress = value;
    }
    /**
     * Sets the Suspended property value. Determines if the user's account is suspended
     * @param value Value to set for the Suspended property.
     */
    public void setSuspended(@jakarta.annotation.Nullable final Boolean value) {
        this.suspended = value;
    }
    /**
     * Sets the TotalBandwidthUsed property value. The total bandwidth used by the account.
     * @param value Value to set for the TotalBandwidthUsed property.
     */
    public void setTotalBandwidthUsed(@jakarta.annotation.Nullable final Long value) {
        this.totalBandwidthUsed = value;
    }
    /**
     * Sets the TrialBandwidthLimit property value. The total free trial bandwidth limit for this account
     * @param value Value to set for the TrialBandwidthLimit property.
     */
    public void setTrialBandwidthLimit(@jakarta.annotation.Nullable final Long value) {
        this.trialBandwidthLimit = value;
    }
    /**
     * Sets the TwoFactorAuthenticationEnabled property value. Determines if the account has 2FA enabled
     * @param value Value to set for the TwoFactorAuthenticationEnabled property.
     */
    public void setTwoFactorAuthenticationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.twoFactorAuthenticationEnabled = value;
    }
    /**
     * Sets the UnreadSupportTicketCount property value. Returns the number of unread tickets on the user's account
     * @param value Value to set for the UnreadSupportTicketCount property.
     */
    public void setUnreadSupportTicketCount(@jakarta.annotation.Nullable final Integer value) {
        this.unreadSupportTicketCount = value;
    }
    /**
     * Sets the VATNumber property value. The billing VAT number of the account
     * @param value Value to set for the VATNumber property.
     */
    public void setVATNumber(@jakarta.annotation.Nullable final String value) {
        this.vATNumber = value;
    }
    /**
     * Sets the ZipCode property value. The address zip code of the user
     * @param value Value to set for the ZipCode property.
     */
    public void setZipCode(@jakarta.annotation.Nullable final String value) {
        this.zipCode = value;
    }
}
