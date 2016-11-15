
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moneg
 */
public class HomePageController {
    @RequestMapping(value = {"/","/home_page"}, method = {RequestMethod.GET})
    public ModelAndView getHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/home_page");
        return mv;
    }
}
