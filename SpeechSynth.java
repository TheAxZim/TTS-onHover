
package speechsynth;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SpeechSynth {

    
	public static void main(String s[]) {

		JFrame frame = new JFrame("0x5P33CH 0x5YNTH3515 0x4 0xB1LL");
                
		JButton button = new JButton("Test Speech");
                
                button.addMouseListener(new MouseListener(){
                    
                    @Override
                    public void mouseExited(java.awt.event.MouseEvent e) {}
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {}
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent e) {}
                    @Override
                    public void mouseReleased(java.awt.event.MouseEvent e) {}

                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent e) {
                        System.out.println("Test2");
                        Voice voice;
  			VoiceManager voiceManager = VoiceManager.getInstance();
			voice = voiceManager.getVoice("kevin");
  			voice.allocate();
  			voice.speak("Waagwan gee gee");
                    }
                });
                
		frame.getContentPane().add(button, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(500, 90);
		frame.setVisible(true);
	}
    
}
