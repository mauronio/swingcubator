package toolbox;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser extends Tool {

	private static String PARAM_DEFAULT_DIRECTORY = "default.directory";
	
	private String defaultDirectory = null;
	
	public File getSelectedFile() {
		return getSelectedFile(null, null);
	}

	public File getSelectedFile(String initialDirectory, String fileNameExtensionDesc, String... extensions) {
		
		File selectedFile = null;
		
		String directory = (initialDirectory!=null ? initialDirectory : this.getToolPropertyValue(PARAM_DEFAULT_DIRECTORY));
		
		JFileChooser chooser = new JFileChooser();
		
		if (fileNameExtensionDesc!=null) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(fileNameExtensionDesc, extensions);
			chooser.setFileFilter(filter);
		}
		
		if (directory!= null) {
			System.out.println("setCurrentDirectory: " + directory);
			chooser.setCurrentDirectory(new File(directory));
		}
		
		int returnVal = chooser.showOpenDialog(null);

		if(returnVal == JFileChooser.APPROVE_OPTION) {
			selectedFile = chooser.getSelectedFile();
			this.setToolPropertyValue(PARAM_DEFAULT_DIRECTORY, selectedFile.getParent());
		}
			
		return selectedFile;

	}
}
