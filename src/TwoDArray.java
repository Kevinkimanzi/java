public class TwoDArray {
    public static void main(String[] args){
        String[][] cars= new String[3][3];
        cars[0][0]="Volvo";
        cars[0][1]="BMW";
        cars[0][2]="Suzuki";
        cars[1][0]="Toyota";
        cars[1][1]="Mistubishi";
        cars[1][2]="Ford";
        cars[2][0]="Merc";
        cars[2][1]="Range";
        cars[2][2]="Ferrari";

        for (int i=0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }

        }
    }
}
