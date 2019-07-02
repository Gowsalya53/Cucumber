package stepdef;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ProductSearch {
	@When("user searches for the product")
	public void user_searches_for_the_product(DataTable Productdata) {
		List<String> Productname=Productdata.asList();
		for(String products:Productname)
		{
			System.out.println(products);
		}
	   
	}

	@When("verify products displayed")
	public void verify_products_displayed() {
		System.out.println("verify products");
	   
	}

	@Then("Close application")
	public void close_application() {
		System.out.println("close");
	    
	}
}
