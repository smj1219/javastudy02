package test.main;

import test.mypac.AirPlane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t=new Test();
		//return type 이 void 인 메소드 호출
		t.walk();
		//return type 이 int 인 메소드 호출하고 리턴되는 값을 a 라는 int type 지역변수에 담기
		int a=t.getNumber();
		//return type 이 String 인 메소드 호출하고 리턴되는 값을 b 라는 String type 지역변수에 딤기
		String b=t.getGreeting();
		//return type 이 AirPlane 인 메소드를 호출하고 리턴되는 값을 c 라는 AirPlane type 지역변수에 담기
		//new AirPlane();
		AirPlane c=t.getPlane();
		//c 에 담긴 값을 이용해서 fly() 메소드를 호출해보세요
		c.fly();
		
		// 위에서 생성한 객체의 setNum() 메소드를 호출해보세요
		t.setNum(999);
		t.setNum(a);
		// 위에서 생성한 객체의 setName() 메소드를 호출해보세요
		t.setName("kim");
		t.setName(b);
		// 위에서 생성한 객체의 setPlane() 메소드를 호출해보세요
		t.setPlane(new AirPlane());
		t.setPlane(c);
		
		t.doSomething(123, "song", new AirPlane());
		
		t.send();
		t.send(10);
		t.send("kim");
		t.send(new AirPlane());
	}
}
