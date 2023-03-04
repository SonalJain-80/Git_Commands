package javatraining;

/*class Shape {
    public void getArea(int r) {
        System.out.println(Math.PI*r*r);
    }

    public void getArea(int a, int b) {
        System.out.println(a*b);
    }
}*/

class Base2 {
    void fun() {
        System.out.println("Base::fun");
    }

    Number method() {
        System.out.println("Number return type");
        return 2;
    }
}

class Derived extends Base2 {

    @Override
    void fun() {
        System.out.println("Derived::fun");
    }

    @Override
    Integer method() {
        System.out.println("Integer return type");
        return 5;
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        /*Shape shape = new Shape();
        shape.getArea(5);*/
        Base2 base = new Base2();
        base.fun();

        Derived d = new Derived();
        d.fun();
        d.method();

        Base2 b = new Derived();
        b.fun();
        b.method();
    }
}
