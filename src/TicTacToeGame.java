//Program to simulate TicTacToe game between computer and player
public class TicTacToeGame {
    public static void main(String[] args) {
        char[] gameBoard = new char[10];
        for (int i = 1; i < 10; i++) {
            gameBoard[i] = (char)(i + '0');
        }
        System.out.println("@@@@@@@@@@@@@@ Welcome to TicTacToe game @@@@@@@@@@@@@");
        for (int i = 1; i < 10; i++) {
            if(i==4 || i==7){
                System.out.println();
            }
            System.out.print(gameBoard[i]+" ");
        }


    }
}