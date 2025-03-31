package com.kidou.arrays.twoPointer;

public class CheckIfStringIsPrefixOfArray {

    /// Given a string s and an array of strings words, check if s is a prefix
    /// string of words.
    /// A string s is a prefix of an array words if there exists a number k such
    /// that

    public boolean isPrefixString(String s, String[] words) {

        int i = 0; // Ponteiro para percorrer s

        for (String word : words) {

            for (char c : word.toCharArray()) {

                if (i == s.length() || s.charAt(i) != c) {
                    return false; // Se `s` já terminou ou um caractere não bate, não é prefixo
                }
                i++; // Avança em `s`
            }

            if (i == s.length()) {
                return true; // Se terminamos `s`, já sabemos que `s` é prefixo
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfStringIsPrefixOfArray solution = new CheckIfStringIsPrefixOfArray();
        String s = "iloveleetcode";
        String[] words = { "i", "love", "leet", "code", "apples" };
        System.out.println(solution.isPrefixString(s, words)); // Output: true
    }

}
