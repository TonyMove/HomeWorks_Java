package com.company.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> phoneMap = new HashMap<>();

    public void add(String lastname, String phoneNumber) {
        List<String> phoneList = phoneMap.get(lastname);
        if (phoneList == null) {
            ArrayList<String> newPhoneList = new ArrayList<>();
            newPhoneList.add(phoneNumber);

            phoneMap.put(lastname, newPhoneList);
        } else {
            phoneList.add(phoneNumber);
        }
    }

    public List<String> get(String lastname) {
        return phoneMap.get(lastname);
    }
}
