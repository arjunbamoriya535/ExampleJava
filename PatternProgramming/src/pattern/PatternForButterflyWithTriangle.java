package pattern;

public class PatternForButterflyWithTriangle {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<=n*4;i++) {
		for(int j=n;j>i;j--) {
			System.out.print("*");
		}
		if(2*(n-1)>=i&&i>=n )
	    for(int k=i-(n-2);k>0;k--) {
	    	System.out.print("*");
	    }
		if(2*(n-1)<i&& i<=(n*3-2))
		for(int j=n;j>i-2*(n-1);j--) {
			System.out.print("*");
		}
	       if(i<19)
			 for(int m=i;m<i-n*3;m++) {
			    	System.out.print("*");
			 }
	
		System.out.println();
	}
	
	
}
}
