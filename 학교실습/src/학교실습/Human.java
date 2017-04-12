package 학교실습;

public class Human implements Valuable{
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public double estimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	@Override
	public String toString(){
		return String.format("Human name: " + name + "\nregistered age: " + age);
	}
}
