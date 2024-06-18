package bunny.sdk.generated.streamapiclient.library.item.videos;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetOrderByQueryParameterType implements ValuedEnum {
    Date("date"),
    Title("title");
    public final String value;
    GetOrderByQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetOrderByQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "date": return Date;
            case "title": return Title;
            default: return null;
        }
    }
}
