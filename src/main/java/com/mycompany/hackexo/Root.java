package com.mycompany.hackexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pigeons",
})
@XmlRootElement(name = "root")
public class Root {
    private Pigeons pigeons;

    public Root() {
    }

    public Root(Pigeons pigeons) {
        this.pigeons = pigeons;
    }

    public Pigeons getPigeons() {
        return pigeons;
    }

    public void setPigeons(Pigeons pigeons) {
        this.pigeons = pigeons;
    }
    
    
}
