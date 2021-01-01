package keybinds.main;

public class Delay extends SingleAction {
	
	public float duration;

	public Delay(DataSaver saver, float duration) {
		super(saver);
		this.saver = saver;
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

	@Override
	public Variants getVariant() {
		return Variants.DELAY;
	}

}
