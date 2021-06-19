# Template Method Pattern

알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패

# 언제 사용할까?

구현하려는 알고리즘이 일정한 프로세스가 있다.
구현하려는 알고리즘이 변경가능성이 있다.

# Process
1. 알고리즘을 여러 단계로 나눈다.
2. 나누어진 알고리즘의 단계를 메소드로 선언한다.
3. 알고리즘을 수행할 템플릿 메소드를 만든다.
4. 하위 클래스에서 나눠진 메소드들을 구현한다.

![Strategy Pattern](https://dz2cdn1.dzone.com/storage/temp/14064500-templatemethoddesignpattern.png)

# 요구사항

신작 게임의 접속을 구현해주세요.
requestConnection(String str):String

유저가 게임 접속시 다음을 고려합니다.
1.보안과정: 보안관련부분을 처리합니다.
doSecurity(String string):String
2.인증과정: username과 password가 일치하는지 확인합니다.
authentication(String id, String password):boolean
3.권한과정: 접속자가 유료회원인지 무료회원인지 게임 마스터 인지 확인합니다.
authorization(String userName):int
4.접속과정: 접속자에게 커넥션 정보를 넘겨줍니다.
connection(String info):String

# 추가 요구사항
1. 보안과정 강화(비밀번호 알고리즘 강화)
2. 권한 시간에 따라 다르게 처리
