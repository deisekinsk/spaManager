import module.CheckIn;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //review
    public static void main(String[] args){

        //catch values
        int insertData = Integer.parseInt(JOptionPane.showInputDialog(
           " Check In \nInsert the day of today: "));

        List<Integer> values  = new ArrayList<Integer>();

        while (insertData != 0){
            values.add(insertData);
            insertData = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insert the day out of spa:" ));
            while (insertData != 0){
                values.add(insertData);
                insertData = Integer.parseInt(JOptionPane.showInputDialog(
                        "Whats is your birth year?" ));
                while (insertData != 0){
                    values.add(insertData);
                    insertData = Integer.parseInt(JOptionPane.showInputDialog(
                            "Insert 0 = Exit." ));
                }
            }
        }


        System.out.println("Array List:" + values);
        CheckIn guestOne = new CheckIn();
        CheckIn.hostedDays(values);
    }

}
