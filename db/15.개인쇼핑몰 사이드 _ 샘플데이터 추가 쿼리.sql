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
    
-- 제품 코드가 abc0001인 제품 중에서 유선제품이 10개 들어오고, 무선제품이5개 들어온 쿼리
UPDATE `option` 
SET 
   op_amount = 10
WHERE
    op_pr_code = 'abc001'
and
	op_name = '유선';
UPDATE `option` 
SET 
   op_amount = 5
WHERE
    op_pr_code = 'abc001'
and
	op_name = '무선';
-- abc123 회원이 배송지를 다음과 가이 등록( 배송지명 : 집, 주소 : 서울시 강남구 123번지, 
-- 상세 : kh아파트 101동 101호, 우편번호 : 12345)
insert into address(ad_name, ad_addr, ad_addr_detail, ad_post, ad_me_id) 
values
	('집', '서울시 강남구 123번지', 'kh아파트 101동 101호', '12345', 'abc123');
-- abc123회원이 abc0001 제품중 유선을 3개 장바구지에 담았을때 쿼리
insert into basket(ba_amount, ba_me_id, ba_op_num) 
-- values(3, 'abc123', 2);
	select 
		3, 'abc123', op_num 
	from `option` 
	where op_pr_code = 'abc001' 
	and op_name = '유선';
-- abc123 회원이 abc001 제품중 유선을 1개 장바구니에 담았을때 쿼리
UPDATE basket
SET 
	ba_amount = 1
WHERE
    ba_me_id = 'abc123' and
    ba_op_num = (select op_num from `option` where op_pr_code = 'abc001'
				and op_name = '유선');
-- abc123회원이 abc001 제품 중 무선을 2개 구매하고 배송지로 집을 선택했을때
-- 실행해야하는 모든 쿼리
-- 1. 주문 내역을 추가 => 주문 리스트에서 주문 내역번호가 필요하기 때문에
insert into `order`(or_total, or_price, or_use_point, or_save_point, or_me_id, or_ad_num) 
	values(15000*2, 15000*2, 0, 3000, 'abc123', 1);
-- 2. 주문 리스트에 구매 목록을 추가
insert into order_list(ol_amount, ol_price, ol_or_num, ol_op_num)
	values(2, 15000*2, 1, 1);
-- 3. 제품 수량을 수정
update `option` set op_amount = op_amount - 2 where op_num = 1;
-- 4. 마일리지(포인트) 적립
-- 4-1. 마일리지 내역 작성
insert into point(po_content, po_amount, po_me_id)
	values('제품 구매에 의한 적립', 3000, 'abc123');
-- 4-2. 회원 정보에 포인트 수정
update member set me_point = me_point + 3000 where me_id = 'abc123';
-- 제품 코드가 abc002, 제품명 kh키보드, 제품상세가 혁신적인 kh키보드, 제품가격이 30000원
-- 제품 종류가 '기계식', '일반'인 제품을 등록하는 쿼리
insert into product values ('abc002', 'kh키보드', '혁신적인 kh키보드', 30000);
insert into `option`(op_name, op_pr_code) values ('기계식', 'abc002'),('일반', 'abc002');
-- 제품 코드가 abc002, 종류가 기계식인 제품이 100개, 제품코드가 abc002, 종류가 일반인 50개 입고
UPDATE `option` 
SET 
   op_amount = op_amount + 100
WHERE
    op_pr_code = 'abc002'
and
	op_name = '기계식';
    UPDATE `option` 
SET 
   op_amount = op_amount + 50
WHERE
    op_pr_code = 'abc002'
and
	op_name = '일반';

-- qwe123 회원이 abc001 제품 중 무선을 2개 장바구니에 담고, 
-- 이어서 abc002 제품 중 기계식을 3개 장바구니에 담았을때 쿼리
insert into basket(ba_amount, ba_me_id, ba_op_num) 
	select 2, 'qwe123', op_num
		from `option` 
		where op_pr_code = 'abc001' 
			and op_name = '무선';
insert into basket(ba_amount, ba_me_id, ba_op_num) 
	select 3, 'qwe123', op_num
		from `option` 
		where op_pr_code = 'abc002' 
			and op_name = '기계식';
-- qwe123회원이 장바구니에 담긴 모든 제품을 구매했을때 쿼리(구매시 포인트 사용은 x)
-- 배송지는 집으로, 경기도 안산시 안산구 123번지, 상세는 없음, 우편번호는 12312를 등록
insert into address(ad_name, ad_addr, ad_addr_detail, ad_post, ad_me_id)
values('집', '경기도 안산시 안산구 123번지', '', '12312', 'qwe123');
-- 1. 주문 테이블에 추가
insert into `order`(or_total, or_price, or_use_point, or_save_point, or_me_id, or_ad_num)
select 15000*2+30000*3, 15000*2+30000*3, 0, (15000*2+30000*3)/10, 'qwe123', ad_num
	from address
    where ad_me_id = 'qwe123' and ad_name = '집';
-- 2. 주문 리스트에 테이블 추가
insert into order_list(ol_amount, ol_price, ol_or_num, ol_op_num)
	select 2, pr_price*2, 2, op_num
    from `option`
    join product
    on op_pr_code = pr_code
    where 
		op_pr_code = 'abc001' and op_name = '무선';
insert into order_list(ol_amount, ol_price, ol_or_num, ol_op_num)
	select 3, pr_price*3, 2, op_num
    from `option`
    join product
    on op_pr_code = pr_code
    where 
		op_pr_code = 'abc002' and op_name = '기계식';
-- 3. 옵션 테이블에 수정(수량)
update `option` set op_amount = op_amount - 2 
	where op_pr_code = 'abc001' and op_name = '무선';
update `option` set op_amount = op_amount - 3 
	where op_pr_code = 'abc002' and op_name = '기계식';

-- abc123회원이 제품을 받고 구매확정을 눌렀을때 쿼리
-- 주문에 구매 확정으로 수정
update `order` set or_state = '구매 확정' where or_num = 1;
-- 포인트 내역에 적립 내용을 추가
insert into point(po_content, po_amount, po_me_id)
	values('제품 구매에 의한 적립', 3000, 'abc123');
-- 회원 정보에 포인트를 누적
update member set me_point = me_point + 3000 where me_id = 'abc123';

-- abc123 회원이 구매 확정한 abc001 제품 중 무선인 제품에 '좋은 마우스입니다.' 라고 리뷰를 등록
insert into review(re_content, re_thumb, re_op_num, re_me_id)
values('좋은 마우스입니다.', null, 1, 'abc123');
    