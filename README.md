## SpringBoot Study
 인프런 강의 스프링 핵심 원리 기본편 

Spring 

필수
- 스프링프레임워크
- 스프링부트

선택
- 스프링데이터
- 스프링 세션
- 스프링 시큐리티
- 스프링 RestDocs
- 스프링 배치
- 스프링 클라우드

Spring Framework
- 핵심 기술: 스프링 DI 컨테이너, AOP, 이벤트
- 웹 기술: 스프링 MCV, 스프링 WebFlux
- 데이터 접근 기술: 트랜잭션, JDBC, ORM 지원, XML 지원
- 기술 통합: 캐시, 



#### 객체지향 

*SOLID*
프로그래머가 시간이 지나도 유지보수와 확장이 쉬운 시스템을 만들고자할 때 이 원칙들을 함께 적용할 수 잇다. 
소프트웨어 작업에서 프로그래머가 소스 코드가 읽기 쉽고 확장하기 쉽게 될 때까지 소스코드를 리팩터링하여 코드 냄새를 제거하기 위해 적용할 수 있는 지침이다. 
이 원칙들은 애자일 소프트웨어의 전략의 일부다.
- SRO: 단일 책임 원칙, 한 클래스는 하나의 책임만 가져야한다.
- OCP: 개방 폐쇄 원칙, 소프트웨어 요소는 확장에는 열려있으나 변경에는 닫혀있어야 한다.
- LSP: 리스코프 치환 원칙, 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야한다.
- ISP: 인터페이스 분리 원칙, 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나보다 낫다.
- DIP: 의존관계 역전 원칙, 프로그래머는 추상화에 의존해야지, 구체화에 의존하면 안된다. 의존성 주입은 이 원칙을 따르는 방법 중 하나이다.

#### 스프링의 역할
- 스프링은 객체를 관리한다.
- 스프링은 의존성을 관리한다.

**Component 종류** 
- @Controller - @RestController
- @Service
- @Repository

**스프링은 객체 생성시 *Singleton Pattern*으로 한다. 계속해서 객체를 생성하며 낭비되는 시간을 절약할 수 있다.**

**Bean**
*스프링 IoC 컨테이너에 의해서 관리되고 애플리케이션의 핵심을 이루는 객체들을 스프링에서는 빈즈라고 부른다.
빈은 스프링 IoC 컨테이너에 의해서 인스턴스화되어 조립되거나 관리되는 객체를 말한다. 이같은 점을 제외하고 빈은 수많은 객체들 중의 하나일 뿐이다. 
빈과 빈 사이의 의존성은 컨테이너가 사용하는 메타데이터 환경설정에 반영된다.*  
- 스프링 객체를 관리한다. 
- @ComponentScan: @Component가 붙은 클래스들을 읽어서 객체로 생성
- @Bean: @Bean을 이용하여 개발자가 생성하는 코드를 작성

**Filter**

**의존관계 주입 방법**
- 생성자 주입: 생성자 호출 시점에 딱 1번 호출하는 것이 보장된다. 불변, 필수 의존관계에 사용된다.
- 수정자 주입: setXXX 메소드 활용 (@Autowired)
- 필드 주입: 
- 일반 메서드 주입:  



**IntelliJ Key map**

File - Settings - Keymap
- Ctrl + E: History
- Ctrl + Alt + V
- F2: Go To Error