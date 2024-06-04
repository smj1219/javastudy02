package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass12 {
	public static void main(String[] args) {
		try {
			//File 로 부터 byte 알갱이를 읽어들일 객체생성
			var fis=new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			//byte 알갱이를 File 에 출력할 객체 생성
			var fos=new FileOutputStream("C:/Users/user/playground/myFolder/copied.jpg");
			
			//1 byte 
			byte[] buffer = new byte[1024];
			while(true) {
				//byte[] 배열을 전달해서 byte 알갱이를 한번에 1024 개씩 읽어들인다.
				int readedCount=fis.read(buffer);//읽어들인 갯수가 리턴된다
				System.out.println(readedCount+" byte를 읽었습니다");
				if(readedCount==-1)break;//만일 더이상 읽을 데이터가 없다면 반복문 탈출
				//byte[] 배열을 배열에 저장된 byte 알갱이를 0번 인덱스로 부터 읽은 갯수만큼만 출력하기
				fos.write(buffer, 0, readedCount);
			}
			System.out.println("파일을 copy 했습니다.");
			//마무리 작업
			fos.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

