package racingcar.controller.Validation

class RaceCountValidation(
    private val raceCount: String,
) {
    fun validateRaceCount() {
        isNotEmpty()

    }

    private fun isNotEmpty() {
        require(raceCount.isNotEmpty()) { RaceCountErrorType.EMPTY_INPUT.errorMessage }
    }

}