package Demo;

import java.util.ArrayList;
import java.util.List;

public class StringConcatinationOniT {
public static void main(String[] args) {
	String lastName=null;
	String firstName="mark";
	System.out.println(returnString(firstName,lastName));
}

private static String returnString(String firstName, String lastName) {
	//String str="";
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
          strbul.append(",");
      }
      //just for removing last comma
      strbul.setLength(strbul.length()-1);
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

}
