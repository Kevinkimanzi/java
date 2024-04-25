public class arrays {
    public static void main(String[] args){
        String[] cars= new String[5];
        cars[0]="Volvo";
        cars[1]="BMW";
        cars[2]="Suzuki";
        cars[3]="Toyota";
        cars[4]="Mistubishi";

        for(int i=0; i<cars.length; i++) {

            System.out.println(cars[i]);
        }
    }
}
