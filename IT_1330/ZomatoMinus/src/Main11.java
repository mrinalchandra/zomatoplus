import java.util.*;
import java.io.*;
public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set data=new HashSet();
        String s="in this one we think we reached the main verb when we the think reached";
         String K="";
     int len= s.length();
     for(int i=0;i<len;i++)
     {
    	  char c=s.charAt(i);
       if(c!=' ')
    	    K=K+c;
       else
       {
    	   data.add(K);
            K="";	
       }
     }
	    data.add(K);
	    
	    	System.out.println(data);
	}
	}

