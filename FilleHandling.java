import java.io.File;

import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		File ab=new File("C:\\mani\\hari\\hello1.pdf");
		try
		{
			System.out.println("is file created=?"+ab.createNewFile());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
           }
      }
  

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingExample {

	public static void main(String[] args) throws IOException {
		FileReader ab=new FileReader("C:\\mani\\hari\\xyz\\abc\\hello.txt");
		BufferedReader b=new BufferedReader(ab);
		String st=b.readLine();
		while(st!=null)
		{
			System.out.println(st);
			st=b.readLine();
		}
          b.close();
          ab.close();
	}

}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class TextFileModificationProgram
{   
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        modifyFile("C:\\mani\\hari\\xyz\\abc\\hello.txt", "85", "95");
        System.out.println("done");
    }
}

import java.io.IOException; 
import java.nio.file.*; 
  
public class Test 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            Files.deleteIfExists(Paths.get("C:\\mani\\hari\\xyz\\abc\\hello.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 
}
