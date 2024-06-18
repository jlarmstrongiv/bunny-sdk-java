package bunny.sdk.generated.bunnyapiclient.models.pullzone.optimizer;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PropertiesOptimizer implements ValuedEnum {
    None("none"),
    Image("image");
    public final String value;
    PropertiesOptimizer(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PropertiesOptimizer forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "image": return Image;
            default: return null;
        }
    }
}
