package org.game;

import java.util.Scanner;

public class DelegateReadLine {
    public static String question() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String question(String question) {
        System.out.println(question);
        return question();
    }
}
