package bunny.sdk.bunnyapiclient.models.shield;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateWafRateLimitRuleModelVariableTypes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ARGS property
     */
    private String aRGS;
    /**
     * The ARGS_COMBINED_SIZE property
     */
    private String aRGSCOMBINEDSIZE;
    /**
     * The ARGS_GET property
     */
    private String aRGSGET;
    /**
     * The ARGS_GET_NAMES property
     */
    private String aRGSGETNAMES;
    /**
     * The ARGS_POST property
     */
    private String aRGSPOST;
    /**
     * The ARGS_POST_NAMES property
     */
    private String aRGSPOSTNAMES;
    /**
     * The FILES_NAMES property
     */
    private String fILESNAMES;
    /**
     * The GEO property
     */
    private String gEO;
    /**
     * The QUERY_STRING property
     */
    private String qUERYSTRING;
    /**
     * The REMOTE_ADDR property
     */
    private String rEMOTEADDR;
    /**
     * The REQUEST_BASENAME property
     */
    private String rEQUESTBASENAME;
    /**
     * The REQUEST_BODY property
     */
    private String rEQUESTBODY;
    /**
     * The REQUEST_COOKIES property
     */
    private String rEQUESTCOOKIES;
    /**
     * The REQUEST_COOKIES_NAMES property
     */
    private String rEQUESTCOOKIESNAMES;
    /**
     * The REQUEST_FILENAME property
     */
    private String rEQUESTFILENAME;
    /**
     * The REQUEST_HEADERS property
     */
    private String rEQUESTHEADERS;
    /**
     * The REQUEST_HEADERS_NAMES property
     */
    private String rEQUESTHEADERSNAMES;
    /**
     * The REQUEST_LINE property
     */
    private String rEQUESTLINE;
    /**
     * The REQUEST_METHOD property
     */
    private String rEQUESTMETHOD;
    /**
     * The REQUEST_PROTOCOL property
     */
    private String rEQUESTPROTOCOL;
    /**
     * The REQUEST_URI property
     */
    private String rEQUESTURI;
    /**
     * The REQUEST_URI_RAW property
     */
    private String rEQUESTURIRAW;
    /**
     * The RESPONSE_BODY property
     */
    private String rESPONSEBODY;
    /**
     * The RESPONSE_HEADERS property
     */
    private String rESPONSEHEADERS;
    /**
     * The RESPONSE_STATUS property
     */
    private String rESPONSESTATUS;
    /**
     * Instantiates a new {@link CreateWafRateLimitRuleModelVariableTypes} and sets the default values.
     */
    public CreateWafRateLimitRuleModelVariableTypes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateWafRateLimitRuleModelVariableTypes}
     */
    @jakarta.annotation.Nonnull
    public static CreateWafRateLimitRuleModelVariableTypes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateWafRateLimitRuleModelVariableTypes();
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
     * Gets the ARGS property value. The ARGS property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getARGS() {
        return this.aRGS;
    }
    /**
     * Gets the ARGS_COMBINED_SIZE property value. The ARGS_COMBINED_SIZE property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getARGSCOMBINEDSIZE() {
        return this.aRGSCOMBINEDSIZE;
    }
    /**
     * Gets the ARGS_GET property value. The ARGS_GET property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getARGSGET() {
        return this.aRGSGET;
    }
    /**
     * Gets the ARGS_GET_NAMES property value. The ARGS_GET_NAMES property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getARGSGETNAMES() {
        return this.aRGSGETNAMES;
    }
    /**
     * Gets the ARGS_POST property value. The ARGS_POST property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getARGSPOST() {
        return this.aRGSPOST;
    }
    /**
     * Gets the ARGS_POST_NAMES property value. The ARGS_POST_NAMES property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getARGSPOSTNAMES() {
        return this.aRGSPOSTNAMES;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(25);
        deserializerMap.put("ARGS", (n) -> { this.setARGS(n.getStringValue()); });
        deserializerMap.put("ARGS_COMBINED_SIZE", (n) -> { this.setARGSCOMBINEDSIZE(n.getStringValue()); });
        deserializerMap.put("ARGS_GET", (n) -> { this.setARGSGET(n.getStringValue()); });
        deserializerMap.put("ARGS_GET_NAMES", (n) -> { this.setARGSGETNAMES(n.getStringValue()); });
        deserializerMap.put("ARGS_POST", (n) -> { this.setARGSPOST(n.getStringValue()); });
        deserializerMap.put("ARGS_POST_NAMES", (n) -> { this.setARGSPOSTNAMES(n.getStringValue()); });
        deserializerMap.put("FILES_NAMES", (n) -> { this.setFILESNAMES(n.getStringValue()); });
        deserializerMap.put("GEO", (n) -> { this.setGEO(n.getStringValue()); });
        deserializerMap.put("QUERY_STRING", (n) -> { this.setQUERYSTRING(n.getStringValue()); });
        deserializerMap.put("REMOTE_ADDR", (n) -> { this.setREMOTEADDR(n.getStringValue()); });
        deserializerMap.put("REQUEST_BASENAME", (n) -> { this.setREQUESTBASENAME(n.getStringValue()); });
        deserializerMap.put("REQUEST_BODY", (n) -> { this.setREQUESTBODY(n.getStringValue()); });
        deserializerMap.put("REQUEST_COOKIES", (n) -> { this.setREQUESTCOOKIES(n.getStringValue()); });
        deserializerMap.put("REQUEST_COOKIES_NAMES", (n) -> { this.setREQUESTCOOKIESNAMES(n.getStringValue()); });
        deserializerMap.put("REQUEST_FILENAME", (n) -> { this.setREQUESTFILENAME(n.getStringValue()); });
        deserializerMap.put("REQUEST_HEADERS", (n) -> { this.setREQUESTHEADERS(n.getStringValue()); });
        deserializerMap.put("REQUEST_HEADERS_NAMES", (n) -> { this.setREQUESTHEADERSNAMES(n.getStringValue()); });
        deserializerMap.put("REQUEST_LINE", (n) -> { this.setREQUESTLINE(n.getStringValue()); });
        deserializerMap.put("REQUEST_METHOD", (n) -> { this.setREQUESTMETHOD(n.getStringValue()); });
        deserializerMap.put("REQUEST_PROTOCOL", (n) -> { this.setREQUESTPROTOCOL(n.getStringValue()); });
        deserializerMap.put("REQUEST_URI", (n) -> { this.setREQUESTURI(n.getStringValue()); });
        deserializerMap.put("REQUEST_URI_RAW", (n) -> { this.setREQUESTURIRAW(n.getStringValue()); });
        deserializerMap.put("RESPONSE_BODY", (n) -> { this.setRESPONSEBODY(n.getStringValue()); });
        deserializerMap.put("RESPONSE_HEADERS", (n) -> { this.setRESPONSEHEADERS(n.getStringValue()); });
        deserializerMap.put("RESPONSE_STATUS", (n) -> { this.setRESPONSESTATUS(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the FILES_NAMES property value. The FILES_NAMES property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFILESNAMES() {
        return this.fILESNAMES;
    }
    /**
     * Gets the GEO property value. The GEO property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGEO() {
        return this.gEO;
    }
    /**
     * Gets the QUERY_STRING property value. The QUERY_STRING property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQUERYSTRING() {
        return this.qUERYSTRING;
    }
    /**
     * Gets the REMOTE_ADDR property value. The REMOTE_ADDR property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREMOTEADDR() {
        return this.rEMOTEADDR;
    }
    /**
     * Gets the REQUEST_BASENAME property value. The REQUEST_BASENAME property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTBASENAME() {
        return this.rEQUESTBASENAME;
    }
    /**
     * Gets the REQUEST_BODY property value. The REQUEST_BODY property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTBODY() {
        return this.rEQUESTBODY;
    }
    /**
     * Gets the REQUEST_COOKIES property value. The REQUEST_COOKIES property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTCOOKIES() {
        return this.rEQUESTCOOKIES;
    }
    /**
     * Gets the REQUEST_COOKIES_NAMES property value. The REQUEST_COOKIES_NAMES property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTCOOKIESNAMES() {
        return this.rEQUESTCOOKIESNAMES;
    }
    /**
     * Gets the REQUEST_FILENAME property value. The REQUEST_FILENAME property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTFILENAME() {
        return this.rEQUESTFILENAME;
    }
    /**
     * Gets the REQUEST_HEADERS property value. The REQUEST_HEADERS property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTHEADERS() {
        return this.rEQUESTHEADERS;
    }
    /**
     * Gets the REQUEST_HEADERS_NAMES property value. The REQUEST_HEADERS_NAMES property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTHEADERSNAMES() {
        return this.rEQUESTHEADERSNAMES;
    }
    /**
     * Gets the REQUEST_LINE property value. The REQUEST_LINE property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTLINE() {
        return this.rEQUESTLINE;
    }
    /**
     * Gets the REQUEST_METHOD property value. The REQUEST_METHOD property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTMETHOD() {
        return this.rEQUESTMETHOD;
    }
    /**
     * Gets the REQUEST_PROTOCOL property value. The REQUEST_PROTOCOL property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTPROTOCOL() {
        return this.rEQUESTPROTOCOL;
    }
    /**
     * Gets the REQUEST_URI property value. The REQUEST_URI property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTURI() {
        return this.rEQUESTURI;
    }
    /**
     * Gets the REQUEST_URI_RAW property value. The REQUEST_URI_RAW property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getREQUESTURIRAW() {
        return this.rEQUESTURIRAW;
    }
    /**
     * Gets the RESPONSE_BODY property value. The RESPONSE_BODY property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRESPONSEBODY() {
        return this.rESPONSEBODY;
    }
    /**
     * Gets the RESPONSE_HEADERS property value. The RESPONSE_HEADERS property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRESPONSEHEADERS() {
        return this.rESPONSEHEADERS;
    }
    /**
     * Gets the RESPONSE_STATUS property value. The RESPONSE_STATUS property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRESPONSESTATUS() {
        return this.rESPONSESTATUS;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ARGS", this.getARGS());
        writer.writeStringValue("ARGS_COMBINED_SIZE", this.getARGSCOMBINEDSIZE());
        writer.writeStringValue("ARGS_GET", this.getARGSGET());
        writer.writeStringValue("ARGS_GET_NAMES", this.getARGSGETNAMES());
        writer.writeStringValue("ARGS_POST", this.getARGSPOST());
        writer.writeStringValue("ARGS_POST_NAMES", this.getARGSPOSTNAMES());
        writer.writeStringValue("FILES_NAMES", this.getFILESNAMES());
        writer.writeStringValue("GEO", this.getGEO());
        writer.writeStringValue("QUERY_STRING", this.getQUERYSTRING());
        writer.writeStringValue("REMOTE_ADDR", this.getREMOTEADDR());
        writer.writeStringValue("REQUEST_BASENAME", this.getREQUESTBASENAME());
        writer.writeStringValue("REQUEST_BODY", this.getREQUESTBODY());
        writer.writeStringValue("REQUEST_COOKIES", this.getREQUESTCOOKIES());
        writer.writeStringValue("REQUEST_COOKIES_NAMES", this.getREQUESTCOOKIESNAMES());
        writer.writeStringValue("REQUEST_FILENAME", this.getREQUESTFILENAME());
        writer.writeStringValue("REQUEST_HEADERS", this.getREQUESTHEADERS());
        writer.writeStringValue("REQUEST_HEADERS_NAMES", this.getREQUESTHEADERSNAMES());
        writer.writeStringValue("REQUEST_LINE", this.getREQUESTLINE());
        writer.writeStringValue("REQUEST_METHOD", this.getREQUESTMETHOD());
        writer.writeStringValue("REQUEST_PROTOCOL", this.getREQUESTPROTOCOL());
        writer.writeStringValue("REQUEST_URI", this.getREQUESTURI());
        writer.writeStringValue("REQUEST_URI_RAW", this.getREQUESTURIRAW());
        writer.writeStringValue("RESPONSE_BODY", this.getRESPONSEBODY());
        writer.writeStringValue("RESPONSE_HEADERS", this.getRESPONSEHEADERS());
        writer.writeStringValue("RESPONSE_STATUS", this.getRESPONSESTATUS());
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
     * Sets the ARGS property value. The ARGS property
     * @param value Value to set for the ARGS property.
     */
    public void setARGS(@jakarta.annotation.Nullable final String value) {
        this.aRGS = value;
    }
    /**
     * Sets the ARGS_COMBINED_SIZE property value. The ARGS_COMBINED_SIZE property
     * @param value Value to set for the ARGS_COMBINED_SIZE property.
     */
    public void setARGSCOMBINEDSIZE(@jakarta.annotation.Nullable final String value) {
        this.aRGSCOMBINEDSIZE = value;
    }
    /**
     * Sets the ARGS_GET property value. The ARGS_GET property
     * @param value Value to set for the ARGS_GET property.
     */
    public void setARGSGET(@jakarta.annotation.Nullable final String value) {
        this.aRGSGET = value;
    }
    /**
     * Sets the ARGS_GET_NAMES property value. The ARGS_GET_NAMES property
     * @param value Value to set for the ARGS_GET_NAMES property.
     */
    public void setARGSGETNAMES(@jakarta.annotation.Nullable final String value) {
        this.aRGSGETNAMES = value;
    }
    /**
     * Sets the ARGS_POST property value. The ARGS_POST property
     * @param value Value to set for the ARGS_POST property.
     */
    public void setARGSPOST(@jakarta.annotation.Nullable final String value) {
        this.aRGSPOST = value;
    }
    /**
     * Sets the ARGS_POST_NAMES property value. The ARGS_POST_NAMES property
     * @param value Value to set for the ARGS_POST_NAMES property.
     */
    public void setARGSPOSTNAMES(@jakarta.annotation.Nullable final String value) {
        this.aRGSPOSTNAMES = value;
    }
    /**
     * Sets the FILES_NAMES property value. The FILES_NAMES property
     * @param value Value to set for the FILES_NAMES property.
     */
    public void setFILESNAMES(@jakarta.annotation.Nullable final String value) {
        this.fILESNAMES = value;
    }
    /**
     * Sets the GEO property value. The GEO property
     * @param value Value to set for the GEO property.
     */
    public void setGEO(@jakarta.annotation.Nullable final String value) {
        this.gEO = value;
    }
    /**
     * Sets the QUERY_STRING property value. The QUERY_STRING property
     * @param value Value to set for the QUERY_STRING property.
     */
    public void setQUERYSTRING(@jakarta.annotation.Nullable final String value) {
        this.qUERYSTRING = value;
    }
    /**
     * Sets the REMOTE_ADDR property value. The REMOTE_ADDR property
     * @param value Value to set for the REMOTE_ADDR property.
     */
    public void setREMOTEADDR(@jakarta.annotation.Nullable final String value) {
        this.rEMOTEADDR = value;
    }
    /**
     * Sets the REQUEST_BASENAME property value. The REQUEST_BASENAME property
     * @param value Value to set for the REQUEST_BASENAME property.
     */
    public void setREQUESTBASENAME(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTBASENAME = value;
    }
    /**
     * Sets the REQUEST_BODY property value. The REQUEST_BODY property
     * @param value Value to set for the REQUEST_BODY property.
     */
    public void setREQUESTBODY(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTBODY = value;
    }
    /**
     * Sets the REQUEST_COOKIES property value. The REQUEST_COOKIES property
     * @param value Value to set for the REQUEST_COOKIES property.
     */
    public void setREQUESTCOOKIES(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTCOOKIES = value;
    }
    /**
     * Sets the REQUEST_COOKIES_NAMES property value. The REQUEST_COOKIES_NAMES property
     * @param value Value to set for the REQUEST_COOKIES_NAMES property.
     */
    public void setREQUESTCOOKIESNAMES(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTCOOKIESNAMES = value;
    }
    /**
     * Sets the REQUEST_FILENAME property value. The REQUEST_FILENAME property
     * @param value Value to set for the REQUEST_FILENAME property.
     */
    public void setREQUESTFILENAME(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTFILENAME = value;
    }
    /**
     * Sets the REQUEST_HEADERS property value. The REQUEST_HEADERS property
     * @param value Value to set for the REQUEST_HEADERS property.
     */
    public void setREQUESTHEADERS(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTHEADERS = value;
    }
    /**
     * Sets the REQUEST_HEADERS_NAMES property value. The REQUEST_HEADERS_NAMES property
     * @param value Value to set for the REQUEST_HEADERS_NAMES property.
     */
    public void setREQUESTHEADERSNAMES(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTHEADERSNAMES = value;
    }
    /**
     * Sets the REQUEST_LINE property value. The REQUEST_LINE property
     * @param value Value to set for the REQUEST_LINE property.
     */
    public void setREQUESTLINE(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTLINE = value;
    }
    /**
     * Sets the REQUEST_METHOD property value. The REQUEST_METHOD property
     * @param value Value to set for the REQUEST_METHOD property.
     */
    public void setREQUESTMETHOD(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTMETHOD = value;
    }
    /**
     * Sets the REQUEST_PROTOCOL property value. The REQUEST_PROTOCOL property
     * @param value Value to set for the REQUEST_PROTOCOL property.
     */
    public void setREQUESTPROTOCOL(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTPROTOCOL = value;
    }
    /**
     * Sets the REQUEST_URI property value. The REQUEST_URI property
     * @param value Value to set for the REQUEST_URI property.
     */
    public void setREQUESTURI(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTURI = value;
    }
    /**
     * Sets the REQUEST_URI_RAW property value. The REQUEST_URI_RAW property
     * @param value Value to set for the REQUEST_URI_RAW property.
     */
    public void setREQUESTURIRAW(@jakarta.annotation.Nullable final String value) {
        this.rEQUESTURIRAW = value;
    }
    /**
     * Sets the RESPONSE_BODY property value. The RESPONSE_BODY property
     * @param value Value to set for the RESPONSE_BODY property.
     */
    public void setRESPONSEBODY(@jakarta.annotation.Nullable final String value) {
        this.rESPONSEBODY = value;
    }
    /**
     * Sets the RESPONSE_HEADERS property value. The RESPONSE_HEADERS property
     * @param value Value to set for the RESPONSE_HEADERS property.
     */
    public void setRESPONSEHEADERS(@jakarta.annotation.Nullable final String value) {
        this.rESPONSEHEADERS = value;
    }
    /**
     * Sets the RESPONSE_STATUS property value. The RESPONSE_STATUS property
     * @param value Value to set for the RESPONSE_STATUS property.
     */
    public void setRESPONSESTATUS(@jakarta.annotation.Nullable final String value) {
        this.rESPONSESTATUS = value;
    }
}
