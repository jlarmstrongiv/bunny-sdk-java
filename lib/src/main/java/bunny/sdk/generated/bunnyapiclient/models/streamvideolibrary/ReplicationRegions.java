package bunny.sdk.generated.bunnyapiclient.models.streamvideolibrary;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReplicationRegions implements ValuedEnum {
    UK("UK"),
    SE("SE"),
    NY("NY"),
    LA("LA"),
    SG("SG"),
    SYD("SYD"),
    BR("BR"),
    JH("JH");
    public final String value;
    ReplicationRegions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReplicationRegions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
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
