package bunny.sdk.generated.bunnyapiclient.models.pullzone;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PullZoneRoutingFilters implements ValuedEnum {
    All("all"),
    Eu("eu");
    public final String value;
    PullZoneRoutingFilters(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PullZoneRoutingFilters forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "eu": return Eu;
            default: return null;
        }
    }
}
