--MemberDao.getMember(int page) ȸ�������� �������� �Լ� .

--���� ���� �Լ��������Ѵ�.

SELECT * FROM 
(
	SELECT ROW_NUMBER() OVER(ORDER BY REGDATE DESC) NUM,MEMBERS.* FROM MEMBERS
)A --�������������� ��Ī�� �� �ٿ�����Ѵ� SQL Query����!
WHERE NUM BETWEEN 11 AND 20; 


