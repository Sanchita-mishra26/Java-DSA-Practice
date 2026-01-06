package Arrays;

public class PrefixSum {
    public static void prefixSum(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

//prefix array
prefix[0] = numbers[0];
for(int i=1; i<prefix.length; i++){
    prefix[i] = prefix[i-1] + numbers[i];
}

//subarray sum
for(int i=0; i<numbers.length; i++){
    int start=i;
    for(int j=i; j<numbers.length; j++){
        int end=j; //index of end
        currSum=0; //initialize currSum to 0

        currSum = start==0? prefix[end] : prefix[end] - prefix[start -1]; //if start is 0 then just prefix[end] else subtract prefix[start-1] from prefix[end]
        if(maxSum<currSum){
            maxSum=currSum;
        }
    }
}
System.err.println("max sum is: " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        prefixSum(numbers);
    }
    
}
