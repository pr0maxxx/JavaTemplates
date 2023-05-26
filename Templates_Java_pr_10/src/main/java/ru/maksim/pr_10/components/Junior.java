package ru.maksim.pr_10.components;

import org.springframework.stereotype.Component;
import ru.maksim.pr_10.interfaces.Programmer;

@Component("junior")
public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm a junior programmer");
    }
}
