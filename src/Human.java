public class Human {
    void PrintData(){
        System.out.println("Method of super class");
    }
}
class Man extends Human{
    void PrintData(){
        System.out.println("Method of sub class");
    }
}
class Test{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Man();
        h.PrintData();
        h1.PrintData();
    }
}
