package com.compose.navigation.data

val userDefault = User(
    userId = "abcd123456",
    name = "Default",
    avatarUrl = null,
    age = 45,
    score = 75,
    registerDate = "20/07/2024",
    email = "default@adnroid.com",
    bio = "Uma pessoa como qualquer outra.."
)

val johnDoe = User(
    userId = "rstuv098765",
    name = "John Doe",
    avatarUrl = null,
    age = 35,
    score = 80,
    registerDate = "21/06/2024",
    email = "jdoe@adnroid.com",
    bio = "Um bom malandro, conquistador, naipe de artista pique de jogador."
)

fun getUserData(userName: String): User {
    return if (userName == "John Doe") {
        johnDoe
    } else {
        userDefault
    }
}


