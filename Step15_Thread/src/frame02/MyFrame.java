package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		//레이아웃 설정
		setLayout(new FlowLayout(FlowLayout.CENTER));
		/*
		 *   var
		 * 
		 *  - type 추론이 가능하다면 지역변수의 type 선언 대신에 var 로 선언할 수 있다
		 *  - java10 에서 추가되 문법, 아직도 실무에서는 1.8 버전을 쓰는 곳이 많기 떄문에 즈의!
		 *  - 지역변수에만 사용가능, 필드는 안됨
		 *  - 인터페이스 type 추론 불가
		 *  - null 로 초기화 불가
		 */
		var startBtn = new JButton("작업 시작");
		add(startBtn);
		startBtn.addActionListener((e)->{
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업이 종료되었습니다.");
		});
		
		var startBtn2 = new JButton("작업 시작2");
		add(startBtn2);
		startBtn2.addActionListener((e)->{
			new WorkThread().start();
		});
	}
	//MyFrame 클래스의 메소드
	public void test() {
		MyFrame a =this;
	}
	//스레드 클래스를 내부 클래스로 만들어보기
	class WorkThread extends Thread{
		//WorkThread 클래스의 메소드 
		@Override
		public void run() {
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			WorkThread a= this;
			//내부 클래스에서 바깥에 있는 클래스로 생성된 객체의 참조값이 필요할 때가 있다
			MyFrame b =MyFrame.this;
			JOptionPane.showMessageDialog(MyFrame.this, "작업이 종료되었습니다.");
		}
	}
	//run 했을 때 실행의 흐름이 시작되는 (main Thread 가 시작되는) main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
