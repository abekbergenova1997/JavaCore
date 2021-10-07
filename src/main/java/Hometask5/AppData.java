package Hometask5;

import java.util.Arrays;

public class AppData {
    private  String[] header;
    private  int[][] data;

    @Override
    public String toString() {
        return "AppData{" +
                "header='" + Arrays.toString(header) + '\'' +
                ", data=" + Arrays.deepToString(data) +
                '}';
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public static class AppDataBuilder{
        AppData appData;
        public AppDataBuilder() {
            appData = new AppData();
        }
        public AppDataBuilder withHeader(String[] header){
            appData.header = header;
            return this;
        }
        public AppDataBuilder withData(int[][] data){
            appData.data = data;
            return this;
        }
        AppData build(){
            return appData;
        }
    }
}
