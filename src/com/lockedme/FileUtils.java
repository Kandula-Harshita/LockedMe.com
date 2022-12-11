package com.lockedme;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileUtils {
	
	public static boolean addFile(String dirName,String file) {
		File f = new File(dirName,file);
		try {
			if(f.exists()) {
				System.out.println("Unable to create the file as the file already exists in the directory");
				return true;
			}
			return f.createNewFile();
		}catch(Exception e) {
			System.out.println("Unable to add new file to the system");
			return true;
		}
	}
	
	public static boolean deleteFile(String dirName,String file) {
		File f=new File(dirName,file);
		try {
			if (!f.exists()) {
				System.out.println("Mentioned file doesn't exist in the directory,unable to delete");
				return true;
			}
			f.delete();
			return true;
		}catch (Exception e) {
			System.out.println("Unable to delete file from the system");
			return true;
		}
	}
	
	public static List<String> getFiles(String dirName) {
		File f = new File(dirName);
		List<String> sortedList = Arrays.asList(f.list());
		Collections.sort(sortedList);
		return sortedList;

	}
	
	public static String createOrCleanUp(String dirName) {
		File f = new File(dirName);
		if(f.exists()) {
			for(File file : f.listFiles()) {
				file.delete();
			}
		}else {
			f.mkdirs();
		}
		return f.getPath();
	}
	
	public static void searchFile(String dirName,String fileName) {
		File f = new File(dirName);
		for (String s:f.list()){
			if (s.equalsIgnoreCase(fileName)){
				System.out.println("File Name found with file name : "+fileName);
				return;
			}
			
		}
		System.out.println("File Not found in the base directory");
	}
}
