public class VowelsInText {
    public static void main(String[] args) {
        String quote = "Do as you want others to do to you!";
        int count = 0;
        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == 'a' || quote.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("Vowels count: " + count);
    }
}
