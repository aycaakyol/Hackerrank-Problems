import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        char[] res1 = new char[grid.size()];
        char[] res2 = new char[grid.size()];
        for(int i = 0; i < grid.size(); i++) {
           char[] arr = grid.get(i).toCharArray();
           Arrays.sort(arr);
           res1[i] = arr[0];
           res2[i] = arr[arr.length-1];
        }

        for(int i = 0; i < res1.length-1; i++) {
            if(Character.compare(res1[i], res1[i+1]) > 0 || Character.compare(res2[i], res2[i+1]) > 0) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("kc");
        l1.add("iu");
        List<String> l2 = new ArrayList<>();
        l2.add("uxf");
        l2.add("vof");
        l2.add("hmp");
        System.out.println(gridChallenge(l1));
        System.out.println(gridChallenge(l2));
    }
}
