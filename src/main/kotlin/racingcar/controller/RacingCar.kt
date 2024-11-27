package racingcar.controller

import racingcar.controller.domain.UserInteractionController

class RacingCar(
    val userInteractionController: UserInteractionController = UserInteractionController()
) {
    fun run() {
        val carsName = getCarsName()
        val raceCount = getRaceCount()
    }

    private fun getCarsName(): String {
        val carsName = userInteractionController.handleCarsName()
        return carsName
    }

    private fun getRaceCount(): String {
        val raceCount = userInteractionController.handleRaceCount()
        return raceCount
    }
}