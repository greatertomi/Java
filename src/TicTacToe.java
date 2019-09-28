import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    public static String A1,A2,A3,B1,B2,B3,C1,C2,C3;
    public static int row, col;
    public static Scanner scan = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char turn = 'X';

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        play();
    }

    public static void play() {
        boolean playing = true;
        while(playing) {
            String move = scan.nextLine();
            ArrayList<Integer> moves = confirmMove(move);
            row = moves.get(0);
            col = moves.get(1);

            board[row][col] = turn;

            if (gameOver(row, col)) {
                playing = false;
                System.out.print("Game Over. Player "+ turn + " wins");
            }

            printBoard();

            if(turn == 'X')
                turn = 'O';
            else
                turn = 'X';

        }
    }

    public static ArrayList<Integer> confirmMove(String move) {
        ArrayList<Integer> moves = new ArrayList<>();
        if(move.equalsIgnoreCase("A1")){
            moves.add(0);
            moves.add(0);
        }
        else if(move.equalsIgnoreCase("A2")){
            moves.add(0);
            moves.add(1);
        }
        else if(move.equalsIgnoreCase("A3")){
            moves.add(0);
            moves.add(2);
        }
        else if(move.equalsIgnoreCase("B1")){
            moves.add(1);
            moves.add(0);
        }
        else if(move.equalsIgnoreCase("B2")){
            moves.add(1);
            moves.add(1);
        }
        else if(move.equalsIgnoreCase("B3")){
            moves.add(1);
            moves.add(2);
        }
        else if(move.equalsIgnoreCase("C1")){
            moves.add(2);
            moves.add(0);
        }
        else if(move.equalsIgnoreCase("C2")){
            moves.add(2);
            moves.add(1);
        }
        else if(move.equalsIgnoreCase("C3")){
            moves.add(2);
            moves.add(2);
        }
        else {
            moves.add(-1);
            moves.add(-1);
        }

        return moves;
    }



    public static void printBoard() {
        for (int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
    }

    public static boolean gameOver(int rMove, int cMove) {
        if(board[0][cMove] == board[1][cMove] && board[0][cMove] == board[2][cMove])
            return true;
        if(board[rMove][0] == board[rMove][1] && board[rMove][0] == board[rMove][2])
            return true;
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_')
            return true;
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_')
            return true;
        return false;
    }
}
