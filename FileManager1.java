package mysrum1package;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager1 {
	/**
	 * This method will return the file names from the folder
	 * 
	 * @param folderpath
	 * @return List<String>
	 */
	public static List<String> getAllFiles(String folderpath) {
		// Creating File object
		File f1 = new File(folderpath);

		// Getting all the files into FileArray
		File[] listofFiles = f1.listFiles();

		// Declare a list to store file names
		List<String> fileNames = new ArrayList<String>();

		for (File f : listofFiles)
			fileNames.add(f.getName());

		// Returns the List
		return fileNames;

	}

	/**
	 * This method creates or append content into the file specified
	 * 
	 * @param folderpath
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static boolean createFiles(String folderpath, String fileName, List<String> content) {
		try {
			File f1 = new File(folderpath, fileName);
			FileWriter fw = new FileWriter(f1);

			for (String s : content) {
				fw.write(s + "\n");
			}
			fw.close();
			return true;
		} catch (Exception Ex) {
			return false;
		}

	}
}
