package com.jshape.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PointEx extends JFrame {

	public PointEx() {
		initUI();
	}

	private void initUI() {
		Point point = new Point();
		add(point);

		setTitle("POINT");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Timer timer = point.getTimer();
				timer.stop();
			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				PointEx pointEx = new PointEx();
				pointEx.setVisible(true);
			}
		});
	}

}
