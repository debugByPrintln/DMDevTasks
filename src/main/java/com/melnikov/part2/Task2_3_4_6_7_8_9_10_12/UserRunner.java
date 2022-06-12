package com.melnikov.part2.Task2_3_4_6_7_8_9_10_12;

public class UserRunner {
    public static void main(String[] args) {
        //Task 6
//        UserSocial userSocial = new UserSocial(1, "A", "B", "Leha", 13);
//        WebMaster webMaster = new WebMaster(11, "C", "D", "http://2ch.hk");
//
//
//        userSocial.printData();
//        webMaster.printData();

        //Task 12
        UserSocial userSocial = new UserSocial(1, "A", "B", "Leha", 13);
        WebMaster webMaster = new WebMaster(11, "C", "D", "http://2ch.hk");

        System.out.println(userSocial);
        System.out.println(webMaster);

        UserSocial socialClone = userSocial.clone();
        WebMaster webClone = webMaster.clone();

        System.out.println(socialClone);
        System.out.println(webClone);
    }
}
