package Hometask5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("csv.txt");
        List<AppData> appDataList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int k = 0;
            int l = 0;
            int [][] current = new int[3][3];
            AppData appData = null;
            String[] line;
            while (reader.ready()) {
                line = reader.readLine().split(";");
                if(k < 1) {
                    appData = new AppData.AppDataBuilder().withHeader(line).build();
                    appDataList.add(appData);
                    k++;
                }else{
                    for (int i = l; i < 3; i++) {
                        for (int j = 0; j < 3;j++) {
                            current[i][j] = Integer.parseInt(line[j]);
                        }
                    }
                    l++;
                }
                appData.setData(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        appDataList.forEach(System.out::println);
    }
}