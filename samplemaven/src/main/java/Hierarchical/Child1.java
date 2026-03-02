package Hierarchical;

public class Child1 extends Father{

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.Getname("Aathira");
		c.Getage(25);
		// TODO Auto-generated method stub

	}
	public void Getage(int age) {
		System.out.println(age);
	}

}
