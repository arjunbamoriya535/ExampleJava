package Demo;

import java.util.Scanner;

public class TestMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the length");
	int l=sc.nextInt();
	System.out.println("enter the width");
	int w=sc.nextInt();
	System.out.println("Enter the height");
	int  h=sc.nextInt();
	
	Cuboid sb=new Cuboid(l,w,h);
	sb.area();
	sb.volume();
	System.out.println(sb.area());
	
	System.out.println(sb.volume());
	
	//System.out.println(new Cuboid(2,4,5));
}


}

