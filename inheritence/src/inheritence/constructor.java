package inheritence;

class Base1{
	
	Base1(){
		System.out.println("I am a constructor");
	}
	Base1(int x){
		System.out.println("I am a overloaded constructor with value of x as : " +x);
	}
//	public int x;
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
	
}
  class Derived1 extends Base1{
	  Derived1(){
		  super(0);
		  System.out.println("I am a derived class constructor");
	  }
	  Derived1(int x, int y){
		  super(x);
		  System.out.println("I am a overloaded constructor of Derived with value of y as: " +y);
	  }
//	public int y;
//	
//	
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
	
  }
  class childOfDerived extends Derived1{
	  childOfDerived(){
		  System.out.println(" am child of derived constructor");
	  }
	  childOfDerived(int x, int y, int z){
		  super(x, y);
		  System.out.println("I am an overloaded constructor of Derived with value of z as: " +z);
	  }
	  
  }
public class constructor {
	public static void main(String[] args) {
//	Base1 b = new Base1();
//	Derived1 d = new Derived1();
	Derived1 d = new Derived1(14, 9);
//	childOfDerived cd = new childOfDerived();
	childOfDerived cd = new childOfDerived(12, 13, 14);
	
	}

}
