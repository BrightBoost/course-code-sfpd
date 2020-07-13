package com.company.day10.winningtopic;

import com.company.day3.Person;

import java.util.ArrayList;
import java.util.List;

public class WinnerCollection {
    //collection is the top interface
    //list inherits from collection
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Jana");

        for(String s : studentList){
            System.out.println(s);
        }

        //how to find something in a list
        //this is a bit tricky, because it is looking for object
        //pointers instead of values
        System.out.println(studentList.indexOf("Jana"));
        String[] arrayString = {"hi", "hey"};
        String[][] array2 = {{"first", "last"}, {}, {}};

        //more complex element

        WinnerAddress winnerAddress = new WinnerAddress();
        winnerAddress.setCity("Brussels");
        winnerAddress.setCountry("Belgium");
        winnerAddress.setHouseNumber("100");
        winnerAddress.setStreetName("Street something");
        winnerAddress.setZipcode("123456");

        WinnerAddress winnerAddress1 = new WinnerAddress();
        winnerAddress1.setCity("Utrecht");
        winnerAddress1.setCountry("NL");
        winnerAddress1.setHouseNumber("100");
        winnerAddress1.setStreetName("Street something");
        winnerAddress1.setZipcode("123456");

        WinnerPerson winnerPerson = new WinnerPerson();
        winnerPerson.setFirstName("Pietje");
        winnerPerson.setLastName("Klein");
        winnerPerson.setAddress(winnerAddress);

        WinnerPerson winnerPerson1 = new WinnerPerson();
        winnerPerson1.setFirstName("Marietje");
        winnerPerson1.setLastName("Klein");
        winnerPerson1.setAddress(winnerAddress1);

        List<WinnerPerson> winnerPeople = new ArrayList<>();
        winnerPeople.add(winnerPerson);
        winnerPeople.add(winnerPerson1);

        WinnerGym winnerGym = new WinnerGym();
        winnerGym.setMembers(winnerPeople);

        //check each member of gym, and check the address country field
        for(WinnerPerson p : winnerGym.getMembers()){
            //what to do to check for any member living in the NL?
            if(p.getAddress().getCountry().equals("NL")){
                System.out.println("found a member in the NL");
                System.out.println("it's: " + p.getFirstName());
                //we are iterating over the list
                //every member is called p
                //we can use object p to find the index using indexOf
                System.out.println("index on list: " + winnerGym.getMembers().indexOf(p));
                break;
            }
            //what to do to check for a member with name pietje?
            if(p.getFirstName().equals("Pietje")){
                System.out.println("index on list of pietje: " + winnerGym.getMembers().indexOf(p));

            }
        }
    }
}
