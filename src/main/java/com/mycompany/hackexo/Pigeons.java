package com.mycompany.hackexo;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pigeon",
})
public class Pigeons {
    private List<Pigeon>  pigeon;

    public Pigeons() {
    }

    public Pigeons(List<Pigeon> pigeons) {
        this.pigeon = pigeons;
    }

    public List<Pigeon> getPigeons() {
        return pigeon;
    }

    public void setPigeons(List<Pigeon> pigeon) {
        this.pigeon = pigeon;
    }
    
    
}
