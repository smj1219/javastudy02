package frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//어디선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다
public class MyFrame extends JFrame implements ActionListener{

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
		
		
		JTextField inputMsg = new JTextField(10);
		add(inputMsg);
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		//버튼에 액션 리스너 등록하기
		sendBtn.addActionListener((e)->{
			//입력한 문자열을 읽어와서 콘솔창에 출력하기
			String msg = inputMsg.getText();
			System.out.println(msg);
		});
		
		//화면상에 실제 보이도록 한다
		setVisible(true);
	
	}
	// main 메소드
	public static void main(String[] args) {
		new MyFrame();
	}
	//implements ActionListener 했기때문에 강제로 구현된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
