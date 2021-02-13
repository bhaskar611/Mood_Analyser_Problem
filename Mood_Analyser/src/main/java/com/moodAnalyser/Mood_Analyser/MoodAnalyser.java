package com.moodAnalyser.Mood_Analyser;

public class MoodAnalyser {
	public void WelcomeMessage() {
		System.out.println("******Welcome to the Mood Analyser Problem*******");
	}
	
	public String AnalyseMood(String message) {
		if(message.contains("Sad")) {
		return "SAD";
		}
		else {
		return "HAPPY";
		}
	}

}
