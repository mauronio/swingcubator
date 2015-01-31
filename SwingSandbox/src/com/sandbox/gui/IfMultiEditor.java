package com.sandbox.gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class IfMultiEditor extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IfMultiEditor frame = new IfMultiEditor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IfMultiEditor() {
		setBounds(100, 100, 678, 446);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JSplitPane splitPane = new JSplitPane();
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane_1.setLeftComponent(scrollPane);
		
		JTree tree = new JTree();
		scrollPane.setViewportView(tree);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		splitPane_1.setRightComponent(scrollPane_1);
		
		JTree tree_1 = new JTree();
		scrollPane_1.setViewportView(tree_1);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Default", null, panel_3, null);

	}
}
