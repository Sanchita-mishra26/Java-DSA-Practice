package String;

public class largestString {

    // //lexicographic order
    //  str1.compareto(str2)
    //  equals to 0:equals
    //  <0:str1<str2
    //  >0:str1>str//comparetoignorecase treats A and  a equally

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest= fruits[i];
            }
        }
        System.out.println(largest);

    }

    
}
