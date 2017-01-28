package com.pong.game;

/**
 *
 * @author Jordan
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pong extends JFrame {

	final static int WINDOW_WIDTH = 500;
	final static int WINDOW_HEIGHT = 300;

	public Pong() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new GamePanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		new Pong();
	}
}
