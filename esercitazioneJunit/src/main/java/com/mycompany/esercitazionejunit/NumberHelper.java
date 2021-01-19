package com.mycompany.esercitazionejunit;

/**
 *
 * @author informatica
 */
public class NumberHelper {
    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        // ritorna true se number numero pari, altrimenti ritorna false
        if(number == 1 || number == 0)
            return false;
        if(number % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if(number == 0)
            return false;
        else if(number == 1)
            return true;
        else if(number % 2 != 0)
            return true;
        else
            return false;
    }
    
    public int sum(int n){
        // ritorna la somma tra number e n
        return number + n;
    }

    public boolean isPrime() {
    //ritorna true se number è un numero primo, altrimenti ritorna false
        /*for(int i = 3; i < number; i += 2)
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
                if(number == 2 || number == 3 || number == 5 || number == i)
                    return true;*/
        if(number == 1)
            return false;
        else if(number == 2 || number == 3 || number == 5)
            return true;
        
        for(int i = 2; i < number; i++)
            if(number % i == 0)
                return false;
        
        return true;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
        if(n == 0)
            return false;
        if(number % n == 0)
            return true;
        else
            return false;
    }
    
}
