package com.easebank.irpkne;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class riskprofilingController {

    @GetMapping("/riskprofiling")
    public String riskProfiling(){
        System.out.println("test successful");
        return "testing successfull";
    }
}
