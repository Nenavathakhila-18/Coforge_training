package com.coforge.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("home")
    public ModelAndView loadHomePage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductPage");  
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "product", params = "ProductRegistration")
    public ModelAndView createProduct(@ModelAttribute Product product) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductPage");

        String result;

        boolean status = service.createProduct(product);

        if (status) {
            result = "SUCCESS : Product Saved";
        } else {
            result = "FAILED : Product Not Saved";
        }

        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "product", params = "UpdateProduct")
    public ModelAndView updateProduct(@ModelAttribute Product product) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductPage");

        String result;

        boolean status = service.updateProduct(product);

        if (status) {
            result = "SUCCESS : Product Updated";
        } else {
            result = "FAILED : Product Not Updated";
        }

        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "product", params = "DeleteProduct")
    public ModelAndView deleteProduct(@RequestParam int pid) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductPage");

        String result;

        boolean status = service.deleteProduct(pid);

        if (status) {
            result = "SUCCESS : Product Deleted";
        } else {
            result = "FAILED : Product Not Deleted";
        }

        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "product", params = "SearchProductByID")
    public ModelAndView findProduct(@RequestParam int pid) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductPage");

        Product product = service.findProductByID(pid);

        if (product != null) {
            mv.addObject("result", product.toString());
        } else {
            mv.addObject("result", "FAILED : Product Not Found");
        }

        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "product", params = "SearchProduct")
    public ModelAndView findAllProducts() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductPage");

        List<Product> products = service.findAllProducts();

        mv.addObject("result", products);

        return mv;
    }

}