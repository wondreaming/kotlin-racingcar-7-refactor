package racingcar.controller

import racingcar.controller.Validation.CarsNameValidation
import racingcar.controller.Validation.RaceCountValidation
import racingcar.controller.domain.UserInteractionController
import racingcar.model.Car

class RacingCar(
    private val userInteractionController: UserInteractionController = UserInteractionController()
) {
    fun run() {
        val carsName = getCarsName()
        validateCarName(carsName)
        val cars = adapterCarsName(carsName)

        val raceCount = getRaceCount()
        validateRaceCount(raceCount)
        val palyCount = adapterRaceCount(raceCount)
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

    private fun validateRaceCount(raceCount: String) {
        val raceCountValidation = RaceCountValidation(raceCount)
        raceCountValidation.validateRaceCount()
    }

    private fun adapterCarsName(carsName: String): List<Car> {
        val cars = carsName.split(",").map { Car(it.trim()) }
        return cars
    }

    private fun adapterRaceCount(raceCount: String): Int {
        return raceCount.toInt()
    }
}