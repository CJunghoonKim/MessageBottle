import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author coryj
 *
 * Basic image encryptor that utilizes symmetric encryption.
 */

@SuppressWarnings("serial")
public class BottlePanel extends JPanel {
	
	/**
	 * Window size parameters
	 */
	private final static int WINDOW_HEIGHT = 400;
	private final static int WINDOW_WIDTH = 600;
	
	/**
	 * Labels
	 */
	private JLabel title;
	
	/**
	 * Buttons
	 */
	private JButton chooseImage;
	private JButton pushToEncrypt;
	
	/**
	 * Textfields
	 */
	private JTextField password;
	
	private BottlePanel() {
		
	}
	
	public void createComponents() {
		
	}
}
