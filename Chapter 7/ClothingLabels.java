import java.util.ArrayList;
class ClothingLabels {
    public static void main(String[] args){
        String[] labels = {"blue shirt", "purple shirt", "yellow shirt"};
        System.out.println(String.join(", ",mark_invent(labels)));//personal preference 
    }
    static ArrayList<String> mark_invent(String[] l){
        ArrayList<String> marked = new ArrayList<>();
        for(String s : l){
            for(int i: new int[]{1,2,3,4,5,6}){
                marked.add(s+" size: "+ i);
            }
        }
        return marked;
    }
}
//Time complexity O(6N+1) --> O(N);
//(remove constants)

/*Output : blue shirt size: 1, blue shirt size: 2, blue shirt size: 3, blue shirt size: 4, blue shirt size: 5, blue shirt size: 6, 
purple shirt size: 1, purple shirt size: 2, purple shirt size: 3, purple shirt size: 4, purple shirt size: 5, purple shirt size: 6, 
yellow shirt size: 1, yellow shirt size: 2, yellow shirt size: 3, yellow shirt size: 4, yellow shirt size: 5, yellow shirt size: 6*/