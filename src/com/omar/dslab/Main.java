package com.omar.dslab;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int ar1 []=generateRandomArray(10);
        int ar2 []=generateRandomArray(100);
        int ar3 []=generateRandomArray(1000);
        int ar4 []=generateRandomArray(10000);
        int ar5 []=generateRandomArray(100000);
        //print all bubble sort running time
        System.out.println("Bubble sort running time");
        printBubbleSortRunningTime(ar1,ar2,ar3,ar4,ar5);
        System.out.println("\nMerge sort running time");
        printMergeSortRunningTime(ar1,ar2,ar3,ar4,ar5);



    }
    static void printBubbleSortRunningTime(int[]ar1 ,int[]ar2,int[]ar3,int[]ar4,int[]ar5){
        //bubble sort n = 10
        int []tempArray = getCopyOfArray(ar1);
        long startTime = System.nanoTime();
        getBubbleSortRunningTime(tempArray);
        long endTime = System.nanoTime();
        double timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of bubble sort with n=10 : " + timeElapsed+" seconds");

        //bubble sort n = 100
        tempArray = getCopyOfArray(ar2);
        startTime = System.nanoTime();
        getBubbleSortRunningTime(tempArray);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of bubble sort with n=100 : " + timeElapsed+" seconds");

        //bubble sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.nanoTime();
        getBubbleSortRunningTime(tempArray);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of bubble sort with n=1000 : " + timeElapsed+" seconds");

        //bubble sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.nanoTime();
        getBubbleSortRunningTime(tempArray);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of bubble sort with n=10000 : " + timeElapsed+" seconds");

        //bubble sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.nanoTime();
        getBubbleSortRunningTime(tempArray);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of bubble sort with n=100000 : " + timeElapsed+" seconds");


    }
    static void printMergeSortRunningTime(int[]ar1 ,int[]ar2,int[]ar3,int[]ar4,int[]ar5){
        //bubble sort n = 10
        int []tempArray = getCopyOfArray(ar1);
        long startTime = System.nanoTime();
        mergeSort(tempArray,0,tempArray.length-1);
        long endTime = System.nanoTime();
        double timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of Merge sort with n=10 : " + timeElapsed+" seconds");

        //bubble sort n = 100
        tempArray = getCopyOfArray(ar2);
        startTime = System.nanoTime();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of Merge sort with n=100 : " + timeElapsed+" seconds");

        //bubble sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.nanoTime();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of Merge sort with n=1000 : " + timeElapsed+" seconds");

        //bubble sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.nanoTime();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))+1000;
        System.out.println("Execution time of Merge sort with n=10000 : " + timeElapsed+" seconds");

        //bubble sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.nanoTime();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.nanoTime();
        timeElapsed = ((double) (endTime - startTime))/1000;
        System.out.println("Execution time of Merge sort with n=100000 : " + timeElapsed+" seconds");


    }


    static int[]getCopyOfArray(int ar[]){
        int tempArray[] = new int[ar.length];
        for (int i=0;i<ar.length;i++)
            tempArray[i]=ar[i];
        return tempArray;
    }
    static void getBubbleSortRunningTime(int ar[]){

    //    long startTime = System.nanoTime();

        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0 ; j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    //swap
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
       // long endTime = System.nanoTime();
       // double timeElapsed = ((double) (endTime - startTime));

      // System.out.println("Execution time in m: " + timeElapsed);



       // return timeElapsed;
    }

    static void mergeSort(int[]ar ,int lowIndex , int highIndex){


        if(highIndex>lowIndex){
            int mid = (highIndex+lowIndex)/2;
            mergeSort(ar , lowIndex , mid);
            mergeSort(ar,mid+1,highIndex);


            //merge the two arrays
            merge(ar , lowIndex,mid, highIndex);

        }




    }

     static void merge(int[] ar, int lowIndex,int mid, int highIndex) {
         int leftArray[] = new int[mid-lowIndex+1];
         int rightArray[] = new int[highIndex-mid];

         for(int i=0;i<mid-lowIndex+1;i++)
             leftArray[i] = ar[i+lowIndex];
         for(int i=0;i<highIndex-mid;i++)
             rightArray[i] = ar[mid+1+i];

        int i =0,j=0,k=lowIndex;
        while ((i<mid-lowIndex+1)&&(j<highIndex-mid)){
            if (leftArray[i]<=rightArray[j]){
                ar[k]=leftArray[i];
                i++;
            }
            else {
                ar[k]=rightArray[j];
                j++;
            }
            k++;
        }


       while (i<leftArray.length){
            ar[k] = leftArray[i];
            i++;
            k++;
        }

         while (j<rightArray.length){
             ar[k] = rightArray[j];
             j++;
             k++;
         }
    }

    static int[] generateRandomArray(int size){

        Random random = new Random();
        int ar[] = new int[size];
        for (int i=0 ;i<ar.length;i++){
            ar[i]=random.nextInt();
        }

        return ar;
    }
    static void displayArray(int []ar){
        for (int i =0;i<ar.length;i++)
            System.out.print(ar[i]+"\t");
        System.out.println("\n");
    }

}
