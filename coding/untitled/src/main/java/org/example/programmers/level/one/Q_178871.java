package org.example.programmers.level.one;

import java.util.Arrays;

public class Q_178871 {

    public static void run() {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Arrays.stream(callings).forEach(call -> {
            players.equals(call)
        });

        for (String name : players) {
            System.out.println(name);
        }
    }
}
