package test.mypac;

public class WowException extends RuntimeException{ //RuntimeException 클래스를 상속받아서 만든다.
	
	//생성자의 매개변수로 예외메세지를 전달받아서
	public WowException(String msg) {
		super(msg); //부모생성자에 전달해준다.
	};
}