/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeSpeechRecognition;

import java.io.*;
import com.sun.speech.freetts.*;
import java.util.Scanner;

/**
 *
 * @author ProWinJVM
 */
public class SimplyConvertingInputTextToSpeech {

    private static final String VOICENAME = "kevin16";

    public void convertToSpeech(String text, boolean a) {
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        if(a){
               voice.speak("What Can I do For You Sir??  Please Say Something!!");

        }
        
        else if(!a) {
            try {
                voice.speak(text);
                for (int i = 0; i <= 50000; i++) {

                }
                voice.speak("Alright??Reading Is Over !!Thank You Sir!!");

            } catch (Exception ex) {

            }
        }

    }

    public static void main(String[] args) {
        SimplyConvertingInputTextToSpeech input = new SimplyConvertingInputTextToSpeech();
        input.convertToSpeech("",true);
        Scanner in = new Scanner(System.in);
        String Data;
        System.out.println("Enter the text to speak:");
        Data = in.nextLine();
        input.convertToSpeech(Data,false);
        System.out.println("Reading Over!!!");
        
    }
}
