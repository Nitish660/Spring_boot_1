package com.example.REST.Spring.REST;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

   /* @GetMapping("/hello")
    public String sayHello() {
        return "Hello from FirstController" ;
    }*/

    @PostMapping("/post-order")
    public  String post(@RequestBody Order order
    ){
           return "Post from FirstController " + order.toString() ;
    }

   //http://localhost:8080/hello/alibu
    @GetMapping("/hello/{user-name}")
    public String pathVar(
           @PathVariable("user-name") String userName
    ){
        return  "Hello from FirstController " + userName ;
    }


    //http://localhost:8080/hello?param_name=param-value & param_namr 2= value
    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-lastname") String userLastname
    ){
        return "Hello from FirstController " + userName + " " + userLastname;
    }

  /*@GetMapping("/hello/{user-name}/{user-lastname}")
public String paramVar(
        @PathVariable("user-name") String userName,
        @PathVariable("user-lastname") String userLastname
){
    return "Hello from FirstController " + userName + " " + userLastname;
}

*/



}
