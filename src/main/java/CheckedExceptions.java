import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args){
        try {
            System.out.println("Opening file: ");
            readFile("C:\\Users\\gabad\\OneDrive\\Desktop\\TreningFirstDay\\src\\main\\java\\text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Wyrzucam wyjątek...");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
