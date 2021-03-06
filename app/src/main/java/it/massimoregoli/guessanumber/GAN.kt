@file:Suppress("SpellCheckingInspection")

package it.massimoregoli.guessanumber

import kotlin.random.Random

class GAN(private var maxAttempts: Int) {
    private var maxValue = 100
    private var toGuess = 0
    private var _attempts = 0
    val attempts
        get() = _attempts

    enum class Answer {
        TOOBIG, TOOSMALL, YOUWIN, YOULOOSE
    }

    fun new() {
        toGuess = Random.nextInt(maxValue) + 1
        _attempts = 0
    }

    fun check(guess: Int) : Answer {
        _attempts += 1

        if (guess == toGuess)
            return Answer.YOUWIN
        if(_attempts > maxAttempts)
            return Answer.YOULOOSE
        if (guess > toGuess)
            return Answer.TOOBIG
        return Answer.TOOSMALL
    }
}