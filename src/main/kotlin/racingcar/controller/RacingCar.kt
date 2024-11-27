package racingcar.controller

import racingcar.controller.domain.UserInteractionController

class RacingCar(
    val userInteractionController: UserInteractionController = UserInteractionController()
) {
    fun run() {
        val carsName = getCarsName()
    }

    private fun getCarsName(): String {
        val carsName = userInteractionController.handleCarsName()
        return carsName
    }
}