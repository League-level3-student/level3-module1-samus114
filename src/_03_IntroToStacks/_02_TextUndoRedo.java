package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	public static void main(String[] args) {
		_02_TextUndoRedo tur = new _02_TextUndoRedo();
		tur.start();
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel. Every time a key is pressed, add
	 * that character to the JLabel. It should look like a basic text editor. Make
	 * it so that every time the BACKSPACE key is pressed, the last character is
	 * erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters. Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String string = "";
	Stack<String> deleted = new Stack<String>();

	void start() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setSize(300, 75);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub b
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			deleted.push(string.substring(string.length() - 1));
			string = string.substring(0, string.length() - 1);
		} else if (e.getKeyChar() >= 'A' && e.getKeyChar() <= 'Z') {
			string = string + "" + e.getKeyChar();
		} else if (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') {
			string = string + "" + e.getKeyChar();
		} else if (e.getKeyChar() == KeyEvent.VK_BACK_SLASH) {
			string = string + "" + deleted.pop();
		}
		label.setText(string);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
