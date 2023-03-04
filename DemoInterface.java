package javatraining;

public interface DemoInterface {
    int VALUE=10;

    int meth();

    default int fun() {
        return 6;
    }
}
