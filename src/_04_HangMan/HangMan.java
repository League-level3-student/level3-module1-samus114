package _04_HangMan;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	Utilities util = new Utilities();
	String numOWords = "";
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.start();
	}
	void start() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		System.out.println(util.getTotalWordsInFile("dictionary.txt"));
		numOWords = JOptionPane.showInputDialog("give me a number between 1 and 266");
		System.out.println(util.readRandomLineFromFile("dicitionary.txt"));
	}
}
