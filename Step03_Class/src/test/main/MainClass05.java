package test.main;

import java.io.PrintStream;

/**
 *  System.out.println();
 *  
 *  에 대한 분석!!
 */
public class MainClass05 {
	public static void main(String[] args) {
		// System 클래스에는 out 이라는 static 필드가 존재하고
		// 거기에는 콘솔창과 연결된 ( 콘솔창에 출력할 수 있는) 
		// PrintStream type 객체의 참조값이 들어있다
		System.out.println("안녕!");
		
		//System 클래스의 out 이라는 필드에 담긴 참조값을 gura 라는 지역변수에 담기
		PrintStream gura = System.out;
		gura.println("안녕!!!");
		
		//System 클래스의 static 메소드 호출
		long time = System.currentTimeMillis();
	}
}
