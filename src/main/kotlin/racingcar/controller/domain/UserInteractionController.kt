package racingcar.controller.domain

import racingcar.model.Car
import racingcar.view.InputView
import racingcar.view.OutputView

class UserInteractionController(
    val inputView: InputView = InputView(),
    val outputView: OutputView = OutputView(),
) {

    fun handleCarsName(): String {
        outputView.showStartMessage()
        val carsName = inputView.getInput()
        return carsName
    }

    fun handleRaceCount(): String {
        outputView.showRaceCount()
        val raceCount = inputView.getInput()
        return raceCount
    }

    fun handlePlayStart() {
        outputView.showPlayStart()
    }

    fun handleEachRoundResult(cars: List<Car>) {
        outputView.showEachRoundResult(cars)
    }
}