package racingcar.controller.Validation

enum class CarsNameErrorType ( private val _errorMessage: String){
    EMPTY_INPUT("자동차 이름에 빈 문자를 입력했습니다."),
    N0_COMMA("쉼표(,)가 입력되지 않았습니다."),
    SAME_NAME("동일한 이름을 입력했습니다."),
    UNDER_5("자동차 이름은 5자 이하만 가능합니다."),
    UP_1("자동차 경주는 2대이상부터 가능합니다.");

    val errorMessage: String
        get() = ERROR_MESSAGE + _errorMessage

    companion object {
        private const val ERROR_MESSAGE = "[ERROR] "
    }
}