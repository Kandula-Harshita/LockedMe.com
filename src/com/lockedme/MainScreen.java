package com.lockedme;

public class MainScreen {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileUtils.createOrCleanUp("lockedme");
		
		MenuOptions.printOptions();
		
		HandleOptions.handleWelcomeScreenInput("lockedme");
	}

	
}
