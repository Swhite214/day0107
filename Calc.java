package method;

public class Calc {
	
	//메서드 오버로드;
	//동일한 메서드 "이름"을 허용하는 문법입니다.
	// 단 매개변수의 타입또는 순서나 갯수에 의해 구분이 되야합니다.
	
	void print() {
		System.out.println("Calc print메서드입니다.");
	}
	/*
	 * int print() {
	 * System.out.println("dasf");
	 * return 0; 이건안됨 리턴값다르다고 허용되지않아
	 * 
	 * }
	 */
	void print(String name) {
		System.out.println(name + "님 ! 안녕하세요");
	
	//이런식으로 분명 메서드 이름은 print로 같지만 앞에있는건 매개변수가 없고 뒤에껀 매개변수 String을 사용
	}
	
	void print(int num) {
		System.out.println(num+ "은 숫자네요");
	}
	int add(int n1, int n2) {
		return n1+n2;
	}
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	int add(byte n1, byte n2) {
		return n1-n2;
	}
	String add(String n1, int n2) {
		return n1+n2;
	}
	String add(int n1, String n2) {
		return n1+n2; //전부다 add지만 가능 이것이오버라이딩~
	}
}
