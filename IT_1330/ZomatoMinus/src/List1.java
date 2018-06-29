import java.util.List;
import java.util.ArrayList;
public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data =new ArrayList();
		data.add("G");
		data.add(2);
		data.add(2f);
		data.add(20.2);
		data.add(null);
		data.add(null);
		for(Object obj:data)
		{
			System.out.println(obj);
		}
	}

}
