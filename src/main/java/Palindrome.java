import java.util.*;

public class Palindrome {

    public boolean wordIsPalindrome(String word) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(word);

        stringBuffer.reverse();
        String reversedWord = stringBuffer.toString();

        return word.equals(reversedWord);
    }

    public boolean wordIsPalindromeWithoutReverse(String word){
        int start = 0;
        int end = word.length() -1;
        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }

    public boolean sentenceIsPalindrome(String sentence){
        String wordWithNoSpaces = sentence.replaceAll("\\s", "");
        return wordIsPalindromeWithoutReverse(wordWithNoSpaces);
    }

    public String longestPalindromeInSentence(String sentence){
        String[] words = sentence.split("\\s");
        Arrays.sort(words);
        List<String> wordsArray = new LinkedList<String>(Arrays.asList(words));
        while(wordsArray.size() > 0){
            String word = wordsArray.get(0);
            if(wordIsPalindromeWithoutReverse(word)){
                return word;
            }
            wordsArray.remove(0);
        }
        return "";
    }

}
