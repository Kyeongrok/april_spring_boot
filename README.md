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

### Mark Down 작성하는 법 _ 매뉴얼 찾기

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

### cafe24 API
ID : onesper
PW :

URL :
https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28


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
