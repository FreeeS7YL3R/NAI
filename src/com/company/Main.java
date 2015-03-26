package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //init vars
        double[][] testDataArr = new double[][]
                {{5.0,3.2,1.2,0.2,0},
                        {5.5,3.5,1.3,0.2,0},
                        {4.9,3.1,1.5,0.1,0},
                        {4.4,3.0,1.3,0.2,0},
                        {5.1,3.4,1.5,0.2,0},
                        {5.0,3.5,1.3,0.3,0},
                        {4.5,2.3,1.3,0.3,0},
                        {6.0,3.4,4.5,1.6,1},
                        {6.7,3.1,4.7,1.5,1},
                        {6.3,2.3,4.4,1.3,1},
                        {5.6,3.0,4.1,1.3,1},
                        {5.5,2.5,4.0,1.3,1},
                        {5.5,2.6,4.4,1.2,1},
                        {6.1,3.0,4.6,1.4,1},
                        {7.7,3.0,6.1,2.3,2},
                        {6.3,3.4,5.6,2.4,2},
                        {6.4,3.1,5.5,1.8,2},
                        {6.0,3.0,4.8,1.8,2},
                        {6.9,3.1,5.4,2.1,2},
                        {6.7,3.1,5.6,2.4,2},
                        {6.9,3.1,5.1,2.3,2}

                };
        //region trainingData init

        double[][] trainingDataArr = new double[][]
                {{5.1, 3.5, 1.4, 0.2, 0},
                        {4.9, 3.0, 1.4, 0.2, 0},
                        {4.7, 3.2, 1.3, 0.2, 0},
                        {4.6, 3.1, 1.5, 0.2, 0},
                        {5.0, 3.6, 1.4, 0.2, 0},
                        {5.4, 3.9, 1.7, 0.4, 0},
                        {4.6, 3.4, 1.4, 0.3, 0},
                        {5.0, 3.4, 1.5, 0.2, 0},
                        {4.4, 2.9, 1.4, 0.2, 0},
                        {4.9, 3.1, 1.5, 0.1, 0},
                        {5.4, 3.7, 1.5, 0.2, 0},
                        {4.8, 3.4, 1.6, 0.2, 0},
                        {4.8, 3.0, 1.4, 0.1, 0},
                        {4.3, 3.0, 1.1, 0.1, 0},
                        {5.8, 4.0, 1.2, 0.2, 0},
                        {5.7, 4.4, 1.5, 0.4, 0},
                        {5.4, 3.9, 1.3, 0.4, 0},
                        {5.1, 3.5, 1.4, 0.3, 0},
                        {5.7, 3.8, 1.7, 0.3, 0},
                        {5.1, 3.8, 1.5, 0.3, 0},
                        {5.4, 3.4, 1.7, 0.2, 0},
                        {5.1, 3.7, 1.5, 0.4, 0},
                        {4.6, 3.6, 1.0, 0.2, 0},
                        {5.1, 3.3, 1.7, 0.5, 0},
                        {4.8, 3.4, 1.9, 0.2, 0},
                        {5.0, 3.0, 1.6, 0.2, 0},
                        {5.0, 3.4, 1.6, 0.4, 0},
                        {5.2, 3.5, 1.5, 0.2, 0},
                        {5.2, 3.4, 1.4, 0.2, 0},
                        {4.7, 3.2, 1.6, 0.2, 0},
                        {4.8, 3.1, 1.6, 0.2, 0},
                        {5.4, 3.4, 1.5, 0.4, 0},
                        {5.2, 4.1, 1.5, 0.1, 0},
                        {5.5, 4.2, 1.4, 0.2, 0},
                        {4.9, 3.1, 1.5, 0.1, 0},
                        {7.0, 3.2, 4.7, 1.4, 1},
                        {6.4, 3.2, 4.5, 1.5, 1},
                        {6.9, 3.1, 4.9, 1.5, 1},
                        {5.5, 2.3, 4.0, 1.3, 1},
                        {6.5, 2.8, 4.6, 1.5, 1},
                        {5.7, 2.8, 4.5, 1.3, 1},
                        {6.3, 3.3, 4.7, 1.6, 1},
                        {4.9, 2.4, 3.3, 1.0, 1},
                        {6.6, 2.9, 4.6, 1.3, 1},
                        {5.2, 2.7, 3.9, 1.4, 1},
                        {5.0, 2.0, 3.5, 1.0, 1},
                        {5.9, 3.0, 4.2, 1.5, 1},
                        {6.0, 2.2, 4.0, 1.0, 1},
                        {6.1, 2.9, 4.7, 1.4, 1},
                        {5.6, 2.9, 3.6, 1.3, 1},
                        {6.7, 3.1, 4.4, 1.4, 1},
                        {5.6, 3.0, 4.5, 1.5, 1},
                        {5.8, 2.7, 4.1, 1.0, 1},
                        {6.2, 2.2, 4.5, 1.5, 1},
                        {5.6, 2.5, 3.9, 1.1, 1},
                        {5.9, 3.2, 4.8, 1.8, 1},
                        {6.1, 2.8, 4.0, 1.3, 1},
                        {6.3, 2.5, 4.9, 1.5, 1},
                        {6.1, 2.8, 4.7, 1.2, 1},
                        {6.4, 2.9, 4.3, 1.3, 1},
                        {6.6, 3.0, 4.4, 1.4, 1},
                        {6.8, 2.8, 4.8, 1.4, 1},
                        {6.7, 3.0, 5.0, 1.7, 1},
                        {6.0, 2.9, 4.5, 1.5, 1},
                        {5.7, 2.6, 3.5, 1.0, 1},
                        {5.5, 2.4, 3.8, 1.1, 1},
                        {5.5, 2.4, 3.7, 1.0, 1},
                        {5.8, 2.7, 3.9, 1.2, 1},
                        {6.0, 2.7, 5.1, 1.6, 1},
                        {5.4, 3.0, 4.5, 1.5, 1},
                        {6.3, 3.3, 6.0, 2.5, 2},
                        {5.8, 2.7, 5.1, 1.9, 2},
                        {7.1, 3.0, 5.9, 2.1, 2},
                        {6.3, 2.9, 5.6, 1.8, 2},
                        {6.5, 3.0, 5.8, 2.2, 2},
                        {7.6, 3.0, 6.6, 2.1, 2},
                        {4.9, 2.5, 4.5, 1.7, 2},
                        {7.3, 2.9, 6.3, 1.8, 2},
                        {6.7, 2.5, 5.8, 1.8, 2},
                        {7.2, 3.6, 6.1, 2.5, 2},
                        {6.5, 3.2, 5.1, 2.0, 2},
                        {6.4, 2.7, 5.3, 1.9, 2},
                        {6.8, 3.0, 5.5, 2.1, 2},
                        {5.7, 2.5, 5.0, 2.0, 2},
                        {5.8, 2.8, 5.1, 2.4, 2},
                        {6.4, 3.2, 5.3, 2.3, 2},
                        {6.5, 3.0, 5.5, 1.8, 2},
                        {7.7, 3.8, 6.7, 2.2, 2},
                        {7.7, 2.6, 6.9, 2.3, 2},
                        {6.0, 2.2, 5.0, 1.5, 2},
                        {6.9, 3.2, 5.7, 2.3, 2},
                        {5.6, 2.8, 4.9, 2.0, 2},
                        {7.7, 2.8, 6.7, 2.0, 2},
                        {6.3, 2.7, 4.9, 1.8, 2},
                        {6.7, 3.3, 5.7, 2.1, 2},
                        {7.2, 3.2, 6.0, 1.8, 2},
                        {6.2, 2.8, 4.8, 1.8, 2},
                        {6.1, 3.0, 4.9, 1.8, 2},
                        {6.4, 2.8, 5.6, 2.1, 2},
                        {7.2, 3.0, 5.8, 1.6, 2},
                        {7.4, 2.8, 6.1, 1.9, 2},
                        {7.9, 3.8, 6.4, 2.0, 2},
                        {6.4, 2.8, 5.6, 2.2, 2},
                        {6.3, 2.8, 5.1, 1.5, 2},
                        {6.1, 2.6, 5.6, 1.4, 2}
                };
        //endregion
        //coś

        //ArrayList<Double> trainingDataList = new ArrayList<Double>();

        double arg1, arg2, arg3, arg4;
        int k; //Amount of nearest flowers
        Scanner sc = new Scanner(System.in);

        //input data from user
        /*System.out.println("USER INPUT\nEnter 4 args ");
        arg1 = sc.nextDouble();
        arg2 = sc.nextDouble();
        arg3 = sc.nextDouble();
        arg4 = sc.nextDouble();*/

        //input data from test data


        System.out.println("Enter K (it's recommended to don't make it bigger than 5): ");
        k = sc.nextInt();
        for(int o = 0; o<testDataArr.length; o++){
            arg1 = testDataArr[o][0];
            arg2 = testDataArr[o][1];
            arg3 = testDataArr[o][2];
            arg4 = testDataArr[o][3];
            boolean isCorrect = true;


        double[][] distLabel = new double[trainingDataArr.length][2];
        //double[][] kClosIrises = new double[k][trainingDataArr[0].length];


        //distance calc
        //user{1, 2, 3, 4}
        //train{5.1, 3.5, 1.4, 0.2}
        double distance = Math.sqrt((Math.pow((5.1 - 1), 2))
                        + (Math.pow((3.5 - 2), 2))
                        + (Math.pow((1.4 - 3), 2))
                        + (Math.pow((0.2 - 4), 2))
        );

        //System.out.println("distance = " + distance);

        double distFunc = 0;


        for (int i = 0; i < trainingDataArr.length; i++) {
            distFunc = calculateDistance(new double[]{trainingDataArr[i][0], trainingDataArr[i][1], trainingDataArr[i][2], trainingDataArr[i][3]},
                    new double[]{arg1, arg2, arg3, arg4});
            //PUT DISTANCE AND LABEL IN NEW ARRAY
            distLabel[i][0] = distFunc;
            distLabel[i][1] = trainingDataArr[i][4];
        }


        //region k shortest distances
        double[] kMinDist = new double[k];
        int[] kMinLabel = new int[k];
        ArrayList<Double> labelOccurences = new ArrayList<Double>();
        int l; //rows in distLabel
        for (l = 0; l < k; l++) {
            double min = Double.MAX_VALUE;
            for (int i = 0; i < distLabel.length; i++) {
                if (distLabel[i][0] < min) {
                    min = distLabel[i][0];
                    kMinDist[l] = distLabel[i][0];
                    //kMinLabel[l] = Integer.parseInt(String.valueOf(distLabel[i][1]));
                    kMinLabel[l] = (int) distLabel[i][1];
                    distLabel[i][0] = Double.MAX_VALUE;
                    //String tempLabel = String.valueOf(distLabel[i][1]);
                    //labelOccurences.add(distLabel[i][1]);
                }
            }
        }
        //endregion

        HashSet<Double> hashsetList = new HashSet<Double>(labelOccurences);
        //System.out.println("Array of k minimum distances with labels:\n" + Arrays.toString(kMinDist) + "\n" + Arrays.toString(kMinLabel));

        /*for(double label : hashsetList){
            for(double item : kMinLabel){
                if()
            }
        }*/
        //System.out.println(hashsetList);

        int rez = getMostFrequent(kMinLabel);
            if (rez == trainingDataArr[o][4]){
                isCorrect = true;
            }
            else {
                isCorrect = false;
            }
        System.out.println("rez = " + rez + " and is " + isCorrect);


    }}


    public static double calculateDistance(double[] array1, double[] array2) {
        double Sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            Sum = Sum + Math.pow((array1[i] - array2[i]), 2.0);
        }
        return Math.sqrt(Sum);
    }

    public static int getMostFrequent(int[] mas) {
        int maxKey = -1;
        int maxValue = -1;
        Map<Integer, Integer> pretenders = new HashMap<Integer, Integer>();
        int masSize = mas.length;
        for (int i = 0; i < masSize; i++) {
            if (!pretenders.containsKey(mas[i]))
                pretenders.put(mas[i], 1);
            else
                pretenders.put(mas[i], pretenders.get(mas[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : pretenders.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxKey;
    }
}