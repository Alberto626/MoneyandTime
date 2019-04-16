package hw7;

public class Money implements Comparable<Money>, Calculable<Money>{
	private double amount;
	
	public Money(double amount) {
		this.amount = amount;
	}
	public Money(Money money) { // this is the deep copy constructor
		this.amount = money.amount;
	}
	public Money add(Money money) {
		double newAmount = amount + money.getAmount();
		newAmount = (double)Math.round(newAmount * 100) / 100; 
		return new Money(newAmount);
	}
	public Money subtract(Money money) { //works
		double newAmount = amount - money.getAmount();
		newAmount = (double)Math.round(newAmount * 100) / 100;
		return new Money(newAmount);
	}
	public int compareTo(Money money) {
		if(this.amount > money.amount) { 
			return 1;
		}
		else if(this.amount < money.amount) { 
			return -1;
		}
		else {
			return 0;
		}
	}
	public double getAmount() {
		return this.amount;
	}
	public String toString() {
		String rep = "$" + amount;
		return rep;
	}
}
