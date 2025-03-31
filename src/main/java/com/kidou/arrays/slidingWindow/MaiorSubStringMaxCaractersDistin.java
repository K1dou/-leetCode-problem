package com.kidou.arrays.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaiorSubStringMaxCaractersDistin {
    // Dada uma string s e um inteiro k, retorna o comprimento da maior substring
    // que
    // contém no máximo k caracteres distintos.
    // Exemplo: s = "eceba", k = 2 -> "ece" tem comprimento 3
    public static int longestSubstringWithKDistinct(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int start = 0, maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) { // Se temos mais de `k` caracteres únicos, reduzimos a janela
                char leftChar = s.charAt(start);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0)
                    freq.remove(leftChar);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithKDistinct("eceba", 2)); // Output: 3
        System.out.println(longestSubstringWithKDistinct("aaabbcc", 2)); // Output: 5
    }

}
