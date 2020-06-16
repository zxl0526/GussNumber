package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    //测试案例，假定"1234" 为答案（输出控制台）

    //位置和数字全对（4A0B）
    @Test
    public void should_return_4A0B_input_1234() {
        //given
        String input = "1 2 3 4";
        //when
        String result = null;
        try {
            result = Game.playGame(input);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //then
        assertEquals("4A0B", result);
    }
    //位置和数字全错（0A0B）
    @Test
    public void should_return_0A0B_input_5678() {
        //given
        String input = "5678";
        //when
        String result = null;
        try {
            result = Game.playGame(input);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //then
        assertEquals("0A0B", result);
    }
    //位置全错，数字全对（0A4B）
    @Test
    public void should_return_0A4B_input_4321() {
        //given
        String input = "4 3 2 1";
        //when
        String result = null;
        try {
            result = Game.playGame(input);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //then
        assertEquals("0A4B", result);
    }
    //数字全对，位置有对有错（2A2B）
    @Test
    public void should_return_2A2B_input_1243() {
        //given
        String input = "1 2 4 3";
        //when
        String result = null;
        try {
            result = Game.playGame(input);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //then
        assertEquals("2A2B", result);
    }
    //位置全错，数字有对有错（0A2B）
    @Test
    public void should_return_0A2B_input_2178() {
        //given
        String input = "2 1 7 8";
        //when
        String result = null;
        try {
            result = Game.playGame(input);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //then
        assertEquals("0A2B", result);
    }

}
