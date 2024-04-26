public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    void eat(){
        System.out.print(this.name+" "+"is eating his lunch");
    }

    void drink(){
        System.out.print(this.name+" "+"is drinking Beer");
    }


    
}
