package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    //测试案例，假定"1234" 为答案（输出控制台）

    //位置和数字全对（4A0B）
    @Test
    public void should_return_4A0B_input_1234() {
       should_try_catch("1 2 3 4","4A0B");
    }
    //位置和数字全错（0A0B）
    @Test
    public void should_return_0A0B_input_5678() {
        should_try_catch("5 6 7 8","0A0B");
    }
    //位置全错，数字全对（0A4B）
    @Test
    public void should_return_0A4B_input_4321() {
      should_try_catch("4 3 2 1","0A4B");
    }
    //数字全对，位置有对有错（2A2B）
    @Test
    public void should_return_2A2B_input_1243() {
        should_try_catch("1 2 4 3","2A2B");

    }
    //位置全错，数字有对有错（0A2B）
    @Test
    public void should_return_0A2B_input_2178() {
        should_try_catch("2 1 7 8","0A2B");
    }
    //位置部分错，数字部分错（1A2B）
    @Test
    public void should_return_1A2B_input_8324() {
        should_try_catch("8 3 2 4","1A2B");
    }
    public void  should_try_catch(String input,String resultA){

        String result = null;
        try {
            result = Game.playGame(input);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertEquals(resultA,result);
    }
}
