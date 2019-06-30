package Analyzers;

import Model.Data;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MedianAnalyzer implements Analyzer {
    @Override
    public void analyze(List dataFromCS) {

        List<Data> dataFromCSV = dataFromCS;

        List<Data> list = dataFromCSV.stream().filter(a->a.getWojewodztwo().equals("Dolnośląskie")).collect(Collectors.toList());
        list.sort(Comparator.comparingDouble(Data::getCena_sprzedazy));
        double median = list.get(list.size()/2).getCena_sprzedazy();
        if(list.size()%2 == 0) median = (median + list.get(list.size()/2-1).getCena_sprzedazy()) / 2;

        System.out.println("Median for Dolnośląskie area" + "\n"+ median); // method can be used for each area/method payment etc. by changing value "Dolnośląskie". Firstly, stream sorts values and then it is checked if list size is even or odd to calculate proper median value

    }
}
