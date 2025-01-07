package constructor;

public class Member {
	
	long id;
	String name;
	int age;
	char gender;
	
	void print() {
		String str ="id=" + id+" , name=" + name + ", age=" + age + ", gender=" + gender;
		System.out.println(str);
	}
	//생성자: 객체가 생성될때 초기화 할때 사용
	//특징
	//이름이 클래스를 만들때 결정이됨 클래스와 동일함
	//메서드와 비슷한 구조를 지니고있음 (매개변수+바디) 또한 생성자도 오버로딩을 지원하고있습니다.
	//리턴형이 존재하지않습니다. 오류가나지는 않지만 쓰지않습니다. 이유? 리턴을 만나는순간 실행을하지않습니다
	//클래스는 반드시 생성자가 존재해야합니다
	//기본 생성자는 생략할수있습니다.(존재하지만 표기만 하지않는상태)
	//기본 생성자는 어떠한생성자를 구현하면 존재하지않는걸로 판별됩니다.
	/*public Member() {
		id = 12;
		name = "아이유";
		age = 20;
		gender = 'F'; //이런식으로 멤버필드의 초기값을 디폴트가 아닌 지정이가능합니다
		//쓸거면 일반적으로 아래에 쓰는걸 지향합시다
	*/
	public Member() {
		//디폴트생성자
	 }
	public Member(long id) {
		this.id=id;
	}
	public Member(long id, String name) {
		this(id);
		this.name=name;
	}
	public Member(long id, String name, int age) {
		this(id,name);
		this.age=age;
	}
	public Member(long id, String name, int age, char gender) {
		this(id, name, age); //new키워드를 사용해서 메모리공간할당이 아니라 초기화기때문에 new안씀
		//new Member가 아니라 this입니다 Member로 하면 이건 메서드로 인식해버립니다.
		//생성자 내부에서 또 다른 생성자를 호출할때 this 생성자를 사용합니다.
		//생성자를 호출하는 this()생성자는 첫문장에서만 허용합니다
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	}



