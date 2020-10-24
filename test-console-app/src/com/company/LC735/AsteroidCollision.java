package com.company.LC735;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr = asteroids[i];
            while(stack.size()>0 && stack.peek()>0 && curr<0){
                int top = stack.pop();
                if(top == -curr){
                    curr = 0;
                    break;
                }
                if(top>-curr){
                    curr = top;
                }
            }
            if(curr!=0)
                stack.push(curr);
        }
        int res[] = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            int top = stack.pop();
            res[i] = top;
        }
        return res;
    }
}
