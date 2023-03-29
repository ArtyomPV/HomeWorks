package homeWork2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        =========вторая задача===================
        FileLog fileLog = new FileLog();
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        fileLog.bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
              System.out.print(sortArr[i] + " ");
        }


    }
}
