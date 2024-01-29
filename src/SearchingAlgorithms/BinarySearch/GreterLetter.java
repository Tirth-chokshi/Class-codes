package SearchingAlgorithms.BinarySearch;

public class GreterLetter {

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        // find wheterh the array is sorted in ascendiing or descending
        boolean isAsc = letters[start] < letters[end]; // check whether the aray is asc or dec if asc = ture else des = false


        while (start <= end) {
            // step 1 - find mid element
            //int mid = (start +end) / 2; // might be possible that (start + end) exceed the range of int in java
            int mid = start + (end - start) / 2;

           if(target < letters[mid]){
               end= mid-1;
           } else {
               start = mid + 1;
           }
        }
        return letters[start  % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'b','c','e','g','f'};
        char target = 'b';
        System.out.println(new GreterLetter());
    }
}
        // return the index of smallest no that is greater then target number (>=target)