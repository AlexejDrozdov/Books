/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsuir.wtech2.books.entity;

/**
 *
 * @author Alexey Drozdov 251006
 */
public class Product {
    private String language;
    private String author;
    
    public Product(String language, String author){
        this.language = language;
        this.author = author;
    }
    
    public String getLanguage(){
        return this.language;
    }
    
    public void setLanguage(String language){
        this.language = language;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public void setAutor(String author){
        this.author = author;
    }
    
}
