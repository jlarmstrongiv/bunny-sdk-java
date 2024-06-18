package bunny.sdk.generated.bunnyapiclient.models.pullzone;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PullZoneCreateRoutingFilters implements ValuedEnum {
    All("all"),
    Eu("eu");
    public final String value;
    PullZoneCreateRoutingFilters(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PullZoneCreateRoutingFilters forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "eu": return Eu;
            default: return null;
        }
    }
}
