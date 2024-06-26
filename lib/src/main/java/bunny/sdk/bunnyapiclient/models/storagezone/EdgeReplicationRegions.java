package bunny.sdk.bunnyapiclient.models.storagezone;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EdgeReplicationRegions implements ValuedEnum {
    DE("DE"),
    UK("UK"),
    SE("SE"),
    CZ("CZ"),
    ES("ES"),
    NY("NY"),
    LA("LA"),
    WA("WA"),
    MI("MI"),
    SG("SG"),
    HK("HK"),
    JP("JP"),
    SYD("SYD"),
    BR("BR"),
    JH("JH");
    public final String value;
    EdgeReplicationRegions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EdgeReplicationRegions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DE": return DE;
            case "UK": return UK;
            case "SE": return SE;
            case "CZ": return CZ;
            case "ES": return ES;
            case "NY": return NY;
            case "LA": return LA;
            case "WA": return WA;
            case "MI": return MI;
            case "SG": return SG;
            case "HK": return HK;
            case "JP": return JP;
            case "SYD": return SYD;
            case "BR": return BR;
            case "JH": return JH;
            default: return null;
        }
    }
}
