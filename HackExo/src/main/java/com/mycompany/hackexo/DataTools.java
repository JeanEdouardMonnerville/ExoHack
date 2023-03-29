package com.mycompany.hackexo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;

/**
 *
 * @author jemon
 */
public class DataTools {

    private String filePath = "src/main/resources/";

    public DataTools() {
    }

    public Root readAnalyseFromXml() {
        Root root = null;
        System.out.println("com.mycompany.hackexo.DataTools.readAnalyseFromXml()");
        try {
            JAXBContext cont = JAXBContext.newInstance(Root.class);
            Unmarshaller u = cont.createUnmarshaller();
            File file = new File(filePath + "data.xml");
            System.out.println(file.exists());
            if (file.exists()) {
                root = (Root) u.unmarshal(file);
                System.out.println(root.getPigeons().getPigeons().get(0).getUsername());
            } else {
                InputStream input = getClass().getClassLoader().getResourceAsStream("data.xml");
                root = (Root) u.unmarshal(input);
                assert input != null;
                input.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return root;
    }

    public void saveAnalyseToXml(Root root) {
        try {
            JAXBContext cont = JAXBContext.newInstance(Root.class);
            Marshaller m = cont.createMarshaller();
            File file = new File(filePath + "data.xml");

            if (!file.exists()) {
                OutputStream output = new FileOutputStream(filePath + "data.xml");
                m.marshal(root, output);
                output.close();
            } else {
                OutputStream output = new FileOutputStream(filePath + "data.xml");
                m.marshal(root, output);

                output.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteThisFile() {

        try {

            File file = new File(filePath + "data.xml");

            if (file.delete()) {
                System.out.println(file.getName() + " est supprimé.");
            } else {
                System.out.println("Opération de suppression echouée");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
