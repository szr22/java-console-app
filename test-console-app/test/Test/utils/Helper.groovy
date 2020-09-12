package Test.utils

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
}
