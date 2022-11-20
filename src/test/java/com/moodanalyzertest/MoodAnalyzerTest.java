package com.moodanalyzertest;

import com.moodanalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
  @Test
    public void SadMood() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
       moodAnalyser.analyseMood("This is a Sad message");
        Assert.assertEquals("SAD",moodAnalyser.analyseMood("SAD"));
    }
@Test
public void HappyMoods() {
    MoodAnalyzer moodAnalyser = new MoodAnalyzer();
     moodAnalyser.analyseMood("This is a happy message");
    Assert.assertEquals("HAPPY", moodAnalyser.analyseMood("HAPPY"));
}
}
