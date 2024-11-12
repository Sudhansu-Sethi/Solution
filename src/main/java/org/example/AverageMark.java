package org.example;

import java.util.*;

public class AverageMark {
/*
        "Given a list of student names and corresponding marks,
                return the highest average marks (and print the corresponding student name - optional).
    The marks can be negative as well and a student may have multiple marks.

    Example:
    String[][] ar1= {{“Charles”, 84},
        {“John”, 100},
        {“Andy”, 37},
        {“John”, 23},
        {“Charles”, 20}};*/

    //Return 61.5 (which is of John's)"

    public static void main(String[] args) {
        String[][] ar1= {{"Charles","84"},{"John","100"},{"Andy","37"},{"Charles","20"},{"John","23"}};
        HashMap<String, ArrayList<Integer>> marks = new HashMap<>();


        for (int i=0;i<ar1.length;i++){
            if(marks.containsKey(ar1[i][0])){

                ArrayList ar = new ArrayList<>();
                int total = Integer.parseInt(ar1[i][1])+marks.get(ar1[i][0]).get(0);
                int count = marks.get(ar1[i][0]).get(1)+1;
                //System.out.println("total"+":"+total);
                //System.out.println("count"+":"+count);
                ar.add(total);
                ar.add(count);
                marks.put(ar1[i][0], ar);

            } else {
                ArrayList ar = new ArrayList<>();
                ar.add(Integer.parseInt(ar1[i][1]));
                ar.add(1);

                marks.put(ar1[i][0], ar);
            }
        }

        double studentAvgMarks = Integer.MIN_VALUE;
        String studentName = "";
        for (Map.Entry<String,ArrayList<Integer>> m:marks.entrySet()){
            String name = m.getKey();
             double averageMark = (double)m.getValue().get(0)/m.getValue().get(1);
            if (averageMark > studentAvgMarks) {
                studentAvgMarks = averageMark;
                studentName = m.getKey();
            }

        }
        System.out.println(studentName+":"+studentAvgMarks);

    }


}
