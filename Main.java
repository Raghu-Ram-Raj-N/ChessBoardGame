package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    //different Keys for different coins
    public static String position[] = {"   ", "W_R", "W_N", "W_B", "W_Q", "W_K", "W_P", " ", " ", " ", " ", "B_R", "B_N", "B_B", "B_Q", "B_K", "B_P"};
    //Board with no coins (Empty)
    public static int board[][]=new int[8][8];
    //checking for who to play
    public static int flag=0;
    //Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setUpBoard();
        int flag=0;
        while(true){
            System.out.printf("Select the Task:\n1.Game Play\n2.Printing the Board\n3.Recording\n4.Exit\n");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                //if you needs to play the game
                case 1:
                    gamePlay();                                 
                    break;
                //if you needs to know how the board is
                case 2:
                    printBoard();
                    break;
                //if you want to see the record of the match
                case 3:
                    break;
                //if you want to quit
                case 4:
                    return;
            }
        }
    }

    public static void gamePlay() {
        while (true){
            if(flag==0){
                System.out.println("White Player's Turn");
            }else{
                System.out.println("Black Player's Turn");
            }
            flag=(flag==0?1:0);                     //To change the Players
            System.out.println("Enter the Position of Coin");
            Scanner sc=new Scanner(System.in);
            String key= sc.nextLine();              //To get the Position of Coin
            char s=key.charAt(0);
            int current_y=s-'a';
            s=key.charAt(1);
            int current_x=7-(s-'1');
            System.out.println("The Current type of Coin : "+position[board[current_x][current_y]]); // Printing  the current coin
            System.out.println("Enter the new Position of Coin"); //To get the new Position of Coin
            String des= sc.nextLine();
            if(des.equals("Print")){
                printBoard();                       //To print the Board
            }else  if(des.equals("exit")){
                break;                              //To exit Game Play Mode
            }
            Moves moves=new Moves(key,des);
        }
    }

    public static void setUpBoard() {

        int temp=1;
        for(int j=0;j<8;j++) {
            board[7][j] = j < 3 ? temp++ : temp--;
            if (j == 3) {
                temp++;
            }
        }
        temp=11;
        for(int j=0;j<8;j++){
            board[0][j]=(j<3)?temp++:temp--;
            if(j==3){
                temp++;
            }
        }
        for(int i=0;i<8;i++){
            board[1][i]=16;
        }
        for(int i=0;i<8;i++){
            board[6][i]=6;
        }
        board[0][4]=15;
        board[7][4]=5;
    }
    public static void printBoard() {
        System.out.print(" ");
        for(int i=0;i<8;i++) {
            System.out.printf("   %c ",i+'a');
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(8-i+"  ");

            for (int j = 0; j < 8; j++) {
                System.out.print(position[board[i][j]] + "  ");
            }
            System.out.println();
        }
    }
}
