/*
 * Класс Sort
 * version - 1.0
 * Авторское право: все мое.
 */
package com.example;
/**
 * Сортитровка расческой.
 * @version 1.0 27 March 2019
 * @author Pavel Samotaev
 */
public final class Sort {
    private Sort() { }
    private static int masLength = 0;
    private static int[] mas = new int[masLength];
    public static void setMasLength(final int masLengthNew) {
        masLength = masLengthNew;
    }
    public static void setMas(final int[] masNew) {
        mas = masNew;
    }
    public static void main(final String[] args) {
        System.out.println("Исхожный массив:");
        for (int i = 0; i < masLength; i++) {
            System.out.print(mas[i] + " ");
        }
        int width = masLength;
        for (int i = 0; i < masLength - 1; i++) {
            width--;
            for (int j = 0; j < masLength; j++) {
                if ((j + width) < masLength) {
                    if (mas[j] > mas[j + width]) {
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
        for (int i = 0; i < masLength; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
