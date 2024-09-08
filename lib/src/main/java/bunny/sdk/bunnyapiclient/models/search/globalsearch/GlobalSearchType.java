package bunny.sdk.bunnyapiclient.models.search.globalsearch;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GlobalSearchType implements ValuedEnum {
    Cdn("cdn"),
    Storage("storage"),
    Dns("dns"),
    Script("script"),
    Stream("stream");
    public final String value;
    GlobalSearchType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GlobalSearchType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cdn": return Cdn;
            case "storage": return Storage;
            case "dns": return Dns;
            case "script": return Script;
            case "stream": return Stream;
            default: return null;
        }
    }
}
