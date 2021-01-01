package keybinds.main;

public abstract class SingleAction implements Notatable, Savable {
	
	public static enum Variants {
			KEY_PRESS,
			KEY_HOLD,
			MOUSE_CLICK,
			MOUSE_MOVE,
			DELAY
	}
	
	public abstract Variants getVariant ();
	
	public DataSaver saver;
	
	public SingleAction(DataSaver saver) {
		this.saver = saver;
	}
	
}
