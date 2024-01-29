package SearchingAlgorithms.LinearSearch;

public class Main {
    // serch in the array : return the index if item found
    // other if item not found return -1
    static int forInts(int[]arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // if none of the return works this line will execxute
        // Disclamier: -1 can be element of the array
        return -1;
    }

    // this method check if the :target: char is in the string or not based on that it will give true of false
    static boolean forString(String str , char target){
        if (str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
               return true;
            }
        }
        return false;
    }
    static int FindMin(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int EvenDigits(int[]arr){
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    //check whether the length of number is even or odd.
     static boolean even(int num) {
        int digitCounter = digit(num);
        return digitCounter %2 == 0; // if written statement after 'return' is true it will return true else false
     }
     static int digit(int num){
        if (num <0){ // this will check element is negative it will make it positive
            num = num * -1;
        }
         if(num == 0){
             return 1;
         }
        int count = 0;
         while (num>0){
             count++;
             num=num/10;
         }
         return count; // other short and complex way is " return (int) (Math.log10(num) + 1) " - number system converting binary ot base10
     }

    public static void main(String[] args) {
        int [] nums = {22,435,4,24,34,32,34,-1,23,-13,23};
        int target = -23;
        int ans = forInts(nums,target);
        //System.out.println(ans);

        String str = "Thomas";
        char target2 = 't';
        boolean ans2 = forString(str,target2);
        //System.out.println(ans2);
        //System.out.println(FindMin(nums));
        System.out.println(EvenDigits(nums));
    }
}