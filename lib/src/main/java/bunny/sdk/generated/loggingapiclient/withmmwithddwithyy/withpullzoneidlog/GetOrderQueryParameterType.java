package bunny.sdk.generated.loggingapiclient.withmmwithddwithyy.withpullzoneidlog;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetOrderQueryParameterType implements ValuedEnum {
    Asc("asc"),
    Desc("desc");
    public final String value;
    GetOrderQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetOrderQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "asc": return Asc;
            case "desc": return Desc;
            default: return null;
        }
    }
}
