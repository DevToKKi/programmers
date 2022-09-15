package com.devtokki.programmers.lv2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpAndTeleportTest {

    @Test
    void solutionTest1() {
//        Given
        Integer oracle = 2;
        Integer inputValue = 5;
        JumpAndTeleport quiz = new JumpAndTeleport();

//        When
        Integer ret = quiz.solution(inputValue);
//        Then
        Assertions.assertEquals(oracle, ret);
    }

    @Test
    void solutionTest2() {
//        Given
        Integer oracle = 2;
        Integer inputValue = 6;
        JumpAndTeleport quiz = new JumpAndTeleport();

//        When
        Integer ret = quiz.solution(inputValue);
//        Then
        Assertions.assertEquals(oracle, ret);
    }

    @Test
    void solutionTest3() {
//        Given
        Integer oracle = 5;
        Integer inputValue = 5000;
        JumpAndTeleport quiz = new JumpAndTeleport();

//        When
        Integer ret = quiz.solution(inputValue);
//        Then
        Assertions.assertEquals(oracle, ret);
    }
}