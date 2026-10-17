# android_app

Sample Android app built with Kotlin and Jetpack Compose (Material 3).

## Requirements

- JDK 17 or newer
- Android SDK with platform 36 (set `sdk.dir` in `local.properties` or `ANDROID_HOME`)

## Build and test

```bash
./gradlew lint                # Android lint
./gradlew testDebugUnitTest   # JVM unit tests
./gradlew assembleDebug       # build app/build/outputs/apk/debug/app-debug.apk
./gradlew installDebug        # install on a connected device/emulator
./gradlew connectedDebugAndroidTest  # instrumented UI tests (device required)
```

## Branch workflow

1. Start from the latest `develop`: `git checkout develop && git pull origin develop`
2. Create a feature branch: `git checkout -b feature/<name>`
3. Commit and push: `git push -u origin feature/<name>`
4. Open a pull request with base `develop` and request a review.
5. GitHub Actions (`.github/workflows/android-ci.yml`) runs lint, unit tests, and a debug build.
6. After approval, merge into `develop`.
