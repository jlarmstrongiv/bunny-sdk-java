# bunny-sdk

[![Maven Central Version](https://img.shields.io/maven-central/v/com.bunny-launcher/bunny-sdk)](https://central.sonatype.com/artifact/com.bunny-launcher/bunny-sdk)

## Install

Add the following dependencies to your `build.gradle` file:

```gradle
implementation 'com.bunny-launcher:bunny-sdk:0.0.0'
```

## Documentation

Please read the [docs](https://bunny-launcher.com/bunny-sdk/java) for usage and examples.

## Contributing

### Setup

- Generate signing credentials with [gpg](https://www.gnupg.org/gph/en/manual.html#AEN26):

  - `gpg --full-generate-key`
    - Key type is `RSA and RSA`
    - Key size is `3072`
    - Key does not expire `0`
    - name is `bunny-launcher`
    - email is blank
    - comment is `signing credentials`
  - `gpg --keyring secring.gpg --export-secret-keys > ~/.gnupg/secring.gpg`

- Export private and public keys

  - `gpg --output ~/.gnupg/public.pgp --armor --export username`
  - `gpg --output ~/.gnupg/private.pgp --armor --export-secret-key username`

Publish the key to any [GPG Key Server](https://maven.apache.org/developers/release/pmc-gpg-keys.html), such as [Ubuntu](https://keyserver.ubuntu.com/#submitKey).

- Create a GitHub token for releases

- Save signing credentials for [jreleaser](https://jreleaser.org/guide/latest/examples/maven/maven-central.html#_gradle) in `~/.jreleaser/config.toml`

  - JRELEASER_MAVENCENTRAL_USERNAME = "your-publisher-portal-username"
  - JRELEASER_MAVENCENTRAL_PASSWORD = "your-publisher-portal-password"
  - JRELEASER_GPG_PASSPHRASE = "your-pgp-passphrase"
  - JRELEASER_GITHUB_TOKEN = "your-github-token"

### Updating

- increment version in `gradle.properties`
- `./gradlew build` (only if you want to test locally)
- `git add -A`
- `git commit -m "message"`
- `git push`
- `./gradlew jreleaserConfig --stacktrace`
- `./gradlew clean`
- `./gradlew publish`
- `./gradlew jreleaserFullRelease --stacktrace`
