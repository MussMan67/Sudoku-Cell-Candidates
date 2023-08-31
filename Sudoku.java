import java.util.Arrays;

public class Sudoku {
    private int[][] sudoku;
    public Sudoku(int[][] sudoku){
        this.sudoku = sudoku;
    }

    public int[] Column(int col){
        int[] c = {0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<9;i++){
            c[i] = sudoku[i][col];
        }
        return c;
    }

    public int[] Row(int row){        
        return sudoku[row];
    }
    public int[] Square(int square){
        int[] squareBox = {0,0,0,0,0,0,0,0,0};
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                squareBox[count] = sudoku[i + 3*(countMultiples(square, 3))][j + 3*(square%3)];
                count++;
            }
        }
        return squareBox;
    }
    public int countMultiples(int base, int subtractor){
        int count = 0;
        while(base>2){
            base-=subtractor;
            count++;
        }
        return count;
    }

    public boolean checkForInColumn(int num, int col){
        for(int cell : Column(col)){
            if(cell == num){
                return true;
            }
        }
        return false;
    }

    public boolean checkForInRow(int num, int row){
        for(int cell : Row(row)){
            if(cell == num){
                return true;
            }
        }
        return false;
    }

        public boolean checkForInSquare(int num, int square){
        for(int cell : Square(square)){
            if(cell == num){
                return true;
            }
        }
        return false;
    }

    public int findSquare(int row, int col){
        return (((row/3)*3)+(col/3 + 1)-1);
    }

    public int[] cellCandidates(int row, int col){
        int[] candList = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for(int num = 1; num<10;num++){
            if(checkForInColumn(num, col) || checkForInRow(num, row) || checkForInSquare(num, findSquare(row, col))){
                candList[count]=0;
            }
            /*if(checkForInSquare(num, findSquare(row, col))){
                System.out.println(num+": "+row+", "+col);
                System.out.println((findSquare(row, col)));
            }*/
            count++;
        }
        Arrays.sort(candList);
        return (candList);
    }

}
