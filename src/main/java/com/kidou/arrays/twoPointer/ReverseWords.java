package com.kidou.arrays.twoPointer;

public class ReverseWords {

    // Given a string s, reverse the order of characters in each word within a
    // sentence while still preserving whitespace and initial word order.

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int l = 0, r = 0;

        while (r < s.length()) {
            if (s.charAt(r) != ' ') {
                r++; // Avança o ponteiro 'r' até encontrar um espaço
            } else {
                res.append(new StringBuilder(s.substring(l, r)).reverse()).append(" ");
                r++; // Avança o ponteiro para a próxima palavra
                l = r; // Atualiza 'l' para o início da próxima palavra
            }
        }

        // Adiciona a última palavra invertida (pois ela não termina com espaço)
        res.append(new StringBuilder(s.substring(l, r)).reverse());

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // Saída: "s'teL ekat edoCteeL tsetnoc"
    }

}
