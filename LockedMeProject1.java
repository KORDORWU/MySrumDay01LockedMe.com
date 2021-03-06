package mysrum1package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject1 {

	static final String folderpath = "C:\\MyPhase1Project\\LockedMeFiles";

	public static void main(String[] args)

	{
		// Variable declaration
		Scanner obj = new Scanner(System.in);
		String fileName;
		int linesCount;
		List<String> content = new ArrayList<String>();

		// Read file name from user
		System.out.println("Enter file Name:");
		fileName = obj.nextLine();

		// Read number of lines from user
		System.out.println("Enter the number of lines in the file:");
		linesCount = Integer.parseInt(obj.nextLine());

		// Read Lines from user
		for (int i = 1; i <= linesCount; i++) {
			System.out.println("Enter line " + i + ":");
			content.add(obj.nextLine());
		}

		// Save the content into the file
		boolean isSaved = FileManager1.createFiles(folderpath, fileName, content);

		if (isSaved)
			System.out.println("File and data saved successfully");
		else
			System.out.println("Some error occured.Please contact admin@niccomplex.com");
	}

}
