/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsuir.wtech2.books.entity.publications;

import com.bsuir.wtech2.books.entity.Publication;

/**
 *
 * @author Alexey Drozdov 251006
 */
public class Magazine extends Publication {
    
    private int year;
    public Magazine(int countPage, String tag, int year) {
        super(countPage, tag);
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(String author) {
        this.year = year;
    }
    
}
