
package Arrays;
public class DistinctEle {
    public static void distinctEle(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println("Duplicate element found: " + numbers[i]);
                }   
                else{
                    System.out.println("Distinct element: " + numbers[i]);
                }
        }
    }
    
}

    public static void main(String args[]){
        int numbers[] = {1,2,3,4,2,3,5,1,6,7};
        distinctEle(numbers);
    }
}
