import java.util.Scanner;
import java.util.Arrays;
public class scc{





//MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN

    public static void main(String[] args) {
        String space = "-";

/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        String l1 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l2 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l3 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l4 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l5 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l6 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l7 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l8 = sc.nextLine().substring(0, 8);
        System.out.println("");
        String l9 = sc.nextLine().substring(0, 8);
        String[] rawStrings = {l1,l2,l3,l4,l5,l6,l7,l8,l9};
        
        int[][] sudoku = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},};

        for(int j = 0; j<9; j++){
            String lineString = rawStrings[j];
            String[] line = lineString.split("");
            for(int i = 0; i<9; i++){
                String num = line[i];
                
                if((num.equals(space))){
                    sudoku[j][i] = 0;
                }
                else{
                    sudoku[j][i] = Integer.parseInt(num);
                }
            }
        }
*/
        //int num = Integer.parseInt(String.valueOf(let));

        int[][] sudoku = {{1,8,5,4,0,0,0,6,3},{9,6,0,0,0,0,0,0,5},{3,0,4,0,0,0,0,0,0},{0,0,0,0,8,0,0,0,0},{0,4,0,2,5,0,8,3,0},{8,2,7,0,1,0,0,4,0},{4,9,0,0,3,0,0,0,0},{0,0,0,0,0,0,2,0,0},{0,1,8,0,4,5,0,0,0},};


        Sudoku s = new Sudoku(sudoku);
        /*for(int i = 0;i<sudoku.length-1;i++){
            for(int j =0; j<sudoku[i].length-1;j++){
                System.out.println(s.findSquare(i,j)+": "+i+", "+j);
            }
        }*/

        System.out.println("      1    |    2    |    3    |    4    |    5    |    6    |    7    |    8    |    9");
        for(int i = 0; i < sudoku.length-1; i++){
            System.out.print((i+1)+" ");
            for(int j = 0; j < sudoku[i].length-1;j++){
                System.out.println("dd");
                if(sudoku[i][j]==0){
                    for(int num : s.cellCandidates(i, j)){
                        if(num!=0){
                            System.out.print(String.valueOf(num));
                        }
                        else if(num==0){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("|");
                    
                }
                else if(sudoku[i][j]!=0){
                    System.out.print("----"+sudoku[i][j]+"----|");
                }
            }
            System.out.println("");
        }
    }

//MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
}
