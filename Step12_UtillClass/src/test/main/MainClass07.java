package test.main;

import java.util.HashMap;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * HashMap<Key type, value type>
		 * 
		 * Key type 은 일반적으로 String type 을 가장 많이 사용한다.
		 * value type 은 담고 싶은 데이터의 type 을 고려해서 지정하면 된다.
		 * value type 을 Object 로 지정하면 어떤 data type 이던지 다 담을 수가 있다
		 * 순서가 없는 데이터를 다룰 때 사용하면 된다.
		 * dto 클래스 대신에 사용하기도 한다.
		 * 
		 */
		
		HashMap<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
		
		//value 의 generic 클래스가 Object 이기 때문에 Object type 이 리턴된다.
		int num = (int)map.get("num");// 원래 type 으로 casting 이 필요!
		String name =(String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
		
		/*
		 * 위에 7 줄의 코드를 javascript 로 표현한다면 아래와 같다
		 * 
		 * let map ={};
		 * map.num = 1;
		 * map.name = "김구라";
		 * map.isMan = true;
		 * 
		 * let num=map.num;
		 * let name=map.name;
		 * let isMan=map.isMan;
		 * 
		 * 아래의 코드도 가능하다
		 * let map={};
		 * map["num"]=1;
		 * map["name"]="김구라";
		 * map["isMan"] = true; 
		 *  
		 * let num=map["num"];
		 * let name=map["name"];
		 * let isMan=map["isMan"];
		 */
	}
}
