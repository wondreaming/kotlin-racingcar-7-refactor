# kotlin-racingcar-precourse
<hr style="border: 1.5px solid white;">

## 🧑‍💻 프로젝트 정의와 주요기능

### 자동차 경주

- 자동차 경주 게임 구현

### 주요 기능

- 자동차 경주의 우승자 출력

## 📋 기능 구현 목록

### 🙋 입력

- [X] 입력 받는 기능

### 🖥 출력

- [X] 자동차 이름 입력 : "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
- [ ] 시도 횟수 : "시도할 횟수는 몇 회인가요?"
- [ ] 매 라운드 실행 결과 : 
  실행 결과
  pobi : -
  woni :
  jun : -
- [ ] 최종 우승자 : "최종 우승자 : pobi", "최종 우승자 : pobi, jun"

### 🌈 로직

- 자동차의 이름 검증
    - [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- [ ] 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우
- [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- [ ] 사용자가 잘 못된 값을 입력하면 IllegalArgumentException

<hr style="border: 1px solid white;">

## 🤔 Edge Case


<hr style="border: 1px solid white;">

## 🚫 예외 상황
<table>
   <tr>
      <td>대상</td>
      <td>구현 여부</td>
      <td>상황</td>
   </tr>
    <tr>
      <td rowspan="4">시도 횟수</td>
      <td></td>
      <td>빈 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>시도 횟수는 long 범위를 입력하지 못한다.</td>
    </tr>
    <tr>
      <td></td>
      <td>Int가 아닌 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>시도횟수는 1이상만 가능</td>
    </tr>
    <tr>
      <td rowspan="5">자동차 이름</td>
      <td></td>
      <td>빈 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>구분자로 쉼표(,)가 없는 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>구분자로 쉼표(,)만 들어오는 경우 - 빈경우</td>
    </tr>
    <tr>
      <td></td>
      <td>같은 이름이 들어온 경우</td>
    </tr>
    <tr>
      <td></td>
      <td>이름은 5자 이하</td>
    </tr>
</table>