public class returnStament{
    public static void main(String[] args){
        String Shouting = printmessage("Welcome to my code");
        System.out.println(Shouting);
        int sum = add(4,5);
        System.out.println(sum);

    }

    public static String printmessage(String s){
        return s.toUpperCase();
    }
    
    public static int add(int a, int b){
        return a + b;

        
    }
    
}
