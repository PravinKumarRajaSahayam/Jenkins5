package com.ems;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
@Controller
public class EMSController {
@Autowired
EmployeeDAO dao;

@RequestMapping("EMSControler")
public ModelAndView sayWelcome() {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("Links");
    return mv; 
}
@RequestMapping("Links")
public ModelAndView sayWelcom() {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("Links");
    return mv;        
}   
@RequestMapping("InsertEmployee")
public ModelAndView loadInsertEmployee() {
    ModelAndView mv=new ModelAndView("InsertEmployee");
    return mv;        
}
@RequestMapping("PerformInsert")
public ModelAndView performInsert(@ModelAttribute("bean") Employee bean)
{
dao.insertEmployee(bean);
ModelAndView mv = new ModelAndView("InsertEmployeeSuccess");
mv.addObject("bean",bean);
return mv;
}
@RequestMapping("UpdateEmployee")
public ModelAndView loadUpdateEmployee() {
    ModelAndView mv=new ModelAndView("UpdateEmployee");
    return mv;        
}
@RequestMapping("PerformUpdate")
public ModelAndView performUpdate(@ModelAttribute("bean") Employee bean)
{
dao.updateEmployee(bean);
ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");
mv.addObject("bean",bean);
return mv;
}
@RequestMapping("DeleteEmployee")
public ModelAndView loadDeleteEmployee() {
	List<Integer> List = dao.getIdList();
    ModelAndView mv=new ModelAndView("DeleteEmployee");
    mv.addObject("idList",List);
    return mv;        
}
@RequestMapping("PerformDelete")
public ModelAndView performDelete(@ModelAttribute("bean") Employee bean)
{
dao.deleteEmployee(bean);
ModelAndView mv = new ModelAndView("DeleteEmployeeSuccess");
mv.addObject("bean",bean);
return mv;
}
public ModelAndView loadFindEmployee() {
	List<Integer> List = dao.getIdList();
    ModelAndView mv=new ModelAndView("FindEmployee");
    mv.addObject("idList",List);
    return mv;        
}
@RequestMapping("PerformFind")
public ModelAndView performFind(@ModelAttribute("bean") Employee bean)
{
Employee emp = dao.findEmployee(bean);
ModelAndView mv = new ModelAndView("FindEmployeeSuccess");
mv.addObject("emp",emp);
return mv;
}
}