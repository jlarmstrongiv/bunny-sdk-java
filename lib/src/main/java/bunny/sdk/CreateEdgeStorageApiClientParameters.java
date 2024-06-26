package bunny.sdk;

public class CreateEdgeStorageApiClientParameters {

    public final String accessKey;
    public final String baseUrl;

    public CreateEdgeStorageApiClientParameters(String accessKey, String baseUrl) {
        this.accessKey = accessKey;
        this.baseUrl = baseUrl;
    }

    public CreateEdgeStorageApiClientParameters(Builder builder) {
        this.accessKey = builder.accessKey;
        this.baseUrl = builder.baseUrl;
    }

    public static class Builder {
        private String accessKey;
        private String baseUrl;

        public static Builder create() {
            return new Builder();
        }

        private Builder() {}

        public Builder setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public CreateEdgeStorageApiClientParameters build() {
            return new CreateEdgeStorageApiClientParameters(this);
        }
    }
}
