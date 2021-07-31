package Reflection;

public class ReflectionDemoClass {

        // creating a private field
        private String name;

        // creating a public constructor
        public ReflectionDemoClass()  {  name = "GeeksforGeeks"; }

        // Creating a public method with no arguments
        public void method1()  {
            System.out.println("The string is " + name);
        }

        // Creating a public method with int as argument
        public void method2(int n)  {
            System.out.println("The number is " + n);
        }

        // creating a private method
        private void method3() {
            System.out.println("Private method invoked");
        }
}
