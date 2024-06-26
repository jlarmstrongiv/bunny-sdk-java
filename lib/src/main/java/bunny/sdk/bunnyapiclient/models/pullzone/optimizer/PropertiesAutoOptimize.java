package bunny.sdk.bunnyapiclient.models.pullzone.optimizer;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PropertiesAutoOptimize implements ValuedEnum {
    Low("low"),
    Medium("medium"),
    High("high");
    public final String value;
    PropertiesAutoOptimize(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PropertiesAutoOptimize forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            default: return null;
        }
    }
}
