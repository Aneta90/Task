package Model;

import Analyzers.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Analyzer> analyzers = new ArrayList<>();
        analyzers.add(new AverageAnalyzer());
        analyzers.add(new MinAndMaxValueAnalyzer());
        analyzers.add(new MedianAnalyzer());
        analyzers.add(new StandardDeviationAnalyzer());

        MultiAnalyzer multiAnalyzer = new MultiAnalyzer(analyzers);
        multiAnalyzer.perform();
    }
}
