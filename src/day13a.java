public class day13a{

static void main() {
    Path path = Path.of("file", "students.csv");
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