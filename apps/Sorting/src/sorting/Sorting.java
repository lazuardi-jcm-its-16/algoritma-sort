/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author rif
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] input = new int[4];
        input[0] = 8;
        input[1] = 5;
        input[2] = 1;
        input[3] = 3;
        
        System.out.println(Arrays.toString(MergeSort.getInstance().sort(input)));
    }
    
}
