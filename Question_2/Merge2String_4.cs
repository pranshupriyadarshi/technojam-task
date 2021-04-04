public class Solution {
    public string MergeAlternately(string word1, string word2) {
     
         string s = "" ;
        for(int i = 0; i< word1.Length || i< word2.Length; i++)
        {
            if(i < word1.Length)
             s = s+word1[i]; 
            if(i < word2.Length)
             s = s+word2[i];   
        }
        return s;
    }
}
