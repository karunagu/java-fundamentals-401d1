import java.util.*;
import java.time.*;

public class LabArray {
  public static void main(String[] args) {
// Daily average temperatures for Seattle, October 1-28 2017
        int [][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
};
        HashSet<Integer> temps = new HashSet<Integer>();
        // Hashset <String, String> temps = new HashMap<String, String>();
        // System.out.println(weeklyMonthTemperatures.length);
        int minTemp = weeklyMonthTemperatures[0][0];
        int maxTemp = weeklyMonthTemperatures[0][0];
            for (int i=0;i<weeklyMonthTemperatures.length;i++) {
                    // System.out.println("i "+i);
                for (int j=0;j<weeklyMonthTemperatures[i].length;j++) {
                        // System.out.print ("  j"+j);
                        System.out.print("   " + weeklyMonthTemperatures[i][j]);
                        temps.add(weeklyMonthTemperatures[i][j]);
                        if (minTemp > weeklyMonthTemperatures[i][j]) {
                            minTemp = weeklyMonthTemperatures[i][j];
                        }
                        if (maxTemp < weeklyMonthTemperatures[i][j]) {
                            maxTemp = weeklyMonthTemperatures[i][j];
                        }
                }
                System.out.println();
                
            }
            System.out.println("High Temperature "+maxTemp);
            System.out.println("Low Temperature "+minTemp);

            for (int i=minTemp;i<maxTemp;i++) {
                if (!temps.contains(i)) {
                    System.out.println("Never saw temperatue " + i);

                }

                }
            }


  }
