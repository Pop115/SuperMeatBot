import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	Color color = Color.red;
	
	public Panneau(){
		this.setBackground(Color.white);
	}
		
	public void paintComponent(Graphics g){
	
		g.setColor(color);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	public void changeColor(Color color){
		this.color=color;
	}
}

