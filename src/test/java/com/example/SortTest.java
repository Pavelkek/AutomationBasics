package com.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    @BeforeClass
    public static void Before() {
        System.out.println("Тестируем сортировку");
    }
    @Test
    public void TestSort1() throws MyExeption {
        //массив со случайными числами
        int[] mass = {5,6,3,4,5};
        int[] massSort = {3,4,5,5,6};
        Sort.setMasLength(5);
        Sort.setMas(mass);
        String[] go = new String[1];
        Sort.main(go);
        if (Arrays.equals(mass,massSort)){
        } else {
            throw(new MyExeption("Привет"));
        }
    }
    @Test
    public void TestSort2() throws MyExeption {
        //Пустой массив
        int[] mass = {};
        int[] massSort = {};
        Sort.setMasLength(0);
        Sort.setMas(mass);
        String[] go = new String[1];
        Sort.main(go);
        if (Arrays.equals(mass,massSort)){
        } else {
            throw(new MyExeption("Привет"));
        }
    }
    @Test
    public void TestSort3() throws MyExeption {
        //Массив с отрицательными значениями
        int[] mass = {-2,2,-3,0,5};
        int[] massSort = {-3,-2,0,2,5};
        Sort.setMasLength(5);
        Sort.setMas(mass);
        String[] go = new String[1];
        Sort.main(go);
        if (Arrays.equals(mass,massSort)){
        } else {
            throw(new MyExeption("Привет"));
        }
    }
    @Test
    public void TestSort4() throws MyExeption {
        //Массив со значениями по возрастанию
        int[] mass = {1,2,3,4,5};
        int[] massSort = {1,2,3,4,5};
        Sort.setMasLength(5);
        Sort.setMas(mass);
        String[] go = new String[1];
        Sort.main(go);
        if (Arrays.equals(mass,massSort)){
        } else {
            throw(new MyExeption("Привет"));
        }
    }
    @Test
    public void TestSort5() throws MyExeption {
        //Массив со значениями по убыванию
        int[] mass = {5,4,3,2,1};
        int[] massSort = {1,2,3,4,5};
        Sort.setMasLength(5);
        Sort.setMas(mass);
        String[] go = new String[1];
        Sort.main(go);
        if (Arrays.equals(mass,massSort)){
        } else {
            throw(new MyExeption("Привет"));
        }
    }
    @AfterClass
    public static void After() {
        int[] mass = {};
        Sort.setMasLength(0);
        Sort.setMas(mass);
    }
}
