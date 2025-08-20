import java.util.*;
public class FirstNonDuplicated {
    public static void main(String[] args){
        String s = "minimum";
        System.out.println("First non duplicate: "+"\'"+find(s)+"\'");

    }
    static String find(String s){
        s = s.replaceAll("\\s+","").toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(char i: s.toCharArray()){
            if(map.get(i)==1){
                return String.valueOf(i);
            }
        }
        return "No non-duplicate found";
    }
}
//Description: function that returns the first non duplicated character in a string
//Output: First non duplicate: 'n'
//Map the complete string to HashMap and count occurrences and then return the first character that doesn't repeat.