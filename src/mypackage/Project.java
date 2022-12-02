package mypackage;

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Project {
	
	@SuppressWarnings("null")
	public static void main(String args[])throws IOException
	{
		Scanner s=new Scanner(System.in);
		int option;
		int suboption;
		System.out.println("Application Developer : Mohammed Sani Dankoly");
		System.out.println("File Menu Related Application");
		
		
		char ch = 0;
		do
		{
			System.out.println("Choose your option");
			System.out.println("1 - Display the Current File Name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			option=s.nextInt();
			String[] flist_search;
			switch(option)
			{
			case 1://Create the file

				File file=new File("c://java//nov22//test.txt");
				
				if(file.createNewFile())
				{
					System.out.println("File is created!");
				}
				else
				{
					System.out.println("File already exists.");
				}
				System.out.println("You are welcome");
				Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
				for (Path name: dirs) {
				    System.err.println(name);
				    				}
				break;
			case 2: //you need to write the logic to display the user
				//interface to perform various operations of file
				System.out.println("writer");
				System.out.println("Choose the operation to do...");
				System.out.println("11 - Add File");
				System.out.println("12 - Delete File");
				System.out.println("13 - Search File");
				System.out.println("14 - Back to Main Menu");
				suboption=s.nextInt();
				switch(suboption)
				{
				case 11:// you need to write a logic to add a file
				}

				String data="We are creating a file using FileOutputStreamClass";
							FileOutputStream out=new FileOutputStream("c://Java//Nov22//Test2.txt");
							out.write(data.getBytes());
							
				Files.write(Paths.get("c://Java//Nov22//Test3.txt"), data.getBytes());
		
				case 12:// you need to write a logic to delete a file
				{
					try {
						Files.deleteIfExists(Paths.get("d://Java//nov22//Test.txt"));
					}
					catch(NoSuchFileException e)
					{
						System.out.println("No such file/directory exists");
					}
					catch(DirectoryNotEmptyException e)
					{
						System.out.println("Directory is not empty");
					}
					catch(IOException e)
					{
						System.out.println("Invalid permissions");
					}
					System.out.println("Deletion successful");
				}

				case 13: // you need to write a logic to search a file
				 flist_search = directory_search("d://Java//dec22//Test.txt");
					int flag_s = 0;
				if (flist_search != null) {
						System.out.println("There is no file present in the directory");
					} else {

						// Linear search in the array
						for (int i = 0; i<flist_search.length; i++) {
							String search_filename = flist_search[i];
							String filename = "d://Java//dec22//Test3.txt";
							if (search_filename.equalsIgnoreCase(filename)) {
								System.out.println(search_filename + " found");
								flag_s = 1;
							}
						}
					}

					if (flag_s == 0) {
						System.out.println("File Not Found");
					}

					return;
					
				case 14:// you need to write a logic to return to main menu
			System.exit(3);
				case 3: 
					System.out.println("thank you");
					break;
				
				}
				
			}while(true);
		}

	private static String[] directory_search(String string) {
		// TODO Auto-generated method stub
		return null;
	}
		

	}
