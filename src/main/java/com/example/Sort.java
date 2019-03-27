package com.example;

public class Sort {
    static int masLength = 0;
    static int mas[] = new int[masLength];
    public static void main(String[] args)
    {
        System.out.println("Исхожный массив:");
        for (int i = 0; i < masLength; i++){
            System.out.print(mas[i] + " ");
        }
        int width = masLength;
        for (int i = 0; i < masLength-1; i++){
            width--;
            for (int j = 0; j < masLength; j++){
                if ((j + width) < masLength){
                    if(mas[j] > mas[j+width]){
                        int variable = mas[j];
                        mas[j] = mas[j + width];
                        mas[j + width] = variable;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < masLength; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
