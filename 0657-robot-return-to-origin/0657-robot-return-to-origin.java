class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0 ; // for left and right moves
        int y = 0 ; // for up and down moves

        for(int i=0 ; i<moves.length() ; i++){
            char c = moves.charAt(i);

            if(c == 'U') y++;

            else if(c == 'D') y--;

            else if(c == 'R') x++;

            else x--;
        }

        if(x == 0 && y == 0) return true;

        else  return false;
    }
}