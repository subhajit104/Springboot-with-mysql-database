package com.cap_coder.Spring.Boot.With.MYSQL.controller;
import com.cap_coder.Spring.Boot.With.MYSQL.ProductService;
import com.cap_coder.Spring.Boot.With.MYSQL.model.products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class homeController {

    private final ProductService service;

    public homeController(ProductService service) {
        this.service = service;
    }


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<products> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {

        System.out.println(" ##############################################\n###########\n");
        products product = new products();
        model.addAttribute("product", product);

        System.out.println(" ####################### okay  #######################\n\n");
        return "new_product";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") products product) {
        service.save(product);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        products product = service.get(id);
        mav.addObject("product", product);

        return mav;
    }


    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
