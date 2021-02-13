package com.moodAnalyser.Mood_Analyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	// Welcome Message
	@Test
	public void Welcome_Message() {
		MoodAnalyser mood = new MoodAnalyser();
		mood.WelcomeMessage();
	}
	// Test Case1
	@Test 
	public void Given_Message_When_Sad_Should_Return_Sad() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("I am in a Sad Mood");
		Assert.assertEquals("SAD", mood);
	}
    // Test Case2
	@Test 
	public void Given_Message_When_Happy_Should_Return_Happy() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("I am in any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
}
