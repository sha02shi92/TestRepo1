package inheritence;

class Base{
	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I am in base and setting x now");
		this.x = x;
	}
	public void printMe() {
		System.out.println("I am constructor");
	}
}

class Derived extends Base{
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class inheritence {
	public static void main(String[] args) {
//		creating an object of base class
		Base b = new Base();
		b.setX(4);
		System.out.println(b.getX());
		
//		vreating an object pf derived class
		Derived d = new Derived();
		d.setY(43);
		System.out.println(d.getY());
	}

}
