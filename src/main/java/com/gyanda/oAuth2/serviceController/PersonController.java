package com.gyanda.oAuth2.serviceController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gyanda.oAuth2.models.Person;
import com.gyanda.oAuth2.services.PersonService;
import com.gyanda.oAuth2.test.Question;

@Controller
@RequestMapping("/persons")
public class PersonController {
	
	private PersonService personService;
	
	@Autowired Question question;
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	
//	@RequestMapping(value = "/persons", method = RequestMethod.GET)
//	public String listPersons(Model model) {
//		model.addAttribute("person", new Person());
//		model.addAttribute("listPersons", this.personService.listPersons());
//		return "person";
//	}
//	
//	//For add and update person both
//	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
//	public String addPerson(@ModelAttribute("person") Person p){
//		
//		if(p.getId() == 0){
//			//new person, add it
//			this.personService.addPerson(p);
//		}else{
//			//existing person, call update
//			this.personService.updatePerson(p);
//		}
//		
//		return "redirect:/persons";
//		
//	}
//	
//	@RequestMapping("/remove/{id}")
//    public String removePerson(@PathVariable("id") int id){
//		
//        this.personService.removePerson(id);
//        return "redirect:/persons";
//    }
// 
//    @RequestMapping("/edit/{id}")
//    public String editPerson(@PathVariable("id") int id, Model model){
//        model.addAttribute("person", this.personService.getPersonById(id));
//        model.addAttribute("listPersons", this.personService.listPersons());
//        return "person";
//    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
	public List<Person> listPersons() {
    	
    	return this.personService.listPersons();
	}
    
    @RequestMapping(value="/add", method= RequestMethod.POST, consumes = "application/json",produces =  "application/json")
    @ResponseBody
    public List<Person> addPersons(@RequestBody Person person){
    	this.personService.addPerson(person);
    	return this.personService.listPersons();
    }
    
	
}