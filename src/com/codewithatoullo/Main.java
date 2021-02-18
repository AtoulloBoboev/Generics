package com.codewithatoullo;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль,
 * удалить самый первый автомобиль из списка. Вывести список в консоль
 **/

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Audi");
        list.add("Tesla");
        list.add("Lincoln");
        list.add("Jiguar");

        System.out.println(list);

        list.add(3,"Toyota");
        System.out.println(list);

        list.remove("BMW");
        System.out.println(list);

    }

}
