public class ClassObjectDemo {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        System.out.println(obj.num);
        obj.num = 20;
        System.out.println("After num change " + obj.num);

        obj.printHi();
        System.out.println(obj.getName());

        Demo1 obj2 = new Demo1();
        System.out.println(obj2.num);
    }
}

class Demo1 {
    int num = 10;

    void printHi() {
        System.out.println("Hello");
    }

    String getName() {
        return "Sam";
    }
}
