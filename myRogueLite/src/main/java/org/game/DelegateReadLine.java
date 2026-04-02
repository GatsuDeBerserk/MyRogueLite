package org.game;

import java.util.Scanner;

public class DelegateReadLine {
    public String question() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public String question(String question) {
        System.out.println(question);
        return question();
    }
}
