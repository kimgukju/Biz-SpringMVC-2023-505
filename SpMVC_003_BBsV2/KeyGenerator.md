# 다중 Table 구조의 DB 프로젝트에서 PK 의 생성
- 여러개의 Table 이 서로 연동되는 프로제트에서 1:N 의 관계인 Table 에 데이터를 Insert 할때 주 Table(1의 Table)의 PK 값을 부 테이블(N의 Table)의 칼럼에 포함하여 insert 를 해야하는 경우가 많다.
- 테이블 JOIN 하여 조회를 할 때 PK 와 FK 칼럼을 서로 묶어야 하기 때문에 INSERT 를 할때 PK 값을 참조해야 한다.
1. 주 Table 에 INSERT 를 수행한다음, 주 Table 의 PK 값을 사용하여 부 Table 에 데이터를 추가해야 한다.

2. 주 Table 의 INSERT mapper 에 `useGeneratedKeys="ture"` 속성과 `keyproperty="PK"` 속성을 추가해 줘야 한다
3. INSERT 가 수행된 후 Service 코드에서 새로 추가된 PK 값을 참조 할 수 있다
```xml
<insert id="insert"
		useGeneratedKeys="true" keyProperty="b_seq">
	<selectKey databaseId="mysql"
		 keyColumn="b_seq" keyProperty="b_seq">
	</selectKey>
	
</insert>
```