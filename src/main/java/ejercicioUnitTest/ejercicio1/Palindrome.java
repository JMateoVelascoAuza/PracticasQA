package ejercicioUnitTest.ejercicio1;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String lowerCaseWord = word.toLowerCase();
        int lengthWord = lowerCaseWord.length();
        for (int i = 0; i < lengthWord / 2; i++) {
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(lengthWord - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
