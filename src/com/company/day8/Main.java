package com.company.day8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StaticClass instanceStatic = initializeListStaticClass();
        StaticClass instanceStatic2 = new StaticClass();
        instanceStatic.saySomething("hello");
        StaticClass.saySomethingStatic("hello");
        System.out.println(instanceStatic.getSomeStaticInt());
        instanceStatic2.setSomeStaticInt(10);
        System.out.println(instanceStatic.getSomeStaticInt());
        StaticClass.someStaticInt = 3;
       // StaticClass.constInt = 90;
        System.out.println(instanceStatic2.getSomeStaticInt());


        //-----------without static initialisers-----------------------


        //create 3 groups
        List<Group> groupList = new ArrayList<>();
        for(int i = 0; i<3; i++){
            Group g = new Group();
            g.setName("name group" +i);
            groupList.add(g);
        }

        //creating 3 members
        List<Member> memberList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Member m = new Member();
            m.setName("name" + i);
            m.setGroupList(groupList);
            memberList.add(m);
        }
        //gym creation
        Gym g = new Gym();
        g.setMemberList(memberList);



        //-----------------------end no static initialisers -------------


        //----------------with static initializers-------------------
        Gym g1 = initializeGym();
        addMembersToGym(g1);

        //if i would want another gym without static initializers i'd
        //have to copy all the loops
        Gym g2 = initializeGym();
        addMembersToGym(g2);


        //---------------end with static initializers----------
        //create a new class - describing a resident of belgium
        //give this class some approriate fields
        //give this class a static field ruler to store king or queen
        //from your main
        //create a few residents
        //change the ruler
        //verify it will be changed for all of them



    }

    public static Gym initializeGym(){
        Gym g = new Gym();
        return g;
    }

    public static void addMembersToGym(Gym g){
        List<Member> memberList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Member m = new Member();
            m.setName("name" + i);
            addGroupListToMember(m);
            memberList.add(m);
        }

        g.setMemberList(memberList);
    }

    public static void addGroupListToMember(Member m){
        List<Group> groupList = new ArrayList<>();
        for(int i = 0; i<3; i++){
            Group g = new Group();
            g.setName("name group" +i);
            groupList.add(g);
        }
        m.setGroupList(groupList);
    }

    public static StaticClass initializeListStaticClass(){
        StaticClass s = new StaticClass();
        s.setSomeList(new ArrayList<>());
        for(int i = 0; i < 9; i++){
            s.getSomeList().add("good morning");

        }
        return s;
    }
}
