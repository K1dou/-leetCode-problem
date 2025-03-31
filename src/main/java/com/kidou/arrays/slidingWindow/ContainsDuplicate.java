package com.kidou.arrays.slidingWindow;

import java.util.HashMap;

public class ContainsDuplicate {

    // Given an integer array nums and an integer k, return true if there are two
    // distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
    // - j) <= k.

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Mapa para armazenar o índice mais recente de cada número
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Se o número já foi visto e a diferença de índices for <= k
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true; // Encontrou uma duplicata dentro da distância k
            }
            // Atualiza o índice mais recente do número
            map.put(nums[i], i);
        }

        // Se não encontrar nenhuma duplicata dentro da distância k
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(cd.containsNearbyDuplicate(nums, k)); // Saída: true

        String s = "abcabcbb";

    }
}
