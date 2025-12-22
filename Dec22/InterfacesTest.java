package Dec22;
import java.util.*;

public class InterfacesTest{
	public static void main(String[] args){
	C c = new C();
	c.show();
	c.hi();
	}
}
interface test1{
	void show();
}

class C implements test1{
	
	public void show(){
		System.out.println("C implements Show method ");
	}
	public void hi(){
		System.out.println("Override Hi method");
	}
}



