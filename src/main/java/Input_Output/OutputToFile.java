package Input_Output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class OutputToFile {

    public static boolean readResultToFile(Map<String,Double> resultMap,String text) {

        try (Writer writer = new FileWriter("C:\\Users\\aw22\\Desktop\\Task\\src\\main\\resources\\result.csv",true)) { //FileWriter is meant for writing streams of characters
         for (Map.Entry<String, Double> entry : resultMap.entrySet()) { //iterate over key-value pair using getKey() and getValue() methods of Map.Entry<K, V>. Uused if both map keys and values are needed
                writer.append(text).append("\n").append(entry.getKey())
                        .append(',')
                        .append(String.valueOf(entry.getValue()))
                        .append("\n");

            }
        } catch (IOException ex) { //This exception may be produced when Output/Input operations does not work.
            ex.printStackTrace(System.err);

        }

        return true;
    }

}

