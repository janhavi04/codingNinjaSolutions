/**
 * HighestORLowestFrequencyElements
 */
import java.util.*;
public class HighestORLowestFrequencyElements {

    public static void main(String[] args) {
        int[] arr = { 11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3 };
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (map.containsKey(key)) {
                freq = map.get(key);
            }
            freq++;
            map.put(key, freq);
        }
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {

            System.out.println(it.getKey() + " -> " + it.getValue());
            int count = it.getValue();
            int element = it.getKey();
            if(count == maxFreq && element < maxEle ){
                maxEle = element;
            }
            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if(count == minFreq && element < minEle ){
                minEle = element;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;

            }

        }
        int[] a = { maxEle, minEle };
        for (int x : a) {
            System.out.print(x + " ");
        }

    }
}