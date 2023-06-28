# Spring Project
- Spring Legacy Project > Spring MVC Project 생성
- views/home.jsp 삭제 후 다시 작성

## pom.xml 수정
- java version 을 11로 변경
- spring framework 5.2.24 로 변경
- slf4j 1.7.36 으로 변경

- maven-compiler-plugin java 버전 property 로 변경( ${java-version} 사용 )
- lombok 설정
- logback 설정(1.2.12 버전)

## Dto 데이터 클래스 생성하기
- spring framework 에서 사용하는 데이터 클래스는 모든 변수를 private 으로 선언한다
- 변수에 접근하기 위하여 getter, setter method 를 필수로 생성한다.
- 두개의 생성자, toString() 재정의
- lombok 을 사용하여 자동 생성한다. 

## Service 클래스 생성하기
- Service 클래스는 기본적으로 Service Interface 를 만들고, interface 를 Impl 하여 작성한다
- Service 클래스에 @Service Annotation 을 부착한다
- @Service Annotation 이 부착된 클래스는 Spring Framework 에서 자동으로 객체를 준비하여 가지고 있다.
- @Autowired 가 부착된 곳을 발견하면 자동으로 객체를 "주입하여" 사용할 준비를 해 준다






## 자주 나타나는 에러 이유
- Controller에서 RequestMapping을 안했을 경우(404)
- .jsp 파일을 안만들었을 경우(404)
- 입력값을 int 로 했는데 문자열을 넣는 경우(400)