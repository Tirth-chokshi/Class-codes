package Array_ArrayList;

public class practice2 {
    public static void main(String[] args) {
        int[][] mar1 = {{1,2,3},
                        {4,5,6}};
        int[][] mar2 = {{9,2,5},
                        {6,5,61}};
        int[][] result= {{0,0,0},
                        {0,0,0}};

        for(int row=0;row< mar1.length;row++) { // row number of times
            for (int col=0;col< mar1[row].length;col++) { // column number of line
                System.out.format("setting the value for row=%d and col=%d\n",row,col);
                result[row][col] = mar1[row][col] + mar2[row][col];
            }
        }

        // Printing the elements of 2-D array
        for (int i=0;i< mar1.length;i++) { // row number of times
            for (int j = 0; j < mar1[i].length; j++) { // column number of line
                System.out.print(result[i][j] + " ");
                result[i][j] = mar1[i][j] + mar2[i][j];
            }
            System.out.println(" "); // Prints a new line
        }
    }
}
