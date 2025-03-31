package com.kidou.arrays.slidingWindow;

public class MinSubArrayLen {

    // with two pointers

    public int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int start = 0, end = 0, currentSum = 0;

        while (end < nums.length) {
            // Expande a janela até atingir ou ultrapassar target
            while (end < nums.length && currentSum < target) {
                currentSum += nums[end];
                end++;
            }

            // Reduz a janela para minimizar o tamanho
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start);
                currentSum -= nums[start];
                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    // Código de teste
    public static void main(String[] args) {
        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minSubArrayLen.minSubArrayLen(target, nums)); // Saída esperada: 2
    }

}
