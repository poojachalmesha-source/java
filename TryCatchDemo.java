public class TryCatchDemo {
    public static void main(String[] args) {
        int solution = 0;
        try {
            solution = 2 / 0;
            System.out.println(solution);
        } catch (Exception e) {
            System.out.println("Excpetion occured during division ");
        } finally {
            System.out.println("Clean up code executed here!");
        }
    }
}
