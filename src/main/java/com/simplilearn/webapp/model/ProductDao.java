package com.simplilearn.webapp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductDao {
	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	// list all products
	public List<Product> getProducts() {
		List<Product> productsList = template.query("select * from product_data", new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setCreatedAt(rs.getDate(4));
				return product;
			}
		});
		return productsList;
	}
	
	// add product
	// update product
	// delete product
	
}
