import java.util.HashMap;
public class MissingLetter{
    public static void main(String[] args){
        String s = "the quick brown box jumps over a the lazy dog";
        System.out.println("Missing: "+find(s));
    }
    static String find(String s){
        s = s.replaceAll("\\s+", "").toLowerCase();
        HashMap<String, Boolean> map = new HashMap<>();
        for(int c = 0; c<s.length();c++){
            map.put(String.valueOf(s.charAt(c)),true);
        }
        for(char c = 'a'; c<='z';c++){
            if(!map.containsKey(String.valueOf(c))){
                return String.valueOf(c);
            }
        }
        return "All present";
    }
}
/*Description: function that accepts a string that contains all the letters of the alphabet
except one*/
//Output: Missing: f
//Map the values of the string in HashMap and then check with all the letters of the alphabet