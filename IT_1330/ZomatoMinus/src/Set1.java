import java.util.*;
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set dat=new HashSet();
		dat.add("Hello");
		dat.add("hello");
		dat.add("hello");
		dat.add(7);
		dat.add(null);
		for(Object o:dat)
		{
			System.out.println(o);
		}
	}

}
