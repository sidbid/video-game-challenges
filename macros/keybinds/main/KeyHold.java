package keybinds.main;

public class KeyHold extends SingleAction {
	
	public DataSaver saver;
	public int keycode;
	public float duration;

	public KeyHold(DataSaver saver, int keycode, float duration) {
		super(saver);
		this.saver = super.saver;
		this.keycode = keycode;
		this.duration = duration;
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
