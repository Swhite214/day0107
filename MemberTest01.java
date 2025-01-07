package constructor;

public class MemberTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = new Member();
		mem.print(); //디폴트 생성자기 때문에 초기화안됨
		
		Member mem1 = new Member(1L);
		mem1.print(); // 1의값으로 id가 초기화
	
		Member mem2 = new Member(1L,"아이유"); //인자값이 두개네요
		mem2.print();
		
		Member mem3 = new Member(1L, "아이유", 17);
		mem3.print();
		
		Member mem4 = new Member(1L, "아이유", 17 , 'F');
		mem4.print();
	
		
	}

}
