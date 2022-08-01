import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        try {
            InputStream file = new FileInputStream("F:\\open-bootcamp\\intro-computacion\\projects\\leer_ficheros\\texto.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("Continuo trabajando");
    }
}
