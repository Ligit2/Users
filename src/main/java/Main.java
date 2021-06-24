public class Main {
    public static void main(String[] args) {
        CsvFileWriter.writeCsvFile("AllUsers.csv",Users.getUsersList());
        CsvFileWriter.writeOnDiffFiles(CSVParser.parse());
    }
}
