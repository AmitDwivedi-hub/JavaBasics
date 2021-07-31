package Reflection;

public class Person {

    private String name;
    private static int personCount;

    public Person(String name){
        this.name=name;
        this.personCount++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Creating a public method with no arguments
    public void method1()  {
        System.out.println("The string is " + name);
    }

    // Creating a public method with int as argument
    public void method2(int number)  {
        System.out.println("The number is " + number);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}
