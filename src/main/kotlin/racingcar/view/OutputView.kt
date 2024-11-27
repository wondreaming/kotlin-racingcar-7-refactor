package racingcar.view

import racingcar.model.Car

class OutputView {
    fun showStartMessage() {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    }

    fun showRaceCount() {
        println("시도할 횟수는 몇 회인가요?")
    }

    fun showPlayStart() {
        println("실행결과")
    }

    fun showEachRoundResult(cars: List<Car>) {
        for (car in cars) {
            println("${car.name} : ${"-".repeat(car.position)}")
        }
    }
}