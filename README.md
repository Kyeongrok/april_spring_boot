# april_spring_boot
# Aprilskin 주문 조회 시스템
Aprilskin cafe24 주문 정보를 만들어준다.

## 접속 방법
```
http://ec2-13-59-102-169.us-east-2.compute.amazonaws.com/index.html
```
위 주소로 접속 한다.

### 사용법
시작 날짜 ex)2017-07-16 20:00:00

끝 날짜 ex)2017-07-16 24:00:00


### 배포하는 방법
```
cd /var/www/electron_react
git pull
npm run build
rsync -ar /var/www/electron_react/build/ /var/www/html

```
sudo su -
cd /var/wwww/ tab 자동생성
cd electron_react/
sh init_and_deploy.sh

### gradle 빌드하는법

/var/wwww/april_spring_boot
sh gradlew build

./build/libs/
java -jar apr-02.jar
-Dspring.profiles.active = prd
java -jar -Dspring.profiles.active = prd apr-02.jar

//// local spring boot와 최신 동기화 
git pull
sh gradlew assemble
 sh april_spring_boot.sh restart

### cafe24 API
ID : onesper
PW :

URL :
https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28
https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=medicube&mall_id=medicube0&start_datetime="+startDatetime+"&end_datetime="+endDatetime+"&limit=2000&data_type=json&auth_code=890f405ec9b7ebccd0ec9d3aa1857254"


### 재시작 방법
```
/var/www/electron_react
forever list
forever start server
```

### 특정 Port로 띄우기
PORT=80 npm start

### Wi-fi password
sarayahe82!


### ubuntu에서 설치
```
sudo su -
apt-get install nginx nodejs
nginx root : /usr/share/nginx/html

```

### 표준시 서울로 바꾸기
```
sudo ln -sf /usr/share/zoneinfo/Asia/Seoul /etc/localtime
reboot
```


### ubuntu AWS ES2 배포시 로그파일 남기는 법\
1. nohup - 사용자가 로그아웃해도 백그라운드로 실행 시키기 ```sh $nohup java -jar & ``` 
프로세스 종료 1. 찾기 ```sh $ps -ef | grep ``` 2. 종료 ```sh $kill -9 ``` 
로그 * `nohup`로 실행된 쉘 스크립트는 자동으로`nohup.out`이라는 로그파일을 실행한 위치에 생성시킨다. 
* 로그 파일 생성막기 ```sh # 1(stdout), 2(stderr). stdout을 /dev/null로 stderr를 stdout으로 리다이렉션시키므로 파일 생성이 안된다. 
$nohup `java -jar ` 1 > /dev/null 2 > &1 & ``` 

2. AWS에서 제공하는 cloudwatch 사용하기

3. 

###
order.amount_paid로 order에 저장한다
이걸로 dash bord의 매출을 구한다.

오늘날짜, 일정 시간에 amount_paid의 합계를 dash board에 보여줌


###
update order1 
set amount_paid = '0' where id <= 840