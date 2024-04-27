public class Human {
    String name;
    String fname;
    String lname;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    // overloading constructor
    //multiple constructor within a class with same name but different parameters
    
    Human(String fname,String lname, int age, double weight){
        this.fname=fname;
        this.lname=lname;
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
