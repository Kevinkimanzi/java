import java.util.Scanner;

public class userImput {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?:");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?:");
		int age = scanner.nextInt();
		
		System.out.println("Hello "+ name);
		System.out.println("You are "+age+" years old" );
		System.out.println("Hello "+name+" "+"You are "+age+" years old" );
		
		

	}
}