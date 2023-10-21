import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadCSV {
    private final Path filePath;

    public list <String> readlines;
    
    public ReadCSV(Path filePath) {
        this.filePath = filePath;
    }
    
    public List<String> readAllLines() throws IOException {
        return Files.readAllLines(filePath, StandardCharsets.ISO_8859_1);
    }

}
