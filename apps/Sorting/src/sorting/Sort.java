package sorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rif
 */
public abstract class Sort {
    public abstract int[] sort(int[] input);
    
    public Integer Max(int[] input) {
        if(input.length > 0) {
            int max = input[0];
            for(Integer item : input) {
                if(max < item)
                    max = item;
            }
            return max;
        }
        return null;
    }
    
    public Integer Min(int[] input) {
        if(input.length > 0) {
            int min = input[0];
            for(Integer item : input) {
                if(min > item)
                    min = item;
            }
            return min;
        }
        return null;
    }
    
    public Integer indexOf(int val, int[] input) {
        int i = 0;
        while(i < input.length && val == input[i]) {
            i++;
        }
        if(i < input.length)
            return i;
        else
            return 0;
    }
    
    public int[] remove(int idx, int[] input) {
        int[] result = new int[input.length-1];
        for(int i=0; i<input.length-1; i++) {
            if(i == idx)
                result[i] = input[i+1];
            else
                result[i] = input[i];
        }
        return result;
    }
}
