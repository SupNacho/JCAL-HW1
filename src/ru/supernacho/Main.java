package ru.supernacho;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] intMass = {1,2,3,4};
        String[] strMass = {"one","two","three","four"};
        ArrayList<Integer> arrayListInt;
        ArrayList<String> arrayListStr;

        System.out.println("Массив интов до перестановки:    " + Arrays.toString(intMass) + " " + intMass.getClass());
        intMass = swap(intMass,1,3);
        System.out.println("Массив интов после перестановки: " + Arrays.toString(intMass) + " " + intMass.getClass());

        System.out.println("\nМассив строк до перестановки:    " + Arrays.toString(strMass) + " " + strMass.getClass());
        strMass = swap(strMass,"two","four");
        System.out.println("Массив строк после перестановки: " + Arrays.toString(strMass) + " " + strMass.getClass());

        arrayListInt = convert(intMass);
        arrayListStr = convert(strMass);
        System.out.println("\nКонвертируем в ArrayList: " + arrayListInt.toString() + " " + arrayListInt.getClass());
        System.out.println("Конвертируем в ArrayList: " + arrayListStr.toString() + " " + arrayListStr.getClass());

        System.out.println("\n=========== Большое задание ===========\n");

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();


        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println("Коробка#1 с Апельсинами весит: " + orangeBox.getWeight() + " " + orangeBox.toString());
        System.out.println("Коробка#2 с Апельсинами весит: " + orangeBox2.getWeight() + " " + orangeBox2.toString());
        System.out.println("\nКоробка#1 с Яблоками весит: " + appleBox.getWeight() + " " + appleBox.toString());
        System.out.println("Коробка#2 с Яблоками весит: " + appleBox2.getWeight() + " " + appleBox2.toString());

        System.out.println("\nСравниваем коробку№1 с яблоками с коробкой №1 с апельсинами\n" +
                "Яблок: " + appleBox.getCount() + " Апельсинов: " + orangeBox.getCount() + "\nОдинаково весят? "
                + appleBox.compare(orangeBox));

        appleBox.moveToBox(appleBox2);
        orangeBox.moveToBox(orangeBox2);

        System.out.println("\nНовая коробка с яблоками #2: " + appleBox2.getWeight() + " " + appleBox2.toString());
        System.out.println("Старая коробка с яблоками #1: " + appleBox.getWeight() + " " + appleBox.toString());

        System.out.println("\nНовая коробка с апельсинами #2: " + orangeBox2.getWeight() + " " + orangeBox2.toString());
        System.out.println("Старая коробка с апельсинами #1: " + orangeBox.getWeight() + " " + orangeBox.toString());

    }

    public static <T> T[] swap (T[] mass, T v1, T v2){
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].equals(v1)) {
                mass[i] = v2;
                continue;
            } else if (mass[i].equals(v2)) {
                mass[i] = v1;
                continue;
            }
        }
        return mass;
    }

    public static <T> ArrayList<T> convert(T[] mass) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            arrayList.add(mass[i]);
        }
        return arrayList;
    }

}
