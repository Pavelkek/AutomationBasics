package com.example;

import org.junit.Test;

public class SortTest {
    @Test
    public void TestSort1() {
        //массив со случайными числами
        int[] mass = {5,6,3,4,5};
        Sort.masLength = 5;
        Sort.mas = mass;
        String[] go = new String[1];
        Sort.main(go);
    }
    @Test
    public void TestSort2() {
        //Пустой массив
        int[] mass = {};
        Sort.masLength = 0;
        Sort.mas = mass;
        String[] go = new String[1];
        Sort.main(go);
    }
    @Test
    public void TestSort3() {
        //Массив с отрицательными значениями
        int[] mass = {-2,2,-3,0,5};
        Sort.masLength = 5;
        Sort.mas = mass;
        String[] go = new String[1];
        Sort.main(go);
    }
    @Test
    public void TestSort4() {
        //Массив со значениями по возрастанию
        int[] mass = {1,2,3,4,5};
        Sort.masLength = 5;
        Sort.mas = mass;
        String[] go = new String[1];
        Sort.main(go);
    }
    @Test
    public void TestSort5() {
        //Массив со значениями по убыванию
        int[] mass = {5,4,3,2,1};
        Sort.masLength = 5;
        Sort.mas = mass;
        String[] go = new String[1];
        Sort.main(go);
    }
}
