package com.twschool.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessInputAnswer {

    private BufferedReader bufferedReader;

    public GuessInputAnswer() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() throws IOException {
        System.out.println("------Please input your answer as x x x x , x <10 ------");
        return bufferedReader.readLine();
    }
}
