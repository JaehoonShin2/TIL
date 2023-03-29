# Conda(anaconda) 명령어



### Conda 관리

1.  conda 의 현재 버전을 업데이트
   
   `conda update conda`



#### Conda 환경 관리

   conda를 설치하게 되면, 기본적으로 설치되는 기본 환경이 있다. 이 기본 환경 설정의 이름은 `base` 이다. 하지만, 이 기본 환경설정을 프로그램에 넣지는 않는다. 따라서 별도의 가상 환경을 생성해야만 한다.



1. 새 환경을 만들고 패키지를 설치
   
   `conda create -n 가상환경이름 (python버전을 입력안할 경우 default python 이 설치됨)`
   
   `conda create --name 가상환경이름 python=버전`

2. 기존의 환경을 제거
   
   `conda remove --name 가상환경이름 -all`

다만, 이렇게 지울 경우 가상환경만 지워지고, 폴더는 안지워지기 때문에 envs 라는 폴더도 같이 지워주어야 한다.

3. 새 환경을 사용 혹은 활성화
   
   `conda activate 활성화하려는가상환경이름`

4. 기존에 사용하던 환경을 비활성화
   
   `conda deactivate 비활성화하려는환경이름`

5. 모든 환경 목록 보기
   
   `conda info --envs`
   
   현재 활성화되고 있는 가상환경은 * 로 표시가 된다.



### Conda 패키지 관리

1. 패키지 찾기
   
   `conda search 찾으려는패키지`

2. 패키지를 현재 환경에 설치하기
   
   `conda install 설치하려는패키지`

3. 패키지가 이 환경에 있는지 확인하기
   
   `conda list`







`conda init`

`conda rename -n test123 test321`

`conda rename --name test123 test321`

`conda rename -p path/to/test123 test321`

`conda rename --prefix path/to/test123 test321`





파이썬 설치

`brew install python`

아나콘다 설치

`brew install --cask anaconda`

아나콘다의 환경변수 설정

`export PATH='/opt/homebrew/anaconda3/bin:PATH'`

`sources ~/zshrc`

터미널을 종료헀다가 다시 켰을 때 conda 명령어를 사용할 수 있도록 하는 명령어

`conda init zsh`

새로운 가상환경 생성(주의점 : 혹시나 모를 의존성 문제를 위해 파이썬은 3.8 버전을 설치한다)

`conda create --name pyenv python=3.8`

주피터 노트북을 conda 를 이용해 설치

`conda install jupyter notebook`

주피터 노트북 실행

`jupyer notebook`


