public class AbstractionDemo {
    public static void main(String[] args) {
        ImplementCal cal = new ImplementCal();
        cal.calculate(10, 20);
    }
}

abstract class Calc1 {
    abstract void calculate(int a, int b);
}

class ImplementCal extends Calc1 {
    void calculate(int a, int b) {
        System.out.println(a + b);
    }
}
