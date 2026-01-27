package SeleniumProgramms;
// Annotaions in java @Override
public class Annotations {
	@SuppressWarnings("Depricated")
	public static void main(String[] args) {
		
		B b = new B();
		b.show();
		C c = new C();
		c.display();
	}
}
class A{
	void show() {
		System.out.println("A Annotaions Example");
	}
}
class B extends A{
	@Override
	//Annotaion @Override
	void show() {
		System.out.println("B annotations example");
	}
	
}
class C{
	/**
	 * @deprecated
	 * It's no longer use now
	 */
	@SuppressWarnings("Depricated")
	@Deprecated
	public void display() {
		System.out.println("hii");
	}
	
}

