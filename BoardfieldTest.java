package modifies;

public class BoardfieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		//System.out.println(board.no); private으로 접근제어해놨기에 no는 해당클래스 내부에만 접근이가능해요
 		System.out.println(board.content);//동일패키지이기때문에 접근가능
		System.out.println(board.readCount);
		System.out.println(board.title);//동일패키지이기때문에 접근가능
	}

}
