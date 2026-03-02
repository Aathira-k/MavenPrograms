package singleinheritence;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		String str=c.getname("Aathira");
		System.out.println(str);
		c.Getid(250);
		// TODO Auto-generated method stub

	}
	public void Getid(int id) {
		System.out.println(id);
	}
}
