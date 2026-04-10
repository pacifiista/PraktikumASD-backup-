package Minggu6_Praktikum05;
public class Sorting20 {

    int [] data;
    int jumData;

    // constructor
    Sorting20(int Data[], int jmlData){
        jumData=jmlData;
        data=new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i]= Data[i];
        }
    }

    // method bubble sort
    void bubbleSort(){
        int temp;
        for (int i = 0; i < jumData-1; i++) {
            for (int j = 1; j < jumData-i; j++) {
                if (data[j-1]>data[j]) {
                    // swap
                     temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    // method tampil data
    void tampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    
}