import java.util.Random;

public class DiceRolle {
    DiceRolle(){
        Random random = new Random();
        int num = 0;
        roll(random, num);

    }

    void roll(Random random, int num){
        num = random.nextInt(6)+1;
        System.out.println(num);

    }
    
}
