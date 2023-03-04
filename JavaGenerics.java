package javatraining;

class AddValue<T> {
    private T obj1;
    private T obj2;

    public AddValue(T obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void addValue() {
        if(obj1.getClass() == String.class && obj2.getClass() == String.class) {
            System.out.println("String Data");
            System.out.println((String) obj1 +  obj2);
        }
        else {
            System.out.println("Integer Data");
            System.out.println((Integer) obj1 + (Integer) obj2);
        }
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        AddValue<Integer> addVal = new AddValue<>(10,11);
        addVal.addValue();

        AddValue<String> addVal2 = new AddValue<>("Hello"," peeps");
        addVal2.addValue();
    }
}
