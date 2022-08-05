
public class Car {
	private String name;
	private int price;
	
	public Car() { //기본 생성자
		System.out.println("방금 객체가 생성되었습니다.");
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}	
	public void myPrint() {
		System.out.println(this);
	}
}
