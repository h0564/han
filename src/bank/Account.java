package bank;

public class Account {
	private String number;
	private String name;
	private long money;
	
	Account(){}
	void setNumber(String number) {
		this.number = number;
	}
	String getNumber() {
		return this.number;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	void setMoney(long money) {
		this.money = money;
	}
	long getMoney() {
		return this.money;
	}
	
	Account(String number,String name,long money){
		this.number = number;
		this.name = name;
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + "]";
	}
	
	
}
