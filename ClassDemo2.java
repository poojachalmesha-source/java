public class ClassDemo2 {
    public static void main(String[] args) {
        Student st2 = new Student(23, 312, "AI");
        System.out.println(st2.dept);
    }
}

class Student {
    int name;
    int rollNo;
    String dept;

    Student(int name, int rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }
}
