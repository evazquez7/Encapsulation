/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experiments;

/**
 *
 * @author Emilio
 */
import java.util.Scanner;
public class Startup {
    public static void main(String[] args) {
        String name;
        String position;
        Scanner k = new Scanner(System.in);
        
        Team t = new Team();
        for(int i =0; i < 3; i++){
            System.out.println("Please enter the player's name: ");
            name = k.nextLine();
            System.out.println("Please enter their position:");
            position = k.nextLine();
            t.setPlayerInfo(name, position);
        }
        t.teamLineUp();
    }
    
}
