package org.packt.jakartaee8.vid01;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/repo")
public class ProdDataRepoService {
	
	
	@GET
	@Path("/strdata")
    @Produces(MediaType.TEXT_PLAIN)
	
	public String getData() {
		return new String("Strdata...");
		
    }
	
	@GET
	@Path("/arrdata")
    @Produces(MediaType.APPLICATION_JSON)
	public String[] listStringArray() {
        return new String[]{"I", "LOVE", "JAKARTAEE", "."};
    }
	
	@GET
	@Path("/listdata")
    @Produces(MediaType.APPLICATION_JSON)
	 public List<String> listData() {
        List<String> listStr = new ArrayList<>();
        listStr.add("I");
        listStr.add("LOVE");
        listStr.add("JAKARTEE");
        listStr.add(".");
        return listStr;
    }
			
	@GET
	@Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
	public Product generateJson() {
		Product product = new Product();
		product.setId(101);
		product.setName("Maling");
		product.setPrice(67869.89);
		
		return product;
    }
	
	
	
	
	
	
	
}
