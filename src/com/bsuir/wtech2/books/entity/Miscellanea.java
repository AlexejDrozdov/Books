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
public abstract class Miscellanea{
	
	private int cost;
	
	public Miscellanea(int cost) {
		this.cost = cost;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		
		if (this.getClass()!=obj.getClass() || obj==null) {
			return false;
		}

		Miscellanea miscellaneaElement = (Miscellanea) obj;
		if (this.cost == miscellaneaElement.cost) {
			return true;
		} else {
			return false;
		}
	}
	public int hashCode(){
		return 31 * this.cost;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public abstract String toString();
}