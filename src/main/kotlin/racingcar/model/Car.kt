package racingcar.model

import racingcar.util.RandomNumber
import javax.swing.text.Position

data class Car(
    private val name: String,
    private var _position: Int = 0,
) {
    val position: Int
        get() = _position

    fun move() {
        val randomNumber = RandomNumber().getRandomNumber()
        if (randomNumber >= 4) {
            _position++
        }
    }
}
