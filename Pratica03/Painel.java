import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Painel extends JPanel
{
    private Personagem persona;
    private Inimigo i1;
    private Inimigo i2;
    
    public Painel() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }
    
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {}
        
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
               persona.setX(persona.getX()-10);
               
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
               persona.setX(persona.getX()+10);
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                persona.setY(persona.getY()-10);
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
               persona.setY(persona.getY()+10); 
        }
        
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.fillOval(persona.getX(), persona.getY(), 20, 20);
        g2d.setColor(Color.RED);
        g2d.fillOval(i1.getX(), i1.getY(), 20, 20);
        g2d.setColor(Color.BLUE);
        g2d.fillOval(i2.getX(), i2.getY(), 20, 20);
    }
    
    public void jogar (Painel painel) throws InterruptedException {
        JFrame frame = new JFrame("Game");
        frame.add(painel);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    
        persona = new Personagem();
        i1 = new Inimigo(10, 10);
        i2 = new Inimigo(20,20);
        
        persona.addObserver(i1);
        persona.addObserver(i2);
        
        while (true) {
            persona.show();           
            painel.repaint();
            Thread.sleep(50);
        }
    }
}


