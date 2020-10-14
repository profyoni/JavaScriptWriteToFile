import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
    generateJSChartData(new File("chartData.js"));
    }

    private static void generateJSChartData(File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            Map<Integer, Double> testMap = new HashMap<>();

            testMap.put(1, 8.96);
            testMap.put(2, 6.3);
            testMap.put(3, 3.4);
            testMap.put(4, 12.6);
            testMap.put(6, 1.36);
            pw.println("function getWordFrequencies() { return google.visualization.arrayToDataTable([['Length', 'Frequency', { role: 'style' }],"
                    + chartData(testMap)
                    + "   ]);        }");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String chartData(Map<Integer,Double> frequencyMap) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList(frequencyMap.keySet());
        Collections.sort(al);
        for (int wordLength : al)
        {
            if (frequencyMap.containsKey(wordLength))
            {
                sb.append(String.format("['%d', %f, '#000087'],", wordLength, frequencyMap.get(wordLength)));
            }
        }
        return sb.toString();
    }
}
