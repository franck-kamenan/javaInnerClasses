package be.intecbrussel.javaInnerClasses;

import be.intecbrussel.javaInheritance.MyCar;
import be.intecbrussel.javaPolymorphism.MyAnimal;
import be.intecbrussel.javaPolymorphism.MyDog;
import be.intecbrussel.javaPolymorphism.MyPig;

public class MyMain
{
    public static void main(String[] args)
    {
        MyClass myOuter = new MyClass();
        MyClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.b + myOuter.a);
        MyClass.StaticInnerClass myStatic = new MyClass.StaticInnerClass();
        System.out.println(myInner.b + myOuter.a + myStatic.c);
    }


}
