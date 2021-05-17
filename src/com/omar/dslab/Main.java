package com.omar.dslab;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int ar1 []=generateRandomArray(1000);
        int ar2 []=generateRandomArray(5000);
        int ar3 []=generateRandomArray(10000);
        int ar4 []=generateRandomArray(100000);
        int ar5 []=generateRandomArray(200000);
        //print all bubble sort running time
        System.out.println("Bubble sort running time");
      printBubbleSortRunningTime(ar1,ar2,ar3,ar4,ar5);

        //print all Merge sort running time
        System.out.println("\nMerge sort running time");
        printMergeSortRunningTime(ar1,ar2,ar3,ar4,ar5);

        System.out.println("\nInsertion sort running time");
        printInsertionSortRunningTime(ar1 , ar2 , ar3 ,ar4, ar5);

        System.out.println("\nQuick sort running time");
        printQuickSortRunningTime(ar1,ar2,ar3,ar4,ar5);

        System.out.println("\nSelection sort running time");
        printSelectionSortRunningTime(ar1,ar2,ar3,ar4,ar5);

        System.out.println("\nHeap sort running time");
        printHeapSortRunningTime(ar1,ar2,ar3,ar4,ar5);




    }
    static void printBubbleSortRunningTime(int[]ar1 ,int[]ar2,int[]ar3,int[]ar4,int[]ar5){
        //bubble sort n = 10
        int []tempArray = getCopyOfArray(ar1);
        long startTime = System.currentTimeMillis();
        getBubbleSortRunningTime(tempArray);
        long endTime = System.currentTimeMillis();
        double timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of bubble sort with n=10 : " + timeElapsed+" miliseconds");

        //bubble sort n = 100
        tempArray = getCopyOfArray(ar2);
        startTime = System.currentTimeMillis();
        getBubbleSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of bubble sort with n=100 : " + timeElapsed+" miliseconds");

        //bubble sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.currentTimeMillis();
        getBubbleSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of bubble sort with n=1000 : " + timeElapsed+" miliseconds");

        //bubble sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.currentTimeMillis();
        getBubbleSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of bubble sort with n=10000 : " + timeElapsed+" miliseconds");

        //bubble sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.currentTimeMillis();
        getBubbleSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of bubble sort with n=100000 : " + timeElapsed+" miliseconds");

    }
    static void printMergeSortRunningTime(int[]ar1 ,int[]ar2,int[]ar3,int[]ar4,int[]ar5){
        //bubble sort n = 10
        int []tempArray = getCopyOfArray(ar1);
        long startTime = System.currentTimeMillis();
        mergeSort(tempArray,0,tempArray.length-1);
        long endTime = System.currentTimeMillis();
        double timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Merge sort with n=10 : " + timeElapsed+" miliseconds");

        //bubble sort n = 100
        tempArray = getCopyOfArray(ar2);
        startTime = System.currentTimeMillis();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Merge sort with n=100 : " + timeElapsed+" miliseconds");

        //bubble sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.currentTimeMillis();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Merge sort with n=1000 : " + timeElapsed+" miliseconds");

        //bubble sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.currentTimeMillis();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Merge sort with n=10000 : " + timeElapsed+" miliseconds");

        //bubble sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.currentTimeMillis();
        mergeSort(tempArray,0,tempArray.length-1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Merge sort with n=100000 : " + timeElapsed+" miliseconds");

    }
    static void printInsertionSortRunningTime(int[]ar1 ,int[]ar2,int[]ar3,int[]ar4,int[]ar5) {
        int []tempArray = getCopyOfArray(ar1);
        long startTime = System.currentTimeMillis();
        getInsertionSortRunningTime(tempArray);
        long endTime = System.currentTimeMillis();
        double timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Insertion sort with n=10 : " + timeElapsed+" miliseconds");

        tempArray = getCopyOfArray(ar2);
        startTime = System.currentTimeMillis();
        getInsertionSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Insertion sort with n=100 : " + timeElapsed+" miliseconds");

        tempArray = getCopyOfArray(ar3);
        startTime = System.currentTimeMillis();
        getInsertionSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Insertion sort with n=1000 : " + timeElapsed+" miliseconds");

        tempArray = getCopyOfArray(ar4);
        startTime = System.currentTimeMillis();
        getInsertionSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Insertion sort with n=10000 : " + timeElapsed+" miliseconds");

        tempArray = getCopyOfArray(ar5);
        startTime = System.currentTimeMillis();
        getInsertionSortRunningTime(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of Insertion sort with n=100000 : " + timeElapsed+" miliseconds");
    }
    static void printSelectionSortRunningTime(int[] ar1, int[] ar2, int[] ar3, int[] ar4, int[] ar5) {
        int[] tempArray = getCopyOfArray(ar1);
        long startTime = System.currentTimeMillis();
        selectionSort(tempArray);
        long endTime = System.currentTimeMillis();
        double timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of selection sort with n=10 : " + timeElapsed + " milliseconds");
        tempArray = getCopyOfArray(ar2);
        startTime = System.currentTimeMillis();
        selectionSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of selection sort with n=100 : " + timeElapsed + " milliseconds");

        // sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.currentTimeMillis();
        selectionSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of selection sort with n=1000 : " + timeElapsed + " milliseconds");

        // sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.currentTimeMillis();
        selectionSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of selection sort with n=10000 : " + timeElapsed + " milliseconds");

        // sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.currentTimeMillis();
        selectionSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of selection sort with n=100000 : " + timeElapsed + " milliseconds");
    }
    static void printQuickSortRunningTime(int[] ar1, int[] ar2, int[] ar3, int[] ar4, int[] ar5) {
        int[] tempArray = getCopyOfArray(ar1);
        long startTime = System.currentTimeMillis();
        quickSort(tempArray, 0, tempArray.length - 1);
        long endTime = System.currentTimeMillis();
        double timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=10 : " + timeElapsed + " milliseconds");

        //bubble sort n = 100
        tempArray = getCopyOfArray(ar2);
        startTime = System.currentTimeMillis();
        quickSort(tempArray, 0, tempArray.length - 1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=100 : " + timeElapsed + " milliseconds");

        //bubble sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.currentTimeMillis();
        quickSort(tempArray, 0, tempArray.length - 1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=1000 : " + timeElapsed + " milliseconds");

        //bubble sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.currentTimeMillis();
        quickSort(tempArray, 0, tempArray.length - 1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=10000 : " + timeElapsed + " milliseconds");

        //bubble sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.currentTimeMillis();
        quickSort(tempArray, 0, tempArray.length - 1);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=100000 : " + timeElapsed + " milliseconds");
    }

    static void printHeapSortRunningTime(int[]ar1 ,int[]ar2,int[]ar3,int[]ar4,int[]ar5) {
        int[] tempArray = getCopyOfArray(ar1);
        long startTime = System.currentTimeMillis();
        heapSort(tempArray);
        long endTime = System.currentTimeMillis();
        double timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=10 : " + timeElapsed + " milliseconds");

        //bubble sort n = 100
        tempArray = getCopyOfArray(ar2);
        startTime = System.currentTimeMillis();
        heapSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=100 : " + timeElapsed + " milliseconds");

        //bubble sort n = 1000
        tempArray = getCopyOfArray(ar3);
        startTime = System.currentTimeMillis();
        heapSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=1000 : " + timeElapsed + " milliseconds");

        //bubble sort n = 10000
        tempArray = getCopyOfArray(ar4);
        startTime = System.currentTimeMillis();
        heapSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=10000 : " + timeElapsed + " milliseconds");

        //bubble sort n = 100000
        tempArray = getCopyOfArray(ar5);
        startTime = System.currentTimeMillis();
        heapSort(tempArray);
        endTime = System.currentTimeMillis();
        timeElapsed = ((double) (endTime - startTime));
        System.out.println("Execution time of quick sort with n=100000 : " + timeElapsed + " milliseconds");
    }
    static int[]getCopyOfArray(int ar[]){
        int tempArray[] = new int[ar.length];
        for (int i=0;i<ar.length;i++)
            tempArray[i]=ar[i];
        return tempArray;
    }
    static void getBubbleSortRunningTime(int ar[]){

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

    static void getInsertionSortRunningTime (int ar[]) {
        for(int i=1;i<ar.length;i++) {
            int key = ar[i];  //ar[1]
            int j = i-1; //j=0

            while(j>=0 && ar[j]>key) {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = key;
        }
        //displayArray(ar);
    }

    public static int partition(int a[], int beg, int end) {

        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((a[loc] <= a[right]) && (loc != right)) {
                right--;
            }
            if (loc == right) {
                flag = 1;
            } else if (a[loc] > a[right]) {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if (flag != 1) {
                while ((a[loc] >= a[left]) && (loc != left)) {
                    left++;
                }
                if (loc == left) {
                    flag = 1;
                } else if (a[loc] < a[left]) {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }

    static void quickSort(int a[], int beg, int end) {
        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc - 1);
            quickSort(a, loc + 1, end);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void heapSort(int ar[]) {
        int size = ar.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(ar, size, i);


        for (int i=size-1; i>=0; i--) {

            int x = ar[0];
            ar[0] = ar[i];
            ar[i] = x;
            heapify(ar, i, 0);
        }
    }

   public static void heapify(int ar[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx = 2 * i + 1; // left = 2*i + 1
        int rightChildIdx = 2 * i + 2; // right = 2*i + 2

        if (leftChildIdx < heapSize && ar[leftChildIdx] > ar[largest])
            largest = leftChildIdx;

        if (rightChildIdx < heapSize && ar[rightChildIdx] > ar[largest])
            largest = rightChildIdx;

        if (largest != i) {
            int swap = ar[i];
            ar[i] = ar[largest];
            ar[largest] = swap;
            heapify(ar, heapSize, largest);
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
