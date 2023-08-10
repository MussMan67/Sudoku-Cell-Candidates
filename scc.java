import java.util.Scanner;

public class scc{





//MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN

    public static void main(String[] args) {
        String space = " ";
        Scanner sc = new Scanner(System.in);
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
        
        int[][] sudoku = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},};

        for(int j = 0; j<8; j++){
            for(int i = 0; i<8; i++){
                String num = rawStrings[j].substring(i,i+1);
                if((num.equals(space))){
                    sudoku[j][i] = 0;
                }
                else{
                    sudoku[j][i] = Integer.parseInt(num);
                }
            }
        }

        //int num = Integer.parseInt(String.valueOf(let));

        System.out.println(sudoku);
        System.out.println();
    }

//MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN

    public int[] Column(int col, int[][] sudoku){
        int[] c = {0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<9;i++){
            c[i] = sudoku[i][col];
        }
        return c;
    }
    public int[] Row(int row, int[][] sudoku){        
        return sudoku[row-1];
    }
    public int[] Square(int square, int[][] sudoku){
        int[] squareBox = {0,0,0,0,0,0,0,0,0};
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; i++){
                squareBox[count] = sudoku[i + square%3 - 1][j + countMultiples(square, 3) - 1];
            }
        }

        return squareBox;
    }
    public int countMultiples(int base, int subtractor){
        int count = 0;
        while(base>=0){
            base-=subtractor;
            count++;
        }
        return count;
    }


}
