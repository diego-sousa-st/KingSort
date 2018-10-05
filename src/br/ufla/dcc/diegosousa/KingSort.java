package br.ufla.dcc.diegosousa;

import java.util.Hashtable;

/**
 * @author diego
 * @version 1.0
 */
public class KingSort {

    private String[] elements;

    private Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();

    public KingSort() {

        hashtable.put('I',1);
        hashtable.put('X',10);
        hashtable.put('V',5);
        hashtable.put('L',50);

    }

    public String[] getSortedList(String[] names) {

        this.elements = names;

        this.sort();
        
        return this.elements;

    }

    private int romanToInt(String roman) {

        int intNum=0;
        int previous = 0;

        for(int i = roman.length()-1; i >= 0 ; i--) {

            int temp = hashtable.get(roman.charAt(i));

            if(temp < previous) {

                intNum -= temp;
            }
            else {

                intNum += temp;

            }

            previous = temp;

        }

        return intNum;

    }

    private int firstLtSecond(String first, String second) {

        char[] cFirst = first.toCharArray();
        char[] cSecond = second.toCharArray();

        for(int i = 0; i < cFirst.length; i++) {

            try {

                if(cFirst[i] > cSecond[i]) {

                    return 1;

                } else if(cFirst[i] < cSecond[i]){

                    return -1;

                }

            } catch (IndexOutOfBoundsException e ){

                return 1;

            }

        }

        return 0;

    }

    private boolean firstLessThanEqualSecond(String first, String second) {

        String[] nameAndNum1 = first.split(" ");
        String[] nameAndNum2 = second.split(" ");

        int result = this.firstLtSecond(nameAndNum1[0], nameAndNum2[0]);

        if(result == -1) {

            return true;

        } else if(result == 0 ) {

            int num1 = this.romanToInt(nameAndNum1[1]);
            int num2 = this.romanToInt(nameAndNum2[1]);

            if(num2 > num1) {

                return true;

            }

            return false;

        } else {

            return false;

        }

    }

    /**
     * QuickSort
     */

    private void sort(){
        
        quickSort(this.elements, 0, this.elements.length-1);
        
    }

    private void exchange(String elements[],int i, int j){
        
        String aux = elements[i];
        elements[i] = elements[j];
        elements[j] = aux;
        
    }

    private int partition(String elements[],int first,int last){
        
        String pivo = elements[last];
        int indexMenores = first-1;
        
        for(int indexMaiores = first; indexMaiores < last; indexMaiores++) {
            
            if(this.firstLessThanEqualSecond(elements[indexMaiores], pivo)){
                
                indexMenores++;
                exchange(elements,indexMenores,indexMaiores);
                
            }
            
        }
        
        int indexPivo = ++indexMenores;
        
        exchange(elements, indexPivo, last);
        
        return indexPivo;
        
    }

    private void quickSort(String elements[],int first,int last){
        
        if(first < last){
            
            int q = partition(elements,first,last);
            
            quickSort(elements, first, q-1);
            quickSort(elements, q+1, last);
            
        }
        
    }

}
