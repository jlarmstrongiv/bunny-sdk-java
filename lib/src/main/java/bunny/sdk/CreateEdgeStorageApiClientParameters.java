package bunny.sdk;

public class CreateEdgeStorageApiClientParameters {

    public final String accessKey;

    public CreateEdgeStorageApiClientParameters(String accessKey) {
        this.accessKey = accessKey;
    }

    public CreateEdgeStorageApiClientParameters(Builder builder) {
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

        public CreateEdgeStorageApiClientParameters build() {
            return new CreateEdgeStorageApiClientParameters(this);
        }
    }
}
