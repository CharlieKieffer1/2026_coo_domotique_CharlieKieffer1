package thermos;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * classe graphique gerant un Thermostat utilise heritage de JPanel pour ecrire
 * rapidement la classe mais il faudrait plutot utiliserun MVC (cf partie TP
 * graphique avec appartement)
 * 
 *
 */
public class Thermostat extends JPanel {

	/**
	 * la temperature du thermostat
	 */
	private int temperature;

	/**
	 * constructeur de thermostat
	 */
	public Thermostat() {
		super();
		setPreferredSize(new Dimension(100, 100));
		this.temperature = 20;

		// construction JFrame
		JFrame f = new JFrame();
		f.setContentPane(this);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * surcharge methode paint
	 */
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("" + this.temperature, 50, 50);
	}

	/**
	 * methode qui permet d'augmenter la temperature de consigne de 1 degr�.
	 * temperature maximale de 25 d�gr�
	 */
	public void monterTemperature() {
		temperature += 1;
		if (temperature > 25)
			temperature = 25;
		repaint();
	}

	/**
	 * methode qui permet de baisser la temperature de consigne de 1 degr�.
	 * temperature minimale de 25 d�gr�
	 */
	public void baisserTemperature() {
		temperature -= 1;
		if (temperature < 15)
			temperature = 15;
		repaint();
	}

	public int getTemperature() {
		return temperature;
	}

	public String toString() {
		return "Thermostat " + this.getTemperature();
	}
}
