import java.util.ArrayList;
class Word_builder{
    public static void main(String[] args){
        String[] arr = {"a","b","c","d"};
        System.out.println(build(arr));
    }
    static String build(String[] a){
        ArrayList<String> s = new ArrayList<>();
        for(String i : a){
            for(String j: a){
                if(!i.equals(j)){
                    s.add(i+j);
                }
            }
        }
        String x = String.join(", ",s);//personal preference 
        return x;
    }
}
//Output : ab, ac, ad, ba, bc, bd, ca, cb, cd, da, db, dc
//Time complexity O(N*2N+1) --> 0(N^2).
//(remove any constants).