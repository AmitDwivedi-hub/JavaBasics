package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UseReflection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        // Creating object whose property is to be checked
        ReflectionDemoClass rdm=new ReflectionDemoClass();

        // Creating class object from the object using
        // getclass method
        Class cls=rdm.getClass();
        System.out.println("Name of the class is: "+cls.getName());

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor=cls.getConstructor();
        System.out.println("Name of the constructor is: "+constructor.getName());


        // Getting methods of the class through the object
        // of the class by using getMethods

        //cls.getDeclaredMethods();  --> returns method directly declared in the class
        //cls.getMethods();  -->returns all declared and inherited methods
        Method[] methods= cls.getDeclaredMethods();
        System.out.println("All methods present in class "+cls.getName()+ " are:");
        for (Method method:methods) {
            System.out.println(method.getName());
        }

        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
        Method method2=cls.getMethod("method2",int.class);

        // invokes the method at runtime
        method2.invoke(rdm,5);

        // creates object of the desired field by providing
        // the name of field as argument to the
        // getDeclaredField method
        Field field=cls.getDeclaredField("name");

        // allows the object to access the field irrespective
        // of the access specifier used with the field
        field.setAccessible(true);

        // takes object and the new value to be assigned
        // to the field as arguments
        field.set(rdm,"Amit");

        // Creates object of desired method by providing the
        // method name as argument to the getDeclaredMethod
        Method method1=cls.getDeclaredMethod("method1");

        // invokes the method at runtime
        method1.invoke(rdm);

        // Creates object of the desired method by providing
        // the name of method as argument to the
        // getDeclaredMethod method
        Method method3=cls.getDeclaredMethod("method3");

        // allows the object to access the method irrespective
        // of the access specifier used with the method
        method3.setAccessible(true);

        // invokes the method at runtime
        method3.invoke(rdm);
    }

    }

