package _DSA_PRACTICE_QUES;

public class Ques8_SubStringCheck {
    public static void main(String[] args) {
        String check = "Ansh Thakur";
        String substring = "sh";
        for (int i = 0; i < substring.length(); i++) {
            for (int j = 0; j < check.length(); j++) {
                if (check.charAt(i) == substring.charAt(j)) {
                    if (check.charAt(i + 1) == substring.charAt(j + 1)) {
                        System.out.println("Substring Exists.");
                    }
                }
            }
        }
    }

}
