package modifies02;

import modifies.Board;
 

public class BoardfieldTest02 {
	public static void main(String[] args) {
	Board board = new Board(); //다른 패키지이므로 import해줘야함
	//System.out.println(board.no);//당연히 내부 클래스아니므로 안됨
	//System.out.println(board.content);//동일패키지가 아니므로 접근안됨 상속관계도 아니기때문에 안됨
	System.out.println(board.readCount);
	//System.out.println(board.title);//동일패키지가 아니므로 접근안됨
	}
}

class BoardSub extends Board{ //상속관계 부모클랫는 Board 자식은 BoardSub
	void display() {
		System.out.println(content);//상속이기에 가능함 앞에 this를 붙여도 상관은없음
		System.out.println(super.readCount);
	}
	
}