아직은 낯선 인텔리제이를 사용하면서 겪게 되는 각종 error 들을 모아볼 예정이다.

### java.lang.NoClassDefFoundError

----

![](https://velog.velcdn.com/images/aristia/post/3f590bde-8eb0-4b07-9266-e28dabc81749/image.png)

인텔리제이를 사용해 maven project 를 실습하던 과정에서 다음과 같은 error 코드가 발생했다.

에러 코드 자체는 심플해서, maven 으로 build 한 mybatis 라이브러리에 대해 class 를 찾을 수 없다는 의미였다.

![](https://velog.velcdn.com/images/aristia/post/bfc26dcc-e10f-4b2c-b907-c3c943e7d934/image.png)

그런데 코드 자체에서는 import 도 제대로 들어왔고, 외부 라이브러리에도 정상적으로 보여서 이유를 알 수 없었는데... 구글링을 하다가 알게 된 점이 compile 될 war 내부에서의 라이브러리 였다..

![](https://velog.velcdn.com/images/aristia/post/a74eb676-8106-4136-bf6b-0de5a153741a/image.png)

이클립스의 경우에는 컴파일 과정에서 외부 라이브러리가 자동적으로 추가되는 건지, 이 부분에 대한 설정을 따로 건든 적이 없어서 모르고 지나쳤었는데 인텔리제이는 조금 달랐다.

![](https://velog.velcdn.com/images/aristia/post/c517780c-17e3-42c2-b2be-9734854cbdba/image.png)

따라서 
Project Structure -> artifact -> output
프로젝트 구조 -> 아티팩트 -> 출력루트 
에서 오른쪽에 위치해 있는 사용 가능한 요소들을 왼쪽으로 이동(혹은 더블클릭) 해주면 해당 아티팩트가 war 파일로 컴파일 될 때 외부 라이브러리 역시 war 파일 내부에 저장되게 된다.

그 후에 다시 실행해보면 500 error 없이 정상적으로 작동됨을 알 수 있었다.