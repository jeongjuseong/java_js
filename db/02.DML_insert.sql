/*
DML : 데이터를 추가/수정/삭제/조회할 때 사용 -> C(create)R(read)U(update)D(delete)
insert : 데이터를 추가
insert 방법1 : insert ... values : 추가할 데이터를 다알고 있는 경우

-- 테이블명만 입력하는 경우 : 속성 순서에 맞춰서 값들을 넣어줘야 함
insert into 테이블명 values(값1, 값2, ..., 값n);
insert into 테이블명 values(값1, 값2, ..., 값n),(값1, 값2,..., 값n);


-- 테이블명 옆에 속성을 쓰는 경우 써준 속성 순서에 맞게 값 순서를 정하면 됨
-- 조건부로 일부 속성을 생략할 수 있음.
 1. null이 가능한 속성
 2. not null이면서 기본값(default)가 설정된 속성
insert into 테이블명(속성1, 속성2, ..., 속성n) values(값1, 값2, ...);
*/
-- 학번이 2023160001인 컴퓨터공학과 장원영 학생을 추가하는 쿼리
insert into student values('2023160001','장원영','컴퓨터공학과');
-- student 테이블에 있는 속성 순서에 맞지 않게 데이터를 잘못 추가한 경우
insert into student values('장원영','2023160001','컴퓨터공학과');
-- 학번이 2023160002인 컴퓨터공학과 안유진 학생을 추가하는 쿼리
insert into student(major, name, num) values('컴퓨터공학과','안유진','2023160002');
-- 과목코드가 MSC001, 과목명이 대학수학기초인 과목을 추가하는 쿼리
insert into subject(code, title) values('MS001', '대학수학기초');
-- 과목코드가 MSC002, 과목명이 영어I, 학점이 2학점, 일주일에 3시간 수업을 하는 과목을 추가하는 쿼리
insert into subject values('MSC002', '영어I', 2, 3);








