package javatraining;

class Base {
    public Base() {
        System.out.println("Base constructor");
    }

    public Base(String str) {
        System.out.println(str + " in parameterised constructor");
    }

    void fun() {
        System.out.println("Base::fun()");
    }

    void fun1() {
        System.out.println("Base::fun1()");
    }

    void fun2() {
        System.out.println("Base::fun2()");
    }
}

class Child extends Base {
    public Child() {
        // super("Hello");
        System.out.println("Child constructor");
        fun1();
        System.out.println("-----------------");
        this.fun1();
    }

    void fun1() {
        System.out.println("Child::fun1()");
        //fun2(); //or super.fun2()
    }
}

public class JavaTraining {
    public static void main (String[] args) {
        Child child = new Child();
        //child.fun1();
        //child.fun();
    }
}
