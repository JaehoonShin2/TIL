
## VUE 의 기본 프로젝트 구조
<br>

1. package.json : 프로젝트에 대한 정보를 담고 있는 파일.

    프로젝트의 이름, 버전, 사용하고 있는 모듈 정보 등을 담고 있다.
    
    dependencies로 설정된 부분이 배포에 사용될 모듈이며, devDependencies로 설정된 부분이 개발에서도 사용되는 모듈이다.

    그리고 여기에 해당되는 모든 모듈들이 실제로 설치된 곳이 바로 node_modules 폴더이다.

2. /src : 어플리케이션 디렉터라고도 부르는, 실제 .vue 코드가 작성될 공간이다.

    2-1. /main.js : main.js 파일은 npm run serve 명령어를 통해 뷰를 실행시켰을 때, 가장 먼저 실행되는 JavaScript 파일이다.

    2-2. /router/index.js : SPA 를 위한 라우팅을 위해 필요한 정보(`router`) 들을 선언하는 파일이다.

    Array type 의 routes 안에는 router 객체들이 배열 형태로 들어있게 된다.

    그리고 router 객체 내부의 property 로는 path, name, component 가 존재한다.

    각각 path 는 
    <route-link to=""> 라는 태그 안에서 입력하게 될, url 주소를 의미하고, name 은 해당 router 를 식별할 수 있는 고유한 식별자 역할을 담당한다. 
    
    마지막으로 component 는 router 가 현재의 path 혹은 name으로 접근했을 때 연결할, 실제하는 component 파일 이름을 나타낸다.
    ``` html
    <!-- html 파일 -->
    <route-link to="{name:'home', params: { key:vaule } }"></route-link>
    ```
    ``` javascript
    // routes/index.js
    const routes = [
        { path : '/home', name : 'home', component: () => inmport('@/Home.vue') }
    ]
    ```

3. /assets : font, icons, images, css 등, 어플리케이션에서 사용되는 정적 파일이 모여있는 디렉터리입니다. 

4. /components/~ : vue 컴포넌트를 작성하고 구조를 잡는 폴더이다.

5. /views/~ : 라우터 시, 보여주게 될 화면 페이지를 생성, 구조를 잡는 폴더이다. 즉 해당 views 폴더 안에 존재하는 HomeView.vue 와 같은 컴포넌트 내부에, 잘게잘게 쪼개놓은 Componentes 폴더 내부에 존재하는 컴포넌트들을 import 하고 조합해서 하나의 화면 페이지로 만드는 것이다.

6. /api/~ 
    
    ex) index.js/auth.js.. 
    
    : axios 와 같이 api 를 사용할 때, 사용하는 폴더이다.
    

### 프로젝트의 폴더 구조

컴포넌트와 라우팅을 통해 보여줄 view 화면들을 구성하면서 어떤 식으로 폴더 구조를 잡는게 이상적일지 고민을 했다.

현 시점에서 떠오른 방식은 
assets
router
modules/functions(기능들)/components+view.vue 를 함께 생성하는 형식이다.



### ref 와 reactive

vue 3 에서는 `composition API` 라는 개념이 등장했다. 이는 기존의 인스턴스 옵션 단위가 아니라, 특정 기능의 논리 단위로 여러 컴포넌트에서 재사용할 수 있도록 재사용성과 유지보수의 용이성을 올리기 위함이었다.

이 중 `ref` 와 `reactive` 를 활용하면 컴포넌트와 별개로 사용할 수 있는 반응형 데이터를 생성할 수 있.

#### ref

ref 는 원시형 데이터, 객체 등 데이터 타입을 가리지 않고 모든 데이터를 담을 수 있다.

`ref` 로 선언한 변수는 변수.value 로 접근이 가능하다.

단, template 안에서는 {{변수}} 로 접근해 사용이 가능하다.

반응성을 유지하기 위해서는 storeToRefs를 사용해야만 반응형이 유지가 된다.
<br>

#### reactive

reactive 는 Object, array, Map, Set과 같은 타입의 데이터 만을 담을 수 있다. 따라서 누군자는 굳이 reactive 를 사용해야 하나, 라고 말할 수 있겠지만 내부적으로 ref에 담긴 객체나 배열 등은 reactive 를 통해 구동이 되는 구조로 이루어져 있다.

`reactive` 로 선언한 변수는 변수.property 로 접근이 가능하다.

단, template 안에서는 {{변수.property}} 로 접근해 사용이 가능하다.


## PINIA

``` javascript
import { defineStore } from 'pinia'

// `defineStore()`의 반환 값(함수)을 할당할 변수의 이름은 원하는 대로 지정할 수 있으나 스토어 이름을 사용하고 `use`와 `Store`로 묶는 것이 권장된다.
// ex) `useCounterStore`, `useBoardStore`, `useMemberStore` ...
// 첫 번째 인자는 앱 전체에서 스토어의 고유 식별자이다.
export const useCounterStore = defineStore('counter', {
    const count = ref(0);
    // ...
})
```
