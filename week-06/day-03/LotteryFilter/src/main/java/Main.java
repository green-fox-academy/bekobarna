import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

    public static void main(String[] args) {

        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        OptionSet options = parser.parse(args);


        if (options.has("y")) {
            readFromFileWriteToFile();
        }

        if (options.has("f")) {
            System.out.println("`-l` was given with the no additional information.");
        }

        if (options.has("o")) {
            System.out.println("`-l` was given with the no additional information.");
        }

    }

        public static void readFromFileWriteToFile() {
            try {
                CSVReader reader = new CSVReader(new FileReader("C:\\Users\\bekob\\greenfox\\bekobarna\\week-06\\day-03\\LotteryFilter\\src\\assets\\otos.csv"));
                List<String[]> lines = reader.readAll();
                CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\bekob\\greenfox\\bekobarna\\week-06\\day-03\\LotteryFilter\\src\\assets\\output.csv"));
                writer.writeAll(lines);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

