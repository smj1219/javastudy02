package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass08 {

	public static void main(String[] args) {		
		//int type 을 담을 지역변수를 미리 만들어 놓는다.
		int ranNum = 0;
		try {
			Random ran = new Random();
			//0~9 사이의 랜덤한 숫자를 얻어내서 미리 만들어둔 지역변수에 담는다.
			ranNum = ran.nextInt(10);
			if(ranNum == 7) {
				//여기서 발생하는 Exception 은 JVM이 직접 처리한다.
				throw new WowException("우왕!! 행운의 7번이당");
			}	
		}
		catch(WowException we) {
			we.printStackTrace();
			}
		System.out.println(ranNum + "숫자가 나왔습니다.");
			
	}
}