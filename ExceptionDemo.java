package javatraining;

class NotAValidatorException extends RuntimeException {
    public NotAValidatorException() {
    }

    public NotAValidatorException(String s) {
        super(s);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int[] a = new int[10];
        try {
            System.out.println(a[12]);
            //int z= x/y;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
            e.printStackTrace(System.out);  //Behaves unusual if u use e.printStackTrace() when u run normally because it takes a bit of time to flush the string, but when u run it in debug mode, since u execute step by step,it works as expected
        }
        System.out.println("BYEEEE");

        int age = 15;
        if (age < 18) throw new NotAValidatorException("Age less than 18");
    }
}
