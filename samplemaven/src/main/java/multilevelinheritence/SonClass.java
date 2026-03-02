package multilevelinheritence;

public class SonClass extends FatherClass{

	public static void main(String[] args) {
		SonClass s=new SonClass();
		s.getage(27);
		s.Getid(500);
		s.getstring("Hello");
		

		// TODO Auto-generated method stub
		
	}
	public void Getid(int id) {
		System.out.println(id);
	}

}
