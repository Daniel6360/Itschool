package ro.itschool.curs23.justbeancontainer;

import org.springframework.stereotype.Component;

@Component
public class PrintingAtConstruction {

    public PrintingAtConstruction(){
        System.out.println("This is bean container");
    }

    public String sayHello(){
        return ("Hello from printer");
    }
}
