import org.junit.Test;


public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    static String VALID_PALINDROME = "hannah";
    static String INVALID_PALINDROME = "aardvark";
    static String VALID_SENTENCE_PALINDROME = "a nut for a jar of tuna";
    static String SENTENCE_WITH_PALINDROME_IN = "hello hannah how are you";
    static String SENTENCE_WITH_NO_PALINDROME = "well hello there this sentence doesnt contain palindromes";

    @Test
    public void isValidPalindrome(){
        boolean isPalindrome = palindrome.wordIsPalindrome(VALID_PALINDROME);
        assert(isPalindrome);
    }

    @Test
    public void isntPalindrome(){
        boolean isPalindrome = palindrome.wordIsPalindrome(INVALID_PALINDROME);
        assert(!isPalindrome);
    }

    @Test
    public void isValidPalindromeSentence(){
        boolean isPalindrome = palindrome.sentenceIsPalindrome(VALID_SENTENCE_PALINDROME);
        assert(isPalindrome);
    }

    @Test
    public void isPalindromeWithoutReverse(){
        boolean isPalindrome = palindrome.wordIsPalindromeWithoutReverse(VALID_PALINDROME);
        assert(isPalindrome);
    }

    @Test
    public void isntPalindromeWithoutReverse(){
        boolean isPalindrome = palindrome.wordIsPalindromeWithoutReverse(INVALID_PALINDROME);
        assert(!isPalindrome);
    }

    @Test
    public void findLongestWordInPalindrome(){
        String longestPalindrome = palindrome.longestPalindromeInSentence(SENTENCE_WITH_PALINDROME_IN);
        assert(longestPalindrome.equals(VALID_PALINDROME));
    }

    @Test
    public void findLongestWordInPalindromeWithNoPalindrome(){
        String longestPalindrome = palindrome.longestPalindromeInSentence(SENTENCE_WITH_NO_PALINDROME);
        System.out.println(longestPalindrome);
        assert(longestPalindrome.equals(""));
    }
}
