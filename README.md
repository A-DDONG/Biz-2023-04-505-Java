# Java 개발자 도구 
1. jdk 17 설치 : java.com
2. 7zip 설치 : 7zip.org
3. D2coding font 설치
4. eclipse 설치 : eclipse.org

## git repository 생성
1. 새로운 컴퓨터애서 최초로 github 를 사용하고자 할때 설정
```bash
git config --global user.name A-DDONG
git config --global user.email ssc5924@gmail.com
```
2. 새로운 원격 repository를 생성하고, local Repository 생성하고자 할때
```bash
git init
```
3. Repository 에 대한 설명을 하기 위하여 README.md 파일 생성하기

4. 원격 Repository 별명 설정하기 : `git remote add origin https://github.com/A-DDONG/Biz-2023-04-java.git`   

### 기존의 repository 에 계속해서 update 하고자 할때

5. 현재 폴더의 파일과 폴더를 local Repository에
압축하고, 암호화하여 보관하기 : `git add .`

6. 현재 local Repository 에 보관된 압축된
데이터에 대한 Comment 를 추가하기 : `git commit -m first`

7. local Repository 에 보관된 압축된 데이터를
원격 Repository 로 push : `git push -u origin master`

- 마이너스 기호 사용 시 이렇게 표기됨
* 별표 기호 사용 시 이렇게 표기됨

```bash
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/A-DDONG/Biz-2023-04-java.git
git push -u origin master
```