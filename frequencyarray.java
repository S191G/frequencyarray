import java.util.HashMap;

public class frequencyarray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 5, 2, 2, 8, 9};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display results
        System.out.println("Element Frequency:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("Element " + key + " occurs " + frequencyMap.get(key) + " times");
        }
    }
}