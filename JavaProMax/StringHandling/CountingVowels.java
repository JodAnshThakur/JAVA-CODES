package JavaProMax.StringHandling;

public class CountingVowels {
    public static void main(String[] args) {

        String string_check = "Ansh Thakur";
        string_check = string_check.toLowerCase();
        int count = 0;
        for (int i = 0; i < string_check.length(); i++) {
            if (string_check.charAt(i) == 'a' || string_check.charAt(i) == 'e' || string_check.charAt(i) == 'i'
                    || string_check.charAt(i) == 'o' || string_check.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total vowels in the string are --> " + count);
    }

}
