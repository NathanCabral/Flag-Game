/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaggame;

/**
 *
 * @author Nathan Cabral
 */
public class FlagGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
       GameData.FG.getGameData();
       GameData.FG.loadGameResults();
       Login nathan = new Login();
       nathan.setVisible(true);

        
    }
    
}