package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By liming on 2020/2/4
 */

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findItemById")
    public String findItemById(Model model){
        Items items=itemsService.findItemById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }



}
