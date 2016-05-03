package com.interview;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindFriendDistance {
    public int findDistance(Person source, Person target) {
        if (source == null || target == null) {
            return 0;
        }

        int distance = 0;

        Set<Person> visitedPerson = new HashSet<>();

        List<Person> levelList = new ArrayList<>();
        levelList.add(source);

        while (!levelList.isEmpty()) {
            List<Person> tempLevelList = new ArrayList<>();

            for (Person p : levelList) {
                if (!visitedPerson.contains(p)) {
                    visitedPerson.add(p);
                }

                if (p == target) {
                    return distance;
                } else {
                    for (Person friend : p.getFriendList()) {
                        if (!visitedPerson.contains(friend)) {
                            tempLevelList.add(friend);
                        }
                    }
                }
            }

            levelList = tempLevelList;
            distance ++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");
        Person p4 = new Person("p4");
        Person p5 = new Person("p5");
        Person p6 = new Person("p6");

        p1.addFriend(p2);
        p1.addFriend(p3);

        p3.addFriend(p4);

        p4.addFriend(p5);

        p5.addFriend(p1);

        FindFriendDistance sol = new FindFriendDistance();
        System.out.printf("Distance of %s and %s is %d\n", p1.getName(), p6.getName(), sol.findDistance(p1, p6));
        System.out.printf("Distance of %s and %s is %d\n", p1.getName(), p4.getName(), sol.findDistance(p1, p4));
        System.out.printf("Distance of %s and %s is %d\n", p1.getName(), p5.getName(), sol.findDistance(p1, p5));
    }
}

class Person {
    private String name;

    private List<Person> friendList;

    public String getName() {
        return name;
    }

    public List<Person> getFriendList() {
        return friendList;
    }

    public Person(String name) {
        this.name = name;
        this.friendList = new ArrayList<>();
    }

    public void addFriend(Person p) {
        if (!friendList.contains(p)) {
            friendList.add(p);
            p.addFriend(this);
        }
    }
}
