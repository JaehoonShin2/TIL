
인텔리제이는 기본적으로 프로젝트 단위로 생성이 된다.
따라서 이클립스와 같은 workspace-project 형태를 구현하는 것은 기본적으로 불가능하다.

하지만 인텔리제이에서 지원하는 project-module 구조를 활용해 비슷한 구조를 만드는 것은 가능하다.

프로젝트를 생성한다.

프로젝트 내부에 모듈을 생성한다.
![](https://velog.velcdn.com/images/aristia/post/ec58a481-d872-4b13-bf6d-94b94e7f0db1/image.png)

현재 spring-module 프로젝트 내부에는 기본 pom.xml 과 core-modules, nuser 두 개의 모듈이 존재한다.
![](https://velog.velcdn.com/images/aristia/post/285936b3-9a12-42cd-b7c3-ec7cd38422d1/image.png)

사용자가 core-modules 내부에는 `확장` 을 위한 추상 클래스 및 인터페이스만을 생성하고, 실질적으로는 nuser 모듈에서 구현을 하려 한다.

즉 nuser 모듈에서 core-modules 모듈을 참조해 사용하는 구조라고 할 수 있다.

core-modules 에 생성한 추상 클래스
![](https://velog.velcdn.com/images/aristia/post/55ab94c0-e613-4657-b85a-d1fe58318347/image.png)
core-modules 에 있는 pom.xml 에는 최상위 클래스에 대한 정보와, 현 모듈의 artifactId 가 존재한다.
![](https://velog.velcdn.com/images/aristia/post/65ebbc4a-d8a0-4ded-83c6-e4e5530630e4/image.png)

core-modules를 참조하려는 모듈, 즉 nuser 모듈의 pom.xml 에는 아래와 같이 입력한다.
![](https://velog.velcdn.com/images/aristia/post/17926f46-cf9e-45a0-a4a2-5902279bc034/image.png)
마치 외부 라이브러리를 추가하듯이, groupId와 artifactId(사용하고자 하는 modules 의 artifactId) 를 입력한다.

![](https://velog.velcdn.com/images/aristia/post/2594943c-13cc-4cd1-9a4b-7d13fde8fe00/image.png)

그러면 nuser 에서 정상적으로 참조되는 것을 알 수 있다.


