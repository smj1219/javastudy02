package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		//콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps=System.out;
		//PrintStream 객체의 참조값을 부모 type 변수에 담기
		OutputStream os=ps;
		//2byte 처리 스트림
		var osw=new OutputStreamWriter(os);
		
		try {
			osw.write(97);
			osw.write(98);
			osw.write(99);
			osw.write(44032); 
			osw.write("나다");
			osw.write("\n");//개행기호 _한 줄 띄어쓰기
			osw.write("피아노");
			osw.flush();//방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
