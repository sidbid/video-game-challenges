package keybinds.main;

public interface Savable {
	
	void save (DataSaver s);
	
	String extract (DataSaver s);
}
