import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    public static String A1,A2,A3,B1,B2,B3,C1,C2,C3;
    private static Scanner scan = new Scanner(System.in);
    private static char[][] board = new char[3][3];
    private static char turn = 'X';
    private static int currentPlayer = 1;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        play();
    }

    private static void play() {
        boolean playing = true;
        while(playing) {
            int row, col;
            System.out.printf("Player %d, enter your move: ", currentPlayer);
            String move = scan.nextLine();
            ArrayList<Integer> moves = confirmMove(move);

            row = moves.get(0);
            col = moves.get(1);
            while(row == -1 || col == -1) {
                System.out.print("Invalid move. Try again: ");
                move = scan.nextLine();
                moves = confirmMove(move);

                row = moves.get(0);
                col = moves.get(1);
            }
            board[row][col] = turn;

            if (gameOver(row, col)) {
                playing = false;
                System.out.print("Game Over. Player "+ turn + " wins");
            }

            printBoard();

            if(turn == 'X') {
                currentPlayer = 2;
                turn = 'O';
            }
            else {
                currentPlayer = 1;
                turn = 'X';
            }
        }
    }

    // Method responsible for adding "X's" and "O's" to the 'moves' array. 
    // Helps avoid repetition in the 'confirmMove' method and passes a return value when 
    // called in confirmMove() which confirmMove() returns in turn.

    private static ArrayList<Integer> addMove(int x, int y) {
        ArrayList<Integer> moves = new ArrayList<>();

        moves.add(x);
        moves.add(y);

        return moves;
    }

    private static ArrayList<Integer> confirmMove(String move) {
        ArrayList<Integer> moves = new ArrayList<>();

        if(move.equalsIgnoreCase("A1") & board[0][0] == '_'){
           moves = addMove(0, 0);
        }
        else if(move.equalsIgnoreCase("A2") & board[0][1] == '_'){
           moves = addMove(0, 1);
        }
        else if(move.equalsIgnoreCase("A3") & board[0][2] == '_'){
            moves = addMove(0, 2);
        }
        else if(move.equalsIgnoreCase("B1") & board[1][0] == '_'){
            moves = addMove(1, 0);
        }
        else if(move.equalsIgnoreCase("B2") & board[1][1] == '_'){
            moves = addMove(1, 1);
        }
        else if(move.equalsIgnoreCase("B3") & board[1][2] == '_'){
            moves = addMove(1, 2);
        }
        else if(move.equalsIgnoreCase("C1") & board[2][0] == '_'){
            moves = addMove(2, 0);
        }
        else if(move.equalsIgnoreCase("C2") & board[2][1] == '_'){
            moves = addMove(2, 1);
        }
        else if(move.equalsIgnoreCase("C3") & board[2][2] == '_'){
            moves = addMove(2, 2);
        } 
        else {
            moves = addMove(-1, -1);
        }
        return moves;
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
        System.out.println();
    }

    private static boolean gameOver(int rMove, int cMove) {
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