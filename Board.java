/**
 * Created by mobee on 3/11/2016.
 */
public class Board {

    private static String board[][];
    private int queens;

    public Board(){
        queens = 0;
        board = new String [8][8];
        for(int j = 0; j < 8; j++){
            for (int k  = 0; k < 8; k++){
                board[j][k]= "-";
            }
        }
    }






    public int getQueens(){
        return queens;
    }

    public void start(){

        solve(0);

    }

    public boolean solve(int queens){


        if(queens == 8){
            System.out.println("Done");
            this.printBoard();
            return true;
        }

        else {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if (validMove(j, k) == 0) {
                        this.placeQueen(j, k, "-");
                        queens++;
                        if (solve(queens)) {
                            return true;
                        } else {
                            this.placeQueen(j, k, "Q");
                            queens--;
                        }
                    }
                }
            }
        }

           return false;
    }

    public static int validMove(int x, int y){
        for (int j = 0; j < 8; j++){
            if (get(x,j) == "Q"){
                return -1;
            }
            if (get(j,y)== "Q"){
                return -1;
            }
        }

        for (int j = 0; j < 8; j++) {
            if (get(x - j, y - j) == "Q") {

                return -1;
            }
            if (get(x + j, y - j) == "Q") {

                return -1;
            }
            if (get(x - j, y + j) == "Q") {

                return -1;
            }
            if (get(x + j, y + j) == "Q") {

                return -1;
            }
        }
            return 0;
    }

    public int placeQueen(int x, int y, String type){

        if (type == "-"){
            board[x][y] = "Q";
            queens++;
            return 0;
        }

        else if(type == "Q"){
            board[x][y]= "-";
            return 0;
        }

        System.out.println("NOPE!!!");
        return -3;

    }

    public static String get (int x, int y){

        if(x < 0 || y < 0 || x > 7 || y > 7){
            return "hi";
        }

        return board[x][y];
    }

    public void printBoard(){

        for (int j = 0; j < 8; j++){
            for (int k = 0; k<8; k++){
                System.out.print(this.get(j,k) + " ");
            }
            System.out.println("");
        }

    }

}
