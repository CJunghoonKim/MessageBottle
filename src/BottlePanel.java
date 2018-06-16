import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
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
	 * Buttons
	 */
	private JButton chooseFile;
	private JButton pushToEncrypt;
	
	/**
	 * Textfields
	 */
	private JTextField keyEntry;
	
	/**
	 * File chooser
	 */
	final JFileChooser fileOpener = new JFileChooser();;
	
	/**
	 * Constructor that initializes interface
	 */
	public BottlePanel() {
		createComponents();
	}
	
	/**
	 * Basic mutators and accessors
	 */
	public int getWindowHeight() {
		return WINDOW_HEIGHT;
	}
	
	public int getWindowWidth() {
		return WINDOW_WIDTH;
	}
	
	public void createComponents() {
		/**
		 * Initialization
		 */
		chooseFile = new JButton("Click to choose file");
		pushToEncrypt = new JButton("Encrypt");
		keyEntry = new JTextField("");

		/**
		 * Add to parent panel
		 */
		this.add(chooseFile);
		this.add(pushToEncrypt);
		this.add(keyEntry);
		
		/**
		 * Visual modifications
		 */
		keyEntry.setColumns(10);
		
		this.setVisible(true);
	}
}
