/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsuir.wtech2.books.entity.products;

import com.bsuir.wtech2.books.entity.Product;

/**
 *
 * @author Alexey Drozdov 251006
 */
public class Verse extends Product{

    private int countStop;
    public Verse(String language, String author, int countStop) {
        super(language, author);
        this.countStop = countStop;
    }
    
    public int getStop(){
        return countStop;
    }
    
    public void setStop(int countStop){
        this.countStop = countStop;
    }
            
}
