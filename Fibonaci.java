
package jurnal1;

import java.util.ArrayList;

public class Fibonaci {
    ArrayList<Integer> al = new ArrayList<>();
    
    public void performSumOfFibonaci(int i){
        int sum = 0;
        for (int j = 0; j < i; j++) {
            if ( j == 0 || j == 1){
                al.add(1);
                sum += 1;
                continue;
            }
            al.add(al.get(j-1)+al.get(j-2));
            sum += al.get(j);
        }
        
        System.out.println("" + sum);
        
    }
}
