import java.util.*;
class Duplicate {
    public static void main(String[] args){
        String[] s = {"a","b","c","d","c","e","f"};
        System.out.println("Duplicate String : "+firstDuplicate(s));
    }
    static String firstDuplicate(String[] s){
        HashMap<String,Boolean> map = new HashMap<>();
        for(String S: s){
            if(map.containsKey(S)){
                return S;
            }
            map.put(S,true);
        }
        return "Not found";
    }
}
/*Description: function that accepts an array of strings and returns the first
duplicate value it finds*/
//Q2 - Page 131 - exercises
//Output : Duplicate String : c
//Map String objects to HashMap and return the string if already present
