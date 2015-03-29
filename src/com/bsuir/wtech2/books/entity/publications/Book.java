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
public class Book extends Publication {
    private String publishingHouse;
    public Book(int countPage,String tag, String publishingHouse) {
        super(countPage, tag);
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return publishingHouse;
    }

    public void setAuthor(String author) {
        this.publishingHouse = author;
    }
}
