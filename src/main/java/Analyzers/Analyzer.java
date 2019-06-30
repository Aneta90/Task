package Analyzers;

import java.util.List;

public interface Analyzer { // create interface to achieve total abstraction, loose coupling.

     void analyze(List dataFromCSV);

}
