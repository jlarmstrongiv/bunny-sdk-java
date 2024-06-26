package bunny.sdk.bunnyapiclient.models.storagezone;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StandardRegions implements ValuedEnum {
    DE("DE"),
    UK("UK"),
    SE("SE"),
    NY("NY"),
    LA("LA"),
    SG("SG"),
    SYD("SYD"),
    BR("BR"),
    JH("JH");
    public final String value;
    StandardRegions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StandardRegions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DE": return DE;
            case "UK": return UK;
            case "SE": return SE;
            case "NY": return NY;
            case "LA": return LA;
            case "SG": return SG;
            case "SYD": return SYD;
            case "BR": return BR;
            case "JH": return JH;
            default: return null;
        }
    }
}
