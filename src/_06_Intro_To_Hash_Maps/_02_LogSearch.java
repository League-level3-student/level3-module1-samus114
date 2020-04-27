package _06_Intro_To_Hash_Maps;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Add an Entry");
	JButton button2 = new JButton("Find an Entry");
	JButton button3 = new JButton("View all Entries");
	String entries = "";
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	int idNum = 0;
	String name = "";
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.start();
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 */
	void addEntry() {
		String idNumS = JOptionPane.showInputDialog("What is your id Number?");
		idNum = Integer.parseInt(idNumS);
		name = JOptionPane.showInputDialog("What is your name");
		hashMap.put(idNum, name);
	}
	 /* Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 */ 
	 void findEntry() {
		 String idNumS = JOptionPane.showInputDialog("What is the id Number of the person you are looking for?");
		 idNum = Integer.parseInt(idNumS);
		for (Integer key : hashMap.keySet()) {
			if (key == idNum) {
				JOptionPane.showMessageDialog(null, "The persons name is: " + hashMap.get(idNum));
				break;
			}
		}
	 }
	/* Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	*/ 
	 void showEntries() {
		 JOptionPane.showMessageDialog(null, "Here are the entries.");
		 for (Integer key : hashMap.keySet()) {
			 entries = entries + "\n ID: " + key + " Name: " + hashMap.get(key);
		}
		 JOptionPane.showMessageDialog(null, entries);
	 }
	 /* When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 */
	private void start() {
		// TODO Auto-generated method stub
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if (e.getSource() == button) {
		addEntry();
	}else if (e.getSource() == button2) {
		findEntry();
	}else if (e.getSource() == button3) {
		showEntries();
	}
	}
	
}
