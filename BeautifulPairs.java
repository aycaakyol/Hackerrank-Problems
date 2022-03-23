import java.util.ArrayList;
import java.util.Collections;                // didnt pass all the test cases
import java.util.List;

public class BeautifulPairs {
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        int count = 0;
        Collections.sort(A);
        Collections.sort(B); 
        int pointer1 = 0; int pointer2 = 0;
        
        for(int i = 0; i < A.size(); i++) {
            if(pointer2 == A.size()) {
                pointer2 = 0;
            }
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j) && j >= pointer2) {
                    count++;
                    pointer2++;
                    break;
                } 
            }
        }

        if(count != A.size()) {
            return count+1;
        }

        return count;
    }  
    
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(11);
        l1.add(5);
        l1.add(8);
        l2.add(5);
        l2.add(7);
        l2.add(11);
        l2.add(10);
        l2.add(5);
        l2.add(8);
        System.out.println(beautifulPairs(l1, l2));
    }
}
