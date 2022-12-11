package com.lockedme;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HandleOptions {
	public static void handleWelcomeScreenInput(String dirName) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					List<String> fileList = FileUtils.getFiles(dirName);
					System.out.println("Found total of "+fileList.size()+ " files in "+dirName+" folder");
					Collections.sort(fileList);
					fileList.stream().forEach(i->System.out.println(i));
					break ;
				case 2:
					HandleOptions.handleFileMenuOptions(dirName);
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput(dirName);
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOptions(String dirName) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayFileMenuOptions();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = sc.next();
					
					FileUtils.addFile(dirName,fileToAdd);
					
					break;
				case 2:
					// File/Folder delete
					System.out.println("Enter the name of the file to be deleted from \"main\" folder");
					String fileToDelete = sc.next();
					FileUtils.deleteFile(dirName, fileToDelete);
					break;
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = sc.next();
					FileUtils.searchFile(dirName, fileName);
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions(dirName);
			}
		} while (running == true);
	}
}
