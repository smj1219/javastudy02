package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		// 1. 세 명의 회원정보(번호, 이름, 주소) 를 HashMap 객체를 생성해서 담아보세요
		// HashMap 객체 하나당 한명의 회원정보를 담으니까 총 3개의 HashMap 갹체가 생성 되어야 합니다
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "동물원");
		// 2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해보세요.
		List<Map<String, Object>> members=new ArrayList<>();
		// 3. ArrayList 객체에 HashMap 객체 3를 담아보세요.
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		// 4. 반복문 돌면서 ArrayList 에 담긴 회원정보를 콘솔창에 이쁘게 출력해보세요
		for(Map<String, Object> tmp:members) {
			String info=String.format("번호:%d 이름:%s 주소:%s", 
					(int)tmp.get("num"), (String)tmp.get("name"), (String)tmp.get("addr"));
			System.out.println(info);
		}
	}
	
}
