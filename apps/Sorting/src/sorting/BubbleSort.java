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
public class BubbleSort extends Sort{

    private static BubbleSort singleton;
    public static BubbleSort getInstance() {
        if(singleton == null)
            singleton = new BubbleSort();
        return singleton;
    }
    
    @Override
    public int[] sort(int[] arrayInput) {
        if(arrayInput.length > 0) {
            for(int i=0 ; i < arrayInput.length-1; i++) {
                for(int j=0; j < arrayInput.length-1-i; j++) {
                    int x = arrayInput[j];
                    int y = arrayInput[j+1];
                    if(x > y) {
                        arrayInput[j+1] = x;
                        arrayInput[j] = y;
                    }
                }
            }
        }
        
        return arrayInput;
    }
}
