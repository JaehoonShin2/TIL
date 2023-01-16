|명령어|동작|
|:---:|:---:|
|git --version|git의 버전을 확인하겠다.	
|git config --list|git의 리스트 						
|git init|현재 폴더에서 git을 시작하겠다.						
|git status|현재 깃의 상태를 알아본다.						
|git add fimename|해당 파일이름을 커밋준비하겠다.			
|git add .|현재 변화된 모든 파일을 커밋준비하겠다.			
|git commit|git에 현재 준비가 완료된 파일들을 커밋하겠다.		
|git log|git의 commit 로그(16진수)와 정보를 확인할 수 있다.	|git commit -m "massage"|
|git diff|git의 바뀐 내용들을 확인할 수 있다.
|git commit -am "massage"|add와 commit을 일괄로 처리하는 명령어. 다만 새로 생성된 파일이 없을 때만 사용이 가능한 명령어이다.
|git reset --hard|리셋할 위치의 커밋해쉬주소
|git reset --hard|가장 마지막에 커밋한 시점으로 되돌린다.<br>이 과정에서 없어졌던 파일이나 폴더들은 생성되고,<br>마지막 기점에서 추가생성된 파일들은 커밋이 안된 상태로 보여진다.
|git revert --hard|리버트할 위치의 커밋해쉬주소		
|git revert --no--commit|리버트할 위치의 커밋해쉬주소		
|git branch 브랜치명|해당 브랜치명으로 브랜치를 생성하겠다.
|git branch|깃의 브랜치들을 확인하겠다.
|git switch 브랜치명|해당 브랜치명으로 브랜치를 이동하겠다.
|git switch -c 브랜치명|새로운 브랜치를 생성한 뒤 해당 브랜치로 변경
|git branch -d  브랜치명|해당 브랜치명을 가진 브랜치를 삭제
|gti branch -m 기존브랜치명 새브랜치명|기존 브랜치명을 새 브랜치명으로 변경
|git merge 브랜치명|현재브랜치(메인브랜치에서 진행. 따라서 이동이 필요 git switch main) 에 입력한 브랜치를 병합한다.
|git rebase main|현재브랜치에서 메인브랜치로 rebase 를 진행하겠다.<br> 다만 rebase를 할 때 기존 브랜치가 메인 브랜치보다 앞서있다면 시점만 이동할 뿐<br>merge가 완벽히 이루어지지 않는다.<br>따라서 한 번 더 git merge 기존브랜치명 을 입력함으로써 merge를 진행한 뒤 git -branch -d 브랜치명 을 통해 브랜치를 삭제해준다.	
|git merge --abort|merge 과정에서 충돌이 너무 심해 merge를 취소해야 할 경우 해당 명령어를 입력한다.
|git rebase|		
|git remote add origin http주소|해당 origin의 원격저장소를 추가하겠다.	
|git clone http주소|		
|git -u origin 브랜치명|origin의 해당 브랜치명에 기본적으로 push., pull에 해당하는 세팅을 잡는다
|git --set -upstream origin 브랜치명|origin의 해당 브랜치명에 기본적으로 push., pull에 해당하는 세팅을 잡는다
|git push ( -u origin main)|	
|git pull --no-rebase|			
|git pull --rebase|			
|git push --force|만약 원격 저장소의 내용이 오류가 나서 로컬 저장소의 내용을 강제로 push 해야 할 경우	
|git branch -a|로컬과 원격 저장소의 모든 브랜치 리스트를 확인한다	
|git fetch|원격의 변경사항 확인	
|git switch -t origin/원격의 브랜치명|로컬에 같은 이름의 브랜치를 생성하여 연결하고 switch
|git push 원격저장소이름 --delete 브랜치명|원격의 브랜치를 삭제한다.|

<br>

### rollback 을 하는 두 가지 방법

1. reset : 이전 기록으로 되돌아간 뒤 이후 시점을 그대로 지운다.
2. revert : 이전 기록과 동일한 작업으로 새로 만든다.

<br>

### merge vs rebase	

merge 는 브랜치의 사용내역을 개별로 기록에 남겨두지만, rebase 는 브랜치의 사용내역을 메인 브랜치에 합친다.


<br>

|VI 키워드|동작|
|:---:|:---:|
|i|입력시작						
|esc|입력종료						
|:q|저장없이 종료						
|:q!|저장없이 강제종료						
|:wq|저장하고 종료 -> 저장을 하고 종료하지 않는 이상 커밋이 이루어지지 않는다.						


		


