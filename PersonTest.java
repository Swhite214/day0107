package modifies;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("카리나");
		System.out.println(p.getName());
		//이런식으로 private로 저장된 멤버필드여도 우회해서 불러올수있고 이게 기본접근방식임 OOP의 특징중하나 인캡슐화임
		//보안상의 이유로 이렇게하는거임
	}
		//멤버변수에만 private 등등 붙일수있는거지 거의 99퍼는 매개변수 지역변수에는 붙이면 오류남 ㅋㅋ
}
