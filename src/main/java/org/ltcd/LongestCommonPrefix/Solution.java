package org.ltcd.LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder finalWord = new StringBuilder();
        String shortest=strs[0];
        for(String word:strs) {
            if(shortest.length()>word.length()) {
                shortest = word;
            }
        }
        for(int i = 0; i<shortest.length(); i++){
            char potential = shortest.charAt(i);
            for(String word:strs){
                if(word.charAt(i) != potential){
                    return finalWord.toString();
                }
            }
            finalWord.append(potential);
        }
        return finalWord.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
