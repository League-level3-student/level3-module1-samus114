package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	JFrame frame = new JFrame("hotel log");
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> strings;
	public static void main(String[] args) {
		
	}
	_02_GuestBook() {
		strings = new ArrayList<String>("Bob Banders", "Sandy Summers", "Greg Ganders", "Donny Doners");
		strings.add()
	}
	void start() {
		frame.add(panel);	
		button.addActionListener(this);
		button2.addActionListener(this);
		}
	void addName() {
		
	}
	void viewNames() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			addName();
		} else if (e.getSource() == button2) {
			
		}
	}
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
