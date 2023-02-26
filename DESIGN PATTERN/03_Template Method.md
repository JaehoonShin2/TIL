## Template method pattern

상위 클래스 쪽에 템플릿이 될 메소드가 정의되어 있고 ,그 메소드 정의에 추상 메소드가 사용된다.

``` java
public abstract class AbstractDisplay {

    abstract void open();
    abstract void print();
    abstract void close();
    
    public void display() {
        open();
        for(int i = 0; i < 5; i++){
            print();
        }
        close();
    }


}
```

추상 메소드를 실제로 구현하는 것은 하위 클래스이다. 하위 클래스에서 메소드를 구현하면 구체적인 처리 방식이 정해진다. 다른 하위 클래스에서 구현을 다르게 하면 ,차리도 다르게 이루어진다. 그러나 어느 하위 클래스에서 어떻게 구현하더라도 처리의 큰 흐름은 상위 클래스에서 구상한 대로 이루어진다.

Template Method 패턴을 사용하게 되면, 상위 클래스의 템플릿 메소드에 알고리즘이 기술되어 있기 때문에 하위 클래스 쪽에서는 알고리즘을 일일이 기술할 필요가 없어진다.

* 관련 패턴
1. Factory Method 패턴 : 템플릿 메소드 패턴을 구체화하는 과정에서 상속을 이용한 방식

2. Strategy 패턴 : 템플릿 메소드 패턴을 구체화하는 과정에서 인터페이스를 이용한 방식

factory method 패턴와 strategy 패턴의 차이점은, 팩토리 메소드 패턴의 경우 상위 클래스에서 프로그램 동작의 큰 틀을 정하고, 하위 클래스에서 구체적 행동을 규정한다면

strategy 패턴의 경우에는 프로그램의 일부를 변경하기보다는 알고리즘 전체를 모두 전환하는 방식이라는 점이다.

