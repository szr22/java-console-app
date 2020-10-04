package com.company.LC39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res = null;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0, target, new ArrayList<>());

        return res;
    }

    private void helper(int[] candidates, int index, int target, List<Integer> list) {
        if(target == 0){
            List<Integer> newList = new ArrayList<Integer>(list);
            res.add(newList);
            return;
        }

        for(int i=index; i<candidates.length; i++){
            if(target - candidates[i] < 0) break;
            list.add(candidates[i]);
            helper(candidates,i, target-candidates[i], list);
            list.remove(list.size()-1);
        }
    }
}
