package pattern;

public class PatternProgram1 {
public static void main(String[] args) {
  int n=5;
  for(int i=0;i<n*2;i++) {
	  for(int j=0;j<=i;j++) {
		  System.out.print(" ");
	  }
	  for(int j=n*2-i; j>i+1;--j) {
		  System.out.print("*");
	  }
	  if(i<n)
	  for(int j=0;j<i*2+1;j++) {
		
		  System.out.print(" ");
	  }
	  else {
		  
		  for (int c = 1 ; c <= 2*(n-(i-n))-1; c++) {
			  System.out.print("*");
		  }
	  }
		  
		  
		  
	  for(int j=n*2-i; j>i+1;--j) {
		  System.out.print("*");
	  }
	  for(int j=0;j<=i;j++) {
		  System.out.print(" ");
	  }
	  System.out.println("");
  }
}
}
