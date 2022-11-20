package com.moodanalyzer;
public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyseMood() {
      /*  if (message.contains(("SAD"))) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }*/
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}