/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web.dogshow;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author moneg
 */
public class DogShowController {
    @RequestMapping(value = {"/dogshow_add"}, method = {RequestMethod.GET})
    public ModelAndView getHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Dogshow/dogshow_add");
        return mv;
}
}
