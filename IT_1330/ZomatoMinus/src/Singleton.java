
public class Singleton {

	public static void main(String[] args) {
		Singleton1 s1=Singleton1.getObject();
		System.out.println("s1 HASHCODE:"+s1.hashCode());
		Singleton1 s2=Singleton1.getObject();
		System.out.println("s2 HASHCODE:"+s2.hashCode());
		// TODO Auto-generated method stub

	}

}
 class Singleton1{
	 
	 private Singleton1() {
		 
	 }
	 static Singleton1 s1=new Singleton1();
	
	 
	 public static Singleton1 getObject() {
		 return s1;
	 }
 }