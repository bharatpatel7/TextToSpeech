package com.example.texttospeech;


import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


import java.util.ArrayList;

@RestController
@RequestMapping("/api/text-to-speech")
public class TextToSpeechController {

    @GetMapping("/voices")
    public ArrayList<String> getVoices() {
        return TextToSpeechService.getVoices();
    }

    @GetMapping("/speed-rates")
    public ArrayList<String> getSpeedRates() {
        return TextToSpeechService.getSpeedRate();
    }

    @GetMapping("/volume-levels")
    public ArrayList<String> getVolumeLevels() {
        return TextToSpeechService.getVolumeLevels();
    }

    @PostMapping("/speak")
    public void speak(@RequestParam String message,
                      @RequestParam String voiceType,
                      @RequestParam String rate,
                      @RequestParam String volume) {
        TextToSpeechService.speak(message, voiceType, rate, volume);
    }
}
