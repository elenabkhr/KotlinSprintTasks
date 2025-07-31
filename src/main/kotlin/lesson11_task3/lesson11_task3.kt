package org.example.lesson11_task3

fun main() {
    val room1 = Room(
        cover = "код обложки",
        title = "название",
        participants = mutableListOf("участник1", "участник2", "участник3")
    )
}

class Participants(
    val profilePicture: String,
    val nickname: String,
    val status: String,
)

class Status(
    val speaking: Boolean,
    val muted: Boolean,
    val userMuted: Boolean,
)

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<String>,
) {

    fun addParticipant(name: Participants) {
    }

    fun updateStatus(nickname: String, newStatus: String) {
    }
}