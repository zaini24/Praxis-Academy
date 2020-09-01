
public class MyParentClass {

    public static void justaMethod() {
        System.out.println("Parent class method");

    }
}

class MyChildClass extends MyParentClass {
    //@Override
    public static void justaMethod() {
        System.out.println("child class method");
   }
}