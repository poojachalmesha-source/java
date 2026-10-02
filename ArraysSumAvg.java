public class ArraysSumAvg {
    public static void main(String[] args) {
        int luckyNos[] = { 12, 11, 2, 7, 8 };
        int sum = 0;
        for (int i = 0; i < luckyNos.length; i++) {
            sum = sum + luckyNos[i];
        }

        int avg = sum / luckyNos.length;

        System.out.println("sum :" + sum + " avg: " + avg);
    }
}
