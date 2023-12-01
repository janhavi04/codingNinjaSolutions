import java.util.HashMap;

/**
 * Count_Frequency_in_a_range
 */
public class Count_Frequency_in_a_range {

    public static void main(String[] args){
        int [] arr = {1,3,4,3,4,1};
            int n = arr.length;
            int x = 4;

            HashMap <Integer,Integer> map = new HashMap<>();

            for(int i =0;i<n;i++){
                int key = arr[i];
                int freq =0;
                if(map.containsKey(key)){
                    freq = map.get(key);
                }
                freq++;
                map.put(key,freq);
            
            }

            int [] s = new int[n];
            for(int i =1; i <=n;i++){
                if(map.containsKey(i)){
                    s[i-1] = map.get(i); 
                }
                else
                    s[i-1] = 0;
            }
            for(int a :s){
            System.out.print(a + " ");
            }
            
    }
}