package racingcar.controller

import racingcar.controller.Validation.CarsNameValidation
import racingcar.controller.Validation.RaceCountValidation
import racingcar.controller.domain.UserInteractionController
import racingcar.model.Car

class RacingCar(
    private val userInteractionController: UserInteractionController = UserInteractionController()
) {
    fun run() {
        val cars = startCarsName()
        val playCount = startRaceCount()
        val doneCars = startGame(playCount, cars)
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

    private fun startCarsName(): List<Car> {
        val carsName = getCarsName()
        validateCarName(carsName)
        val cars = adapterCarsName(carsName)
        return cars
    }

    private fun startRaceCount(): Int {
        val raceCount = getRaceCount()
        validateRaceCount(raceCount)
        val playCount = adapterRaceCount(raceCount)
        return playCount
    }

    private fun adapterCarsName(carsName: String): List<Car> {
        val cars = carsName.split(COMMA).map { Car(it.trim()) }
        return cars
    }

    private fun adapterRaceCount(raceCount: String): Int {
        return raceCount.toInt()
    }

    private fun startGame(playCount: Int, cars: List<Car>): List<Car> {
        userInteractionController.handlePlayStart()
        for (count in START_GAME..playCount) {
            cars.forEach { it.move() }
            userInteractionController.handleEachRoundResult(cars)
        }
        return cars
    }

    companion object {
        private const val COMMA = ","
        private const val START_GAME = 1
    }
}