package com.sandbox.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.Action;

public class MainApp {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpenFile = new JMenuItem("Open File...");
		mntmOpenFile.setAction(action);
		mnFile.add(mntmOpenFile);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane = new JDesktopPane();
		scrollPane.setViewportView(desktopPane);
		
		//JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		//internalFrame.setBounds(171, 73, 189, 72);
		//internalFrame.setResizable(true);
		//desktopPane.add(internalFrame);
		//internalFrame.setVisible(true);

		IfEditor ifEditor = new IfEditor();
		ifEditor.setBounds(176, 25, 189, 72);
		ifEditor.setResizable(true);
		desktopPane.add(ifEditor);
		ifEditor.setVisible(true);

		IfMultiEditor ifMultiEditor = new IfMultiEditor();
		ifMultiEditor.setLocation(35, 106);
		//ifMultiEditor.setBounds(171, 73, 189, 72);
		ifMultiEditor.setResizable(true);
		desktopPane.add(ifMultiEditor);
		ifMultiEditor.setVisible(true);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Open File...");
			putValue(SHORT_DESCRIPTION, "Open a File");
		}
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			chooser.setCurrentDirectory(new File("c:\\"));
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				System.out.println("You chose to open this file: " +
						chooser.getSelectedFile().getName());
				System.out.println("Path: " +
						chooser.getSelectedFile().getParent());
				
				
			}
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
