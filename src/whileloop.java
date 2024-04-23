import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter Your Name Please!");
            name = scanner.nextLine();
        }
        // do loop will act the same as while loop
        //A do-while loop guarantees the loop body runs at least once before checking the condition
        
        /*do{
            System.out.println("Enter Your Name Please!");
            name = scanner.nextLine();
        }while(name.isBlank());*/
        System.out.println("Hello, "+name);
    }   
}
