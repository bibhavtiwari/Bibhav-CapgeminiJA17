package Labbook3;
import java.io.*;
public class Display {
	public static void main(String[] args)throws IOException {
		 File file = new File("G:\\CapgeminiJA17\\LabbookExercises\\src\\Labbook3\\TextCount.txt");
	        FileInputStream fileStream = new FileInputStream(file);
	        InputStreamReader input = new InputStreamReader(fileStream);
	        BufferedReader reader = new BufferedReader(input);  
	        String line;
	        int countWord = 0;
	        int sentenceCount = 0;
	        int characterCount = 0;

	        while((line = reader.readLine()) != null)
	        {
	                characterCount += line.length();
	             
	                String[] wordList = line.split("\\s+");
	                  
	                countWord += wordList.length;
	                String[] sentenceList = line.split("[!?.:]+");  
	                sentenceCount += sentenceList.length;
	        }
	          
	        System.out.println("Total word count = " + countWord);
	        System.out.println("Total number of lines = " + (sentenceCount-1));
	        System.out.println("Total number of characters = " + characterCount);
	        
	        reader.close();
	      }}
