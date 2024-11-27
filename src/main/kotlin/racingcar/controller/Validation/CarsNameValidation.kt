package racingcar.controller.Validation

class CarsNameValidation(
    private val carsName: String,
) {
    fun validateCarsName() {
        isNotEmpty()
        checkCarsCount()
        isCOMMA()
    }

    private fun isNotEmpty() {
        require(carsName.isNotEmpty()) { CarsNameErrorType.EMPTY_INPUT.errorMessage }
    }

    private fun checkCarsCount() {
        val carsCount = carsName.split(COMMA).size
        require(carsCount >= RACING_OK_COUNT) { CarsNameErrorType.UP_1.errorMessage }
    }


    private fun isCOMMA() {
        require(carsName.contains(COMMA)) { CarsNameErrorType.N0_COMMA.errorMessage }
    }

    companion object {
        private const val COMMA = ","
        private const val RACING_OK_COUNT = 2
    }
}