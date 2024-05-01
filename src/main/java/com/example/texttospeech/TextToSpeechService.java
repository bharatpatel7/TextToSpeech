
package com.example.texttospeech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.util.ArrayList;

public class TextToSpeechService {
    private static VoiceManager voiceManager = VoiceManager.getInstance();

    public static ArrayList<String> getVoices() {
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");


        ArrayList<String> voices = new ArrayList<>();
        for(Voice voice : voiceManager.getVoices()){
            voices.add(voice.getName());
        }

        return voices;
    }

    public static ArrayList<String> getSpeedRate() {
        ArrayList<String> speedRate = new ArrayList<>();
        speedRate.add("140");
        speedRate.add("170");
        speedRate.add("200");
        speedRate.add("100");
        speedRate.add("60");
        return speedRate;
    }

    public static ArrayList<String> getVolumeLevels() {
        ArrayList<String> volumeLevels = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            volumeLevels.add(Integer.toString(i));
        }
        return volumeLevels;
    }

    public static void speak(String message, String voiceType, String rate, String volume) {
        Voice voice = voiceManager.getVoice(voiceType);
        if(voice == null){
            System.err.println("Can not found voice: kevin16");
            System.exit(1);
        }
    }
}
