package com.webwangbao.house.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webwangbao.house.biz.service.RecommendService;
import com.webwangbao.house.common.model.House;
/**
 * @author :wangbao02
 * @desc:主页面
 * @date:2018/04/18
 */
@Controller
public class HomepageController {
  
  @Autowired
  private RecommendService recommendService;
  
  @RequestMapping("index")
  public String accountsRegister(ModelMap modelMap){
    List<House> houses =  recommendService.getLastest();
    modelMap.put("recomHouses", houses);
    return "/homepage/index";
  }

  @RequestMapping("xieyi")
  public String toxieyi(){
    return "/homepage/xieyi";
  }


  @RequestMapping("")
  public String index(ModelMap modelMap){
    return "redirect:/index";
  }
}
