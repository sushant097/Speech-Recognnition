/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReadingIntoSpeech;

import java.io.*;
import com.sun.speech.freetts.*;

/**
 *
 * @author ProWinJVM
 */
public class ReadingTheFile {
    // Some available voices are (kevin, kevin16, alan)
	private static final String VOICE_NAME_KEVIN = "kevin16";
	private final Voice voice;
	
	public ReadingTheFile() {

		VoiceManager vm = VoiceManager.getInstance();		
		voice = vm.getVoice(VOICE_NAME_KEVIN);
		voice.allocate();
	}
	
	public void speak(File file) {
		
		if(file != null) {
			
			FileInputStream inputStream = null;
			try {
			
				inputStream = new FileInputStream(file);
				voice.speak(inputStream);
				
			} catch (FileNotFoundException e) {
				
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
        
        public static void main(String[] args) {
        
		// Defining File Object 
		File file = new File("input.txt");
		
		ReadingTheFile fttsc = new ReadingTheFile();

		// Passing file object as argument
		fttsc.speak(file);
		
		System.out.println("Reading is over!!!!");
    }
}


