package com.jshape.example;

import javax.swing.*;
import java.awt.*;

public class BasicEx extends JFrame {

	public BasicEx(){
		initUI();
	}

	private void initUI() {
		add(new Basic());
		setTitle("Simple Java 2D");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				BasicEx ex = new BasicEx();
				ex.setVisible(true);
			}
		});
	}

}
