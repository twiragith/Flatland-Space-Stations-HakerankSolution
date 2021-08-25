package hakerrank.algorithm;

import java.util.Arrays;

public class FlatlandSpaceStations {

    static int findDistance(int n, int[] c){
        int result=0;

        Arrays.sort(c);

        result= c[0];

        for (int i = 0; i < (c.length-1); i++) {
            if(Math.floorDiv(c[i+1]-c[i],2)>result){
                result = Math.floorDiv(c[i+1]-c[i],2);
            }
        }

        if(n-c[c.length-1]-1>result)
            result = n-c[c.length-1]-1;


        return result;
    }

    public static void main(String[] args) {

        System.out.println(findDistance(20, new int[]{13, 1, 11, 10 ,6}));

    }

}
