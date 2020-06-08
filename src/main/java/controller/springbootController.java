package controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class springbootController {

	 @RequestMapping(value = "/welcome", method = RequestMethod.POST)
	    public String Welcome(@RequestParam("name") String naam){
	        return "welkom "+naam;
	    }

	    @RequestMapping(value = "/huidige-datum", method = RequestMethod.GET)
	    public Date Date(){
	    	Date date = new Date();
	        return date;
	    }
}
