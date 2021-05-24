package Demo;

import java.util.ArrayList;
import java.util.List;

public class StringConcatinatioOnItAssignment {
	
	    
	    public static String getUserName (String firstName,String lastName) {
	         List<String> list=new ArrayList<String>();
		     //firstName=capitalFirst(firstName);
		      //lastName=capitalFirst(lastName);
	         	if(lastName!=null) {
			   list.add(capitalFirst(lastName));
		       }
	     	if(firstName!=null) {
			     list.add(capitalFirst(firstName));
	        	}
		  StringBuilder strbul=new StringBuilder();
	      for(String str : list)
	      {
	          strbul.append(str);
	          //for adding comma between elements
	          strbul.append(", ");
	      }
	      //just for removing last comma
	      strbul.setLength(strbul.length()-2);
	      String str=strbul.toString();
		return str;
	}

	public static String  capitalFirst(String str ) {
	String	str1=str.substring(0,1).toUpperCase();
	/* System.out.println("hi "+"hh"+ str1); */
	String str2=str.substring(1,str.length());
		str=str1+str2;
		return str;
	}

	    
	    
	    public static String capitaliseFirstLetter (String s) {
	        if (s == null || s.length() < 1) {
	            return s;
	        }
	            
	        char[] chars = s.toCharArray();
	        
	        chars[0] = Character.toUpperCase(chars[0]);
	        
	        return String.valueOf(chars);
	    }       
	}

