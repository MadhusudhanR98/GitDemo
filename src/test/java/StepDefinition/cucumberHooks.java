package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks {

    @Before("@android")
    public void openTheBrowser(){
        System.out.println("&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&");
    }

    @After("@ios")
    public void closeTheBrowser(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("coming from gitdemo");
    }
}
