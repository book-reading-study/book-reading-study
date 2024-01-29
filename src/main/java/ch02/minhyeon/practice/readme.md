# 연습문제 풀이

## 문제2-1
```java
    Print p = new PrintBanner("Hello");
```
왜 아래와 같이 PrintBanner에 대입하지 않았을까요?
```java
    PrintBanner p = new PrintBanner("Hello");
```

### 답변 : 
Main 클래스에서 필요한것은 Target인 "Print"의 인터페이스나 class 였기 때문에.
PrintBanner는 어뎁터로써의 기능을 할뿐이지 내가 필요한 기능을 정의한 class나 인터페이스가 아니다.

## 문제 2-2

