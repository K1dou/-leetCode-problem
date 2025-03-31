package com.kidou.arrays.slidingWindow;

public class MaxSumSubArray {

    /// Dado um array de inteiros e um inteiro k, retorna a soma máxima de qualquer
    /// subarray de tamanho k.
    static int maxSum(int arr[], int n, int k) {

        if (n < k) {
            System.out.println("Entrada inválida");
            return -1;
        }

        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k]; // Remove o primeiro e adiciona o próximo
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

}
