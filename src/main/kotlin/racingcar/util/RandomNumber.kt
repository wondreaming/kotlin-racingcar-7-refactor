package racingcar.util

import camp.nextstep.edu.missionutils.Randoms

class RandomNumber {
    fun getRandomNumber(): Int {
        val randomNumber = Randoms.pickNumberInRange(0, 9)
        return randomNumber
    }

}