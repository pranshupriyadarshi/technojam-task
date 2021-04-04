import java.util.*;

    class Solution {
        public int uniqueMorseRepresentations(String[] words) {

            HashMap<String,String> morseMap = new HashMap<>(26);
                       String [] morseWords = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> uniqCode = new HashSet<>();
        String morse = "";
        int ind;

        for( int i = 0; i < words.length; i++ )
        {
            morse = "";
            for( int j = 0; j < words[i].length(); j++ )
            {
                ind = ((int)words[i].charAt(j)) - 97;
                morse += morseWords[ind];
            }
            uniqCode.add(morse);
        }

            return uniqCode.size();

        }
    }
