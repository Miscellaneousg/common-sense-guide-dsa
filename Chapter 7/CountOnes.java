class CountOnes {
    public static void main(String[] java){
        int[][] ones = {{0,1,1,1,0},{0,1,0,1,0,1},{1,0}};
        int count = 0;
        for(int[] i: ones){
            for(int j: i){
                if(j==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
//Output : 7
//Time complexity   O(N+2) --> O(N) 
// (we iterate over every data element one single time + remove any constants).
