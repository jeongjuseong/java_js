use shoppingmall;

-- 회원 아이디가 abc123, 비번이 1234, 번호가 011-1234-5678, 
-- 주소가 서울시 강남구 kh빌딩, 주소상세가 6층 361반, 우편번호가 01234 인 회원이 가입을 했을때 쿼리
-- 권한은 admin, user 중 하나
insert into member(me_id, me_pw, me_phone, me_addr, me_addr_detail, me_post, me_authority, me_name) 
values
	('abc123', '1234', '011-1234-5678', '서울시 강남구 kh빌딩', '6층 361반', '01234', 'user', '홍길동');
    
insert into member(me_id, me_pw, me_phone, me_addr, me_addr_detail, me_post, me_authority, me_name) 
values
	('admin', 'admin', '011-1111-1111', '서울시 강남구 kh빌딩', '3층 101호', '01231', 'admin', '임꺽정');
    
insert into member(me_id, me_pw, me_phone, me_addr, me_addr_detail, me_post, me_authority, me_name) 
values
	('qwe123', 'qwe123', '011-9999-5678', '서울시 강남구 kh빌딩', '1층 161반', '01234', 'user', '장원영');
    
-- 제품 코드가 abc001, 제품명이 kh무선마우스, 제품설명이 kh무선마우스 입니다, 가격이 15000원
-- 종류가 무선 / 유선인 제품을 등록하는 쿼리
-- product 테이블, option 테이블에 데이터를 추가
insert into product values ('abc001', 'kh무선마우스', 'kh무선마우스 입니다.', 15000);
insert into `option`(op_name, op_pr_code) values ('무선', 'abc001'),('유선', 'abc001');

-- 제품 코드가 abc인 001인 제품의 제품정보와 옵션을 조회하는 쿼리
select * from product
	join `option` on pr_code = op_pr_code
    where pr_code = 'abc001';