package com.example.Primeiroexerciosspring.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Helloworld {


@GetMapping("/hello")
public String Helloworld (){

    return "helloword";

}

}
