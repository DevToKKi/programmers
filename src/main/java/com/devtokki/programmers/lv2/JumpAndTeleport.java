package com.devtokki.programmers.lv2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 */
public class JumpAndTeleport {
    public int solution(int n) {
        int ans = 0;
        while(n > 1) {
            if( n % 2 != 0)
                ++ans;

            n = n / 2;
        }
        return ans + 1;
    }
}
