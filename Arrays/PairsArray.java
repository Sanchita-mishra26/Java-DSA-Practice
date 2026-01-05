package Arrays;

public class PairsArray {
    
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr=numbers[i];
            for(int j=0; j<numbers.length; j++){
                System.out.print("(" + curr+ "," + numbers[j] + ") ");
            }
            System.err.println();
        }
    }
        public static void main(String args[]){

            int numbers[] = {2,3,4,5,6};
            printPairs(numbers);
    }
}
