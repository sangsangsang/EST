--MemberDao.getMember(int page) 회원정보를 가져오는 함수 .

--씨퀄 에선 함수가존재한다.

SELECT * FROM 
(
	SELECT ROW_NUMBER() OVER(ORDER BY REGDATE DESC) NUM,MEMBERS.* FROM MEMBERS
)A --서브쿼리에대한 별칭을 꼭 붙여줘야한다 SQL Query에서!
WHERE NUM BETWEEN 11 AND 20; 


