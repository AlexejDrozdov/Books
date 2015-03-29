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
public class Novel extends Product {

    private String mainHero;
    private int part;
    public Novel(String language, String author, String mainHero, int part) {
        super(language, author);
        this.mainHero = mainHero;
        this.part = part;
    }
    
    public String getMainHero(){
        return this.mainHero;
    }
    
    public void getMainHero(String mainHero){
        this.mainHero = mainHero;
    }
    
    public int getPart(){
        return this.part;
    }
    
    public void setPart(int part){
        this.part = part;
    }
    
}
