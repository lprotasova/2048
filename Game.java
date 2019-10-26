//package pkg2048;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author Iryna
 */
public class Game {
    String gameState;
    private final Random rand;
    public Game(){
        rand = new Random();
        gameState = "0000000000000000";
        addTile();
        printBoard();
    }

    public static void main(String[] args){
        Game aGame = new Game();
        aGame.addTile();
        aGame.printBoard();
        System.out.println("hey");
    }

    public void printBoard(){
        for (int i=0;i<4;i++){
            System.out.println(gameState.substring(i*4,i*4+4));
        }
    }

    public int addTile(){
        if (gameState.indexOf('0') == -1){
            return -1;
        }
        int n = rand.nextInt(16);
        while (gameState.charAt(n) != '0'){
            n=rand.nextInt();
        }
        if (Math.random() < 0.9){
            gameState = gameState.substring(0, n) + "1" + gameState.substring(n+1);
        }
        else{
            gameState = gameState.substring(0, n) + "2" + gameState.substring(n+1);
        }
        return 0;
    }

    public int moveLeft(){
        int[] line = new int[4];
        int[] line2 = new int[4];
        for (int i=0; i<4; i++){
            int pos = 0;
            for (int j=0; j<4; j++){
                if (gameState.charAt(i*4+j) != '0'){
                    line[pos]=gameState.charAt(i*4+j);
                    pos++;
                }
            }
            if (pos == 0)
                return 0;
            for (; pos<4; pos++){
                line[pos]=0;
            }
            for (int j2=0, j1=0; j2<4; j2++, j1++){
                if (j1>=4||line[j1]==0){
                    line2[j2]=0;
                }
                else if (line[j1] == line[j1+1] && line[j1]!=0){
                    line2[j2]=line[j1]+1;
                    j1++;
                }
                else{
                    line2[j2]=line[j1];
                }
            }

        }
        return 0;
    }
}

