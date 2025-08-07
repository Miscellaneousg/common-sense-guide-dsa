class Average_of_even_numbers{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(average(a));
    }
    public static int average(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i: arr){
            if(i%2==0){
                sum+=i;
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        int average = sum/count;
        return average;
    }
}  
//Output : 4
//Time complexity O(3N+3) --> O(N). (remove constants).
