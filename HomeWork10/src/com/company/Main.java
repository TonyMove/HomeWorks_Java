package com.company;

import com.company.PhoneBook.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("elephant");
        words.add("bear");
        words.add("wolf");
        words.add("rabbit");
        words.add("fox");
        words.add("deer");
        words.add("bear");
        words.add("fox");
        words.add("wolf");
        words.add("dog");
        words.add("cat");
        words.add("parrot");
        words.add("fish");
        words.add("shark");
        words.add("shark");
        words.add("fly");
        words.add("monkey");
        words.add("fox");
        words.add("shark");

        showUniqWithCountRepeat(words);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Arakcheev", "1111111");
        phoneBook.add("Arakcheev", "2222222");
        phoneBook.add("Avdoshin", "12121212");
        phoneBook.add("Bryusov", "13131313");
        phoneBook.add("Ivanov", "14141414");
        phoneBook.add("Ivanov", "14000041");
        phoneBook.add("Petrov", "15151515");
        phoneBook.add("Petrov", "16161616");
        phoneBook.add("Petrov", "17171717");
        phoneBook.add("Prusov", "100000001");
        phoneBook.add("Prusov", "199999991");
        phoneBook.add("Demidova", "200000002");
        phoneBook.add("Larina", "101");
        phoneBook.add("Larina", "323");
        phoneBook.add("Medvedeva", "202");
        phoneBook.add("Nemtsova", "303");
        phoneBook.add("Prasova", "404");
        phoneBook.add("Brezhneva", "505");
        phoneBook.add("Brezhneva", "515");
        phoneBook.add("Brezhneva", "5025");
        phoneBook.add("Brezhneva", "545");

        System.out.println(phoneBook.get("Arakcheev"));
        System.out.println(phoneBook.get("Avdoshin"));
        System.out.println(phoneBook.get("Bryusov"));
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Prusov"));
        System.out.println(phoneBook.get("Demidova"));
        System.out.println(phoneBook.get("Larina"));
        System.out.println(phoneBook.get("Medvedeva"));
        System.out.println(phoneBook.get("Nemtsova"));
        System.out.println(phoneBook.get("Prasova"));
        System.out.println(phoneBook.get("Brezhneva"));


    }

    private static void showUniqWithCountRepeat(List<String> words) {
        HashMap<String, Integer> countRepeatWords = new HashMap<>();
        for (String word : words) {
            Integer countRepeat = countRepeatWords.get(word);
            if (countRepeat == null) {
                countRepeatWords.put(word, 1);
            } else {
                countRepeatWords.put(word, countRepeat + 1);
            }
        }
        Set<String> uniqWords = countRepeatWords.keySet();
        System.out.println(countRepeatWords);
        System.out.println(uniqWords);
    }

}
