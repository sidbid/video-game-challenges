package keybinds.main;

import java.io.File;

public class DataSaver {
	
	public File file;
	
	public DataSaver (String fileLocation) {
		this.file = new File(fileLocation);
	}

}
