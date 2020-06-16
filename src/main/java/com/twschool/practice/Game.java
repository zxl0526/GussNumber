package com.twschool.practice;

public class Game {




    public static String playGame(String input) throws Exception {
         String[] answer = { "1", "2", "3", "4" };
        // 值正确，位置不正确
        int answerCountRight = 0;
        // 值正确，位置正确
        int positionCountRight  = 0;

        String[] result = input.split(" ");
        for (int i = 0; i < result.length; i++) {
            for (int k = 0; k < answer.length; k++) {
                if (result[i].equals(answer[k])) {
                    // 位置相等
                    if (i == k) {
                        positionCountRight++;
                    } else {
                        // 只有值相等
                        answerCountRight++;
                    }
                }
            }
        }
        return positionCountRight + "A" + answerCountRight + "B";
    }
}
