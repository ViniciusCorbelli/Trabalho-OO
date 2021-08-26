/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.model;

/**
 *
 * @author Vinícius
 */
public class Payment extends Movement {
    
	private String id;
	
	public String getId() {
		return id;
	}

	public void setBankAccount(String id) {
		this.id = id;
	}

	@Override
	public void setBankAccount(BankAccount bank) {
	}
    
}
