package com.melnikov.part2.Task2_3_4_7_8_9_10_12;

public class UserRunnerForFirstPart {
    public static void main(String[] args) {
        //Task 2
//        User user1 = new User(1, "Leha", "12345");
//        User user2 = new User(2, "Jora", "qwerty");
//
//        System.out.println(user1 + "\n" + user2);

        //Task 3
//        User user = new User(1, "Leha", "12345");
//
//        user.setId(100);
//        System.out.println(user.getId());
//        user.setLogin();
//        System.out.println(user);

        //Task 4
//        User user = new User(1, "Leha", "12345");
//
//        int i = user.id; //<-- error;

        //Task 10
        User user = new User(1, "Leha", "12345") {
            private int id;
            private String login;
            private String password;

            @Override
            public void printData() {
                System.out.println(id + " " + login + " " + password);
            }
        };

        user.printData();
    }
}
