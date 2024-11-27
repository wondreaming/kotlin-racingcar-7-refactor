package racingcar.controller.Validation

class RaceCountValidation(
    private val raceCount: String,
) {
    fun validateRaceCount() {
        isNotEmpty()
        isLong()
        isInteger()
        over1()
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

    private fun over1() {
        require(raceCount.toInt() >= RACE_COUNT_OK) { RaceCountErrorType.UP_1.errorMessage }
    }

    companion object {
        private const val RACE_COUNT_OK = 1
    }
}