
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
/*public class day13 {
    static void main() {
        Path path = Path.of("files", "report.txt");


        try {
            List<String> data = data =
                    Files.readAllLines(path);
            for (String line : data) {
                System.out.println(line);
            }
            List<String> newData = new ArrayList<>();
            newData.add("lazzi");
            newData.add("sajii");
            newData.add("dheshu");
            newData.add("ashmi");
            newData.add("rithu");

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
*/
public class day13{
    static void main() {
        Path path =Path.of("file", "students.csv");
        try {
            List<String> students = Files.readAllLines(path);

            for (String line : students) {
                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " | ");
                }
                System.out.println();
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}