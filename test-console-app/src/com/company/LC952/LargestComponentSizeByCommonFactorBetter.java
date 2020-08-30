package com.company.LC952;

public class LargestComponentSizeByCommonFactorBetter {
    private int[] generateSpf(int lim){
        int spf[] = new int[lim+1];
        for(int i=2; i<=lim; i++){
            if(spf[i] == 0){
                for(int j=i; j<=lim; j+=i)
                    spf[j] = (spf[j]==0)?i:spf[j];
            }
        }
        return spf;
    }

    private int findParent(int id[], int i){
        if(id[i] == i) return i;
        return (id[i] = findParent(id, id[i]));
    }

    private void union(int id[], int cnt[], int i, int j){
        i = findParent(id, i);
        j = findParent(id, j);

        if(i == j) return;

        if(cnt[i] >= cnt[j]){
            id[j] = id[i];
            cnt[i] += cnt[j];
        }
        else{
            id[i] = j;
            cnt[j] += cnt[i];
        }
    }

    public int largestComponentSize(int[] A) {
        int max = (int)1e5 + 10,
            spf[] = generateSpf(max),
            n = A.length, id[] = new int[n],
            label[] = new int[max+1],
            cnt[] = new int[n];

        for(int i=0; i<=max; i++)
            label[i] = -1;

        for(int i=0; i<n; i++){
            id[i] = i;
            cnt[i] = 1;

            int val = A[i];
            while(val > 1){
                if(label[spf[val]] == -1)    label[spf[val]] = i;
                else    union(id, cnt, i, label[spf[val]]);
                val /= spf[val];
            }
        }

        int maxSize = 0;
        for(int i=0; i<n; i++){
            if(maxSize<cnt[findParent(id, i)])
                maxSize = cnt[findParent(id, i)];
        }

        return maxSize;
    }
}
