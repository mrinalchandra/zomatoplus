
public class Main1 {

	public static void main(String[] args) {
		Person p1=new Person("Gautam","Rathi",20);
		Person p2=new Person("Gautam","Rathi",20);
		Person p3=new Person("Gau","Rathi",20);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		

	}

}

class Person
{
	private String fname;
	private String lname;
	private int age;
	public Person(String fname,String lname,int age)
	{
		this.fname=fname;
		this.lname=lname;
		this.age=age;
	}
	public boolean equals(Object obj) {
		Person that =(Person)obj;
		if(this.fname.equals(that.fname))
			return true;
		return false;
	}
	
}