package com.moodanalyzertest;

import com.moodanalyzer.MoodAnalyzer;
import com.moodanalyzer.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MoodAnalyzerTest {
  @Test
    public void SadMood() throws MoodAnalyzerException {
      MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is a Sad message");
      // Assert.assertEquals("SAD",moodAnalyser.analyseMood());
      try {
          Assert.assertEquals("SAD", moodAnalyser.analyseMood());
      } catch (MoodAnalyzerException e) {
      }
  }
@Test
public void HappyMoods() throws MoodAnalyzerException {
    MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is a happy message");
    //Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
    try {
        Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
    } catch (MoodAnalyzerException e) {
    }
}
    @Test
    public void nullMoodReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood=moodAnalyser.analyseMood();
        ExpectedException expectedException=ExpectedException.none();
        expectedException.expect((MoodAnalyzerException.class));
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void nullMoodThrowException() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        try{
            moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.exceptionType.Null,e.type);
        }
    }
}
