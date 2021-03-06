package ProgrammingByDoing;

import java.awt.*;
import javax.swing.JFrame;

public class Program90 extends Canvas {
	public void paint(Graphics window) {
		// this code draws a 100x100 box in blue at (200,300)
		window.setColor(Color.BLUE);
		window.fillRect(200, 300, 100, 100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210, 310, 80, 80);
		// draw three more boxes -- different colors, different places
		window.setColor(Color.GREEN);
		window.fillRect(300, 200, 100, 100);
		window.setColor(Color.WHITE);
		window.fillRect(310, 210, 80, 80);

		window.setColor(Color.RED);
		window.fillRect(200, 200, 100, 100);
		window.setColor(Color.WHITE);
		window.fillRect(210, 210, 80, 80);

		window.setColor(Color.YELLOW);
		window.fillRect(300, 300, 100, 100);
		window.setColor(Color.WHITE);
		window.fillRect(310, 310, 80, 80);

	}

	public static void main(String[] args) {
		Canvas canvas = new Program90();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add(canvas);
		win.setVisible(true);
	}
}
