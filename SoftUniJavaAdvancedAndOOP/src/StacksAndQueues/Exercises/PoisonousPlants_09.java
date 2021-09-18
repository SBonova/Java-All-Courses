package StacksAndQueues.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PoisonousPlants_09 {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> indexPesticidesCount = new LinkedHashMap<>(Integer.parseInt(consoleReader.readLine()));
        String[] inputTokens = consoleReader.readLine().split(" ");

        consoleReader.close();

        for (int i = 0; i < inputTokens.length; i++) {
            indexPesticidesCount.put(i, Integer.parseInt(inputTokens[i]));
        }

        int daysCounter = 0;
        List<Integer> indicesOfPlantsToBeRemoved = new ArrayList<>();

        while (true) {
            Map.Entry<Integer, Integer> previousEntry = null;

            for (Map.Entry<Integer, Integer> currentEntry : indexPesticidesCount.entrySet()) {
                if (previousEntry == null) {
                    previousEntry = currentEntry;
                    continue;
                }

                if (previousEntry.getValue() < currentEntry.getValue()) { // if current plant has more pesticides than previous one
                    indicesOfPlantsToBeRemoved.add(currentEntry.getKey());
                }

                previousEntry = currentEntry;
            }

            if (indicesOfPlantsToBeRemoved.isEmpty()) {
                break;
            }

            daysCounter++; //increment now since some plants will die

            for (int i = 0; i < indicesOfPlantsToBeRemoved.size(); i++) {
                indexPesticidesCount.remove(indicesOfPlantsToBeRemoved.get(i));
            }

            indicesOfPlantsToBeRemoved.clear();
        }

        System.out.println(daysCounter);
    }
}
