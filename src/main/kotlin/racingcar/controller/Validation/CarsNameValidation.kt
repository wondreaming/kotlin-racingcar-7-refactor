package racingcar.controller.Validation

class CarsNameValidation(
    private val carsName: String,
) {
    fun validateCarsName() {
        isNotEmpty()
        checkCarsCount()
        checkCarName5()
    }

    private fun isNotEmpty() {
        require(carsName.isNotEmpty()) { CarsNameErrorType.EMPTY_INPUT.errorMessage }
    }

    private fun checkCarsCount() {
        val carsCount = carsName.split(COMMA).size
        require(carsCount >= RACING_OK_COUNT) { CarsNameErrorType.UP_1.errorMessage }
    }

    private fun checkCarName5() {
        val carsName = carsName.split(COMMA)
        require(carsName.any { it.length <= CAR_NAME_OK_LENGTH }) { CarsNameErrorType.UNDER_5.errorMessage }
    }
    companion object {
        private const val COMMA = ","
        private const val RACING_OK_COUNT = 2
        private const val CAR_NAME_OK_LENGTH = 2

    }
}