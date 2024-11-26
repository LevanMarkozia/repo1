package ge.ibsu.demo.controllers;

import ge.ibsu.demo.dto.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @RequestMapping(value="/hello",method= RequestMethod.GET,produces={"application/json"})
    public String hello(){
        return "Hi";
    }
    @RequestMapping(value="/person",method=RequestMethod.PATCH,produces={"application/json"})
    public Person testPost(@RequestBody Person p){
        p.setName(p.getName()+" from server");
        return p;
    }
}
