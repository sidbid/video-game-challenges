package keybinds.main;

public class KeyPress extends SingleAction {
	
	public DataSaver saver;
	public int keycode;

	public KeyPress(DataSaver saver, int keycode) {
		super(saver);
		this.saver = super.saver;
		this.keycode = keycode;
	}

	@Override
	public String notate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notatable unNotate(String original) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(DataSaver s) {
		// TODO Auto-generated method stub

	}

	@Override
	public String extract(DataSaver s) {
		// TODO Auto-generated method stub
		return null;
	}

}
