import java.io.*;

public class CoordinateParser {
    public static void main(String [] args) {

        // The name of the file to open.
        String readFile = "ExampleGPS.txt";
        String writeFile = "ExampleCorrectedGPS.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(readFile);
            // FileWriter copies text with additional formatting.
        	FileWriter fileWriter =
                    new FileWriter(writeFile);

            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            int first = 0;
            
            while((line = bufferedReader.readLine()) != null) {
            	if (first !=0)
            	{
            		bufferedWriter.write(",\r\n");
            	}
            	first++;
            	bufferedWriter.write("{lat: ");
                for (int i = 0; i< line.length(); i++)
                {
                	if (line.charAt(i) == ',')
                	{
                		bufferedWriter.write(", lng:");
                	}
                	
                	else
                	{
                		bufferedWriter.write(line.charAt(i));
                	}
                }
                bufferedWriter.write("}");
            }   

            // Always close files.
            bufferedReader.close();     
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                readFile + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + readFile + "'");                  
        }
    }
}
