package Demo;



import java.util.*;

public class Test42 {
    // DO NOT write a main method
    public static void main(String[] args) {
		char[] x= {'a','b','c','a','c','a'};
		
		char[] ch=removeDuplicates(x);
		
		  for(int i=0;i<ch.length;i++) { 
			  System.out.print(ch[i]); }
		 
	}
    public static char[] removeDuplicates (char[] arg) {
    int index=0;
    Arrays.sort(arg);
    for(int i=arg.length;i>=0;i++){
        int j;
        for(j=i;j>i;j--){
            if(arg[i]==arg[j])
            {
                break;
            }
        }
        if(j==i){
            arg[index]=arg[i--];
        }
    }
    char[] ch=Arrays.copyOf(arg,index);
    
	return ch;
    
    }
}