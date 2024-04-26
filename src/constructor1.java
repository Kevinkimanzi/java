public class constructor1 {
    public static void main(String[] args){
        Human human1 =new Human("Kevin", 70, 50);
        Human human2 =new Human("Kimanzi", 40, 50);

        System.out.println(human1.name);  //not for attribute we have to print

        human1.eat();  //for method we just call
        System.out.println(); // to allow us have space
        human2.drink();

    }
}
