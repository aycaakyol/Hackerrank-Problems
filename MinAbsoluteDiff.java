import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAbsoluteDiff {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int result = 0;

        Collections.sort(arr);
        int[] l = new int[arr.size()-1];

        for(int i = 0; i <= arr.size()-1; i++) {
            l[i] = Math.abs(arr.get(i)-arr.get(i+1));
        }

        Arrays.sort(l);
        result = l[0];

        return result;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(-7);
        l.add(0);
        System.out.println(minimumAbsoluteDifference(l));
    }
}
