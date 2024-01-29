package problem_solving;
import java.io.*;
public class test {
    public static void main(String[] args) {
        char[] array = {'H','e','l','l','o'};
        try {
            CharArrayReader reader=new CharArrayReader(array);
            System.out.print("The characters read from the reader:");
            int charRead;
            while ((charRead=reader.read())!=-1) {
                System.out.print((char)charRead+",");
            }
            reader.close();
        } catch (IOException ex)
        {
            System.out.print(ex);
        }
    }
}
