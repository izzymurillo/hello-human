package com.izzy.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Create an app that will show in the browser either a default value of "human" or with the name provided in the URL query string.
@RestController
public class HumanController {
  
  @RequestMapping("/")
  public String index(@RequestParam(value="name", required=false) String name) {
    if (name != null) {
      return "Hello " + name;
    }
    return "Hello Human";
  }

}
