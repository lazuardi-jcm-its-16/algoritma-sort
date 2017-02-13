/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


/**
 *
 * @author rif
 */
public class SelectionSort extends Sort{

    private static SelectionSort singleton;
    public static SelectionSort getInstance() {
        if(singleton == null)
            singleton = new SelectionSort();
        return singleton;
    }
    
    @Override
    public int[] sort(int[] input) {
        int[] sorted = new int[input.length];
        int i = 0;
        do {
            int min = Min(input);
            sorted[i] = min;
            input = remove(indexOf(min, input), input);
            i++;
        } while (input.length > 0);
        
        return sorted;
    }
    
}
