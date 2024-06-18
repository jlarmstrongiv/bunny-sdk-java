package bunny.sdk.generated.bunnyapiclient.models.pullzone.optimizer;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PropertiesCropGravity implements ValuedEnum {
    Center("center"),
    Forget("forget"),
    East("east"),
    North("north"),
    South("south"),
    West("west"),
    Northeast("northeast"),
    Northwest("northwest"),
    Southeast("southeast"),
    Southwest("southwest");
    public final String value;
    PropertiesCropGravity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PropertiesCropGravity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "center": return Center;
            case "forget": return Forget;
            case "east": return East;
            case "north": return North;
            case "south": return South;
            case "west": return West;
            case "northeast": return Northeast;
            case "northwest": return Northwest;
            case "southeast": return Southeast;
            case "southwest": return Southwest;
            default: return null;
        }
    }
}
