/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;
import javax.swing.*;


public class SnakeGame extends JFrame {
   
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();
        
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
       new SnakeGame();
    }
    
}
