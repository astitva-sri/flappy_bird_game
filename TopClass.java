import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TopClass{
    private static final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();  
    private static final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    
    private JFrame f = new JFrame("Flappy Bird: The Game");

    private static TopClass tc = new TopClass();

    public TopClass(){
    }

    public static void main(String[] args){
        JFrame frame = new JFrame();
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                tc.buildFrame();

                Thread t = new Thread() {
                    public void run(){

                    }
                };
                t.start();
            }        
        });

        ImageIcon icon = new ImageIcon("flappy_bird_game\\resources\\icon.png");
        frame.setIconImage(icon.getImage());
    }

    private void buildFrame(){
        Image icon = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("resources/blue_bird.png"));
	    f.setContentPane(createContentPane()); 
        f.setResizable(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setAlwaysOnTop(false);
        f.setVisible(true);
        f.setMinimumSize(new Dimension(SCREEN_WIDTH*1/4, SCREEN_HEIGHT*1/4)); 
        f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        f.setIconImage(icon); 
    }

    private JPanel topPanel;

    private JPanel createContentPane(){
        topPanel = new JPanel();
        return topPanel;
    }
}