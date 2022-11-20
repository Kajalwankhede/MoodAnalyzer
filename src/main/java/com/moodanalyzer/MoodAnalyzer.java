package com.moodanalyzer;
public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public void analyseMood(String message) throws MoodAnalyzerException {
        this.message = message;
        analyseMood();
    }


    /*public String analyseMood() {
      if (message.contains(("SAD"))) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }*/
      /*  try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }*/

    public String analyseMood() throws MoodAnalyzerException{
        try {
            if(message.length()==0)
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.empty,"Enter Mood");
            if(message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.Null,"Enter mood");
        }
    }
}