package jan22_26;

//Functional Interface Annotation
@FunctionalInterface
interface Inter{
	double getpi();
}
public class FuncInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter a;
		a = ()-> 3.1415;
		System.out.println("Value of pi = "+a.getpi());
	}
}
