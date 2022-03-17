package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
/*
we can't use background and hooks both together
if use background it will execute first and after that all the test will run
hooks is use to target a specific when to run a prequsite configuration

 */
    @Before("@MobileTesting")
    public void loadEmulator(){
        System.out.println("MobileTesting started");
        System.out.println("Emulator started");
    }

    @After("@MobileTesting")
    public void closeEmulator(){
        System.out.println("Emulator closed");
    }


}
