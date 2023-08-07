/* 
개인이 운영하는 쇼핑몰 사이트 구축을 위한 요구사항 정리 
- 판매자는 1명으로 고정. 판매자가 관리자이다. 
- 제품은 대분류, 중분류를 선택해서 등록한다. 
- 제품은 판매자가 제품명, 제품코드, 제품 상세 설명, 옵션 종류, 수량, 제품 이미지(썸네일 포함)를 선택해서 등록한다.
- 제품 옵션의 수량이 없으면 품절이라고 출력하고 해당 옵션은 구매할 수 없다. 
- 회원은 아이디, 비번, 이메일, 전화번호, 이름, 주소를 입력하여 회원가입을 한다.
- 회원 가입시 아이디는 중복체크를 하고, 전화번호를 통해 본인인증을 한다. 
- 회원은 제품 옵션을 선택해서 장바구니에 수량과 함께 담을 수 있다. 
- 제품코드와 옵션이 동일한 제품을 장바구니에 담는 경우 최근에 담은 수량으로 변경된다. 
- 회원은 장바구니에 담긴 제품 목록을 선택해서 바로 구매할 수 있다. 
- 회원은 장바구니에 담긴 제품을 장바구니에서 제거할 수 있다. 
- 회원은 제품 구매시 반드시 한가지 옵션을 선택하고 수량을 입력해서 구매해야 한다. 
- 제품 구매시 등록된 배송지를 선택한다. 
- 등록된 배송지가 없으면 반드시 배송지를 등록해서 추가해야 한다. 
- 배송지 등록하는 경우, 우편번호, 주소, 상세주소, 배송지명(배송지 선택시 사용할 이름)을 입력한다. 
- 제품 구매가 완료되면 주문번호, 구매한 제품 목록(제품명, 제품코드, 옵션, 수량), 배송지를 보여준다. 
- 제품 구매 후 구매 확정이 되면 구매 금액의 10%가 마일리지로 적립이 된다.
- 제품 구매시 마일리지를 사용할 수 있다. 
- 회원은 구매한 제품 목록을 확인할 수 있다. 
- 회원은 제품 상태가 배송전인 경우 바로 주문 취소가 가능하다.
- 회원은 제품에 하자가 있으면 반품/환불을 할 수 있다. 
- 회원은 반품/환불을 위해 하자가 있는 제품의 이미지와 반품/환불 사유를 등록해서 승인을 받아야 반품/환불이 진행된다. 
- 회원은 제품을 받고 제품에 문제가 없으면 구매 확정을 통해 구매를 완료한다. 
- 회원은 구매확정이 된 제품에 한해 리뷰를 남길 수 있다.
- 회원은 리뷰 등록시, 별점(1~5)과 리뷰 내용, 이미지(최대 하나)를 등록을 한다. 
- 회원은 제품을 검색해서 제품명, 가격, 별점을 조회할 수 있다. 
- 회원이 제품 조회시, 제품명, 제품코드, 제품 이미지(썸네일), 제품상세, 리뷰를 조회할 수 있다. 
- 회원은 마일리지 이용 내역을 조회할 수 있다.
- 회원은 마일리지 적립/사용 내역을 조회할 수 있다. 
*/
/*
개체를 논리적으로 설계할 때 개체명을 릴레이션으로, 개체 속성을 릴레이션 속성으로 바꿔서 작성
관계를 논리적으로 설계할 때 경우에 따라 다음과 같이 작성한다. 
-- 관계에 속성이 없는 경우 -- 
두 개체의 관계가 1:1인 경우 
  => A개체에 외래키로 B개체의 기본키를 설정. 누가 A,B가 될지 상관없음 
두 개체의 관계가 1:n인 경우 - 관계에 속성이 없는 경우 
  => n쪽인 개체에 다른 개체의 기본키를 외래키로 설정. 
두 개체의 관계가 n:m인 경우
  => 새 릴레이션을 추가 후, 대리키를 기본키로 만들고, 각 개체의 기본키들을 새 릴레이션의 외래키로 지정 
  
-- 관계에 속성이 있는 경우 --
두 개체의 관계가 1:1, 1:n, n:m 상관없음
  => 새 릴레이션을 추가 후, 관계에 있는 속성을 새 릴레이션추가하고, 각 개체의 기본키들을 
     새 릴레이션의 외래키로 지정 

*/
/*
개인이 운영하는 쇼핑몰 사이트 구축을 위한 논리적 설계
회원(아이디(PK), 비번, 전화번호, 주소, 상세주소, 우편번호, 마일리지, 권한, 이름)
배송지(배송지번호(PK), 배송지명, 주소, 상세주소, 우편번호, 아이디(FK))
제품(제품코드(PK), 제품명, 상세설명, 가격)
옵션(옵션번호(PK), 옵션명, 수량, 제품코드(FK))
제품이미지(이미지번호(PK), 파일명, 제품코드(FK))
마일리지내역(마일리지내역번호(PK), 내용, 마일리지, 아이디(FK))
주문(주문번호(PK), 총금액, 결제금액, 사용마일리지, 적립마일리지, 상태, 아이디(FK), 배송지번호(FK))
장바구니(장바구니번호(PK), 수량, 아이디(FK), 옵션번호(FK))
리뷰(리뷰번호(PK), 내용, 이미지, 아이디(FK), 옵션번호(FK))
주문목록(주문목록번호(PK), 수량, 총가격, 주문번호(FK), 옵션번호(FK))
*/
