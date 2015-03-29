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
public class Fable extends Product {
    
    private String nation;
    
    public Fable(String language, String author, String nation) {
        super(language, author);
        this.nation = nation;
    }
    
    public String getNation(){
        return nation;
    }
    
    public void setNation(String nation){
        this.nation = nation;
    }
    
}
