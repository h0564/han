package first;

public class Test {
	int a;
	int b;
	int getA() {
		return a;
	}
	void setA(int a) {
		this.a = a;
	}
	int getB() {
		return b;
	}
	void setB(int b) {
		this.b = b;
	}
	String get() {
		return this.b+" ";
	}
	@Override
	public String toString() {
		return "Test [a=" +a + ", b=" + b + "]";
	}
	
	
	
}
