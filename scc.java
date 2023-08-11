import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class scc{





//MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN

    public static void main(String[] args) {
        String space = " ";
/*      Scanner sc = new Scanner(System.in);
        System.out.println("");
        String l1 = sc.nextLine();
        System.out.println("");
        String l2 = sc.nextLine();
        System.out.println("");
        String l3 = sc.nextLine();
        System.out.println("");
        String l4 = sc.nextLine();
        System.out.println("");
        String l5 = sc.nextLine();
        System.out.println("");
        String l6 = sc.nextLine();
        System.out.println("");
        String l7 = sc.nextLine();
        System.out.println("");
        String l8 = sc.nextLine();
        System.out.println("");
        String l9 = sc.nextLine();
        String[] rawStrings = {l1,l2,l3,l4,l5,l6,l7,l8,l9};
        */
//        int[][] sudoku = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},};
        int[][] sudoku = {{1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3},{4,4,4,4,4,4,4,4,4},{5,5,5,5,5,5,5,5,5},{6,6,6,6,6,6,6,6,6},{7,7,7,7,7,7,7,7,7},{8,8,8,8,8,8,8,8,8},{9,9,9,9,9,9,9,9,9},};

        /*for(int j = 0; j<9; j++){
            for(int i = 0; i<9; i++){
                String num = rawStrings[j].substring(i,i+1);
                if((num.equals(space))){
                    sudoku[j][i] = 0;
                }
                else{
                    sudoku[j][i] = Integer.parseInt(num);
                }
            }
        }*/

        //int num = Integer.parseInt(String.valueOf(let));
        



        System.out.println(Arrays.deepToString(sudoku));
        Sudoku s = new Sudoku(sudoku);

        
    }

//MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN


}
