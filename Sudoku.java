import java.util.ArrayList;

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
        return sudoku[row-1];
    }
    public int[] Square(int square){
        int[] squareBox = {0,0,0,0,0,0,0,0,0};
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                squareBox[count] = sudoku[i + 3*(square%3 - 1)][j + 3*(countMultiples(square, 3))];
                count++;
            }
        }

        return squareBox;
    }
    public int countMultiples(int base, int subtractor){
        int count = 0;
        while(base>3){
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
        return (((row/3)*3)+(col/3 + 1));
    }

    public ArrayList<Integer> cellCandidates(int row, int col){
        ArrayList<Integer> candList = new ArrayList<>();
        candList.add(1);candList.add(2);candList.add(3);candList.add(4);candList.add(5);candList.add(6);candList.add(7);candList.add(8);candList.add(9);
        int[] r = Row(row);
        int[] c = Column(col);
        int[] s = Square(findSquare(row, col));
        for(int num : candList){
            if(checkForInColumn(num, col) || checkForInRow(num, row) || checkForInSquare(num, findSquare(row, col))){
                candList.remove(candList.indexOf(num));
            }
        }
        return candList;

    }

}
