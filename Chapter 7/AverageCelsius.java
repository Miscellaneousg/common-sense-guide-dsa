import java.util.ArrayList;
class AverageCelsius{
    public static void main(String[] args){
        int[] temps  = {112,124,78,96,160};
        System.out.println(String.format("%.2f",averageCelsius(temps))); //personal preference 
    }
    static double averageCelsius(int[] t){
        ArrayList<Double> celsius = new ArrayList<>();
        int count = 0;
        double sum = 0;
        for(int i:t){
            double c = (i-32)/1.8;
            celsius.add(c);
            count++;
            sum+=c;
        }
        return (sum/count);
    }
}
//Output : 45.56 (little too hot btw ;-))
//Time complexity O(4N+4) --> O(N) (remove contstants).