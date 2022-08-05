/*
 * this() : new 없이 생성자를 호출하기 위한 메소드
 * 1.반드시 생성자 메소드에서만 사용해야 하고
 * 2.생성자 메소드 내의 반드시 첫번째 줄에 와야 한다.
 */
public class ConstructorDemo3 {
	public static void main(String[] args) {
		sawon jimin=new sawon();
		System.out.println(jimin.salary+jimin.name);
		
	}
}
class sawon{
	 String name;
	 int salary;
	public sawon(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	public sawon(String name) {
		this(name,50000);
	}
	public sawon(int salary) {
		this("Unknown");
	}
	public sawon() {
		this("Unknown",50000);
//		new sawon("Unknown",50000);  
		
	}
}
