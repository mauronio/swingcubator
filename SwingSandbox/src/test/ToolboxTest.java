package test;

import java.io.File;

import toolbox.Factory;
import toolbox.FileChooser;

public class ToolboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File selected = Factory.getFileChooser().getSelectedFile();
				
		if (selected!=null) {
			System.out.println("filepath = " + selected.getPath());
		} else {
			System.out.println("no file selected");
		}
	}

}
