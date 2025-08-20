package org.example.lesson17

class Quiz(private val question: String, private var answer: String) {

    fun getQuestion() = question

    fun getAnswer() = answer
    fun setAnswer(newAnswer: String) {
        answer = newAnswer
    }
}