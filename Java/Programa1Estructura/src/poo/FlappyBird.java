package poo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	
	public class FlappyBird {
		public static void main (String [] args) {
			new FlappyBird();
			
		}

	    // Tamaño de la ventana del juego
	    private final int GAME_WIDTH = 400;
	    private final int GAME_HEIGHT = 600;

	    // Posición y tamaño del pájaro
	    private final int BIRD_X = 50;
	    private int birdY = GAME_HEIGHT / 2;
	    private final int BIRD_SIZE = 30;

	    // Velocidad del pájaro y gravedad
	    private int birdVelocity = 0;
	    private final int GRAVITY = 1;

	    // Altura y espacio entre los obstáculos
	    private final int OBSTACLE_HEIGHT = 200;
	    private final int OBSTACLE_SPACE = 150;

	    // Posición y tamaño del primer obstáculo
	    private int obstacleX = GAME_WIDTH;
	    private int obstacleY = 0;
	    private final int OBSTACLE_WIDTH = 50;

	    // Panel del juego
	    private JPanel gamePanel;

	    // Temporizador para actualizar el juego
	    private Timer timer;

	    // Puntaje
	    private int score;

	    public FlappyBird() {
	        // Crear el marco principal
	        JFrame frame = new JFrame("Flappy Bird");
	        frame.setSize(GAME_WIDTH + 20, GAME_HEIGHT + 70);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Crear el panel del juego y agregarlo al marco
	        gamePanel = new JPanel();
	        gamePanel.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
	        gamePanel.setBackground(Color.WHITE);
	        frame.add(gamePanel, BorderLayout.CENTER);

	        // Agregar un listener de teclado para mover el pájaro
	        gamePanel.setFocusable(true);
	        gamePanel.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent e) {
	                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
	                    birdVelocity = -10;
	                }
	            }
	        });

	        // Crear un temporizador para actualizar el juego
	        timer = new Timer(20, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                updateGame();
	            }
	        });

	        // Mostrar el marco
	        frame.setVisible(true);

	        // Iniciar el temporizador
	        timer.start();
	    }

	    private void updateGame() {
	        // Mover el pájaro
	        birdVelocity += GRAVITY;
	        birdY += birdVelocity;

	        // Mover el obstáculo
	        obstacleX -= 5;
	        if (obstacleX < -OBSTACLE_WIDTH) {
	            obstacleX = GAME_WIDTH;
	            obstacleY = (int) (Math.random() * (GAME_HEIGHT - OBSTACLE_HEIGHT - OBSTACLE_SPACE));
	            score++;
	        }

	        // Verificar si el pájaro choca con el obstáculo o la pared
	        if (birdY < 0 || birdY > GAME_HEIGHT - BIRD_SIZE ||
	            (BIRD_X + BIRD_SIZE > obstacleX && BIRD_X < obstacleX + OBSTACLE_WIDTH &&
	             (birdY < obstacleY + OBSTACLE_HEIGHT || birdY + BIRD_SIZE > obstacleY + OBSTACLE_HEIGHT + OBSTACLE_SPACE))) {
	            timer.stop();
	            JOptionPane.showMessageDialog(gamePanel, "¡Game over!\nPuntaje: " + score);
	            System.exit(0);
	        }

	        // Repintar el panel del juego
	        gamePanel.repaint();
	    }
	}
