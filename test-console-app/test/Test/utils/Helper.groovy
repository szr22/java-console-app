package Test.utils

import com.company.util.ListNode
import com.company.util.TreeNode

class Helper {
    static void checkArray(actual, expect){
        for(int i=0; i<expect.size(); i++){
            assert expect[i]==actual[i]
        }
    }

    static void check2DArray(actual, expect){
        for(int i=0; i<expect.size(); i++){
            for(int j=0; j<expect[i].size(); j++){
                assert expect[i][j]==actual[i][j]
            }
        }
    }

    static boolean checkTree(TreeNode actual, TreeNode expect){
        if(actual==null && expect ==null){
            return true;
        }
        if(actual==null || expect ==null){
            return false;
        }
        return checkTree(actual.left, expect.left) && checkTree(actual.right, expect.right);
    }

    static boolean checkListNode(ListNode actual, ListNode expect){
        if(actual==null && expect ==null){
            return true;
        }
        if(actual==null || expect ==null){
            return false;
        }
        return actual.val==expect.val && checkListNode(actual.next, expect.next)
    }
}
