import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Painel extends JPanel
{
    private Inimigo enemy[] = new Inimigo[3];
    Personagem persona;
    Escudo escudoFraco;
    Escudo escudoMedio;
    Escudo escudoForte;
    
    public Painel(Personagem persona, Escudo escudoFraco, 
        Escudo escudoMedio, Escudo escudoForte) {
        this.persona = persona;
        this.escudoFraco = escudoFraco;
        this.escudoMedio = escudoMedio;
        this.escudoForte = escudoForte;
        persona.setEscudo(escudoForte);
        
        persona.setPoder(new PoderFraco(persona));
        persona.setPoder(new PoderMedio(persona));
        persona.setPoder(new PoderForte(persona));
        
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
            
            if (e.getKeyCode() == KeyEvent.VK_SPACE){
                for(int i=0; i<enemy.length; i++){
                    if(Math.abs(persona.getX() - enemy[i].getX())==0 
                    && Math.abs(persona.getX() - enemy[i].getX())==0){
                        System.out.println("Poder: "+persona.getPoder());
                        System.out.println("Ataque: "+persona.getAtaque());
                        enemy[i].perdeVida(persona.getAtaque());
                    }
                }
            }
                
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
        g2d.fillOval(enemy[0].getX(), enemy[0].getY(), 20, 20);
        g2d.setColor(Color.BLUE);
        g2d.fillOval(enemy[1].getX(), enemy[1].getY(), 20, 20);
        g2d.setColor(Color.GREEN);
        g2d.fillOval(enemy[2].getX(), enemy[2].getY(), 20, 20);
    }
    
    public void jogar (Painel painel) throws InterruptedException {
        JFrame frame = new JFrame("Game");
        frame.add(painel);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    
        enemy[0] = new Inimigo(10, 10);
        enemy[1] = new Inimigo(210,20);
        enemy[2] = new Inimigo(-30, 90);
        
        for(int i=0; i<enemy.length; i++){
            persona.addObserver(enemy[i]);
        }
        
        while (true) {
            persona.show();           
            painel.repaint();
            Thread.sleep(50);
        }
    }
}


