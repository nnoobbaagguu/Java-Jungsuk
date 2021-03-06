# 자바의 정석

<h2>Chapter 04. 조건문과 반복문</h2>

```
// 향상된 for문
for ( 타입 변수명 : 배열 또는 컬렉션 ) {}

int sum = 0;
int[] arr = { 1, 2, 3, 4, 5 };
for (int tmp : arr) {
  sum += tmp;
}
```

```
// 이름 붙은 반복문
loop : while (true) {
  while (true) {
    break loop; // loop를 빠져나와서
  }
  System.out.println("loop");
} // 여기로 이동
```

<h2>Chapter 05. 배열 array</h2>

<p>배열의 최대 길이는 int 타입의 최대값인 2^31 - 1이고, 최소 길이는 0이다.</p>

```
// System.arraycopy()를 이용한 배열의 복사
int[] num = { 1, 2, 3, 4, 5 };
int[] newNum = new int[10];
System.arraycopy(num, 0, newNum, 0, num.length);
```
  
  
<h5>의문점1 - Chapter02 변수 72p</h5>
실수는 부동소수점수의 형태로 저장한다.<br>
float의 경우 가수는 23개의 bit로 저장한다.<br>
가수는 1.12345678901234567890123(이진법으로 나타내야하지만 소수점 아래의 각 자리의 수는 일단 소수점 아래 몇 자리수인가를 나타낸다.)로 저장된다.<br>
무조건 가수의 일의 자리수는 1, 0 중 1으로 정규화된다는 말이다.<br>
따라서 float형 변수가 나타낼 수 있는 최소 양수는 1.00000000000000000000000 * 2^(-126)이어야 하는데, 0.00000000000000000000001(2진수) * 2^(-126) = 1.0 * 2^(-149)가 최소 양수로 설명되어 있다.<br>

<h5>의문점2 - Chapter07 객체지향 프로그래밍 II 381p</h5>
인터페이스의 멤버는 상수 혹은 추상 메소드이어야 한다.<br>
그런데 왜 멤버변수는 public static final이어야 할까? (default) static final는 안 되는 걸까?<br>
구현을 통해 사용될수 밖에 없으므로 abstract class보다 더 심한 제약을 두는 걸까?

[구글링 결과](https://docs.microsoft.com/ko-kr/cpp/c-language/type-float?view=msvc-170) C와 C++의 경우는 최대 값의 지수(10의)가 38, 최소 양의 값의 지수(10의) -38로 내가 생각된 대로 나왔다.<br>
Java에서 실수를 저장하는 방식은 C, C++와 다르다. => 는 옳지 않다.<br>
실수가 정규화되지 않고 비정규화되면, 가수의 일의 자리수가 1이 될 필요가 없다.<br>
지수부가 -127(최소값)인 경우, 비정규화된 형식으로 해석하기로 약속했기 때문에, 표현할 수 있는 최소 절대값이 약 10^(-38)이 아닌 약 10^(-45)인 것이다.<br>
