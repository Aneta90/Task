package Input_Output;

import Model.Data;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class InputFromFile {

    public static List<Data> readTextFromFile() throws FileNotFoundException { //Exception in thrown when file is not found. It can be caused for example by wrong path or when this file does not exist on the host environment.

        Path path = Paths.get("C:\\Users\\aw22\\Desktop\\Task\\src\\main\\resources\\agd.csv"); //file path
        List<Data> dataFromCSV;
        File inputFIle = new File(String.valueOf(path));
        InputStream inputStream = new FileInputStream(inputFIle); //FileInputStream obtains input bytes from a file in a file system
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream)); //BufferedReader reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.

        dataFromCSV = bufferedReader.lines().skip(1).map(x -> { //skip first line with 'titles'
            String[] split = x.split(","); //saving CSV to array, splitted by COMA
            Data data = new Data();
            data.setRok(split[0].replace("\"", ""));
            data.setKwartal(Integer.valueOf(split[1].replace("\"", "")));
            data.setMiesiac(split[2].replace("\"", ""));
            data.setTydzien(Integer.valueOf(split[3].replace("\"", "")));
            data.setDzienT(Integer.valueOf(split[4].replace("\"", "")));
            data.setDzien(Integer.valueOf(split[5].replace("\"", "")));
            data.setData(split[6].replace("\"", ""));
            data.setSwieto(split[7].replace("\"", ""));
            data.setProdukt_ID(Integer.valueOf(split[8].replace("\"", "")));
            data.setKod(split[9].replace("\"", ""));
            data.setProducent(split[10].replace("\"", ""));
            data.setGrupa_produktowa(split[11].replace("\"", ""));
            data.setKategoria(split[12].replace("\"", ""));
            data.setMiasto(split[13].replace("\"", ""));
            data.setWojewodztwo(split[14].replace("\"", ""));
            data.setRegion(split[15].replace("\"", ""));
            data.setPotencjal(split[16].replace("\"", ""));
            data.setPlatnosc(split[17].replace("\"", ""));
            data.setKanal(split[18].replace("\"", ""));
            data.setIlosc(Integer.valueOf(split[19].replace("\"", "")));
            data.setCena(split[20].replace("\"", ""));
            data.setCena_sprzedazy(Double.valueOf(String.valueOf(split[21]).replace("\"", "")));
            data.setKoszt_zm(split[22].replace("\"", ""));
            data.setKoszt_st(split[23].replace("\"", ""));
            data.setMarza_br(split[24].replace("\"", ""));
            data.setPromocja(split[25].replace("\"", ""));
            data.setPowiat_ID(split[26].replace("\"", ""));
            data.setWojew_ID(split[27].replace("\"", ""));
            return data;
        })
                .collect(Collectors.toList());
        return dataFromCSV;

    }
}
