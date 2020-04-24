package _01_IntroToArrayLists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class _06_IPodShuffle implements ActionListener{
	Song songer = new Song("The Sound of Silence - 18 String Harp Guitar Cover.mp3");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton whatEverYouWantTo = new JButton("SuRpRiSe Me!");
	JButton stop = new JButton("StOp ThE sOnG");
	ArrayList<Song> songs;
	Song sang = new Song("demo.mp3");
	Random rand = new Random();
	int ban;
	Song playing;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		songs = new ArrayList<Song>();
		songs.add(new Song("Desp.mp3"));
		songs.add(new Song("marsh.mp3"));
		songs.add(songer);
		frame.add(panel);
		panel.add(whatEverYouWantTo);
		panel.add(stop);
		frame.setVisible(true);
		frame.pack();
		stop.addActionListener(this);
		whatEverYouWantTo.addActionListener(this);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
	}
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == whatEverYouWantTo) {
			if (playing != null) {
				playing.stop();
			}
			ban = rand.nextInt(songs.size());
			System.out.println("a song");
			for (int i = 0; i < songs.size(); i++) {
				playing = songs.get(ban);
				playing.play();
			}  
	} else if (e.getSource() == stop) {
		if (playing != null) {
			try {
				playing.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println("stop");
	}
}
}