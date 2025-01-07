package modifies;
//클래스 앞에는 public 과 package 두가지의 접근제어자만 가능 package를 쓰라는게 아니라 Default라는뜻임
public class Board {
	private long no; //동일 클래스 내에서만 접근가능
	String title; //생략해서 표기하는게 문법입니다. default 동일패키지 내에서 접근가능
	protected String content; //동일패키지 + 상속관계(다른 패키지에있더라도 상속이면 가능)
	public int readCount; // 어디서든 접근이 가능
	public long getno(){
		//단 이너 클래스(내부 클래스)라면 default public 말고도 private protected 전부다 가능함
	return this.no;
	
	}
	public void setno(long no) {
		this.no = no;
		//같은 클래스 내부면 가능함
		//당연히 생성자내부에도 접근가능함
		//클래스 내부에는 반드시 1개이상의 생성자가 존재해야하기때문
		
	}
}	

class board2{
	//이게 Default 혹은 Package임 Package쓰거나 명시하면 에러임 그냥 비워놓으라는뜻
	//허용하는 범위가 동일패키지내 라는 뜻임 여기서는 modifies패키지까지임
	//보통 이런식으로 하나의 파일에 2개의 클래스 이너도 아니고 쌩 2개의 클래스 잘 안만듬
}