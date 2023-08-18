package db.day2.board.service;

import java.sql.*;
import java.util.*;

import db.day2.board.dao.MemberDAO;
import db.day2.board.dao.MemberMapper;
import db.day2.board.vo.MemberVO;

public class MemberServiceImp implements MemberService{
	
	private Connection con;
	private MemberDAO memberDao;
	
	public MemberServiceImp(Connection con) {
		this.con = con;
		memberDao = new MemberMapper(con);
	}

	@Override
	public boolean signup(String id, String pw) {
		
		
		//아이디가 id인 회원의 수를 가져옴
		MemberVO member = memberDao.getMember(id);
		//회원의 수가 0이면 회원을 등록
		if(member != null) {
			return false;
		}
		//아니면 회원을 등록하지 않음
		memberDao.insertMember(id, pw);
		return false;
	}

	@Override
	public boolean withdraw(String id, String pw) {
		
		MemberVO member = memberDao.getMember(id);
		
		if(member != null && member.getMe_pw().equals(pw)) {
			memberDao.deleteMember(id);
			return true;
		}
		return false;
	}

}
