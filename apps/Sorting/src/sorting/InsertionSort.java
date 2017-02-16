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
public class InsertionSort extends Sort{
    private static InsertionSort singleton;
    public static InsertionSort getInstance() {
        if(singleton == null)
            singleton = new InsertionSort();
        return singleton;
    }
    
    @Override
    public int[] sort(int[] arrayInput) {
        startTimer();
        
        for(int j=1; j < arrayInput.length; j++) {
            int i = 0;
            while(arrayInput[j] > arrayInput[i]) {
                i++;
            }
            int m = arrayInput[j];
            for(int k=0; k<(j-i); k++) {
                arrayInput[j-k] = arrayInput[j-k-1];
            }
            arrayInput[i] = m;
        }
        
        stopTimer();
        return arrayInput;
    }
}
