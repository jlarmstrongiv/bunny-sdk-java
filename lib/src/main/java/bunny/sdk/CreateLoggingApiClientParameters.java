package bunny.sdk;

public class CreateLoggingApiClientParameters {

  public final String accessKey;

  public CreateLoggingApiClientParameters(String accessKey) {
    this.accessKey = accessKey;
  }

  public CreateLoggingApiClientParameters(Builder builder) {
    this.accessKey = builder.accessKey;
  }

  public static class Builder {
    private String accessKey;

    public static Builder create() {
      return new Builder();
    }

    private Builder() {
    }

    public Builder setAccessKey(String accessKey) {
      this.accessKey = accessKey;
      return this;
    }

    public CreateLoggingApiClientParameters build() {
      return new CreateLoggingApiClientParameters(this);
    }
  }
}
