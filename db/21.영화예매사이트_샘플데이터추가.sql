-- 관리자를 등록하는 작업
-- 아이디 : admin, 비번 : admin, 이름 : 관리자, 번호 : 011-1111-2222, 생일 : 2000-01-01
-- 권한 : admin
insert into member (me_id, me_pw, me_name, me_phone, me_birthday, me_authority)
values ('admin', 'admin', '관리자', '011-1111-2222', '2000-01-01', 'admin');

-- 관리자가 영화 오펜하이머를 등록하기전에 사전에 해야하는 작업을 쿼리로 작성.
-- 영화를 등록하기 위해 필요한 연령제한 데이터를 추가
-- 전체 관람가, 12세관람가, 15세관람가, 청소년 관람불가, 제한상영가
insert into age values('전체관람가'),('12세관람가'),('15세관람가'),('청소년관람불가'),('제한상영가');
-- 감독/배우를 등록하기 위해서 필요한 국가 데이터를 추가
-- 한국, 미국, 영국, 일본, 등...
insert into country values('한국'),('미국'),('영국'),('일본'),('아일랜드');
--
-- insert into country select country from sakila.country; 
-- 영화를 등록하기 위해 필요한 장르 데이터를 추가
-- 드라마, 스릴러, 공포, sf, 어드벤처, 판타지, 액션, 로맨스, 멜로, 코미디 등
insert into genre values('멜로'),('드라마'),('코미디'),('sf'),('어드벤처'),
('액션'),('판타지'),('공보'),('스릴러'),('범죄'),('전쟁');
-- 관리자가 영화 오펜하이머를 등록하는 작업을 쿼리로 작성
-- 메인포스터 등록 : 오펜하이머_메인포스터.jpg
insert into file(fi_name, fi_state) values('오펜하이머_메인포스터.jpg', '메인포스터');
-- 영화 정보를 등록 : 제목, 제목영어, 개봉일, 런닝타임, 줄거리, 등록된 메인포스터 번호, 연령제한을 설정
insert into movie(mo_title, mo_title_eng, mo_opening_date, mo_running_time,
	mo_plot, mo_fi_num, mo_ag_name)
    values('오펜하이머', 'oppenheimer', '2023-08-15', 180, '"나는 이제 죽음이요, 세상의 파괴자가 되었다."', 1, '15세관람가');
-- 등록된 영화인이 아닌 경우는 영화인을 등록하고 이미 등록되어 있으면 생략
-- 영화인을 등록(크리스토퍼 놀란, 킬리언 머피, 에밀리 블런트, 맷 데이먼, 로버트 다우니 주니어, 플로렌스 퓨,
-- 조쉬 하트넷, 케이시애플렉, 라미 말렉, 케네스 브래너)
insert into film_person(fp_name, fp_thumbnail, fp_agency, fp_final_education,
	fp_birthday, fp_ct_name)
    values('크리스토퍼 놀란','크리스토퍼 놀란.jpg','','','1970-07-30','영국'),('킬리언 머피','킬리언 머피.jpg','','','1974-05-25','아일랜드'),
    ('에밀리 블런트','에밀리 블런트.jpg','','','1983-02-23','영국'),('맷 데이먼','맷 데이먼.jpg','','','1970-10-08','미국'),
    ('로버트 다우니 주니어','로버트 다우니 주니어.jpg','','','1965-04-04','미국'),('플로렌스 퓨','플로렌스 퓨.jpg','','','1996-01-03','영국'),
    ('조쉬 하트넷','조쉬 하트넷.jpg','','','1978-07-21','미국'),('케이시애플렉','케이시애플렉.jpg','','','1975-08-12','미국'),
    ('라미 말렉','라미 말렉.jpg','','','1981-05-12','미국'),('케네스 브래너','케네스 브래너.jpg','','','1960-12-10','미국');
-- 역할을 등록
insert into role(ro_role, ro_fp_num, ro_mo_num)
values('감독', 1, 1),
('배우', 2, 1),
('배우', 3, 1),
('배우', 4, 1),
('배우', 5, 1),
('배우', 6, 1),
('배우', 7, 1),
('배우', 8, 1),
('배우', 9, 1),
('배우', 10, 1);
-- 영화 장르에서 오펜하이머 장르를 추가
insert into movie_genre(mg_ge_name, mg_mo_num) values('드라마', 1),('스릴러', 1);
-- 제작 국가에서 오펜하이머 제작국가를 추가
insert into country_production(cp_ct_name, cp_mo_num) values('미국', 1),('영국',1); 
-- 트레일러와 스틸컷을 등록(오펜하이머_트레일러1.mp4, 오펜하이머_스틸컷.jpg..)
insert into file(fi_name, fi_state) 
values('오펜하이머_트레일러1.MP4', '트레일러'),
('오펜하이머_트레일러2.MP4', '트레일러'),
('오펜하이머_트레일러3.MP4', '트레일러'),
('오펜하이머_스틸컷1.JPG', '스틸컷'),
('오펜하이머_스틸컷2.JPG', '스틸컷'),
('오펜하이머_스틸컷3.JPG', '스틸컷'),
('오펜하이머_스틸컷4.JPG', '스틸컷'),
('오펜하이머_스틸컷5.JPG', '스틸컷');
-- 영화 파일에 오펜하이머에 어떤 트레일러와 스틸컷이 있는지 등록
insert into movie_file(mf_fi_num, mf_mo_num)
values(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1),(9,1);

-- 영화 콘크리트 유토피아를 등록
-- 트레일러는 2개, 스틸컷은 3개
insert into file(fi_name, fi_state) values('콘크리트 유토피아_메인포스터.jpg', '메인포스터');
-- 영화 정보를 등록
insert into movie(mo_title, mo_title_eng, mo_opening_date, mo_running_time,
	mo_plot, mo_fi_num, mo_ag_name)
    values('콘크리트 유토피아', 'Concrete Utopia', '2023-08-09', 130, '"아파트는 주민의 것”', 10, '15세관람가');
-- 영화인을 등록
insert into film_person(fp_name, fp_thumbnail, fp_agency, fp_final_education,
	fp_birthday, fp_ct_name)
    values('엄태화','엄태화.jpg','','','1981-01-01','한국'),
		('이병헌','이병헌.jpg','','','1970-07-12','한국'),
        ('박서준','박서준.jpg','','','1988-12-16','한국'),
        ('박보영','박보영.jpg','','','1990-02-12','한국'),
        ('김선영','김선영.jpg','','','1976-04-10','한국'),
        ('박지후','박지후.jpg','','','2003-11-07','한국'),
        ('김도윤','김도윤.jpg','','','1981-08-07','한국');
-- 역할을 등록
insert into role(ro_role, ro_fp_num, ro_mo_num)
values('감독', 11, 2),
('배우', 12, 2),
('배우', 13, 2),
('배우', 14, 2),
('배우', 15, 2),
('배우', 16, 2),
('배우', 17, 2);
-- 영화 장르에서 오펜하이머 장르를 추가
insert into movie_genre(mg_ge_name, mg_mo_num) values('드라마', 2);
-- 제작 국가에서 오펜하이머 제작국가를 추가
insert into country_production(cp_ct_name, cp_mo_num) values('한국', 2);
-- 트레일러와 스틸컷을 등록(오펜하이머_트레일러1.mp4, 오펜하이머_스틸컷.jpg..)
insert into file(fi_name, fi_state) 
values('콘크리트 유토피아_트레일러1.MP4', '트레일러'),
('콘크리트 유토피아_트레일러2.MP4', '트레일러'),
('콘크리트 유토피아_스틸컷1.JPG', '스틸컷'),
('콘크리트 유토피아_스틸컷2.JPG', '스틸컷'),
('콘크리트 유토피아_스틸컷3.JPG', '스틸컷');

-- 영화 파일을 등록
insert into movie_file(mf_fi_num, mf_mo_num)
values(11,2),(12,2),(13,2),(14,2),(15,2);

-- 영화관 등록을 위해 사전에 해야하는 작업
-- 지역 데이터를 추가 : 서울, 경기, 인천, 강원, 대전/충청, 대구, 부산/울산, 경상, 광주/전라/제주
insert into region values('서울'), ('경기'), ('인천'), ('강원'), ('대전/충청'), ('대구'),
	('부산/울산'), ('경상'), ('광주/전라/제주');
-- 영화관 등록 :
-- cgv강남 영화관을 등록, 2관, 24좌석
insert into theater(th_name, th_address, th_re_name, th_total_screen,  th_total_seat)
	values('CGV강남', '서울특별시 강남구 강남대로 438 (역삼동)', '서울', 2, 24);
-- CGV강남 영화관에 있는 상영과나 등록
-- 1관 6층, 총 10좌석
-- 2관(LCK관) 6층(LASER), 총 14좌석
insert into screen(sc_name, sc_total_seat, sc_th_num)
values('1관 6층', 10, 1), ('2관(LCK관) 6층(LASER)', 14, 1);
-- 좌석을 등록
-- 1관 : A1, A2, A3, A4, B1, B2, B3, C1, C2, C3
-- 2관 : A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, D1, D2
insert into seat(se_name, se_row, se_col, sc_num)
value('A1', 'A', '1', 1),
('A2', 'A', '2', 1), 
('A3', 'A', '3', 1), 
('A4', 'A', '4', 1), 
('B1', 'B', '1', 1), 
('B2', 'B', '2', 1),
('B3', 'B', '3', 1),
('C1', 'C', '1', 1),
('C2', 'C', '2', 1),
('C3', 'C', '3', 1),
('A1', 'A', '1', 2),
('A2', 'A', '2', 2), 
('A3', 'A', '3', 2), 
('A4', 'A', '4', 2), 
('B1', 'B', '1', 2), 
('B2', 'B', '2', 2),
('B3', 'B', '3', 2),
('B4', 'B', '4', 2),
('C1', 'C', '1', 2),
('C2', 'C', '2', 2),
('C3', 'C', '3', 2),
('C4', 'C', '4', 2),
('D1', 'D', '1', 2),
('D2', 'D', '2', 2);
-- CGV강남 영화 스케쥴
-- 오펜하이머 1관 23년 8월 16일 09:00, 12:30, 16:00, 19:30, 23:00
-- 콘크리트 유토피아 2관 23년 8월 16일 10:10, 12:50, 18:10, 20:50, 23:30
insert into movie_schedule(ms_mo_num, ms_sc_num, ms_date, ms_possible_seat, ms_start_time,
	ms_end_time, ms_discount)
select 
	1, 1, '2023-08-16',10, '09:00:00', 
	right(adddate('2023-08-16 09:00:00', interval mo_running_time+10 minute), 8),
    case when '09:00' <= '12:00' then 'y' else 'n' end
    from movie where mo_num = 1;
insert into movie_schedule(ms_mo_num, ms_sc_num, ms_date, ms_possible_seat, ms_start_time,
	ms_end_time, ms_discount)
select 
	1, 1, '2023-08-16',10, '12:30:00', 
	right(adddate('2023-08-16 09:00:00', interval mo_running_time+10 minute), 8),
    case when '09:00' <= '12:00' then 'y' else 'n' end
    from movie where mo_num = 1;




