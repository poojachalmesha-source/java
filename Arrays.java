public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 100;

        int luckyNos[] = { 12, 11, 2, 7, 8 };

        System.out.println(luckyNos[4]);
        System.out.println("The length is " + luckyNos.length);

        for (int i = 0; i < luckyNos.length; i++) {
            System.out.println(luckyNos[i]);
        }
    }
}
