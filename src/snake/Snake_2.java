package snake;

import java.awt.EventQueue;
import javax.swing.JFrame;

import board.Board_2;
public class Snake_2 extends JFrame{
	
public Snake_2() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board_2());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake_2();
            ex.setVisible(true);
        });
    }

}
