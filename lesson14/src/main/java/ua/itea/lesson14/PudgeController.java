package ua.itea.lesson14;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pudgeService")
public class PudgeController {
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Pudge getPudgeById(@PathVariable String id) {
		Pudge pudge = new Pudge("miniMax", Integer.valueOf(id));
		return pudge;
	}
	
	@RequestMapping(value="/addPudge", method=RequestMethod.POST)
	public Pudge addPudge(@RequestBody Pudge pudge) {
		System.out.println(pudge);
		return pudge;
	}

}
