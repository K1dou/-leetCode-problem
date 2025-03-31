package com.kidou.arrays.twoPointer;

class TwoSumSorted {

    // Given an array of integers numbers that is already sorted in non-decreasing
    // order, find two numbers such that they add up to a specific target number.
    // Return the indices of the two numbers (1-indexed) as an integer array answer
    // of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // Retorna os índices 1-indexed
            } else if (sum < target) {
                left++; // Move o ponteiro esquerdo para a direita
            } else {
                right--; // Move o ponteiro direito para a esquerda
            }
        }

        return new int[] { -1, -1 }; // Caso não encontre, retorna -1, -1 (não esperado)
    }

    public static void main(String[] args) {
        TwoSumSorted twoSum = new TwoSumSorted();
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum.twoSum(numbers, target);
        System.out.println("Os índices são: " + result[0] + ", " + result[1]); // Saída: Os índices são: 1, 2
    }
}