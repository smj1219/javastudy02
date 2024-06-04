package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		//전체 회원 목록을 불러오려면?
		MemberDao dao=new MemberDao();
		List<MemberDto> list=dao.getList();
		
		//테스트로 출력도 해보면
		for(MemberDto tmp:list) {
			String info=String.format("번호:%d, 이름:%s, 주소:%s",
					tmp.getNum(),tmp.getName(),tmp.getAddr());
			System.out.println(info);
		}
	}
}
