package module;

import java.util.List;
import java.util.Arrays;

public class CheckIn {

    public static List<Integer> hostedDays(List<Integer> listOfValues){
        int result = 0;
        int sizeList = listOfValues.size();

        //convert to array
        Integer arrayList[] = new Integer[sizeList];
        for (int i = 0; i <sizeList; i++){
            arrayList[i] = listOfValues.get(i);
        }
        //calculate hosted days
        for (int i = 0; i < sizeList; i++){
             if (arrayList[i] > 0 && arrayList[i] <= 31){
                 if (arrayList[i] > arrayList[i+1]){
                     result = arrayList[i] - arrayList[i+1];
                 }else{
                     result = arrayList[i+1] - arrayList[i];
                 }
             }
        }
        //convert to List
        List<Integer> result = Arrays.asList(arrayList);

        return result;

    }



}
