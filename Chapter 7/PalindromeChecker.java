class PalindromeChecker {
    public static void main(String[] args){
        String[] s = {"rofl", "lol", "rizz","kayak","deified","racecar"};
        for(String S: s){
            System.out.print(isPalin(S)+", ");
        }
    }
    static int isPalin(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
}
//Output : 0, 1, 0, 1, 1, 1, 
//Time complexity O(2(N/2) + 2) --> O(N).
//(remove any constants).
