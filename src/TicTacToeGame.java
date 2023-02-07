import java.util.Scanner;

//Program to simulate TicTacToe game between computer and player
public class TicTacToeGame {
    public static char letter,playerValue,computerValue;
    public static char[] gameBoard = new char[10];
    public static int chance;
    public static int boardFull = 1;

    public static int toss(){
    return (int)(Math.random() * 2);
    }
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
                gameBoard[move] = playerValue;
                success = true;
            } else {
                System.out.println("its already taken, kindly try another index");
                move = scanner.nextInt();
            }
    }
        showBoard();
        boardFull++;
        chance=1;           //Computer chance
    }

    public static void computerMove(){

       int computerMove = (int)(Math.random() * 9 + 1);
        boolean success = false;
        while (success == false){                           //Empty index check
            if (gameBoard[computerMove] == '-') {
                gameBoard[computerMove] = computerValue;
                success = true;
            } else {
                computerMove = (int)(Math.random() * 9 + 1);

            }
        }
        showBoard();
        boardFull++;
        chance=2;       //Player Chance
    }
    public static void main(String[] args) {

        System.out.println("@@@@@@@@@@@@@@ Welcome to TicTacToe game @@@@@@@@@@@@@");
        //player choose a letter between x or o to proceed

        for (int i = 1; i < 10; i++) {
            gameBoard[i] = '-';
        }
        playerValue=chooseLetterXorO();
        if (playerValue=='x'){
            computerValue = 'o';
        }else {
            computerValue = 'x';
        }
        showBoard();


            if (toss() == 1) {                                 // If 1 then user win and plays first
                System.out.println("Player turn");
                playerMove();
            } else {
                System.out.println("Computer turn");
                computerMove();
            }

            while (boardFull<10){
                if(chance==1){
                    System.out.println("Computer turn");
                    computerMove();
                }else{
                    playerMove();
                }
            }
    }
}