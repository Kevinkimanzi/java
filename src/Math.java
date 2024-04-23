import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//double x = 3.14;
		//double y = -10;
		
		//double z = Math.min(x,y);
		//double k = Math.max(x,y);
		//double a = Math.abs(y);  // absolute value
		//double b = Math.sqrt(x);  // print squareroot
		
		
		//System.out.println(z);
		//System.out.println(k);
		//System.out.println(a);
		//System.out.println(b);
		
		//Lets build a program that will calculate hypotenuse
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the value of x: ");
		double x =scanner.nextDouble();
		
		System.out.print("What is the value of y: ");
		double y =scanner.nextDouble();
		
		double z;
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The value for hypotenuse is:"+z);
		
		scanner.close();
		
		
		
		

	}

}
