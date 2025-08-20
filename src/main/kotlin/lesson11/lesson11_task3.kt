package org.example.lesson11

fun main() {
    val room1 = Room(
        cover = "код обложки",
        title = "название",
        participant = mutableListOf(),
    )

    val participant1 = Participant(
        profilePicture = "фото",
        nickname = "имя",
        status = Status(speaking = true, muted = false, userMuted = false),
    )
}

class Participant(
    val profilePicture: String,
    val nickname: String,
    var status: Status,
)

class Status(
    val speaking: Boolean,
    val muted: Boolean,
    val userMuted: Boolean,
)

class Room(
    val cover: String,
    val title: String,
    val participant: MutableList<Participant>,
) {

    fun addParticipant(name: Participant) {
        participant.add(name)
    }

    fun updateStatus(nickname: String, newStatus: Status) {
        for (i in participant) {
            if (i.nickname == nickname) {
                i.status = newStatus
                break
            }
        }
    }
}