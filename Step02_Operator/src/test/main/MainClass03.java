package test.main;
/*
 * 
 * 3. 비교연산자 테스트
 * 	  비교연산의 결과는 boolean type 을 리턴해준다.
 * 
 *   ==, !=, >, >=, <, <=
 * */
public class MainClass03 {
	public static void main(String[] args) {
		//같은지 비교하는 연산자 ==
		boolean result1 = 10 == 10; //true
		//다른지 비교하는 연산자 !=
		boolean result2 = 10 != 10; //false
		boolean result3 = 10 > 100; //false
		boolean result4 = 10 >= 10; //ttue
		boolean result5 = 10 < 100; //true
		boolean result6 = 10 >= 10; //true
		
		//String type 변수 name에 null 대입하기 
		String name=null;
		//null 인지 아닌지 비교가 가능하다 ( 즉 java에서 null 값은 비교가 가능)
		boolean result7 = name == null;
		boolean result8 = name != null;
	}
}
