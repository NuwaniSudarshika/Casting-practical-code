public class Parent {
    String name;
    void display(){
        System.out.println("super class is Running");
    }
}
class Child extends Parent{
    int age;
    void display(){
        System.out.println("sub class is Running");
    }
}
class Downcasting{
    public static void main(String[] args) {
        Parent p = new Child();//upcasted object
        p.name = "Gawesh";
        Child c = (Child) p;//downcasted object
        c.age =25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}
