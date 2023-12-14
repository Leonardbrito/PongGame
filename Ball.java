import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{

	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
	/*
     	O construtor recebe coordenadas x, y e dimensões width e height da bola.
    	Um objeto Random é criado para gerar números aleatórios.
    	randomXDirection e randomYDirection obtêm valores aleatórios entre 0 e 1, e são ajustados para -1 ou 1, determinando a direção inicial da bola.
    	setXDirection e setYDirection são chamados para definir as direções iniciais da bola com base nos valores aleatórios.
 	*/
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection*initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection*initialSpeed);
		
	}
	//configura as direcoes da bola
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
	//atualiza as coordenadas da bola com base nas direções
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
