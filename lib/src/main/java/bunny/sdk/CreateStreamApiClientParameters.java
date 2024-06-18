package bunny.sdk;

public class CreateStreamApiClientParameters {

    public final String accessKey;

    public CreateStreamApiClientParameters(String accessKey) {
        this.accessKey = accessKey;
    }

    public CreateStreamApiClientParameters(Builder builder) {
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

        public CreateStreamApiClientParameters build() {
            return new CreateStreamApiClientParameters(this);
        }
    }
}
