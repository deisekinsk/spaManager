package module;

import java.util.List;
import java.util.Arrays;

public class CheckIn {

    public static void hostedDays(List<Integer> listOfValues){
        int result = 0;

        //calculate hosted days
          if (listOfValues.get(0) > 0 && listOfValues.get(1) <= 31){
             if (listOfValues.get(0) > listOfValues.get(1)){
                 result = listOfValues.get(0) - listOfValues.get(1);
             }else{
                 result = listOfValues.get(1) - listOfValues.get(0);
             }
         }

        System.out.println("Result of " + result + " days.");

    }
}
