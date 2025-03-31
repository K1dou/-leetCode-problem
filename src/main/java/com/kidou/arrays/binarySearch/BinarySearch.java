package com.kidou.arrays.binarySearch;

public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int start = 0; // Inicializa o ponteiro esquerdo
        int end = nums.length - 1; // Inicializa o ponteiro direito

        while (start <= end) { // Enquanto o intervalo for válido
            int mid = start + (end - start) / 2; // Calcula o índice do meio

            if (nums[mid] == target) {
                return mid; // Encontrou o alvo, retorna o índice
            }
            if (nums[mid] < target) {
                start = mid + 1; // O alvo está à direita
            } else {
                end = mid - 1; // O alvo está à esquerda
            }
        }

        return -1; // Não encontrou o alvo
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = bs.binarySearch(nums, target);
        System.out.println("O índice do alvo " + target + " é: " + result); // Saída: O índice do alvo 3 é: 2
    }
}
