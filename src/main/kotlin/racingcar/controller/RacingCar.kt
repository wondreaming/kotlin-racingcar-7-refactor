package racingcar.controller

import racingcar.controller.Validation.CarsNameValidation
import racingcar.controller.domain.UserInteractionController

class RacingCar(
    private val userInteractionController: UserInteractionController = UserInteractionController()
) {
    fun run() {
        val carsName = getCarsName()
        validateCarName(carsName)

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

    private fun validateCarName(carsName: String) {
        val carsNameValidation = CarsNameValidation(carsName)
        carsNameValidation.validateCarsName()
    }
}