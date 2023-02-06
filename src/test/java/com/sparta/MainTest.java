package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("my first test")
    public void firsTest(){
        Assertions.assertTrue( 5==5);
    }
    @Test
    @DisplayName("given a time 21, greeting return good evening")
    public void Give21_greeting_ReturnsGoodEvening(){
        int time= 21;
                String expectedGreeting = "good evening ";
        String result= Main.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 10, 12})
    @DisplayName("given a time between 5 to 12, greeting method returns good morning")
    public void GivenTimeBetween5And12_Greeting_ReturnsGoodmorning(int time){
        String expected = "good morning";
        String result = Main.greeting(time);
        Assertions.assertEquals(expected, result);
    }


}