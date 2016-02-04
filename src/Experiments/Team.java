/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experiments;

import java.util.ArrayList;

/**
 *
 * @author Emilio
 */
public class Team {
    Player player;
    
    
    ArrayList<Player> players = new ArrayList<Player>();
    
    private void addPlayer(Player player){
        players.add(player);
    }
    public void teamLineUp() {
 
        int count=0;
        for (int x = 0; x < players.size(); x++){
            count++;
            System.out.println(count+". " + "Name:" + players.get(x).getName()+ "\n   Position: " + players.get(x).getPosition());
            System.out.println("");

            }
        
    }
    public void setPlayerInfo(String name,String position){
        Player p = new Player();
        p.setName(name);
        p.setPosition(position);
        player = p;
        addPlayer(player);
    }

  
    
  

    
    
}
