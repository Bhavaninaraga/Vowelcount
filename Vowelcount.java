public class Vowelcount {
    public static void main(String[] args) {
        // Sample string
        String str = "hello world";
        
        // Function call to count vowels
        int vowelCount = countVowels(str);
        
        // Display the result
        System.out.println("The number of vowels in the string \"" + str + "\" is: " + vowelCount);
    }

    // Function to count vowels in the string
    public static int countVowels(String str) {
        int count = 0;
        // Convert string to lowercase to make comparison case-insensitive
        str = str.toLowerCase();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is a vowel
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

