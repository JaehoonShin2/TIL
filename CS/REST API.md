#### REST
(Representational State Transfer)
HTTP, web 을 조금 더 잘 사용하기 위한 `Achitecture` 

구성요소
- `Resource(자원)` : server 쪽에 존재하는 사용 가능한 모든 것들(`resource...` 파일, image, 문서, 프로그램... 들의 통칭)의 `id`가 부여된다. 이 id 가 `URI` 로 표현된다.

	ex) 
	/web/counter => counter 라는 프로그램 handler 를 가르키는 URI
	/web/resources/html/test.html => test.html 이라는 파일을 지칭하는 URI
	눈으로 보기에는 URL 와 URI 은 큰 차이가 없지만 내부적으로 약간의 차이가 존재한다.
	URI는 식별하고, URL은 위치를 가르킨다.

- Method(행위) : http 의 method 로 이 행위를 명시한다. 즉, HTTP Method에 의미가 부여된다.

|method|의미|CRUD|
|:---:|:---:|:---:|
|GET|자원을 조회하겠다.|R
|POST|자원을 생성하겠다.|C
|PUT|자원을 수정하겠다.|U
|DELETE|자원을 삭제하겠다.|D

- Representation(표현) : client 가 특정 method 에 대해서 처리를 하고, 적절한 응답을 보내야 한다.
하나의 데이터를 가지고 표현방법이 여러가지 일 수 있다.
	
   - plain
   - json
   - xml
    ... 표현방법이 여럿 존재한다. 이러한 여러 표현방법이  client 에게 전달될 수 있다.
    
    
#### REST API

REST API 라는 것은 결국 REST 아키텍쳐의 규칙을 기반으로 만든 service API.

### REST API 의 디자인 패턴


1. URI 는 `Resource` 를 표현하는 수단이어야 한다.

ex) `GET` /member/delete/3 
member를 delete 할건데, memberNo 이 3번이다...
이는 즉 동작을 의미하게 된다. 

URI 는 Resource 를 명시해야만 한다.

|Method|URI|
|:---:|:---:|
|조회|`GET` /member/3
|생성|`POST` /member
|수정|`PUT` /member/3
|삭제|`DELETE` /member/3

member/3 은 `3번의 member` 명사, 구성요소를 가르키고, 앞에 붙은 method 를 통해 어떤 행위를 할 지 가르킨다.

그리고 `3` 과 같은, Resource 의 id(식별자) 값이 uri에 같이 전달되기 때문에 `@PathVariable` 이라는 어노테이션이 자주 사용되게 된다.


2. URI 의 마지막은 `/` 로 끝나지 않는다.

||URI|
|:---:|:---:|
올바르지 않는 방법|member/3/
올바른 방법|member/3

3. 사용 가능한 특수 문자는 `하이픈(-)`, `언더바(_)` 가 존재하지만, `언더바(_)` 는 사용하지 않고, `하이픈(-)` 을 권장한다.

||URI|
|:---:|:---:|
권장하지 않는 방법|sports/soccer_score (X)
권장하는 방법|sports/soccer-score (O)

4. URI 는 소문자로만 작성한다.

||URI|
|:---:|:---:|
권장하지 않는 방법|member/myPhoto.gif (X)
권장하는 방법|member/my-photo (O)

5. 확장자는 URI 에 표출하지 않는다.

||URI|
|:---:|:---:|
권장하지 않는 방법|member/my-photo.gif (X)
권장하는 방법|member/my-photo (O)

대신에 확장자는 accept-header 에 mine-type(image/gif) 을 통해 명시.

6. REST 정책에 따라 서버는 client 에게 상태정보를 보내야 한다.

200, 201, 404, 415, 500... 등등

7. REST 의 인증

- HTTP 인증 : 데이터 암호화(base64) 를 통해 인증
- key base 인증 : 서버가 client 에게 key 를 발급하고, request 할 때 마다 key 를 포함. server 는 key를 확인해서 적합한 client 인지 확인한다.
- OAuth 인증 : token 을 생성해서 인증을 하는 것. kakao login 이나 google login 등을 실시할 때 사용
