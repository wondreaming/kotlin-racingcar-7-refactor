package racingcar.controller.Validation

class CarsNameValidation(
    private val carsName: String,
) {
    fun validateCarsName() {
        isNotEmpty()
    }

    private fun isNotEmpty() {
        require(carsName.isNotEmpty()) { CarsNameErrorType.EMPTY_INPUT.errorMessage }
    }
}