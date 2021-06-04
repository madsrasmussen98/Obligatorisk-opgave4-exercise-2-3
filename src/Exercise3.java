import java.io.*;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        //i create a new file object
        File file = new File("C:/Users/Mads/wordscounted.txt");
        // i initialize the word array
        String[] words=null;
        //Initial wordcount is 0
        int wordCount = 0;
        // I instantiate a filereader object
        FileReader fr = new FileReader(file);
        //I instantiate a buffered reader object
        BufferedReader br = new BufferedReader(fr);
        String s;
        //I read the content from the fil
        while((s=br.readLine())!= null){
            words=s.split(" ");
           //word count is added for each word in the file
            wordCount=wordCount + words.length;
        }
        fr.close();
        //Finally i print out the total number of words counted in the file
        System.out.println("Number of words in the file are: " + wordCount);

    }
}
