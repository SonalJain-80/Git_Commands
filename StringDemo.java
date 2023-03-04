package javatraining;

public class StringDemo {
    public static void main(String[] args) {
        String str="Hello";
        String st1="Hello";
        st1.concat(" ols"); // but  st1=st1.concat(" ols"); will work
        System.out.println(str.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(str==st1);
        String st2=new String("Hello");  //it does not check if "Hello" is present in string pool or not, it creates a new string "Hello"
        System.out.println(st1.hashCode());
        System.out.println(str==st2);
    }
}
