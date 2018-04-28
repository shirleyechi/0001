import javax.swing.*;

import java.awt.*;

public class DrawDiamond extends JFrame {
	public DrawDiamond() {
		setTitle("test");
		setLayout(new GridLayout(2, 2));
		add(new ex_1());
		
	}

	/** Main method */
	public static void main(String[] args) {
		DrawDiamond frame = new DrawDiamond();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

// The class for drawing arcs on a panel
class ex_1 extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		g.drawOval(x - radius / 10, y - radius / 10, 5, 5);
		g.drawOval(x - radius / 10 + 5, y - radius / 10 + 10, 5, 5);
		g.drawOval(x - radius / 10 - 5, y - radius / 10 + 10, 5, 5);
		g.drawOval(x - radius / 10, y - radius / 10 + 20, 5, 5);
		g.drawOval(x - radius / 10 + 10, y - radius / 10 + 20, 5, 5);
		g.drawOval(x - radius / 10 - 10, y - radius / 10 + 20, 5, 5);
		g.drawOval(x - radius / 10 + 5, y - radius / 10 + 30, 5, 5);
		g.drawOval(x - radius / 10 - 5, y - radius / 10 + 30, 5, 5);
		g.drawOval(x - radius / 10 + 15, y - radius / 10 + 30, 5, 5);
		g.drawOval(x - radius / 10 - 15, y - radius / 10 + 30, 5, 5);
		g.drawOval(x - radius / 10, y - radius / 10 + 40, 5, 5);
		g.drawOval(x - radius / 10 + 10, y - radius / 10 + 40, 5, 5);
		g.drawOval(x - radius / 10 - 10, y - radius / 10 + 40, 5, 5);
		g.drawOval(x - radius / 10 - 20, y - radius / 10 + 40, 5, 5);
		g.drawOval(x - radius / 10 + 20, y - radius / 10 + 40, 5, 5);
		g.drawOval(x - radius / 10 + 5, y - radius / 10 + 50, 5, 5);
		g.drawOval(x - radius / 10 - 5, y - radius / 10 + 50, 5, 5);
		g.drawOval(x - radius / 10 + 15, y - radius / 10 + 50, 5, 5);
		g.drawOval(x - radius / 10 - 15, y - radius / 10 + 50, 5, 5);
		g.drawOval(x - radius / 10, y - radius / 10 + 60, 5, 5);
		g.drawOval(x - radius / 10 + 10, y - radius / 10 + 60, 5, 5);
		g.drawOval(x - radius / 10 - 10, y - radius / 10 + 60, 5, 5);
		g.drawOval(x - radius / 10 + 5, y - radius / 10 + 70, 5, 5);
		g.drawOval(x - radius / 10 - 5, y - radius / 10 + 70, 5, 5);
		g.drawOval(x - radius / 10, y - radius / 10 + 80, 5, 5);

	}
}
