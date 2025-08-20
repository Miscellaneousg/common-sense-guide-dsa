import java.util.*;
class Intersection{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {0,2,4,6,8};
        System.out.println(intersect(a,b));
    }
    static List<Integer> intersect(int[] set, int[] subset){ 
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int i = 0;i<set.length;i++){
            map.put(set[i], true);
        }
        for(int i = 0;i<subset.length;i++){
            if(map.containsKey(subset[i])){
                list.add(subset[i]);
            }
        }
        return list;
    }
}
//Description : function that retruns intersection of two arrays
//Q1 - Page 131 - exercises
//Output : [2, 4] 
//Save the set values in the map and then iterate over the alleged subset

