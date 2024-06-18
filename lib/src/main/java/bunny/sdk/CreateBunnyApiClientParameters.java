package bunny.sdk;

public class CreateBunnyApiClientParameters {

    public final String accessKey;

    public CreateBunnyApiClientParameters(String accessKey) {
        this.accessKey = accessKey;
    }

    public CreateBunnyApiClientParameters(Builder builder) {
        this.accessKey = builder.accessKey;
    }

    public static class Builder {
        private String accessKey;

        public static Builder create() {
            return new Builder();
        }

        private Builder() {}

        public Builder setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public CreateBunnyApiClientParameters build() {
            return new CreateBunnyApiClientParameters(this);
        }
    }
}
