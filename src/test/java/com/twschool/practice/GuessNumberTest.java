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







}
