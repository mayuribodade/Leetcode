class Solution {
    public List<List<String>> solveNQueens(int n) {
         // This will store all valid board configurations
        List<List<String>> solution = new ArrayList<>();

        //creating new 2d array empty array
       char[][] board = new char[n][n];

         // Initialize the board with '.' (means empty cell)
         for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                board[i][j] = '.';
            }
         }
         //call function
           nQueens(board , 0 , solution) ;

         return solution ; //calling 2D array list which we made above with all upadates by nQueen f^n
    }


        //core logic of Nqueens

        public void nQueens(char[][] board , int row , List<List<String>> solution){
            if(row == board.length){
                solution.add(boardlist(board));
                return;
            }

            for(int j=0 ; j<board.length ; j++){
                if(isSafe(board , row ,j)){
                    board[row][j] = 'Q';
                    nQueens(board , row+1 ,solution);
                    //remaining places fill with . 
                    board[row][j] = '.'; //backtrack
                }
            }
        }

          //print function
       // Converts the 2D board into List<String> format 
       public List<String>boardlist (char[][] board){

        // List to store each row as a string
        List<String> list = new ArrayList<>();

        //now traverse each row
        for(int i=0 ; i<board.length ; i++){

            // Convert the current row (char array) into a String
            list.add (new String(board[i]));
        }
            return list;//in string formate
       }
       
       
       
        //safe function
        public boolean isSafe(char[][] board , int row ,int col){
           //vertical up condition check check cell(i-1 , j) clear or not
           
           for(int i=row-1 ; i>=0 ; i--){
             if(board[i][col] == 'Q'){
              return false;
               }
           }
           //diagonal right condition
           for(int i=row-1 , j= col+1 ; i>=0 && j<board.length ; i-- ,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
           }
        //diagonal left condition
           for(int i=row-1 , j= col-1 ; i>=0 && j>=0 ; i-- ,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
           }
          return true;
        }
}