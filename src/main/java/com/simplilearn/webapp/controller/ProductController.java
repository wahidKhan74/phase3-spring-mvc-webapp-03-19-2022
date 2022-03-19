package com.simplilearn.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.webapp.model.Product;
import com.simplilearn.webapp.model.ProductDao;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value="/list-products", method=RequestMethod.GET)
	public ModelAndView listAllProducts() {
		ModelAndView mv = new ModelAndView("list-products");
		List<Product> list = productDao.getProducts();
		mv.addObject("list", list);
		return mv;
	}

}
