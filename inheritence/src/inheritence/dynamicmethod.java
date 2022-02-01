package inheritence;

class Phone{
public void showTime() {
		
		System.out.println("Time is 8 am");
}
	public void on() {
		
		System.out.println("Turning on phone...");
	}
	
}

class SmartPhone extends Phone{
public void music() {
		
		System.out.println("Playing music...");
}
	public void on() {
		
		System.out.println("Turning on Smartphone");
}
}
public class dynamicmethod {
	public static void main(String[] args) {
//		phone obj = new phone(); // allowed
//		Smartphone smobj = new Smartphone(); //allowed
//		obj.name();
		
		Phone obj = new SmartPhone();  //yes it is allowed
		
		obj.showTime();
		obj.on();
//		obj.music(); not allowed

	}
		
	}


