package com.webwangbao.house.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webwangbao.house.biz.service.CommentService;
import com.webwangbao.house.common.model.User;
import com.webwangbao.house.web.interceptor.UserContext;
/**
 * @author :wangbao02
 * @desc:内容
 * @date:2018/04/18
 */
@Controller
public class CommentController {
  
  @Autowired
  private CommentService commentService;
  
  
  @RequestMapping(value="comment/leaveComment",method={RequestMethod.POST,RequestMethod.GET})
  public String leaveComment(String content,Long houseId,ModelMap modelMap){
    User user = UserContext.getUser();
    Long userId =  user.getId();
    commentService.addHouseComment(houseId,content,userId);
    return "redirect:/house/detail?id=" + houseId;
  }
  
  @RequestMapping(value="comment/leaveBlogComment",method={RequestMethod.POST,RequestMethod.GET})
  public String leaveBlogComment(String content,Integer blogId,ModelMap modelMap,RedirectAttributes redirectAttributes){
    User user = UserContext.getUser();
    Long userId =  user.getId();
    commentService.addBlogComment(blogId,content,userId);
    return "redirect:/blog/detail?id=" + blogId;
  }

}
