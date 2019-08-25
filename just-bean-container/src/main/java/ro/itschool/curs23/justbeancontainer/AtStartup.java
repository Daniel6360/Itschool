package ro.itschool.curs23.justbeancontainer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AtStartup implements CommandLineRunner {
    private final PrintingAtConstruction printer;

    public AtStartup(PrintingAtConstruction printer){
        System.out.println("init at startup");
        this.printer=printer;

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The app is ready");
        System.out.println(printer.sayHello());
    }
}
