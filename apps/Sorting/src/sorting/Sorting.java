/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        int n = 1000000;
        List<Integer> list = new ArrayList<>();    
        new Random().ints(n, Integer.MIN_VALUE, Integer.MAX_VALUE).forEach(x -> list.add(x));
        
        int[] input = list.stream().mapToInt(i->i).toArray();
        
        BubbleSort.getInstance().sort(input);
        InsertionSort.getInstance().sort(input);
        SelectionSort.getInstance().sort(input);
        MergeSort.getInstance().sort(input);
        
        System.out.println(n + " item");
        System.out.println(BubbleSort.class + " " + BubbleSort.getInstance().getExecutionTime() + " ");
        System.out.println(InsertionSort.class + " " + InsertionSort.getInstance().getExecutionTime() + " ");
        System.out.println(SelectionSort.class + " " + SelectionSort.getInstance().getExecutionTime() + " ");
        System.out.println(MergeSort.class + " " + MergeSort.getInstance().getExecutionTime() + " ");
}
    
}
