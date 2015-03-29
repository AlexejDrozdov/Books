/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsuir.wtech2.books.entity;

import java.util.ArrayList;

/**
 *
 * @author Alexey Drozdov 251006
 */
public abstract class Miscellanea{
	
    private Publication publication;
    private ArrayList<Product> products;

    public Miscellanea(Publication publication, ArrayList<Product> products){
        this.publication = publication;
        this.products = new ArrayList<Product>(products);
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}