package racingcar.controller.domain

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
}