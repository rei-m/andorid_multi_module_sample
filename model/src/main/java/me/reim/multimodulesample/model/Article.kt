package me.reim.multimodulesample.model

data class Article(
    val id: String,
    val title: String,
    val body: String,
    val user: User
)
