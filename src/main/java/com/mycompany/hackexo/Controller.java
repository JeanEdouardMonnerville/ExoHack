package com.mycompany.hackexo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private DataTools tools = new DataTools();
    
    @PostMapping(path = "/pigeon", consumes = "application/json")
    public void postPigeon(@RequestBody Pigeon pigeon){
            Root root = tools.readAnalyseFromXml();
            root.getPigeons().getPigeons().add(pigeon);
            tools.saveAnalyseToXml(root);
        }
    
    @GetMapping(path = "/pigeon", produces = "application/json" )
    public Pigeons getPigeons(){
        return tools.readAnalyseFromXml().getPigeons();
    }
    
}
