package test.aaaa2;

import java.util.Random;

import test.aaaa.Work; 

public class WorkTest {
	public static void main(String[] args) {
		Work work1 = new Work();
		work1.name = "스쿼트";
		work1.price = 12;
		work1.drive();
		String[] fortunes={"동쪽으로 가면 귀인을 만나요", 
				"오늘은 집에만 계세요", 
				"너무 멀리가지 마세요",
				"오늘은 뭘해도 되는 날이에요",
				"로또가 당첨되요"};
		//오늘의 운세가 5개중에서 랜덤하게 나오도록 프로그래밍 해 보세요
		Random ran=new Random();
		int ranNum=ran.nextInt(fortunes.length);

		System.out.println(fortunes[ranNum]);
	}
}
