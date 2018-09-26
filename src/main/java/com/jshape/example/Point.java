package com.jshape.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Point extends JPanel implements ActionListener {

	private final int DELAY = 150;
	private Timer timer;

	public Point() {
		initTimer();
	}

	private void initTimer() {
		timer = new Timer(DELAY, this);
		timer.start();
	}

	public Timer getTimer() {
		return timer;
	}

	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.blue);

		int w = getWidth();
		int h = getHeight();

		Random random = new Random();

		for (int i = 0; i < 2000; i++) {
			int x = Math.abs(random.nextInt()) % w;
			int y = Math.abs(random.nextInt()) % h;
			g2d.drawLine(x, y, x, y);
		}

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
