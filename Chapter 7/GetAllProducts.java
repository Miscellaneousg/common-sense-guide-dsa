import java.util.ArrayList;
import java.util.*;
class GetAllProducts {
    public static void main(String[] args){
        int[] nums = {1,5,6,8,9};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                list.add(nums[i]*nums[j]);
            }
        }
        System.out.println(list);
    }
    
}
//Output : [5, 6, 8, 9, 30, 40, 45, 48, 54, 72]
//Time complexity : N + (N - 1) + (N - 2) + (N - 3)... + 1 is equivalent to N2 / 2
//But because Big O ignores constants, we express this as O(N2) 
//(remove any constants).