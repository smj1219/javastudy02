package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//어디선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다
public class MyFrame extends JFrame{
	//생성자
	public MyFrame() {
		//프레임의 제목 설정
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		//종료 버튼을 놀렀을 때 프로세스 전체가 종료 되도록 한다
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		
		//프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		//JButton 객체 생성
		JButton btn1=new JButton("버튼1");
		//프레임의 add() 메소드를 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		this.add(btn1);
		
		//버튼 2개를 프레임에 추가로 배치해보세요
		JButton btn2=new JButton("버튼2");
		this.add(btn2);
		
		JButton btn3=new JButton("버튼3");	
		this.add(btn3);
		//화면상에 실제 보이도록 한다
		setVisible(true);
	
	}
	// main 메소드
	public static void main(String[] args) {
		new MyFrame();
	}
}
