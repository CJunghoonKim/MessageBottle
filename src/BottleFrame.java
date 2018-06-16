import javax.swing.JFrame;

public class BottleFrame extends JFrame {
	
	public BottleFrame() {
		super("Message Bottle");
		createComponents();
	}
	
	public void createComponents() {
		BottlePanel panel = new BottlePanel();
		
		this.add(panel);
		this.setSize(panel.getWindowWidth(), panel.getWindowHeight());
		this.setVisible(true);
	}
}
