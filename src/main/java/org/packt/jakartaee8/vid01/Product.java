/**
 * 	<h1>Packt Publishing - JakartaEE 8 Recipes</h1>
 * 	A typical POJO when used in EJB session beans. 
 * 	
 *  
 *  @author Sherwin John Tragura
 *  @version 1.0
 *  @since December 4, 2018
 * 
 */

package org.packt.jakartaee8.vid01;

import java.io.Serializable;
import java.time.LocalDate;


public class Product implements Serializable{
		
    private static final long serialVersionUID = -9126923390440918622L;

	
	private Integer id;
    	
   
	private String name;
    
   
    private Double price;
    
  
    private LocalDate supplied;
    
    public LocalDate getSupplied() {
		return supplied;
	}
	public void setSupplied(LocalDate supplied) {
		this.supplied = supplied;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
