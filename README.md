# 코어 자바 9 

작성자: 안지환  
마지막 수정일: 2022.07.26  

### 브랜치 구성
 * `1-basic-java` : 기본 프로그래밍 구조
 * `2-oop` : 객체 지향 프로그래밍
 * `3-interFace` : 인터페이스와 람타 표현식
 * `4-extends` : 상속과 리플렉션
 * `5-try-catch` : 예외, 단정, 로깅
 * `6-generic` : 제네릭 프로그래밍
 * `7-collection` : 컬렉션
 * `8-stream` : 스트림
 * `9-input-output` : 입출력 처리
 * `10-parallel-programming` : 병행 프로그래밍
 * `11-annotation` : 애너테이션
 * `12-date-and-time` : 날짜와 시간 API
 * `13-internationalization` : 국제화
 * `14-compiling-and-scripting` : 컴파일링과 스크립팅
 * `15-Java-platform-module-system` : 자바 플랫폼 모듈 시스템

### 배경 (Background)
자바의 기본 지식의 중요하다고 느꼈습니다. 코어 자바 9 책 내용 내에 기본 지식을 습들을 하여서 부족했던 자바의 기본 지식을 채워 나아가기 위해서 공부합니다.  


### 목표 (Goals)
코어 자바 9내에 있는 내용을 습득합니다. 습득 과정에서 예제문제는 빠짐 없이 풀어야 합니다.


### 목표가 아닌 것 (Non-goals)
책에서 벗어나는 주제는 이번 과정에서 공부 하지 않습니다. 예문 + 예제를 중시 합니다. 


### 계획 (Plan)
앞으로 계획은 아래와 같습니다.

[Trello - 코어자바9](https://trello.com/c/It5nwuui) 내에 CheckList 을 확인 후 전날 계획을 확인합니다.  

한 강의가 들을 때는 Input 방식이 아닌 Output 방식(인출 학습)으로 공부를 진행 할 예정입니다.
강의 시작 전에 브랜치를 새로 생성합니다. 강의가 끝 난 후에는 git 브랜치를 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 구현을 도전합니다.

```java
git branch -a // 모든 로컬 브랜치 확인
git checkout main

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

강의 끝난 후에 필수 개념 및 중요한 내용은 README.md로 정리합니다.

마지막에 TIL 작성에서 오늘 배운 내용에 대해서 Fact/Feeling/Finding 으로 정리 해 기록을 남깁니다.

### 이외 고려사항들 (Other Considerations)


### 마일스톤 (Milestones)
