package Analyzers;

import Model.Data;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinAndMaxValueAnalyzer implements Analyzer {

    @Override
    public void analyze(List dataFromCS) {

        List<Data> dataFromCSV = dataFromCS;

        System.out.println("Min and max value for each product group");

        Map<String, DoubleSummaryStatistics> minAndMaxValueForEachProductGroup = dataFromCSV.stream()
                .collect(Collectors.groupingBy(Data::getGrupa_produktowa, Collectors.summarizingDouble(Data::getCena_sprzedazy)));
        minAndMaxValueForEachProductGroup.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getMax() + " " + e.getValue().getMin()));

        //Stream in this case is used for collecting statistics such as  min and max value. It can be also used with different values like long- LongSummaryStatistics or int- IntSummaryStatistics.

        System.out.println("Min and max value for each payment method ");

        Map<String, DoubleSummaryStatistics> minAndMaxValueForEachPaymentMethod = dataFromCSV.stream()
                .collect(Collectors.groupingBy(Data::getPlatnosc, Collectors.summarizingDouble(Data::getCena_sprzedazy)));
        minAndMaxValueForEachPaymentMethod.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getMax() + " " + e.getValue().getMin()));

        System.out.println("Min and max value for each area");

        Map<String, DoubleSummaryStatistics> minAndMaxValueForEachArea = dataFromCSV.stream()
                .collect(Collectors.groupingBy(Data::getWojewodztwo, Collectors.summarizingDouble(Data::getCena_sprzedazy)));
        minAndMaxValueForEachArea.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getMax() + " " + e.getValue().getMin()));

        System.out.println("Min and max value for each month in year 2004");

        Map<String, DoubleSummaryStatistics> minAndMaxValueForEachMonthInYear2004 = dataFromCSV.stream().filter(a -> a.getRok().equals("2004"))
                .collect(Collectors.groupingBy(Data::getMiesiac, Collectors.summarizingDouble(Data::getCena_sprzedazy)));
        minAndMaxValueForEachMonthInYear2004.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getMax() + " " + e.getValue().getMin()));

        System.out.println("Min and max value for each month in year 2005");

        Map<String, DoubleSummaryStatistics> minAndMaxValueForEachMonthInYear2005 = dataFromCSV.stream().filter(a -> a.getRok().equals("2005"))
                .collect(Collectors.groupingBy(Data::getMiesiac, Collectors.summarizingDouble(Data::getCena_sprzedazy)));
        minAndMaxValueForEachMonthInYear2005.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getMax() + " " + e.getValue().getMin()));


    }
}
