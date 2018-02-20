package com.leena.core;



import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class JAXBExample {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setId(2);
        customer.setAge(32);
        customer.setName("Jiya");


        try{
            File file = new File("/Users/leenapatil/workspace/XMLToAvro/file.xml");

                JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

                jaxbMarshaller.marshal(customer,file);
                jaxbMarshaller.marshal(customer,System.out);
                

            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }
    }

