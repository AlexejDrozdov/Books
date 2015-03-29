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
public class Publication {
    private int countPage;
    private String tag;

    public Publication(int countPage, String tag){
        this.countPage = countPage;
        this.tag = tag;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
