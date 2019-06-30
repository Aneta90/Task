package Analyzers;

import Input_Output.OutputToFile;
import Model.Data;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAnalyzer implements Analyzer { //Each Analyzer implements interface, Java uses interfaces to implement multiple inheritance

    @Override
    public void analyze(List dataFromCS) { // We use @Override to override a method in sub class, it is not mandatory to use this annotation while overriding the method

        List<Data> dataFromCSV = dataFromCS;

        Map<String, Double> averageForEachProductGroup = dataFromCSV.stream().collect(Collectors.groupingBy(Data::getGrupa_produktowa, Collectors.averagingDouble(Data::getCena_sprzedazy))); // Using stream, I group products by distinct product groups and count average price for each product group (functional programming). Stream uses lambda expressions. Stream supports sequential parallel processing, which can be very helpful in achieving high performance for large collections.

        System.out.println("Average price for each product group" + averageForEachProductGroup);
        String text = "Average price for each product group";
        System.out.println(OutputToFile.readResultToFile(averageForEachProductGroup,text)); // Result from stream is written to the file named result.csv

        Map<String, Double> averageForEachPaymentMethod = dataFromCSV.stream().collect(Collectors.groupingBy(Data::getPlatnosc, Collectors.averagingDouble(Data::getCena_sprzedazy)));

        System.out.println("Average price for each payment method" + averageForEachPaymentMethod);
        String text1 = "Average price for each payment method";
        System.out.println(OutputToFile.readResultToFile(averageForEachPaymentMethod,text1));

        Map<String, Double> averageForEachArea = dataFromCSV.stream().collect(Collectors.groupingBy(Data::getWojewodztwo, Collectors.averagingDouble(Data::getCena_sprzedazy)));

        String text2 = "Average price for each area";
        System.out.println("Average price for each area" + averageForEachArea);
        System.out.println(OutputToFile.readResultToFile(averageForEachArea,text2));

        Map<String, Double> averageForYear2004 = dataFromCSV.stream().filter(a -> a.getRok().equals("2004")).collect(Collectors.groupingBy(Data::getMiesiac, Collectors.averagingDouble(Data::getCena_sprzedazy)));

        Map<String, Double> averageForYear2005 = dataFromCSV.stream().filter(a -> a.getRok().equals("2005")).collect(Collectors.groupingBy(Data::getMiesiac, Collectors.averagingDouble(Data::getCena_sprzedazy)));

        String text3= "Average price for each month in year 2004";
        String text4= "Average price for each month in year 2005";
        System.out.println("Average price for each month in year 2004" + averageForYear2004);
        System.out.println(OutputToFile.readResultToFile(averageForYear2004,text3));

        System.out.println("Average price for each month in year 2005" + averageForYear2005);
        System.out.println(OutputToFile.readResultToFile(averageForYear2005,text4));

    }
}

