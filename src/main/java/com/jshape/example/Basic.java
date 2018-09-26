package com.jshape.example;

import javax.swing.*;
import java.awt.*;

public class Basic extends JPanel {

	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawString("Java 2D", 50, 50);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}

}
