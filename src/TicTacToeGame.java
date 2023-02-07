import java.util.Scanner;

//Program to simulate TicTacToe game between computer and player
public class TicTacToeGame {
    public static char letter,player,computer;
    public static char[] gameBoard = new char[10];
    public static int chance;
    public static char chooseLetterXorO(){  //Method to give player chance to choose character X or O before starting game
        System.out.println("Choose a letter between x or o before starting game");
        Scanner scanner = new Scanner(System.in);
        letter = scanner.next().charAt(0);
        return letter;
    }

    public static void showBoard(){
        for (int i = 1; i < 10; i++) {
            if(i==4 || i==7){
                System.out.println();
            }
            System.out.print(gameBoard[i]+" ");
        }
        System.out.println();
    }

    public static void playerMove() {
        System.out.println("Kindly play your move between 1-9 ");
        int move;
        boolean success = false;
        Scanner scanner = new Scanner(System.in);
        move = scanner.nextInt();
        while (success == false){                           //Empty index check
            if (gameBoard[move] == '-') {
                gameBoard[move] = player;
                success = true;
            } else {
                System.out.println("its already taken, kindly try another index");
                move = scanner.nextInt();
            }
    }
        showBoard();
    }
    public static void main(String[] args) {

        System.out.println("@@@@@@@@@@@@@@ Welcome to TicTacToe game @@@@@@@@@@@@@");
        //player choose a letter between x or o to proceed

        for (int i = 1; i < 10; i++) {
            gameBoard[i] = '-';
        }
        player=chooseLetterXorO();
        if (player=='x'){
            computer = 'o';
        }else {
            computer = 'x';
        }
        showBoard();

        playerMove();


    }
}