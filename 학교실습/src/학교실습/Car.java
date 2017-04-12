package 학교실습;

public class Car implements Valuable{
	private String name;
	private double price;
	private int time;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
		time = 0;
	}
	public double estimateValue(int month){
		return (price*4/5)*(Math.pow((99./100),month));
		
	}
	
	@Override
	public String toString(){
		return String.format("Car name: " + name + "\ninitial price: " + price);
	}
}
