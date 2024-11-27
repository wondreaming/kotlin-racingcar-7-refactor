package racingcar.controller.Validation

class RaceCountValidation(
    private val raceCount: String,
) {
    fun validateRaceCount() {
        isNotEmpty()
        isLong()
        isInteger()
    }

    private fun isNotEmpty() {
        require(raceCount.isNotEmpty()) { RaceCountErrorType.EMPTY_INPUT.errorMessage }
    }

    private fun isLong() {
        require(raceCount.toLongOrNull() == null) { RaceCountErrorType.NO_LONG.errorMessage }
    }

    private fun isInteger() {
        require(raceCount.toIntOrNull() != null) { RaceCountErrorType.INTEGER.errorMessage }
    }
}