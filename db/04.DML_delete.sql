/*
delete : 데이터를 삭제
delete from 테이블명 where 기본키 = 값;
*/
-- 학번이 2023160001인 학생의 데이터를 삭제하는 쿼리
DELETE FROM student 
WHERE
    num = '202316001';
    
/*
- 데이터 삭제시 where절이 없거나, where의 속성이 기본키가 아닌경우
	워크벤치에서 동작이 안될수 있음
- 이유는 워크벤치에서는 update(update/delete)될때 안전하게 하도록 기본키로 update하는
	경우에만 적용이 되도록 설정 되어 있음.
- 해결하려면 Edit -> Preperences... -> SQL Editor -> 제일 하단의 Safe update...를 체크해지
*/