## 배열과 배열 리스트
배열은 프로그래밍의 기본요소로 타입이 같은 아이템을 모으는 데 사용합니다.  
자바는 언어 수준에 배열 타입을 포함하여, 필요에 따라 늘어나고 줄어드는 배열을 나타내는 ArrayList 클래스도 제공합니다.ArrayList 클래스는 컬렉션을 다루는 프레임워크의 일부이다.

### 배열 다루기

모든 타입에는 대응하는 배열 타입이 있다. 정수의 배열은 int[] 타입, String 객체의 배열은 String[] 타입이 되는 식이다.

```java
String[] name;
```

아직 변수가 초기화되지 않았으니 새 배열로 초기화 해 봅니다.
new 연산자가 필요합니다.

```java
names = new String[100];
```

다음과 같이 해볼 수 있습니다.
```java
String[] names = new String[100];
```

배열의 길이는 array.length로 얻을 수 있습니다. 다음 루프는 배열을 빈 문자열로 채울 수 있습니다.
```java
for(int i = 0; i < names.length; i++) {
    names[i] = "";
}
```

### 배열 생성
new 연산자로 배열을 선언하면 배열을 기본 값으로 채웁니다.
* 숫자 타입의 배열은 0으로 채웁니다.
* boolean의 배열은 false로 채웁니다.
* 객체의 배열은 null 참조로 채웁니다.

객체의 배열을 생성한 후에는 객체로 채워야 합니다.   
```java
BigInteger[] numbers = new BigInteger[100];
```
아직은 어떤 BigInteger 객체도 포함하지 않은 상태다. 그저 null 참조 100개로 채운 배여일 뿐이다. 이 null 참조를 BigInteger 객체 참조로 교체해야 합니다.  
```java
for (int i = 0; i < 100; i++) { 
    numbers[i] = BIgInteger.valueOf(i);
}
```
루프를 작성해서 배열의 값을 채울 수 있습니다. 원하는 값을 알고 있을 때 중괄호 안에 원하는 값을 나열하면 됩니다.  
```java
int[] primes = { 2, 3, 4, 7, 11, 13 };
```

중괄호로 값을 채울 때 new 연산자를 사용하지 않으면 배열의 길이도 지정하지 않습니다.
```java
String[] authors = {
    "James Gosling",
    "Bill Joy",
    "Guy Steele"
};
```
배열에 이름을 붙이지 않을 때도 유사한 초기화 문법을 사용합니다.

```java
primes = new int[] { 17. 19, 23, 29 31 };
```

### 배열 리스트

배열을 생성하려면 배열의 길이를 알아야 합니다.
배열을 한번 생성하면 절대로 길이를 변경할 수 없습니다. 이 문제는 `ArrayList`로 해결이 가능합니다.  
`ArrayList` 객체는 내부에서 배열을 관리합니다. 배열이 너무 작아지거나 배여르이 공간이 많아지면, 다른 내부 배열을 자동으로 생성해서 원본 배열의 요소를 옮깁니다.  
배열과 배열 리스트의 문법은 완전 다릅니다. 배열은 특수 문법을 사용합니다.
요소에 접근할 때는 [ ] 연산자를 사용하고, 배열 타입에는 Type[ ]문법, 배열을 생성 할 때는 new Type[n] 문법을 사용합니다.

이와 달리 배열 리스트는 클래스이므로 일반 인스턴스 생성 문법과 메서드 호출 문법을 사용합니다.
하지만 지금까지 살펴본 클래스와 달리 ArrayList는 제네릭 클래스 즉 타입 매개변수가 있는 클래스입니다.
배열 리스트 변수를 선언하려면 제네릭 클래스 문법을 사용해 `<>` 안에 타입을 지정해야 합니다.

```java
ArrayList<String> friends;
```
`<>` 부분은 컴파일러의 변수 타입에서 타입 매개변수를 추론합니다.
이 호출에는 생성 인수가 없지만, 그럼에도 끝에()를 붙여야 합니다. 결과는 크기가 0인 배열 리스트다. add 메서드로 요소를 끝에 추가할 수 있습니다.

```java
friends.add("Pater");
friends.add("Paul");
```

배열 리스트용 초깃값 지정 문법은 없습니다. 다음과 같이 배열 리스트르 생성하는 것이 최선입니다.
```java
ArrayList<String> friends = new ArrayList<>(List.of("Peter", "Paul"));
```
List.of 메서드는 지정한 요소들로 구성된 수정 불가능한 리스트를 반환합니다.
반환받은 리스트로 ArrayList를 생성합니다. ArrayList의 어느 위치든 요소를 추가하고 제거할 수 있습니다.

```java
friends.remove(1);
friends.add(0, "Paul"); // 인덱스 0 앞에 추가합니다.
```
배열 리스트의 요소에 접근하려면 [] 문법이 아니라 메서드 호출을 사용해야 합니다. get 메서드는 요소를 읽어 오고, set 메서드는 요소를 다른 값으로 교체합니다.

```java
String first = friends.get(0);
friends.set(1, "Mary");
```
size 메서드는 리스트의 현재 크기를 돌려줍니다. 모든 요소를 순회하고 싶다면 다음과 같이 루프를 사용합니다.

```java
for (int i = 0; i < friends.size(); i++){
    System.out.println(friends.get(i));
}
```

### 기본 타입의 래퍼 클래스

**래퍼 클래스는 무엇인가요?**  
- 래퍼 클래스는 기본 타입을 객체 타입으로 취급하기 위해서 데이터 객체로 포장해주는 클래스 입니다.    

**래퍼 클래스를 사용하는 이유는 무엇인가요?**
* 제네릭 클래스는 한가지 제약이 있습니다. 기본 타입을 매개변수를 사용 할 수 없습니다. 예시로 **ArrayList<int>** 는 사용이 불가능합니다. `<>` 안에는 타입이 들어와야 하기 때문에 기본 타입을 사용 할 수가 없습니다. 해결책으로는 **래퍼 클래스**를 사용해서 이 문제를 해결 합니다.

**어떤 형태로 사용해야 합니까?**  

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(42);
int first = numbers.get(0);

System.out.println("first : " + first) //42
```
**어떻게 `<>` 안에서 래퍼 타입을 기본 타입으로 알 수 있습니까?**  
* 래퍼 타입은 기본 타입으로 자동 변환을 합니다. add를 호출하는 과정에서 **오토박싱을** 거쳐서 Integer 객채를 42 값을 거쳐 자동으로 만들어 줍니다. 
* get 메서드로 호출을 하면 Integer 객체로 반환해줍니다. 객체 내부에 int 값을 반환해주는 **언박싱**이 됩니다. 
* **참고 사항**은 래퍼 타입은 객체임으로 null 값이 허용이 됩니다. 기본 타입은 null이 허용이 되지 않아서 둘 차이를 염두 해야 합니다.

### 배열과 배열 리스트 복사

- **배열 복사는 무엇인가요?**
    - 배열의 변수를 다른 배열 변수로 복사 합니다. 한 변수가 다른 변수의 배열을 참조합니다.

```java
int[] numbers = primes;
numbers[5] = 42; //primes [5] 도 42이다. 
```

![같은 배열의 참조하는 두 배열](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bea4d9af-20ca-4147-b091-4dcb4afc0ad0/75DEBA6A-8937-46BB-9CE0-B1083DD5BC05.png)

같은 배열의 참조하는 두 배열

numbers = primes 두 주소를 공유해서 primes[5]와 number[5]은 같은 주소입니다.

배열의 사본을 만들 때 정적 메서드 `Arrays.copyOf` 를 사용하면 됩니다.

```java
public class ArrayListCopyExample {

    public static void main(String[] args) {

        int[] primes = new int[]{1,2,3,4,5};
        int[] numbers = primes;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if(number == 5) {
                System.out.println(42);
            }
        }

        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);

        System.out.println(copiedPrimes.length);
    }

}
```

이외에도 배열 리스트를 참조해서 동일하 배열 요소를 복하 할 수 있습니다.

```java
public class ArrayListCopyOfExample {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        friends.add("Paul");
        friends.add("jihwooon");
        friends.remove(1);
        friends.set(0, "Paul");
        System.out.println("friends" + friends);
        String getNumber = friends.get(0);
        System.out.println("getNumber : " + getNumber);

        for (int i = 0; i < friends.size(); i++) {
            System.out.println("friends.get(i) : " + friends.get(i));
        }

        ArrayList<String> people = friends;
        people.set(0, "Mary");

        ArrayList<String> copiedFriends = new ArrayList<>(friends);

        String result = copiedFriends.get(0);
        System.out.println(result);

        friends = new ArrayList<>(List.of("Peter", "Paul", "Mary"));
        String[] names = friends.toArray(new String[0]);
        System.out.println("friends : " + Arrays.toString(names));

    }

}
```

### 배열 알고리즘

- `Array`와 `Collections` 클래스는 배열과 배열 리스트에 자주 쓰이는 알고리즘 입니다.

```java
Arrays.fill(numbers, 0)// int[] 배열
Collections.fill(friends, ""); //ArrayList<String>
```

배열이나 배열 리스트를 정렬할 때 `sort` 메서드를 사용합니다.

```java
Arrays.sort(names);
Collections.sort(friends);
```

`Arrays.toString` 메서드는 배열을 문자열로 표현한 결과를 돌려준다. 디버깅용으로 요긴하다.

```java
System.out.println(Arrays.toString(primes));
// [2, 3, 5, 7, 11, 13]을 출력한다.
```

배열 리스트용 알고리즘

```java
Collections.reverse(names); // 요소들을 뒤집는다.
Collections.shuffle(names); // 요소들을 임의로 섞는다.
```

### 향상된 for 루프 (forEacth)

모든 요소들을 방문하는 일은 아주 잦다.

```java
int sum = 0;
for (int i = 0; i < numbers.length; i++ ) {
	sum += numbers[i];
}
```

향상된 for 루프 단축법

```java
int sum = 0;
for (int n : numbers) {
		sum += n;
}
```

향상된 for 루프의 변수는 배열의 인덱스 값이 아니라 요소를 순회한다.

n 변수는 **number[0], numbers[1]** 등 할당 받는다. 배열 리스트도 향상된 for 루프에 사용할 수 있다.

```java
for (String nmae : friends ) {
	System.out.println(name);
}
```

### 명령줄 인수


```java
public class Greeting {
  public static void main(String[] args) {
          for(int i = 0; i < args.length; i++) {
          String arg = args[i];
          if (arg.equals("-h")) arg = "Hello";
          else if (arg.equals("-g")) arg = "Goodbye";
          System.out.println(arg);
      }
   }
}
```
