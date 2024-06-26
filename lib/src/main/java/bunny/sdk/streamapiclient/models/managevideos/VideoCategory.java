package bunny.sdk.streamapiclient.models.managevideos;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The automatically detected category of the video
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VideoCategory implements ValuedEnum {
    Adult("Adult"),
    AnimalsBirds("Animals Birds"),
    AnimalsCats("Animals Cats"),
    AnimalsDogs("Animals Dogs"),
    Animated("Animated"),
    Anime("Anime"),
    Gaming("Gaming"),
    Graphics("Graphics"),
    Illustrations("Illustrations"),
    Movie("Movie"),
    Other("Other"),
    OtherPeople("Other People"),
    SportsBasketball("Sports Basketball"),
    SportsHockey("Sports Hockey"),
    SportsOther("Sports Other"),
    SportsRacing("Sports Racing"),
    SportsSoccer("Sports Soccer"),
    SportsTennis("Sports Tennis"),
    Unknown("unknown");
    public final String value;
    VideoCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VideoCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Adult": return Adult;
            case "Animals Birds": return AnimalsBirds;
            case "Animals Cats": return AnimalsCats;
            case "Animals Dogs": return AnimalsDogs;
            case "Animated": return Animated;
            case "Anime": return Anime;
            case "Gaming": return Gaming;
            case "Graphics": return Graphics;
            case "Illustrations": return Illustrations;
            case "Movie": return Movie;
            case "Other": return Other;
            case "Other People": return OtherPeople;
            case "Sports Basketball": return SportsBasketball;
            case "Sports Hockey": return SportsHockey;
            case "Sports Other": return SportsOther;
            case "Sports Racing": return SportsRacing;
            case "Sports Soccer": return SportsSoccer;
            case "Sports Tennis": return SportsTennis;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
