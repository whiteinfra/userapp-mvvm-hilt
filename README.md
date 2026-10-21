# UserApp: MVVM + Clean Architecture

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)
![Hilt](https://img.shields.io/badge/Hilt-DI-34A853?style=flat-square&logo=google&logoColor=white)

A user list and details app that shows **MVVM** on top of **Clean Architecture** layers, wired with **Hilt**. The data layer simulates a network source with an in-memory list and delays.

> Lab #4 · Mobile Application Development course. Ukrainian version: [README.uk.md](README.uk.md)

## Structure

| Layer | Contents |
|---|---|
| domain | `User`, `UserRepository` interface, `GetUsersUseCase`, `GetUserByIdUseCase` |
| data | `UserDto`, `UserRepositoryImpl` |
| presentation | `UserListScreen`, `UserDetailScreen`, `NavGraph`, `UserViewModel` (`StateFlow`) |
| di | `AppModule` (Hilt) |

## Tech stack

Kotlin · Jetpack Compose · Navigation Compose · Hilt · Coroutines · StateFlow · ViewModel

## Run locally

Open in Android Studio, let Gradle sync, run on API 26+.
