package Analyzers;

import Input_Output.InputFromFile;
import Model.Data;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MultiAnalyzer {

    public MultiAnalyzer(ArrayList<Analyzer> analyzers) { //create List of Analyzers
        analyzers.add(averageAnalyzer);
        analyzers.add(minAndMaxValueAnalyzer);
        analyzers.add(medianAnalyzer);
        analyzers.add(standardDeviationAnalyzer);
    }

    private AverageAnalyzer averageAnalyzer = new AverageAnalyzer();
    private MinAndMaxValueAnalyzer minAndMaxValueAnalyzer = new MinAndMaxValueAnalyzer();
    private MedianAnalyzer medianAnalyzer = new MedianAnalyzer();
    private StandardDeviationAnalyzer standardDeviationAnalyzer = new StandardDeviationAnalyzer();

    public void perform() throws FileNotFoundException { //method for reading CSV values, each analyzer does its own job by analyze data from CSV and return Map of of key-value

        List<Data> resultList = InputFromFile.readTextFromFile();
        averageAnalyzer.analyze(resultList);
        minAndMaxValueAnalyzer.analyze(resultList);
        medianAnalyzer.analyze(resultList);
        standardDeviationAnalyzer.analyze(resultList);
    }
}
