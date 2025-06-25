import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LibraryManager {
    String path;

    public LibraryManager() {
        path = "./library.txt";
    }

    public void writeLibrary(Library lib) {
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(lib.toString());
            writer.flush();
            writer.close();
        } catch (Exception ex) {}
    }

    public Library[] getAllLibraries() {
        File file = new File(path);
        int count = 0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
        } catch (Exception ex) {}

        Library[] libraries = new Library[count];
        try {
            Scanner sc = new Scanner(file);
            for (int i = 0; i < count; i++) {
                String line = sc.nextLine();
                Library lib = new Library(line);
                libraries[i] = lib;
            }
        } catch (Exception ex) {}
        return libraries;
    }
}