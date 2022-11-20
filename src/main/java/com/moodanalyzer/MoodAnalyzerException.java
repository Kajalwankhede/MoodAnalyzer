package com.moodanalyzer;

public class MoodAnalyzerException extends  Exception{
    public enum exceptionType{
        empty, Null
    }
 public exceptionType type;

    public MoodAnalyzerException(exceptionType type, String message){
        super(message);
        this.type=type;
    }

}
