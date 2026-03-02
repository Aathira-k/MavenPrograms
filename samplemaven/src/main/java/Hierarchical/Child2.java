package Hierarchical;

public class Child2 extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c1=new Child2();
		c1.Getname("Hi");
		c1.Getid(350);
	}
	public void Getid(int id) {
		System.out.println(id);
	}
}
