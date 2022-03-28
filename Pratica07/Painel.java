import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Painel extends JPanel
{
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    private Personagem personagem;
    private Inimigo enemy[] = new Inimigo[3];
    
        
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
               personagem.setX(personagem.getX()-personagem.getCorrida().getValor());
               
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
               personagem.setX(personagem.getX()+personagem.getCorrida().getValor());
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                personagem.setY(personagem.getY()-personagem.getCorrida().getValor());
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
               personagem.setY(personagem.getY()+personagem.getCorrida().getValor()); 
            
            if (e.getKeyCode() == KeyEvent.VK_SPACE)
                for(int i=0; i<inimigos.size(); i++){
                    if(Math.abs(personagem.getX() - inimigos.get(i).getX())==0 
                        && Math.abs(personagem.getX() - inimigos.get(i).getX())==0)
                            personagem.atacar(inimigos.get(i));
                            if(inimigos.get(i).getVida()<=0){
                                personagem.deleteObserver(inimigos.get(i));
                                inimigos.remove(inimigos.get(i));
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
        
        // personagem
        if(personagem.getEstado().getClass().getName() == "EstadoForte"){
            g2d.setColor(Color.MAGENTA);
        } else if(personagem.getEstado().getClass().getName() == "EstadoPerigo"){
            g2d.setColor(Color.RED);
        } else {
            g2d.setColor(Color.BLACK);
        }
        g2d.fillOval(personagem.getX(), personagem.getY(), 20, 20);
        
        // inimigos
        for(int i=0; i<inimigos.size(); i++){
            if(inimigos.get(i).getEstado().getClass().getName() == "EstadoForte"){
                g2d.setColor(Color.BLUE); 
            }
            else if(inimigos.get(i).getEstado().getClass().getName() == "EstadoPerigo"){
                g2d.setColor(Color.ORANGE); 
            }
            else {
                g2d.setColor(Color.GRAY);
            }
            
            g2d.fillOval(inimigos.get(i).getX(), inimigos.get(i).getY(), 20, 20);
        }
    }
    
    public void jogar (Painel painel) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o modo do jogo: ");
        System.out.println("1 - Medieval");
        System.out.println("2 - Futurista");
        int n = entrada.nextInt();
        while (n!=1 && n!=2) {
            System.out.println("Opção inválida");            
            System.out.println("Escolha o modo do jogo: ");
            System.out.println("1 - Medieval");
            System.out.println("2 - Futurista");
            n = entrada.nextInt();
        }
        
        JFrame frame = new JFrame("Game");
        frame.add(painel);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Game game;
        if(n == 1){
            // jogo medieval     
            game = new GameMedieval();
            
            // instanciar defesas
            Defesa escudofraco = new EscudoFraco(personagem);
            Defesa escudoforte = new EscudoForte(personagem);
            escudoforte.setSucessor(escudofraco);
            escudofraco.setSucessor(null);
        }
        else{
            // jogo futurista   
            game = new GameFuturista();
            
            // instanciar defesas
            Defesa campoforca = new CampoForca(personagem);
            Defesa supercampo = new SuperCampoForca(personagem);
            supercampo.setSucessor(campoforca);
            campoforca.setSucessor(null);
        }
        
        // criando personagem
        personagem = game.createPersonagem(50, 50);
        System.out.println("Personagem "+ personagem + " criado com sucesso!");
        
        // criar inimigos
        enemy[0] = game.createInimigo(10, 10);
        enemy[1] = game.createInimigo(210,20);
        enemy[2] = game.createInimigo(-30, 90);
        
        inimigos.add(enemy[0]);
        inimigos.add(enemy[1]);
        inimigos.add(enemy[2]);
        
        for(int i=0; i<inimigos.size(); i++){
            personagem.addObserver(inimigos.get(i));
        }
        
        
        while (true) {
            personagem.show();           
            painel.repaint();
            //System.out.println("\nTotal de inimigos no jogo: " + inimigos.size()+ "\n");
            Thread.sleep(50);
        }
    }
}