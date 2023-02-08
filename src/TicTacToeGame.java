import java.util.Random;
import java.util.Scanner;

//Program to simulate TicTacToe game between computer and player
public class TicTacToeGame {
    public static char letter,playerValue,computerValue;
    public static char[] gameBoard = new char[10];
    public static int chance,flag=0;
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
        winCheck();
        boardFull++;
        chance=1;           //Computer chance
    }

    public static void computerMove(){

       int[] corners = {1,3,7,9};
        Random generator=new Random();
        int randomCorner = generator.nextInt(corners.length);;
        int[] sides = {2,4,6,8};
        int randomSides = generator.nextInt(sides.length);
        boolean success = false;
        /*
                added condition below for win situation and blocking the opponent
                 */
        while (success==false){
                if(gameBoard[3] == '-' && Character.compare(gameBoard[1],computerValue)==0 && Character.compare(gameBoard[2],computerValue)==0|| gameBoard[3] == '-' && Character.compare(gameBoard[1],playerValue)==0 && Character.compare(gameBoard[2],playerValue)==0) {
                    gameBoard[3] = computerValue;
                    success = true;
                }
        if(gameBoard[1] == '-' && Character.compare(gameBoard[2],computerValue)==0 && Character.compare(gameBoard[3],computerValue)==0 || gameBoard[1] == '-' && Character.compare(gameBoard[2],playerValue)==0 && Character.compare(gameBoard[3],playerValue)==0 )
        {gameBoard[1]=computerValue;
            success=true;
        } else if(gameBoard[2] == '-' && Character.compare(gameBoard[1],computerValue)==0 && Character.compare(gameBoard[3],computerValue)==0|| gameBoard[2] == '-' && Character.compare(gameBoard[1],playerValue)==0 && Character.compare(gameBoard[3],playerValue)==0)
        {gameBoard[2]=computerValue;
            success=true;
        } else if(gameBoard[6] == '-' && Character.compare(gameBoard[4],computerValue)==0 && Character.compare(gameBoard[5],computerValue)==0|| gameBoard[6] == '-' && Character.compare(gameBoard[4],playerValue)==0 && Character.compare(gameBoard[5],playerValue)==0)
            {gameBoard[6]=computerValue;
                success=true;
            } else if(gameBoard[4] == '-' && Character.compare(gameBoard[5],computerValue)==0 && Character.compare(gameBoard[6],computerValue)==0 || gameBoard[4] == '-' && Character.compare(gameBoard[5],playerValue)==0 && Character.compare(gameBoard[6],playerValue)==0)
            {gameBoard[4]=computerValue;
                success=true;
            } else if(gameBoard[5] == '-' && Character.compare(gameBoard[4],computerValue)==0 && Character.compare(gameBoard[6],computerValue)==0 || gameBoard[5] == '-' && Character.compare(gameBoard[4],playerValue)==0 && Character.compare(gameBoard[6],playerValue)==0)
            {gameBoard[5]=computerValue;
                success=true;
            } else if(gameBoard[9] == '-' && Character.compare(gameBoard[7],computerValue)==0 && Character.compare(gameBoard[8],computerValue)==0 || gameBoard[9] == '-' && Character.compare(gameBoard[7],playerValue)==0 && Character.compare(gameBoard[8],playerValue)==0)
            {gameBoard[9]=computerValue;
            success=true;
            } else if(gameBoard[7] == '-' && Character.compare(gameBoard[8],computerValue)==0 && Character.compare(gameBoard[9],computerValue)==0 || gameBoard[7] == '-' && Character.compare(gameBoard[8],playerValue)==0 && Character.compare(gameBoard[9],playerValue)==0)
            {gameBoard[7]=computerValue;
            success=true;
            }else if(gameBoard[8] == '-' && Character.compare(gameBoard[7],computerValue)==0 && Character.compare(gameBoard[9],computerValue)==0 || gameBoard[8] == '-' && Character.compare(gameBoard[7],playerValue)==0 && Character.compare(gameBoard[9],playerValue)==0)
            {gameBoard[8]=computerValue;
            success=true;
            }else if(gameBoard[7] == '-' && Character.compare(gameBoard[1],computerValue)==0 && Character.compare(gameBoard[4],computerValue)==0 || gameBoard[7] == '-' && Character.compare(gameBoard[1],playerValue)==0 && Character.compare(gameBoard[4],playerValue)==0)
            {gameBoard[7]=computerValue;
            success=true;
            }else if(gameBoard[1] == '-' && Character.compare(gameBoard[4],computerValue)==0 && Character.compare(gameBoard[7],computerValue)==0|| gameBoard[1] == '-' &&  Character.compare(gameBoard[4],playerValue)==0 && Character.compare(gameBoard[7],playerValue)==0)
        {gameBoard[1]=computerValue;
            success=true;
        }else if(gameBoard[4] == '-' && Character.compare(gameBoard[1],computerValue)==0 && Character.compare(gameBoard[7],computerValue)==0|| gameBoard[4] == '-' &&  Character.compare(gameBoard[1],playerValue)==0 && Character.compare(gameBoard[7],playerValue)==0)
        {gameBoard[4]=computerValue;
            success=true;
        }else if(gameBoard[8] == '-' && Character.compare(gameBoard[2],computerValue)==0 && Character.compare(gameBoard[5],computerValue)==0|| gameBoard[8] == '-' &&  Character.compare(gameBoard[2],playerValue)==0 && Character.compare(gameBoard[5],playerValue)==0)
        {gameBoard[8]=computerValue;
            success=true;
        }else if(gameBoard[2] == '-' && Character.compare(gameBoard[5],computerValue)==0 && Character.compare(gameBoard[8],computerValue)==0|| gameBoard[2] == '-' &&  Character.compare(gameBoard[5],playerValue)==0 && Character.compare(gameBoard[8],playerValue)==0)
        {gameBoard[2]=computerValue;
            success=true;
        }else if(gameBoard[5] == '-' && Character.compare(gameBoard[2],computerValue)==0 && Character.compare(gameBoard[8],computerValue)==0|| gameBoard[5] == '-' &&  Character.compare(gameBoard[2],playerValue)==0 && Character.compare(gameBoard[8],playerValue)==0)
        {gameBoard[5]=computerValue;
            success=true;
        }else if(gameBoard[9] == '-' && Character.compare(gameBoard[3],computerValue)==0 && Character.compare(gameBoard[6],computerValue)==0 || gameBoard[9] == '-' &&  Character.compare(gameBoard[3],playerValue)==0 && Character.compare(gameBoard[6],playerValue)==0)
        {gameBoard[9]=computerValue;
            success=true;
        }else if(gameBoard[3] == '-' && Character.compare(gameBoard[6],computerValue)==0 && Character.compare(gameBoard[9],computerValue)==0 || gameBoard[3] == '-' &&  Character.compare(gameBoard[6],playerValue)==0 && Character.compare(gameBoard[9],playerValue)==0)
        {gameBoard[3]=computerValue;
            success=true;
        }else if(gameBoard[6] == '-' && Character.compare(gameBoard[3],computerValue)==0 && Character.compare(gameBoard[9],computerValue)==0|| gameBoard[6] == '-' &&  Character.compare(gameBoard[3],playerValue)==0 && Character.compare(gameBoard[9],playerValue)==0)
        {gameBoard[6]=computerValue;
            success=true;
        }else if(gameBoard[9] == '-' && Character.compare(gameBoard[1],computerValue)==0 && Character.compare(gameBoard[5],computerValue)==0|| gameBoard[9] == '-' &&  Character.compare(gameBoard[1],playerValue)==0 && Character.compare(gameBoard[5],playerValue)==0)
        {gameBoard[9]=computerValue;
            success=true;
        }else if(gameBoard[1] == '-' && Character.compare(gameBoard[5],computerValue)==0 && Character.compare(gameBoard[9],computerValue)==0|| gameBoard[1] == '-' &&  Character.compare(gameBoard[5],playerValue)==0 && Character.compare(gameBoard[9],playerValue)==0)
        {gameBoard[1]=computerValue;
            success=true;
        }else if(gameBoard[5] == '-' && Character.compare(gameBoard[1],computerValue)==0 && Character.compare(gameBoard[9],computerValue)==0|| gameBoard[5] == '-' &&  Character.compare(gameBoard[1],playerValue)==0 && Character.compare(gameBoard[9],playerValue)==0)
        {gameBoard[5]=computerValue;
            success=true;
        }else if(gameBoard[7] == '-' && Character.compare(gameBoard[3],computerValue)==0 && Character.compare(gameBoard[5],computerValue)==0|| gameBoard[7] == '-' &&  Character.compare(gameBoard[3],playerValue)==0 && Character.compare(gameBoard[5],playerValue)==0)
        {gameBoard[7]=computerValue;
            success=true;
        }else if(gameBoard[3] == '-' && Character.compare(gameBoard[5],computerValue)==0 && Character.compare(gameBoard[7],computerValue)==0|| gameBoard[3] == '-' &&  Character.compare(gameBoard[5],playerValue)==0 && Character.compare(gameBoard[7],playerValue)==0)
        {gameBoard[3]=computerValue;
            success=true;
        }else if(gameBoard[5] == '-' && Character.compare(gameBoard[3],computerValue)==0 && Character.compare(gameBoard[7],computerValue)==0|| gameBoard[5] == '-' &&  Character.compare(gameBoard[3],playerValue)==0 && Character.compare(gameBoard[7],playerValue)==0)
        {gameBoard[5]=computerValue;
            success=true;
        }else if(success==false){
            while (gameBoard[randomCorner] != '-'){
                randomCorner = generator.nextInt(corners.length);
            }
            gameBoard[randomCorner]=computerValue;
            success=true;
        } else if(gameBoard[5] == '-'){
            gameBoard[5] = computerValue;
            success=true;
        } else if(success==false){
            while (gameBoard[randomSides] != '-'){
                randomSides = generator.nextInt(sides.length);
            }
            gameBoard[randomSides] = computerValue;
            success=true;
        }
        }

        showBoard();
        winCheck();
        boardFull++;
        chance=2;       //Player Chance
    }

    public static void winCheck() {
        if (Character.compare(gameBoard[1], playerValue) == 0 && Character.compare(gameBoard[2], playerValue) == 0 && Character.compare(gameBoard[3], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[3], playerValue) == 0 && Character.compare(gameBoard[5], playerValue) == 0 && Character.compare(gameBoard[7], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[4], playerValue) == 0 && Character.compare(gameBoard[5], playerValue) == 0 && Character.compare(gameBoard[6], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[7], playerValue) == 0 && Character.compare(gameBoard[8], playerValue) == 0 && Character.compare(gameBoard[9], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[1], playerValue) == 0 && Character.compare(gameBoard[4], playerValue) == 0 && Character.compare(gameBoard[7], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[2], playerValue) == 0 && Character.compare(gameBoard[5], playerValue) == 0 && Character.compare(gameBoard[8], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[3], playerValue) == 0 && Character.compare(gameBoard[6], playerValue) == 0 && Character.compare(gameBoard[9], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[1], playerValue) == 0 && Character.compare(gameBoard[5], playerValue) == 0 && Character.compare(gameBoard[9], playerValue) == 0) {
            System.out.println("Player has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[1], computerValue) == 0 && Character.compare(gameBoard[2], computerValue) == 0 && Character.compare(gameBoard[3], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[3], computerValue) == 0 && Character.compare(gameBoard[5], computerValue) == 0 && Character.compare(gameBoard[7], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[4], computerValue) == 0 && Character.compare(gameBoard[5], computerValue) == 0 && Character.compare(gameBoard[6], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[7], computerValue) == 0 && Character.compare(gameBoard[8], computerValue) == 0 && Character.compare(gameBoard[9], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[1], computerValue) == 0 && Character.compare(gameBoard[4], computerValue) == 0 && Character.compare(gameBoard[7], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[2], computerValue) == 0 && Character.compare(gameBoard[5], computerValue) == 0 && Character.compare(gameBoard[8], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[3], computerValue) == 0 && Character.compare(gameBoard[6], computerValue) == 0 && Character.compare(gameBoard[9], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        } else if (Character.compare(gameBoard[1], computerValue) == 0 && Character.compare(gameBoard[5], computerValue) == 0 && Character.compare(gameBoard[9], computerValue) == 0) {
            System.out.println("Computer has won!!!!");
            flag=1;
        }else if(boardFull==9){
            System.out.println("Board is full!!!!!");
            flag=1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int userInput=0;



        while(flag==0) {
            System.out.println("@@@@@@@@@@@@@@ Welcome to TicTacToe game @@@@@@@@@@@@@");
            //player choose a letter between x or o to proceed
            for (int i = 1; i < 10; i++) {
                gameBoard[i] = '-';
            }
            playerValue = chooseLetterXorO();
            if (playerValue == 'x') {
                computerValue = 'o';
            } else {
                computerValue = 'x';
            }
            showBoard();


            if (toss() == 1) {                                 // If 1 then user win and plays first
                System.out.println("You won toss. Your turn");
                playerMove();
            } else {
                System.out.println("Computer won toss. Computer turn");
                computerMove();
            }

            while (boardFull < 10 && flag == 0) {
                if (chance == 1) {
                    System.out.println("Computer turn");
                    computerMove();
                } else {
                    playerMove();
                }
            }

            if(flag==1){
                System.out.println("Do you want to play again. Press 1 to replay 0 to exit .");
                userInput = scanner.nextInt();
                if(userInput==1){
                    flag=0;
                }
            }

        }
    }
}