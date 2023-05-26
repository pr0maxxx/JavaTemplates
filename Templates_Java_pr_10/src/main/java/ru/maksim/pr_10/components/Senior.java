package ru.maksim.pr_10.components;

import org.springframework.stereotype.Component;
import ru.maksim.pr_10.interfaces.Programmer;

@Component("senior")
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm a senior programmer");
    }
}