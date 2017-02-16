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
public class MergeSort extends Sort{
    private static MergeSort singleton;
    public static MergeSort getInstance() {
        if(singleton == null)
            singleton = new MergeSort();
        return singleton;
    }
    
    private boolean firstSort = true;
    
    @Override
    public int[] sort(int[] input) {
        if(firstSort) {
            startTimer();
            firstSort = false;
        }
        
        int[] L = new int[input.length];
        
        if (input.length > 1) {
            int m = input.length/2;
            int[] listOne = new int[m];
            int[] listTwo = new int[input.length-m];
            
            int j=0;
            for(int i=0; i<input.length; i++) {
                if(i<m) {
                    listOne[i] = input[i];
                }
                else {
                    listTwo[j] = input[i];
                    j++;
                }
            }
           
            if(listOne.length > 1)
                listOne = sort(listOne);
            if(listTwo.length > 1)
                listTwo = sort(listTwo);
            
            L = merge(listOne, listTwo);
        }
        else {
            L[0] = input[0];
        }
        
        firstSort = true;
        stopTimer();
        return L;
    }
     
    private int[] merge(int[] one, int[] two) {
        int min;
        int m = one.length;
        int n = two.length;
        int[] listMerge = new int[m+n];
        
        int i = 0;
        while(m > 0 && n > 0) {
            int minListOne = Min(one);
            int minListTwo = Min(two);
            if(minListOne < minListTwo) {
                min = minListOne;
                one = remove(indexOf(min,one),one);
                m--;
            }
            else {
                min = minListTwo;
                two = remove(indexOf(min,two),two);
                n--;
            }   
            listMerge[i] = min;
            i++;
        }
        
        if(m < 1) {
            for(int item : two) {
                listMerge[i] = item;
                i++;
            } 
        }
        else if(n < 1) {
            for(int item : one) {
                listMerge[i] = item;
                i++;
            } 
        } 
        
        return listMerge;
    }
}
